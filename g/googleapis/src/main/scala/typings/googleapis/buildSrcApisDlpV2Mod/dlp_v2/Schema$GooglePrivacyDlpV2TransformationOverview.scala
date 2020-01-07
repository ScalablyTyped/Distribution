package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Overview of the modifications that occurred.
  */
@js.native
trait Schema$GooglePrivacyDlpV2TransformationOverview extends js.Object {
  /**
    * Transformations applied to the dataset.
    */
  var transformationSummaries: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2TransformationSummary]] = js.native
  /**
    * Total size in bytes that were transformed in some way.
    */
  var transformedBytes: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2TransformationOverview {
  @scala.inline
  def apply(
    transformationSummaries: js.Array[Schema$GooglePrivacyDlpV2TransformationSummary] = null,
    transformedBytes: String = null
  ): Schema$GooglePrivacyDlpV2TransformationOverview = {
    val __obj = js.Dynamic.literal()
    if (transformationSummaries != null) __obj.updateDynamic("transformationSummaries")(transformationSummaries.asInstanceOf[js.Any])
    if (transformedBytes != null) __obj.updateDynamic("transformedBytes")(transformedBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2TransformationOverview]
  }
}

