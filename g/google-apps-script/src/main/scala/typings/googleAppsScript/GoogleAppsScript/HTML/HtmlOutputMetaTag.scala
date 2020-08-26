package typings.googleAppsScript.GoogleAppsScript.HTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that represents a meta tag added to the page by calling HtmlOutput.addMetaTag(name, content).
  *
  *     var output = HtmlService.createHtmlOutput('<b>Hello, world!</b>');
  *     output.addMetaTag('viewport', 'width=device-width, initial-scale=1');
  *
  *     var tags = output.getMetaTags();
  *     Logger.log('<meta name="%s" content="%s"/>', tags[0].getName(), tags[0].getContent());
  */
@js.native
trait HtmlOutputMetaTag extends js.Object {
  def getContent(): String = js.native
  def getName(): String = js.native
}

object HtmlOutputMetaTag {
  @scala.inline
  def apply(getContent: () => String, getName: () => String): HtmlOutputMetaTag = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), getName = js.Any.fromFunction0(getName))
    __obj.asInstanceOf[HtmlOutputMetaTag]
  }
  @scala.inline
  implicit class HtmlOutputMetaTagOps[Self <: HtmlOutputMetaTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetContent(value: () => String): Self = this.set("getContent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
  }
  
}

