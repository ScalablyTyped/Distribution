package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of the δ-presence computation. Note that these results are an
  * estimation, not exact values.
  */
@js.native
trait Schema$GooglePrivacyDlpV2DeltaPresenceEstimationResult extends js.Object {
  /**
    * The intervals [min_probability, max_probability) do not overlap. If a
    * value doesn&#39;t correspond to any such interval, the associated
    * frequency is zero. For example, the following records: {min_probability:
    * 0, max_probability: 0.1, frequency: 17}   {min_probability: 0.2,
    * max_probability: 0.3, frequency: 42}   {min_probability: 0.3,
    * max_probability: 0.4, frequency: 99} mean that there are no record with
    * an estimated probability in [0.1, 0.2) nor larger or equal to 0.4.
    */
  var deltaPresenceEstimationHistogram: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket]] = js.native
}

object Schema$GooglePrivacyDlpV2DeltaPresenceEstimationResult {
  @scala.inline
  def apply(
    deltaPresenceEstimationHistogram: js.Array[Schema$GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket] = null
  ): Schema$GooglePrivacyDlpV2DeltaPresenceEstimationResult = {
    val __obj = js.Dynamic.literal()
    if (deltaPresenceEstimationHistogram != null) __obj.updateDynamic("deltaPresenceEstimationHistogram")(deltaPresenceEstimationHistogram.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2DeltaPresenceEstimationResult]
  }
}

