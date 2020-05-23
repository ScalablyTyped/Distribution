package typings.evernote.anon

import typings.evernote.mod.Types.LazyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationData extends js.Object {
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

object ApplicationData {
  @scala.inline
  def apply(
    altitude: js.UndefOr[Double] = js.undefined,
    applicationData: LazyMap = null,
    attachment: js.UndefOr[Boolean] = js.undefined,
    cameraMake: String = null,
    cameraModel: String = null,
    clientWillIndex: js.UndefOr[Boolean] = js.undefined,
    fileName: String = null,
    latitude: js.UndefOr[Double] = js.undefined,
    longitude: js.UndefOr[Double] = js.undefined,
    recoType: String = null,
    sourceURL: String = null,
    timestamp: js.UndefOr[Double] = js.undefined
  ): ApplicationData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (applicationData != null) __obj.updateDynamic("applicationData")(applicationData.asInstanceOf[js.Any])
    if (!js.isUndefined(attachment)) __obj.updateDynamic("attachment")(attachment.get.asInstanceOf[js.Any])
    if (cameraMake != null) __obj.updateDynamic("cameraMake")(cameraMake.asInstanceOf[js.Any])
    if (cameraModel != null) __obj.updateDynamic("cameraModel")(cameraModel.asInstanceOf[js.Any])
    if (!js.isUndefined(clientWillIndex)) __obj.updateDynamic("clientWillIndex")(clientWillIndex.get.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(latitude)) __obj.updateDynamic("latitude")(latitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longitude)) __obj.updateDynamic("longitude")(longitude.get.asInstanceOf[js.Any])
    if (recoType != null) __obj.updateDynamic("recoType")(recoType.asInstanceOf[js.Any])
    if (sourceURL != null) __obj.updateDynamic("sourceURL")(sourceURL.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationData]
  }
}

