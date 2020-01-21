package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CdnSettings extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var frameRate: js.UndefOr[String] = js.undefined
  var ingestionInfo: js.UndefOr[IngestionInfo] = js.undefined
  var ingestionType: js.UndefOr[String] = js.undefined
  var resolution: js.UndefOr[String] = js.undefined
}

object CdnSettings {
  @scala.inline
  def apply(
    format: String = null,
    frameRate: String = null,
    ingestionInfo: IngestionInfo = null,
    ingestionType: String = null,
    resolution: String = null
  ): CdnSettings = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (ingestionInfo != null) __obj.updateDynamic("ingestionInfo")(ingestionInfo.asInstanceOf[js.Any])
    if (ingestionType != null) __obj.updateDynamic("ingestionType")(ingestionType.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[CdnSettings]
  }
}

