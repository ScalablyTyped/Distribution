package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmark
  extends StObject
     with BackboneElement {
  
  /**
    * An instrument, tool, analyzer, etc. used in the measurement.
    */
  var device: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The measured distance (e.g., in cm) from a body landmark.
    */
  var value: js.UndefOr[js.Array[Quantity]] = js.undefined
}
object BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmark {
  
  inline def apply(): BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmark] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: js.Array[CodeableReference]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDeviceVarargs(value: CodeableReference*): Self = StObject.set(x, "device", js.Array(value*))
    
    inline def setValue(value: js.Array[Quantity]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Quantity*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
