package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tuple of values for the quasi-identifier columns.
  */
@js.native
trait Schema$GooglePrivacyDlpV2KMapEstimationQuasiIdValues extends js.Object {
  /**
    * The estimated anonymity for these quasi-identifier values.
    */
  var estimatedAnonymity: js.UndefOr[String] = js.native
  /**
    * The quasi-identifier values.
    */
  var quasiIdsValues: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2Value]] = js.native
}

object Schema$GooglePrivacyDlpV2KMapEstimationQuasiIdValues {
  @scala.inline
  def apply(estimatedAnonymity: String = null, quasiIdsValues: js.Array[Schema$GooglePrivacyDlpV2Value] = null): Schema$GooglePrivacyDlpV2KMapEstimationQuasiIdValues = {
    val __obj = js.Dynamic.literal()
    if (estimatedAnonymity != null) __obj.updateDynamic("estimatedAnonymity")(estimatedAnonymity.asInstanceOf[js.Any])
    if (quasiIdsValues != null) __obj.updateDynamic("quasiIdsValues")(quasiIdsValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2KMapEstimationQuasiIdValues]
  }
}

