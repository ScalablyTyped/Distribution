package typings.googleDashAppsDashScript.GoogleAppsScript.HTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

