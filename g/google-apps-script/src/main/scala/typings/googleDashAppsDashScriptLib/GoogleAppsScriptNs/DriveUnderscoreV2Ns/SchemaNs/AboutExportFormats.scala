package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutExportFormats extends js.Object {
  var source: js.UndefOr[java.lang.String] = js.undefined
  var targets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AboutExportFormats {
  @scala.inline
  def apply(source: java.lang.String = null, targets: js.Array[java.lang.String] = null): AboutExportFormats = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    if (targets != null) __obj.updateDynamic("targets")(targets)
    __obj.asInstanceOf[AboutExportFormats]
  }
}

