package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Altitude extends js.Object {
  var altitude: js.UndefOr[scala.Double] = js.undefined
  var applicationData: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.LazyMap] = js.undefined
  var attachment: js.UndefOr[scala.Boolean] = js.undefined
  var cameraMake: js.UndefOr[java.lang.String] = js.undefined
  var cameraModel: js.UndefOr[java.lang.String] = js.undefined
  var clientWillIndex: js.UndefOr[scala.Boolean] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var latitude: js.UndefOr[scala.Double] = js.undefined
  var longitude: js.UndefOr[scala.Double] = js.undefined
  var recoType: js.UndefOr[java.lang.String] = js.undefined
  var sourceURL: js.UndefOr[java.lang.String] = js.undefined
  var timestamp: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Altitude {
  @scala.inline
  def apply(
    altitude: scala.Int | scala.Double = null,
    applicationData: evernoteLib.evernoteMod.EvernoteNs.LazyMap = null,
    attachment: js.UndefOr[scala.Boolean] = js.undefined,
    cameraMake: java.lang.String = null,
    cameraModel: java.lang.String = null,
    clientWillIndex: js.UndefOr[scala.Boolean] = js.undefined,
    fileName: java.lang.String = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null,
    recoType: java.lang.String = null,
    sourceURL: java.lang.String = null,
    timestamp: scala.Int | scala.Double = null
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

