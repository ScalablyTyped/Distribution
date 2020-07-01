package typings.exif.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPSAltitude extends js.Object {
  var GPSAltitude: js.UndefOr[Double] = js.undefined
  var GPSAltitudeRef: js.UndefOr[Double] = js.undefined
  var GPSAreaInformation: js.UndefOr[Buffer] = js.undefined
  var GPSDOP: js.UndefOr[Double] = js.undefined
  var GPSDateStamp: js.UndefOr[String] = js.undefined
  var GPSDestBearing: js.UndefOr[Double] = js.undefined
  var GPSDestBearingRef: js.UndefOr[String] = js.undefined
  var GPSDestDistance: js.UndefOr[Double] = js.undefined
  var GPSDestDistanceRef: js.UndefOr[String] = js.undefined
  var GPSDestLatitude: js.UndefOr[js.Array[Double]] = js.undefined
  var GPSDestLatitudeRef: js.UndefOr[String] = js.undefined
  var GPSDestLongitude: js.UndefOr[js.Array[Double]] = js.undefined
  var GPSDestLongitudeRef: js.UndefOr[String] = js.undefined
  var GPSDifferential: js.UndefOr[Double] = js.undefined
  var GPSHPositioningError: js.UndefOr[Double] = js.undefined
  var GPSImgDirection: js.UndefOr[Double] = js.undefined
  var GPSImgDirectionRef: js.UndefOr[String] = js.undefined
  var GPSLatitude: js.UndefOr[js.Array[Double]] = js.undefined
  var GPSLatitudeRef: js.UndefOr[String] = js.undefined
  var GPSLongitude: js.UndefOr[js.Array[Double]] = js.undefined
  var GPSLongitudeRef: js.UndefOr[String] = js.undefined
  var GPSMapDatum: js.UndefOr[String] = js.undefined
  var GPSMeasureMode: js.UndefOr[String] = js.undefined
  var GPSProcessingMethod: js.UndefOr[Buffer] = js.undefined
  var GPSSatellites: js.UndefOr[String] = js.undefined
  var GPSSpeed: js.UndefOr[Double] = js.undefined
  var GPSSpeedRef: js.UndefOr[String] = js.undefined
  var GPSStatus: js.UndefOr[String] = js.undefined
  var GPSTimeStamp: js.UndefOr[js.Array[Double]] = js.undefined
  var GPSTrack: js.UndefOr[Double] = js.undefined
  var GPSTrackRef: js.UndefOr[String] = js.undefined
  var GPSVersionId: js.UndefOr[js.Array[Double]] = js.undefined
}

object GPSAltitude {
  @scala.inline
  def apply(
    GPSAltitude: js.UndefOr[Double] = js.undefined,
    GPSAltitudeRef: js.UndefOr[Double] = js.undefined,
    GPSAreaInformation: Buffer = null,
    GPSDOP: js.UndefOr[Double] = js.undefined,
    GPSDateStamp: String = null,
    GPSDestBearing: js.UndefOr[Double] = js.undefined,
    GPSDestBearingRef: String = null,
    GPSDestDistance: js.UndefOr[Double] = js.undefined,
    GPSDestDistanceRef: String = null,
    GPSDestLatitude: js.Array[Double] = null,
    GPSDestLatitudeRef: String = null,
    GPSDestLongitude: js.Array[Double] = null,
    GPSDestLongitudeRef: String = null,
    GPSDifferential: js.UndefOr[Double] = js.undefined,
    GPSHPositioningError: js.UndefOr[Double] = js.undefined,
    GPSImgDirection: js.UndefOr[Double] = js.undefined,
    GPSImgDirectionRef: String = null,
    GPSLatitude: js.Array[Double] = null,
    GPSLatitudeRef: String = null,
    GPSLongitude: js.Array[Double] = null,
    GPSLongitudeRef: String = null,
    GPSMapDatum: String = null,
    GPSMeasureMode: String = null,
    GPSProcessingMethod: Buffer = null,
    GPSSatellites: String = null,
    GPSSpeed: js.UndefOr[Double] = js.undefined,
    GPSSpeedRef: String = null,
    GPSStatus: String = null,
    GPSTimeStamp: js.Array[Double] = null,
    GPSTrack: js.UndefOr[Double] = js.undefined,
    GPSTrackRef: String = null,
    GPSVersionId: js.Array[Double] = null
  ): GPSAltitude = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(GPSAltitude)) __obj.updateDynamic("GPSAltitude")(GPSAltitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(GPSAltitudeRef)) __obj.updateDynamic("GPSAltitudeRef")(GPSAltitudeRef.get.asInstanceOf[js.Any])
    if (GPSAreaInformation != null) __obj.updateDynamic("GPSAreaInformation")(GPSAreaInformation.asInstanceOf[js.Any])
    if (!js.isUndefined(GPSDOP)) __obj.updateDynamic("GPSDOP")(GPSDOP.get.asInstanceOf[js.Any])
    if (GPSDateStamp != null) __obj.updateDynamic("GPSDateStamp")(GPSDateStamp.asInstanceOf[js.Any])
    if (!js.isUndefined(GPSDestBearing)) __obj.updateDynamic("GPSDestBearing")(GPSDestBearing.get.asInstanceOf[js.Any])
    if (GPSDestBearingRef != null) __obj.updateDynamic("GPSDestBearingRef")(GPSDestBearingRef.asInstanceOf[js.Any])
    if (!js.isUndefined(GPSDestDistance)) __obj.updateDynamic("GPSDestDistance")(GPSDestDistance.get.asInstanceOf[js.Any])
    if (GPSDestDistanceRef != null) __obj.updateDynamic("GPSDestDistanceRef")(GPSDestDistanceRef.asInstanceOf[js.Any])
    if (GPSDestLatitude != null) __obj.updateDynamic("GPSDestLatitude")(GPSDestLatitude.asInstanceOf[js.Any])
    if (GPSDestLatitudeRef != null) __obj.updateDynamic("GPSDestLatitudeRef")(GPSDestLatitudeRef.asInstanceOf[js.Any])
    if (GPSDestLongitude != null) __obj.updateDynamic("GPSDestLongitude")(GPSDestLongitude.asInstanceOf[js.Any])
    if (GPSDestLongitudeRef != null) __obj.updateDynamic("GPSDestLongitudeRef")(GPSDestLongitudeRef.asInstanceOf[js.Any])
    if (!js.isUndefined(GPSDifferential)) __obj.updateDynamic("GPSDifferential")(GPSDifferential.get.asInstanceOf[js.Any])
    if (!js.isUndefined(GPSHPositioningError)) __obj.updateDynamic("GPSHPositioningError")(GPSHPositioningError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(GPSImgDirection)) __obj.updateDynamic("GPSImgDirection")(GPSImgDirection.get.asInstanceOf[js.Any])
    if (GPSImgDirectionRef != null) __obj.updateDynamic("GPSImgDirectionRef")(GPSImgDirectionRef.asInstanceOf[js.Any])
    if (GPSLatitude != null) __obj.updateDynamic("GPSLatitude")(GPSLatitude.asInstanceOf[js.Any])
    if (GPSLatitudeRef != null) __obj.updateDynamic("GPSLatitudeRef")(GPSLatitudeRef.asInstanceOf[js.Any])
    if (GPSLongitude != null) __obj.updateDynamic("GPSLongitude")(GPSLongitude.asInstanceOf[js.Any])
    if (GPSLongitudeRef != null) __obj.updateDynamic("GPSLongitudeRef")(GPSLongitudeRef.asInstanceOf[js.Any])
    if (GPSMapDatum != null) __obj.updateDynamic("GPSMapDatum")(GPSMapDatum.asInstanceOf[js.Any])
    if (GPSMeasureMode != null) __obj.updateDynamic("GPSMeasureMode")(GPSMeasureMode.asInstanceOf[js.Any])
    if (GPSProcessingMethod != null) __obj.updateDynamic("GPSProcessingMethod")(GPSProcessingMethod.asInstanceOf[js.Any])
    if (GPSSatellites != null) __obj.updateDynamic("GPSSatellites")(GPSSatellites.asInstanceOf[js.Any])
    if (!js.isUndefined(GPSSpeed)) __obj.updateDynamic("GPSSpeed")(GPSSpeed.get.asInstanceOf[js.Any])
    if (GPSSpeedRef != null) __obj.updateDynamic("GPSSpeedRef")(GPSSpeedRef.asInstanceOf[js.Any])
    if (GPSStatus != null) __obj.updateDynamic("GPSStatus")(GPSStatus.asInstanceOf[js.Any])
    if (GPSTimeStamp != null) __obj.updateDynamic("GPSTimeStamp")(GPSTimeStamp.asInstanceOf[js.Any])
    if (!js.isUndefined(GPSTrack)) __obj.updateDynamic("GPSTrack")(GPSTrack.get.asInstanceOf[js.Any])
    if (GPSTrackRef != null) __obj.updateDynamic("GPSTrackRef")(GPSTrackRef.asInstanceOf[js.Any])
    if (GPSVersionId != null) __obj.updateDynamic("GPSVersionId")(GPSVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPSAltitude]
  }
}

