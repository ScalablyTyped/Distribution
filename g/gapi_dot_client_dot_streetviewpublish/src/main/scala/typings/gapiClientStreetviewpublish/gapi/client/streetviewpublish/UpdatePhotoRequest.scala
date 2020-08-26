package typings.gapiClientStreetviewpublish.gapi.client.streetviewpublish

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePhotoRequest extends js.Object {
  /**
    * Required. Photo object containing the
    * new metadata.
    */
  var photo: js.UndefOr[Photo] = js.native
  /**
    * Mask that identifies fields on the photo metadata to update.
    * If not present, the old Photo
    * metadata will be entirely replaced with the
    * new Photo metadata in this request.
    * The update fails if invalid fields are specified. Multiple fields can be
    * specified in a comma-delimited list.
    *
    * The following fields are valid:
    *
    * &#42; `pose.heading`
    * &#42; `pose.latLngPair`
    * &#42; `pose.pitch`
    * &#42; `pose.roll`
    * &#42; `pose.level`
    * &#42; `pose.altitude`
    * &#42; `connections`
    * &#42; `places`
    *
    *
    * <aside class="note"><b>Note:</b> Repeated fields in
    * updateMask
    * mean the entire set of repeated values will be replaced with the new
    * contents. For example, if
    * updateMask
    * contains `connections` and `UpdatePhotoRequest.photo.connections` is empty,
    * all connections will be removed.</aside>
    */
  var updateMask: js.UndefOr[String] = js.native
}

object UpdatePhotoRequest {
  @scala.inline
  def apply(): UpdatePhotoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePhotoRequest]
  }
  @scala.inline
  implicit class UpdatePhotoRequestOps[Self <: UpdatePhotoRequest] (val x: Self) extends AnyVal {
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
    def setPhoto(value: Photo): Self = this.set("photo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

