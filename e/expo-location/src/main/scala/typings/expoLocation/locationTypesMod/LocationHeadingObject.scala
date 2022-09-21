package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationHeadingObject extends StObject {
  
  /**
    * Level of calibration of compass.
    * - `3`: high accuracy, `2`: medium accuracy, `1`: low accuracy, `0`: none
    * Reference for iOS:
    * - `3`: < 20 degrees uncertainty, `2`: < 35 degrees, `1`: < 50 degrees, `0`: > 50 degrees
    */
  var accuracy: Double
  
  /**
    * Measure of magnetic north in degrees.
    */
  var magHeading: Double
  
  /**
    * Measure of true north in degrees (needs location permissions, will return `-1` if not given).
    */
  var trueHeading: Double
}
object LocationHeadingObject {
  
  inline def apply(accuracy: Double, magHeading: Double, trueHeading: Double): LocationHeadingObject = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], magHeading = magHeading.asInstanceOf[js.Any], trueHeading = trueHeading.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationHeadingObject]
  }
  
  extension [Self <: LocationHeadingObject](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setMagHeading(value: Double): Self = StObject.set(x, "magHeading", value.asInstanceOf[js.Any])
    
    inline def setTrueHeading(value: Double): Self = StObject.set(x, "trueHeading", value.asInstanceOf[js.Any])
  }
}
