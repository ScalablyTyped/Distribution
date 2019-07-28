package typings.evernote

import typings.evernote.evernoteMod.EvernoteNs.LazyMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Altitude extends js.Object {
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

object Anon_Altitude {
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
  ): Anon_Altitude = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (applicationData != null) __obj.updateDynamic("applicationData")(applicationData)
    if (!js.isUndefined(attachment)) __obj.updateDynamic("attachment")(attachment)
    if (cameraMake != null) __obj.updateDynamic("cameraMake")(cameraMake)
    if (cameraModel != null) __obj.updateDynamic("cameraModel")(cameraModel)
    if (!js.isUndefined(clientWillIndex)) __obj.updateDynamic("clientWillIndex")(clientWillIndex)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (recoType != null) __obj.updateDynamic("recoType")(recoType)
    if (sourceURL != null) __obj.updateDynamic("sourceURL")(sourceURL)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Altitude]
  }
}

