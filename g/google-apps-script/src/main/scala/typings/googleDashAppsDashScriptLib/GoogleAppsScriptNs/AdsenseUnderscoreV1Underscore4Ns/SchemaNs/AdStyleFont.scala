package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdStyleFont extends js.Object {
  var family: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object AdStyleFont {
  @scala.inline
  def apply(family: java.lang.String = null, size: java.lang.String = null): AdStyleFont = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[AdStyleFont]
  }
}

