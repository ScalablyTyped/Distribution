package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If set, the detailed findings will be persisted to the specified
  * OutputStorageConfig. Only a single instance of this action can be
  * specified. Compatible with: Inspect, Risk
  */
@js.native
trait Schema$GooglePrivacyDlpV2SaveFindings extends js.Object {
  var outputConfig: js.UndefOr[Schema$GooglePrivacyDlpV2OutputStorageConfig] = js.native
}

object Schema$GooglePrivacyDlpV2SaveFindings {
  @scala.inline
  def apply(outputConfig: Schema$GooglePrivacyDlpV2OutputStorageConfig = null): Schema$GooglePrivacyDlpV2SaveFindings = {
    val __obj = js.Dynamic.literal()
    if (outputConfig != null) __obj.updateDynamic("outputConfig")(outputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2SaveFindings]
  }
}

