package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationHeadingObject extends StObject {
  
  var accuracy: Double
  
  var magHeading: Double
  
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
