package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The results of an inspect DataSource job.
  */
@js.native
trait Schema$GooglePrivacyDlpV2InspectDataSourceDetails extends js.Object {
  /**
    * The configuration used for this job.
    */
  var requestedOptions: js.UndefOr[Schema$GooglePrivacyDlpV2RequestedOptions] = js.native
  /**
    * A summary of the outcome of this inspect job.
    */
  var result: js.UndefOr[Schema$GooglePrivacyDlpV2Result] = js.native
}

object Schema$GooglePrivacyDlpV2InspectDataSourceDetails {
  @scala.inline
  def apply(
    requestedOptions: Schema$GooglePrivacyDlpV2RequestedOptions = null,
    result: Schema$GooglePrivacyDlpV2Result = null
  ): Schema$GooglePrivacyDlpV2InspectDataSourceDetails = {
    val __obj = js.Dynamic.literal()
    if (requestedOptions != null) __obj.updateDynamic("requestedOptions")(requestedOptions.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2InspectDataSourceDetails]
  }
}

