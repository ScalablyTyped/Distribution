package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutImportFormats extends js.Object {
  var source: js.UndefOr[java.lang.String] = js.undefined
  var targets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AboutImportFormats {
  @scala.inline
  def apply(source: java.lang.String = null, targets: js.Array[java.lang.String] = null): AboutImportFormats = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    if (targets != null) __obj.updateDynamic("targets")(targets)
    __obj.asInstanceOf[AboutImportFormats]
  }
}

