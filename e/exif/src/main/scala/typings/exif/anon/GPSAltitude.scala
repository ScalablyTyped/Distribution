package typings.exif.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPSAltitude extends js.Object {
  
  var GPSAltitude: js.UndefOr[Double] = js.native
  
  var GPSAltitudeRef: js.UndefOr[Double] = js.native
  
  var GPSAreaInformation: js.UndefOr[Buffer] = js.native
  
  var GPSDOP: js.UndefOr[Double] = js.native
  
  var GPSDateStamp: js.UndefOr[String] = js.native
  
  var GPSDestBearing: js.UndefOr[Double] = js.native
  
  var GPSDestBearingRef: js.UndefOr[String] = js.native
  
  var GPSDestDistance: js.UndefOr[Double] = js.native
  
  var GPSDestDistanceRef: js.UndefOr[String] = js.native
  
  var GPSDestLatitude: js.UndefOr[js.Array[Double]] = js.native
  
  var GPSDestLatitudeRef: js.UndefOr[String] = js.native
  
  var GPSDestLongitude: js.UndefOr[js.Array[Double]] = js.native
  
  var GPSDestLongitudeRef: js.UndefOr[String] = js.native
  
  var GPSDifferential: js.UndefOr[Double] = js.native
  
  var GPSHPositioningError: js.UndefOr[Double] = js.native
  
  var GPSImgDirection: js.UndefOr[Double] = js.native
  
  var GPSImgDirectionRef: js.UndefOr[String] = js.native
  
  var GPSLatitude: js.UndefOr[js.Array[Double]] = js.native
  
  var GPSLatitudeRef: js.UndefOr[String] = js.native
  
  var GPSLongitude: js.UndefOr[js.Array[Double]] = js.native
  
  var GPSLongitudeRef: js.UndefOr[String] = js.native
  
  var GPSMapDatum: js.UndefOr[String] = js.native
  
  var GPSMeasureMode: js.UndefOr[String] = js.native
  
  var GPSProcessingMethod: js.UndefOr[Buffer] = js.native
  
  var GPSSatellites: js.UndefOr[String] = js.native
  
  var GPSSpeed: js.UndefOr[Double] = js.native
  
  var GPSSpeedRef: js.UndefOr[String] = js.native
  
  var GPSStatus: js.UndefOr[String] = js.native
  
  var GPSTimeStamp: js.UndefOr[js.Array[Double]] = js.native
  
  var GPSTrack: js.UndefOr[Double] = js.native
  
  var GPSTrackRef: js.UndefOr[String] = js.native
  
  var GPSVersionId: js.UndefOr[js.Array[Double]] = js.native
}
object GPSAltitude {
  
  @scala.inline
  def apply(): GPSAltitude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPSAltitude]
  }
  
  @scala.inline
  implicit class GPSAltitudeOps[Self <: GPSAltitude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGPSAltitude(value: Double): Self = this.set("GPSAltitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSAltitude: Self = this.set("GPSAltitude", js.undefined)
    
    @scala.inline
    def setGPSAltitudeRef(value: Double): Self = this.set("GPSAltitudeRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSAltitudeRef: Self = this.set("GPSAltitudeRef", js.undefined)
    
    @scala.inline
    def setGPSAreaInformation(value: Buffer): Self = this.set("GPSAreaInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSAreaInformation: Self = this.set("GPSAreaInformation", js.undefined)
    
    @scala.inline
    def setGPSDOP(value: Double): Self = this.set("GPSDOP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSDOP: Self = this.set("GPSDOP", js.undefined)
    
    @scala.inline
    def setGPSDateStamp(value: String): Self = this.set("GPSDateStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSDateStamp: Self = this.set("GPSDateStamp", js.undefined)
    
    @scala.inline
    def setGPSDestBearing(value: Double): Self = this.set("GPSDestBearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSDestBearing: Self = this.set("GPSDestBearing", js.undefined)
    
    @scala.inline
    def setGPSDestBearingRef(value: String): Self = this.set("GPSDestBearingRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSDestBearingRef: Self = this.set("GPSDestBearingRef", js.undefined)
    
    @scala.inline
    def setGPSDestDistance(value: Double): Self = this.set("GPSDestDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSDestDistance: Self = this.set("GPSDestDistance", js.undefined)
    
    @scala.inline
    def setGPSDestDistanceRef(value: String): Self = this.set("GPSDestDistanceRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSDestDistanceRef: Self = this.set("GPSDestDistanceRef", js.undefined)
    
    @scala.inline
    def setGPSDestLatitudeVarargs(value: Double*): Self = this.set("GPSDestLatitude", js.Array(value :_*))
    
    @scala.inline
    def setGPSDestLatitude(value: js.Array[Double]): Self = this.set("GPSDestLatitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSDestLatitude: Self = this.set("GPSDestLatitude", js.undefined)
    
    @scala.inline
    def setGPSDestLatitudeRef(value: String): Self = this.set("GPSDestLatitudeRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSDestLatitudeRef: Self = this.set("GPSDestLatitudeRef", js.undefined)
    
    @scala.inline
    def setGPSDestLongitudeVarargs(value: Double*): Self = this.set("GPSDestLongitude", js.Array(value :_*))
    
    @scala.inline
    def setGPSDestLongitude(value: js.Array[Double]): Self = this.set("GPSDestLongitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSDestLongitude: Self = this.set("GPSDestLongitude", js.undefined)
    
    @scala.inline
    def setGPSDestLongitudeRef(value: String): Self = this.set("GPSDestLongitudeRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSDestLongitudeRef: Self = this.set("GPSDestLongitudeRef", js.undefined)
    
    @scala.inline
    def setGPSDifferential(value: Double): Self = this.set("GPSDifferential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSDifferential: Self = this.set("GPSDifferential", js.undefined)
    
    @scala.inline
    def setGPSHPositioningError(value: Double): Self = this.set("GPSHPositioningError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSHPositioningError: Self = this.set("GPSHPositioningError", js.undefined)
    
    @scala.inline
    def setGPSImgDirection(value: Double): Self = this.set("GPSImgDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSImgDirection: Self = this.set("GPSImgDirection", js.undefined)
    
    @scala.inline
    def setGPSImgDirectionRef(value: String): Self = this.set("GPSImgDirectionRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSImgDirectionRef: Self = this.set("GPSImgDirectionRef", js.undefined)
    
    @scala.inline
    def setGPSLatitudeVarargs(value: Double*): Self = this.set("GPSLatitude", js.Array(value :_*))
    
    @scala.inline
    def setGPSLatitude(value: js.Array[Double]): Self = this.set("GPSLatitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSLatitude: Self = this.set("GPSLatitude", js.undefined)
    
    @scala.inline
    def setGPSLatitudeRef(value: String): Self = this.set("GPSLatitudeRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSLatitudeRef: Self = this.set("GPSLatitudeRef", js.undefined)
    
    @scala.inline
    def setGPSLongitudeVarargs(value: Double*): Self = this.set("GPSLongitude", js.Array(value :_*))
    
    @scala.inline
    def setGPSLongitude(value: js.Array[Double]): Self = this.set("GPSLongitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSLongitude: Self = this.set("GPSLongitude", js.undefined)
    
    @scala.inline
    def setGPSLongitudeRef(value: String): Self = this.set("GPSLongitudeRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSLongitudeRef: Self = this.set("GPSLongitudeRef", js.undefined)
    
    @scala.inline
    def setGPSMapDatum(value: String): Self = this.set("GPSMapDatum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSMapDatum: Self = this.set("GPSMapDatum", js.undefined)
    
    @scala.inline
    def setGPSMeasureMode(value: String): Self = this.set("GPSMeasureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSMeasureMode: Self = this.set("GPSMeasureMode", js.undefined)
    
    @scala.inline
    def setGPSProcessingMethod(value: Buffer): Self = this.set("GPSProcessingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSProcessingMethod: Self = this.set("GPSProcessingMethod", js.undefined)
    
    @scala.inline
    def setGPSSatellites(value: String): Self = this.set("GPSSatellites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSSatellites: Self = this.set("GPSSatellites", js.undefined)
    
    @scala.inline
    def setGPSSpeed(value: Double): Self = this.set("GPSSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSSpeed: Self = this.set("GPSSpeed", js.undefined)
    
    @scala.inline
    def setGPSSpeedRef(value: String): Self = this.set("GPSSpeedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSSpeedRef: Self = this.set("GPSSpeedRef", js.undefined)
    
    @scala.inline
    def setGPSStatus(value: String): Self = this.set("GPSStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSStatus: Self = this.set("GPSStatus", js.undefined)
    
    @scala.inline
    def setGPSTimeStampVarargs(value: Double*): Self = this.set("GPSTimeStamp", js.Array(value :_*))
    
    @scala.inline
    def setGPSTimeStamp(value: js.Array[Double]): Self = this.set("GPSTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSTimeStamp: Self = this.set("GPSTimeStamp", js.undefined)
    
    @scala.inline
    def setGPSTrack(value: Double): Self = this.set("GPSTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSTrack: Self = this.set("GPSTrack", js.undefined)
    
    @scala.inline
    def setGPSTrackRef(value: String): Self = this.set("GPSTrackRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSTrackRef: Self = this.set("GPSTrackRef", js.undefined)
    
    @scala.inline
    def setGPSVersionIdVarargs(value: Double*): Self = this.set("GPSVersionId", js.Array(value :_*))
    
    @scala.inline
    def setGPSVersionId(value: js.Array[Double]): Self = this.set("GPSVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGPSVersionId: Self = this.set("GPSVersionId", js.undefined)
  }
}
