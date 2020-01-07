package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All result fields mentioned below are updated while the job is processing.
  */
@js.native
trait Schema$GooglePrivacyDlpV2Result extends js.Object {
  /**
    * Statistics of how many instances of each info type were found during
    * inspect job.
    */
  var infoTypeStats: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2InfoTypeStats]] = js.native
  /**
    * Total size in bytes that were processed.
    */
  var processedBytes: js.UndefOr[String] = js.native
  /**
    * Estimate of the number of bytes to process.
    */
  var totalEstimatedBytes: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2Result {
  @scala.inline
  def apply(
    infoTypeStats: js.Array[Schema$GooglePrivacyDlpV2InfoTypeStats] = null,
    processedBytes: String = null,
    totalEstimatedBytes: String = null
  ): Schema$GooglePrivacyDlpV2Result = {
    val __obj = js.Dynamic.literal()
    if (infoTypeStats != null) __obj.updateDynamic("infoTypeStats")(infoTypeStats.asInstanceOf[js.Any])
    if (processedBytes != null) __obj.updateDynamic("processedBytes")(processedBytes.asInstanceOf[js.Any])
    if (totalEstimatedBytes != null) __obj.updateDynamic("totalEstimatedBytes")(totalEstimatedBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2Result]
  }
}

