package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Video extends js.Object {
  /** Brand of the camera with which the video was taken. */
  var cameraMake: js.UndefOr[String] = js.native
  /** Model of the camera with which the video was taken. */
  var cameraModel: js.UndefOr[String] = js.native
  /** Frame rate of the video. */
  var fps: js.UndefOr[Double] = js.native
  /** Processing status of the video. */
  var status: js.UndefOr[String] = js.native
}

object Video {
  @scala.inline
  def apply(): Video = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Video]
  }
  @scala.inline
  implicit class VideoOps[Self <: Video] (val x: Self) extends AnyVal {
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
    def setCameraMake(value: String): Self = this.set("cameraMake", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraMake: Self = this.set("cameraMake", js.undefined)
    @scala.inline
    def setCameraModel(value: String): Self = this.set("cameraModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraModel: Self = this.set("cameraModel", js.undefined)
    @scala.inline
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFps: Self = this.set("fps", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

