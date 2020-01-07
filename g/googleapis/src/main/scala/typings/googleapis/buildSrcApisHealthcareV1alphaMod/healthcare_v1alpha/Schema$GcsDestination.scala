package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Google Cloud Storage location to which the output should be written.
  */
@js.native
trait Schema$GcsDestination extends js.Object {
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
    * URI for a Google Cloud Storage directory to which result files should be
    * written (e.g., `gs://bucket-id/path/to/destination/dir`). If there is no
    * trailing slash, the service will append one when composing the object
    * path. The user is responsible for creating the Google Cloud Storage
    * bucket referenced in `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String] = js.native
}

object Schema$GcsDestination {
  @scala.inline
  def apply(mimeType: String = null, uriPrefix: String = null): Schema$GcsDestination = {
    val __obj = js.Dynamic.literal()
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (uriPrefix != null) __obj.updateDynamic("uriPrefix")(uriPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GcsDestination]
  }
}

