package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenewalSettings extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var renewalType: js.UndefOr[java.lang.String] = js.undefined
}

object RenewalSettings {
  @scala.inline
  def apply(kind: java.lang.String = null, renewalType: java.lang.String = null): RenewalSettings = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (renewalType != null) __obj.updateDynamic("renewalType")(renewalType)
    __obj.asInstanceOf[RenewalSettings]
  }
}

