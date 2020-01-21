package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

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
    if (cueType != null) __obj.updateDynamic("cueType")(cueType.asInstanceOf[js.Any])
    if (durationSecs != null) __obj.updateDynamic("durationSecs")(durationSecs.asInstanceOf[js.Any])
    if (offsetTimeMs != null) __obj.updateDynamic("offsetTimeMs")(offsetTimeMs.asInstanceOf[js.Any])
    if (walltime != null) __obj.updateDynamic("walltime")(walltime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CuepointSettings]
  }
}

