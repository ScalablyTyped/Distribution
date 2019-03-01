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
  def apply(getContent: js.Function0[java.lang.String], getName: js.Function0[java.lang.String]): HtmlOutputMetaTag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContent")(getContent)
    __obj.updateDynamic("getName")(getName)
    __obj.asInstanceOf[HtmlOutputMetaTag]
  }
}

