package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.HTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HtmlOutputMetaTag extends js.Object {
  def getContent(): java.lang.String
  def getName(): java.lang.String
}

object HtmlOutputMetaTag {
  @scala.inline
  def apply(getContent: () => java.lang.String, getName: () => java.lang.String): HtmlOutputMetaTag = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), getName = js.Any.fromFunction0(getName))
  
    __obj.asInstanceOf[HtmlOutputMetaTag]
  }
}

