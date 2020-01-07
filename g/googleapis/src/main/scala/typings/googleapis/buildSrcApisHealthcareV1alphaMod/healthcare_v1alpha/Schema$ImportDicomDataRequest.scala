package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Imports data into the specified DICOM store. Returns an error if any of the
  * files to import are not DICOM files. This API will accept duplicate DICOM
  * instances, by simply ignoring the newly pushed instance (it will not
  * overwrite).
  */
@js.native
trait Schema$ImportDicomDataRequest extends js.Object {
  /**
    * Specifies where the imported data resides.
    */
  var inputConfig: js.UndefOr[Schema$InputConfig] = js.native
}

object Schema$ImportDicomDataRequest {
  @scala.inline
  def apply(inputConfig: Schema$InputConfig = null): Schema$ImportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    if (inputConfig != null) __obj.updateDynamic("inputConfig")(inputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImportDicomDataRequest]
  }
}

