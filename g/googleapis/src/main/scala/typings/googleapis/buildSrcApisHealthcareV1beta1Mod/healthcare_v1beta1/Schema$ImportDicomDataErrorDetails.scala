package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns the errors encountered during DICOM store import.
  */
@js.native
trait Schema$ImportDicomDataErrorDetails extends js.Object {
  /**
    * Deprecated. Use only for debugging purposes.  Contains sample errors
    * encountered in imports of individual resources (for example, a Cloud
    * Storage object).
    */
  var sampleErrors: js.UndefOr[js.Array[Schema$ErrorDetail]] = js.native
}

object Schema$ImportDicomDataErrorDetails {
  @scala.inline
  def apply(sampleErrors: js.Array[Schema$ErrorDetail] = null): Schema$ImportDicomDataErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (sampleErrors != null) __obj.updateDynamic("sampleErrors")(sampleErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImportDicomDataErrorDetails]
  }
}

