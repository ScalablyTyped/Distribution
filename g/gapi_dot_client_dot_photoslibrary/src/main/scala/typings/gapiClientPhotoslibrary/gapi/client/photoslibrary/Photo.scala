package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends js.Object {
  /** Aperture f number of the camera lens with which the photo was taken. */
  var apertureFNumber: js.UndefOr[Double] = js.undefined
  /** Brand of the camera with which the photo was taken. */
  var cameraMake: js.UndefOr[String] = js.undefined
  /** Model of the camera with which the photo was taken. */
  var cameraModel: js.UndefOr[String] = js.undefined
  /** Exposure time of the camera aperture when the photo was taken. */
  var exposureTime: js.UndefOr[String] = js.undefined
  /** Focal length of the camera lens with which the photo was taken. */
  var focalLength: js.UndefOr[Double] = js.undefined
  /** ISO of the camera with which the photo was taken. */
  var isoEquivalent: js.UndefOr[Double] = js.undefined
}

object Photo {
  @scala.inline
  def apply(
    apertureFNumber: Int | Double = null,
    cameraMake: String = null,
    cameraModel: String = null,
    exposureTime: String = null,
    focalLength: Int | Double = null,
    isoEquivalent: Int | Double = null
  ): Photo = {
    val __obj = js.Dynamic.literal()
    if (apertureFNumber != null) __obj.updateDynamic("apertureFNumber")(apertureFNumber.asInstanceOf[js.Any])
    if (cameraMake != null) __obj.updateDynamic("cameraMake")(cameraMake.asInstanceOf[js.Any])
    if (cameraModel != null) __obj.updateDynamic("cameraModel")(cameraModel.asInstanceOf[js.Any])
    if (exposureTime != null) __obj.updateDynamic("exposureTime")(exposureTime.asInstanceOf[js.Any])
    if (focalLength != null) __obj.updateDynamic("focalLength")(focalLength.asInstanceOf[js.Any])
    if (isoEquivalent != null) __obj.updateDynamic("isoEquivalent")(isoEquivalent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Photo]
  }
}

