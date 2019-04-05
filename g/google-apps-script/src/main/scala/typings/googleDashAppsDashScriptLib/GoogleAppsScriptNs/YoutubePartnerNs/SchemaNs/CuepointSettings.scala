package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CuepointSettings extends js.Object {
  var cueType: js.UndefOr[java.lang.String] = js.undefined
  var durationSecs: js.UndefOr[scala.Double] = js.undefined
  var offsetTimeMs: js.UndefOr[java.lang.String] = js.undefined
  var walltime: js.UndefOr[java.lang.String] = js.undefined
}

object CuepointSettings {
  @scala.inline
  def apply(
    cueType: java.lang.String = null,
    durationSecs: scala.Int | scala.Double = null,
    offsetTimeMs: java.lang.String = null,
    walltime: java.lang.String = null
  ): CuepointSettings = {
    val __obj = js.Dynamic.literal()
    if (cueType != null) __obj.updateDynamic("cueType")(cueType)
    if (durationSecs != null) __obj.updateDynamic("durationSecs")(durationSecs.asInstanceOf[js.Any])
    if (offsetTimeMs != null) __obj.updateDynamic("offsetTimeMs")(offsetTimeMs)
    if (walltime != null) __obj.updateDynamic("walltime")(walltime)
    __obj.asInstanceOf[CuepointSettings]
  }
}

