package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1InfoTypeTransformations extends js.Object {
  /**
    * Transformation for each info type. Cannot specify more than one
    * for a given info type. [required]
    */
  var transformations: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoTypeTransformation]] = js.undefined
}

object GooglePrivacyDlpV2beta1InfoTypeTransformations {
  @scala.inline
  def apply(transformations: js.Array[GooglePrivacyDlpV2beta1InfoTypeTransformation] = null): GooglePrivacyDlpV2beta1InfoTypeTransformations = {
    val __obj = js.Dynamic.literal()
    if (transformations != null) __obj.updateDynamic("transformations")(transformations)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InfoTypeTransformations]
  }
}

