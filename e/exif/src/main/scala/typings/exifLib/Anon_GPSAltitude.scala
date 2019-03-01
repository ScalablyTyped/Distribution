package typings
package exifLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GPSAltitude extends js.Object {
  var GPSAltitude: js.UndefOr[scala.Double] = js.undefined
  var GPSAltitudeRef: js.UndefOr[scala.Double] = js.undefined
  var GPSDateStamp: js.UndefOr[java.lang.String] = js.undefined
  var GPSLatitude: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var GPSLatitudeRef: js.UndefOr[java.lang.String] = js.undefined
  var GPSLongitude: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var GPSLongitudeRef: js.UndefOr[java.lang.String] = js.undefined
  var GPSTimeStamp: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var GPSVersionId: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_GPSAltitude {
  @scala.inline
  def apply(
    GPSAltitude: scala.Int | scala.Double = null,
    GPSAltitudeRef: scala.Int | scala.Double = null,
    GPSDateStamp: java.lang.String = null,
    GPSLatitude: js.Array[scala.Double] = null,
    GPSLatitudeRef: java.lang.String = null,
    GPSLongitude: js.Array[scala.Double] = null,
    GPSLongitudeRef: java.lang.String = null,
    GPSTimeStamp: js.Array[scala.Double] = null,
    GPSVersionId: js.Array[scala.Double] = null
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

