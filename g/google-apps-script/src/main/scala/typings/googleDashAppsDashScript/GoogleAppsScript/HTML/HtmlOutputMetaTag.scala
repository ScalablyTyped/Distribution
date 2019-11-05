package typings.googleDashAppsDashScript.GoogleAppsScript.HTML

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
trait HtmlOutputMetaTag extends js.Object {
  def getContent(): String
  def getName(): String
}

object HtmlOutputMetaTag {
  @scala.inline
  def apply(getContent: () => String, getName: () => String): HtmlOutputMetaTag = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), getName = js.Any.fromFunction0(getName))
  
    __obj.asInstanceOf[HtmlOutputMetaTag]
  }
}

