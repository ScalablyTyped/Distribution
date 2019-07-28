package typings.exif

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GPSAltitude extends js.Object {
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

object Anon_GPSAltitude {
  @scala.inline
  def apply(
    GPSAltitude: Int | Double = null,
    GPSAltitudeRef: Int | Double = null,
    GPSDateStamp: String = null,
    GPSLatitude: js.Array[Double] = null,
    GPSLatitudeRef: String = null,
    GPSLongitude: js.Array[Double] = null,
    GPSLongitudeRef: String = null,
    GPSTimeStamp: js.Array[Double] = null,
    GPSVersionId: js.Array[Double] = null
  ): Anon_GPSAltitude = {
    val __obj = js.Dynamic.literal()
    if (GPSAltitude != null) __obj.updateDynamic("GPSAltitude")(GPSAltitude.asInstanceOf[js.Any])
    if (GPSAltitudeRef != null) __obj.updateDynamic("GPSAltitudeRef")(GPSAltitudeRef.asInstanceOf[js.Any])
    if (GPSDateStamp != null) __obj.updateDynamic("GPSDateStamp")(GPSDateStamp)
    if (GPSLatitude != null) __obj.updateDynamic("GPSLatitude")(GPSLatitude)
    if (GPSLatitudeRef != null) __obj.updateDynamic("GPSLatitudeRef")(GPSLatitudeRef)
    if (GPSLongitude != null) __obj.updateDynamic("GPSLongitude")(GPSLongitude)
    if (GPSLongitudeRef != null) __obj.updateDynamic("GPSLongitudeRef")(GPSLongitudeRef)
    if (GPSTimeStamp != null) __obj.updateDynamic("GPSTimeStamp")(GPSTimeStamp)
    if (GPSVersionId != null) __obj.updateDynamic("GPSVersionId")(GPSVersionId)
    __obj.asInstanceOf[Anon_GPSAltitude]
  }
}

