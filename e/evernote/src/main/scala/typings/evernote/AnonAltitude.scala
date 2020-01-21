package typings.evernote

import typings.evernote.mod.Evernote.LazyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAltitude extends js.Object {
  var altitude: js.UndefOr[Double] = js.undefined
  var applicationData: js.UndefOr[LazyMap] = js.undefined
  var attachment: js.UndefOr[Boolean] = js.undefined
  var cameraMake: js.UndefOr[String] = js.undefined
  var cameraModel: js.UndefOr[String] = js.undefined
  var clientWillIndex: js.UndefOr[Boolean] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  var recoType: js.UndefOr[String] = js.undefined
  var sourceURL: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
}

object AnonAltitude {
  @scala.inline
  def apply(
    altitude: Int | Double = null,
    applicationData: LazyMap = null,
    attachment: js.UndefOr[Boolean] = js.undefined,
    cameraMake: String = null,
    cameraModel: String = null,
    clientWillIndex: js.UndefOr[Boolean] = js.undefined,
    fileName: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    recoType: String = null,
    sourceURL: String = null,
    timestamp: Int | Double = null
  ): AnonAltitude = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (applicationData != null) __obj.updateDynamic("applicationData")(applicationData.asInstanceOf[js.Any])
    if (!js.isUndefined(attachment)) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (cameraMake != null) __obj.updateDynamic("cameraMake")(cameraMake.asInstanceOf[js.Any])
    if (cameraModel != null) __obj.updateDynamic("cameraModel")(cameraModel.asInstanceOf[js.Any])
    if (!js.isUndefined(clientWillIndex)) __obj.updateDynamic("clientWillIndex")(clientWillIndex.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (recoType != null) __obj.updateDynamic("recoType")(recoType.asInstanceOf[js.Any])
    if (sourceURL != null) __obj.updateDynamic("sourceURL")(sourceURL.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAltitude]
  }
}

