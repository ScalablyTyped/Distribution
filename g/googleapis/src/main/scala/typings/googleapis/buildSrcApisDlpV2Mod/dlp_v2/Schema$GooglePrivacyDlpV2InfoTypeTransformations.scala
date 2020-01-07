package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type of transformation that will scan unstructured text and apply various
  * `PrimitiveTransformation`s to each finding, where the transformation is
  * applied to only values that were identified as a specific info_type.
  */
@js.native
trait Schema$GooglePrivacyDlpV2InfoTypeTransformations extends js.Object {
  /**
    * Transformation for each infoType. Cannot specify more than one for a
    * given infoType. [required]
    */
  var transformations: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2InfoTypeTransformation]] = js.native
}

object Schema$GooglePrivacyDlpV2InfoTypeTransformations {
  @scala.inline
  def apply(transformations: js.Array[Schema$GooglePrivacyDlpV2InfoTypeTransformation] = null): Schema$GooglePrivacyDlpV2InfoTypeTransformations = {
    val __obj = js.Dynamic.literal()
    if (transformations != null) __obj.updateDynamic("transformations")(transformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2InfoTypeTransformations]
  }
}

