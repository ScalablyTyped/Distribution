package typings.exif.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPSAltitude extends js.Object {
  var GPSAltitude: js.UndefOr[Double] = js.undefined
  var GPSAltitudeRef: js.UndefOr[Double] = js.undefined
  var GPSDateStamp: js.UndefOr[String] = js.undefined
  var GPSLatitude: js.UndefOr[js.Array[Double]] = js.undefined
  var GPSLatitudeRef: js.UndefOr[String] = js.undefined
  var GPSLongitude: js.UndefOr[js.Array[Double]] = js.undefined
  var GPSLongitudeRef: js.UndefOr[String] = js.undefined
  var GPSTimeStamp: js.UndefOr[js.Array[Double]] = js.undefined
  var GPSVersionId: js.UndefOr[js.Array[Double]] = js.undefined
}

object GPSAltitude {
  @scala.inline
  def apply(
    GPSAltitude: js.UndefOr[Double] = js.undefined,
    GPSAltitudeRef: js.UndefOr[Double] = js.undefined,
    GPSDateStamp: String = null,
    GPSLatitude: js.Array[Double] = null,
    GPSLatitudeRef: String = null,
    GPSLongitude: js.Array[Double] = null,
    GPSLongitudeRef: String = null,
    GPSTimeStamp: js.Array[Double] = null,
    GPSVersionId: js.Array[Double] = null
  ): GPSAltitude = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(GPSAltitude)) __obj.updateDynamic("GPSAltitude")(GPSAltitude.get.asInstanceOf[js.Any])
    if (!js.isUndefined(GPSAltitudeRef)) __obj.updateDynamic("GPSAltitudeRef")(GPSAltitudeRef.get.asInstanceOf[js.Any])
    if (GPSDateStamp != null) __obj.updateDynamic("GPSDateStamp")(GPSDateStamp.asInstanceOf[js.Any])
    if (GPSLatitude != null) __obj.updateDynamic("GPSLatitude")(GPSLatitude.asInstanceOf[js.Any])
    if (GPSLatitudeRef != null) __obj.updateDynamic("GPSLatitudeRef")(GPSLatitudeRef.asInstanceOf[js.Any])
    if (GPSLongitude != null) __obj.updateDynamic("GPSLongitude")(GPSLongitude.asInstanceOf[js.Any])
    if (GPSLongitudeRef != null) __obj.updateDynamic("GPSLongitudeRef")(GPSLongitudeRef.asInstanceOf[js.Any])
    if (GPSTimeStamp != null) __obj.updateDynamic("GPSTimeStamp")(GPSTimeStamp.asInstanceOf[js.Any])
    if (GPSVersionId != null) __obj.updateDynamic("GPSVersionId")(GPSVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPSAltitude]
  }
}

