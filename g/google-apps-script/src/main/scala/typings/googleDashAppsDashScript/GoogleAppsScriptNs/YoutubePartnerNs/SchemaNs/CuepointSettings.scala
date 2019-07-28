package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CuepointSettings extends js.Object {
  var cueType: js.UndefOr[String] = js.undefined
  var durationSecs: js.UndefOr[Double] = js.undefined
  var offsetTimeMs: js.UndefOr[String] = js.undefined
  var walltime: js.UndefOr[String] = js.undefined
}

object CuepointSettings {
  @scala.inline
  def apply(
    cueType: String = null,
    durationSecs: Int | Double = null,
    offsetTimeMs: String = null,
    walltime: String = null
  ): CuepointSettings = {
    val __obj = js.Dynamic.literal()
    if (cueType != null) __obj.updateDynamic("cueType")(cueType)
    if (durationSecs != null) __obj.updateDynamic("durationSecs")(durationSecs.asInstanceOf[js.Any])
    if (offsetTimeMs != null) __obj.updateDynamic("offsetTimeMs")(offsetTimeMs)
    if (walltime != null) __obj.updateDynamic("walltime")(walltime)
    __obj.asInstanceOf[CuepointSettings]
  }
}

