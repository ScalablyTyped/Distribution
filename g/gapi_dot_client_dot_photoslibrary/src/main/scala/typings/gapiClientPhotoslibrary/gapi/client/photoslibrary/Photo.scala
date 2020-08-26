package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Photo extends js.Object {
  /** Aperture f number of the camera lens with which the photo was taken. */
  var apertureFNumber: js.UndefOr[Double] = js.native
  /** Brand of the camera with which the photo was taken. */
  var cameraMake: js.UndefOr[String] = js.native
  /** Model of the camera with which the photo was taken. */
  var cameraModel: js.UndefOr[String] = js.native
  /** Exposure time of the camera aperture when the photo was taken. */
  var exposureTime: js.UndefOr[String] = js.native
  /** Focal length of the camera lens with which the photo was taken. */
  var focalLength: js.UndefOr[Double] = js.native
  /** ISO of the camera with which the photo was taken. */
  var isoEquivalent: js.UndefOr[Double] = js.native
}

object Photo {
  @scala.inline
  def apply(): Photo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Photo]
  }
  @scala.inline
  implicit class PhotoOps[Self <: Photo] (val x: Self) extends AnyVal {
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
    def setApertureFNumber(value: Double): Self = this.set("apertureFNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApertureFNumber: Self = this.set("apertureFNumber", js.undefined)
    @scala.inline
    def setCameraMake(value: String): Self = this.set("cameraMake", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraMake: Self = this.set("cameraMake", js.undefined)
    @scala.inline
    def setCameraModel(value: String): Self = this.set("cameraModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraModel: Self = this.set("cameraModel", js.undefined)
    @scala.inline
    def setExposureTime(value: String): Self = this.set("exposureTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposureTime: Self = this.set("exposureTime", js.undefined)
    @scala.inline
    def setFocalLength(value: Double): Self = this.set("focalLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocalLength: Self = this.set("focalLength", js.undefined)
    @scala.inline
    def setIsoEquivalent(value: Double): Self = this.set("isoEquivalent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsoEquivalent: Self = this.set("isoEquivalent", js.undefined)
  }
  
}

