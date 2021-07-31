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
  
  @scala.inline
  def apply(accuracy: Double, magHeading: Double, trueHeading: Double): LocationHeadingObject = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], magHeading = magHeading.asInstanceOf[js.Any], trueHeading = trueHeading.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationHeadingObject]
  }
  
  @scala.inline
  implicit class LocationHeadingObjectMutableBuilder[Self <: LocationHeadingObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagHeading(value: Double): Self = StObject.set(x, "magHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueHeading(value: Double): Self = StObject.set(x, "trueHeading", value.asInstanceOf[js.Any])
  }
}
