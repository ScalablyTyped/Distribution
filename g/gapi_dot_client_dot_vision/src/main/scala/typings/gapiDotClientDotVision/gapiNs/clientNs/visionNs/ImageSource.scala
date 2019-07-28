package typings.gapiDotClientDotVision.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSource extends js.Object {
  /**
    * NOTE: For new code `image_uri` below is preferred.
    * Google Cloud Storage image URI, which must be in the following form:
    * `gs://bucket_name/object_name` (for details, see
    * [Google Cloud Storage Request
    * URIs](https://cloud.google.com/storage/docs/reference-uris)).
    * NOTE: Cloud Storage object versioning is not supported.
    */
  var gcsImageUri: js.UndefOr[String] = js.undefined
  /**
    * Image URI which supports:
    * 1) Google Cloud Storage image URI, which must be in the following form:
    * `gs://bucket_name/object_name` (for details, see
    * [Google Cloud Storage Request
    * URIs](https://cloud.google.com/storage/docs/reference-uris)).
    * NOTE: Cloud Storage object versioning is not supported.
    * 2) Publicly accessible image HTTP/HTTPS URL.
    * This is preferred over the legacy `gcs_image_uri` above. When both
    * `gcs_image_uri` and `image_uri` are specified, `image_uri` takes
    * precedence.
    */
  var imageUri: js.UndefOr[String] = js.undefined
}

object ImageSource {
  @scala.inline
  def apply(gcsImageUri: String = null, imageUri: String = null): ImageSource = {
    val __obj = js.Dynamic.literal()
    if (gcsImageUri != null) __obj.updateDynamic("gcsImageUri")(gcsImageUri)
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri)
    __obj.asInstanceOf[ImageSource]
  }
}

