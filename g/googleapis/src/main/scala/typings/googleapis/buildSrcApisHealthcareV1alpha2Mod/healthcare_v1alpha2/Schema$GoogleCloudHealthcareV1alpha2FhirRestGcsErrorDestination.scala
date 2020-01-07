package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the Cloud Storage destination where errors will be recorded.
  */
@js.native
trait Schema$GoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination extends js.Object {
  /**
    * URI for a Cloud Storage directory to which error report files should be
    * written (in the format `gs://{bucket-id}/{path/to/destination/dir}`). If
    * there is no trailing slash, the service will append one when composing
    * the object path. The user is responsible for creating the Cloud Storage
    * bucket referenced in `uri_prefix`.
    */
  var uriPrefix: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination {
  @scala.inline
  def apply(uriPrefix: String = null): Schema$GoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination = {
    val __obj = js.Dynamic.literal()
    if (uriPrefix != null) __obj.updateDynamic("uriPrefix")(uriPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudHealthcareV1alpha2FhirRestGcsErrorDestination]
  }
}

