package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

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
    if (format != null) __obj.updateDynamic("format")(format)
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate)
    if (ingestionInfo != null) __obj.updateDynamic("ingestionInfo")(ingestionInfo)
    if (ingestionType != null) __obj.updateDynamic("ingestionType")(ingestionType)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution)
    __obj.asInstanceOf[CdnSettings]
  }
}

