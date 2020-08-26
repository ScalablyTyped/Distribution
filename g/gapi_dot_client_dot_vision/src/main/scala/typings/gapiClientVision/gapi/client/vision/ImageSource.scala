package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSource extends js.Object {
  /**
    * NOTE: For new code `image_uri` below is preferred.
    * Google Cloud Storage image URI, which must be in the following form:
    * `gs://bucket_name/object_name` (for details, see
    * [Google Cloud Storage Request
    * URIs](https://cloud.google.com/storage/docs/reference-uris)).
    * NOTE: Cloud Storage object versioning is not supported.
    */
  var gcsImageUri: js.UndefOr[String] = js.native
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
  var imageUri: js.UndefOr[String] = js.native
}

object ImageSource {
  @scala.inline
  def apply(): ImageSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSource]
  }
  @scala.inline
  implicit class ImageSourceOps[Self <: ImageSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGcsImageUri(value: String): Self = this.set("gcsImageUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcsImageUri: Self = this.set("gcsImageUri", js.undefined)
    @scala.inline
    def setImageUri(value: String): Self = this.set("imageUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUri: Self = this.set("imageUri", js.undefined)
  }
  
}

