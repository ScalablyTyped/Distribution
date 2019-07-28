package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdStyleFont extends js.Object {
  var family: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object AdStyleFont {
  @scala.inline
  def apply(family: String = null, size: String = null): AdStyleFont = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[AdStyleFont]
  }
}

