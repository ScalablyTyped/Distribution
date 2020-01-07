package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns the errors encountered during DICOM store import.
  */
@js.native
trait Schema$ImportDicomDataErrorDetails extends js.Object {
  /**
    * Contains errors encountered in imports of individual resources (e.g., a
    * Google Cloud Storage object).
    */
  var errors: js.UndefOr[js.Array[Schema$ImportError]] = js.native
}

object Schema$ImportDicomDataErrorDetails {
  @scala.inline
  def apply(errors: js.Array[Schema$ImportError] = null): Schema$ImportDicomDataErrorDetails = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImportDicomDataErrorDetails]
  }
}

