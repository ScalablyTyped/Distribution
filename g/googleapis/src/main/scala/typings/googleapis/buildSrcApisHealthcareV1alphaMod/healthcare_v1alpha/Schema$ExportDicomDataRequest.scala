package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exports data from the specified DICOM store. If a given resource (e.g., a
  * DICOM object with the same SOPInstance UID) already exists in the output,
  * it is overwritten with the version in the source dataset. Exported DICOM
  * data will persist when the DICOM store from which it was exported is
  * deleted.
  */
@js.native
trait Schema$ExportDicomDataRequest extends js.Object {
  /**
    * Specifies where the exported data should be placed.
    */
  var outputConfig: js.UndefOr[Schema$OutputConfig] = js.native
}

object Schema$ExportDicomDataRequest {
  @scala.inline
  def apply(outputConfig: Schema$OutputConfig = null): Schema$ExportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    if (outputConfig != null) __obj.updateDynamic("outputConfig")(outputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ExportDicomDataRequest]
  }
}

