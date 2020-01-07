package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Cloud Storage location where the output should be written, and the
  * export configuration.
  */
@js.native
trait Schema$GoogleCloudHealthcareV1beta1DicomGcsDestination extends js.Object {
  /**
    * MIME types supported by DICOM spec. Each file will be written in the
    * following format:
    * `.../{study_id}/{series_id}/{instance_id}[/{frame_number}].{extension}`
    * The frame_number component will exist only for multi-frame instances.
    * Refer to the DICOM conformance statement for permissible MIME types:
    * https://cloud.google.com/healthcare/docs/dicom#wado-rs  The following
    * extensions will be used for output files:   application/dicom -&gt; .dcm
    * image/jpeg -&gt; .jpg   image/png -&gt; .png  If unspecified, the
    * instances will be exported in their original DICOM format.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * The Cloud Storage destination to export to.  URI for a Cloud Storage
    * directory where result files should be written (in the format
    * `gs://{bucket-id}/{path/to/destination/dir}`). If there is no trailing
    * slash, the service will append one when composing the object path. The
    * user is responsible for creating the Cloud Storage bucket referenced in
    * `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudHealthcareV1beta1DicomGcsDestination {
  @scala.inline
  def apply(mimeType: String = null, uriPrefix: String = null): Schema$GoogleCloudHealthcareV1beta1DicomGcsDestination = {
    val __obj = js.Dynamic.literal()
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (uriPrefix != null) __obj.updateDynamic("uriPrefix")(uriPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudHealthcareV1beta1DicomGcsDestination]
  }
}

