package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Video extends js.Object {
  /** Brand of the camera with which the video was taken. */
  var cameraMake: js.UndefOr[String] = js.undefined
  /** Model of the camera with which the video was taken. */
  var cameraModel: js.UndefOr[String] = js.undefined
  /** Frame rate of the video. */
  var fps: js.UndefOr[Double] = js.undefined
  /** Processing status of the video. */
  var status: js.UndefOr[String] = js.undefined
}

object Video {
  @scala.inline
  def apply(
    cameraMake: String = null,
    cameraModel: String = null,
    fps: js.UndefOr[Double] = js.undefined,
    status: String = null
  ): Video = {
    val __obj = js.Dynamic.literal()
    if (cameraMake != null) __obj.updateDynamic("cameraMake")(cameraMake.asInstanceOf[js.Any])
    if (cameraModel != null) __obj.updateDynamic("cameraModel")(cameraModel.asInstanceOf[js.Any])
    if (!js.isUndefined(fps)) __obj.updateDynamic("fps")(fps.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
}

