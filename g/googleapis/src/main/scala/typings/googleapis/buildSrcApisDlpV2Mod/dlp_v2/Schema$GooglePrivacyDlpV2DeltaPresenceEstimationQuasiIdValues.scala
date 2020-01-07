package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tuple of values for the quasi-identifier columns.
  */
@js.native
trait Schema$GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues extends js.Object {
  /**
    * The estimated probability that a given individual sharing these
    * quasi-identifier values is in the dataset. This value, typically called
    * δ, is the ratio between the number of records in the dataset with these
    * quasi-identifier values, and the total number of individuals (inside
    * *and* outside the dataset) with these quasi-identifier values. For
    * example, if there are 15 individuals in the dataset who share the same
    * quasi-identifier values, and an estimated 100 people in the entire
    * population with these values, then δ is 0.15.
    */
  var estimatedProbability: js.UndefOr[Double] = js.native
  /**
    * The quasi-identifier values.
    */
  var quasiIdsValues: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2Value]] = js.native
}

object Schema$GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues {
  @scala.inline
  def apply(
    estimatedProbability: Int | Double = null,
    quasiIdsValues: js.Array[Schema$GooglePrivacyDlpV2Value] = null
  ): Schema$GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues = {
    val __obj = js.Dynamic.literal()
    if (estimatedProbability != null) __obj.updateDynamic("estimatedProbability")(estimatedProbability.asInstanceOf[js.Any])
    if (quasiIdsValues != null) __obj.updateDynamic("quasiIdsValues")(quasiIdsValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues]
  }
}

