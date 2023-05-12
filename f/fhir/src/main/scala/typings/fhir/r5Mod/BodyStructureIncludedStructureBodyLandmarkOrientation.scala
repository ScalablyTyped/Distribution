package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyStructureIncludedStructureBodyLandmarkOrientation
  extends StObject
     with BackboneElement {
  
  /**
    * An description of the direction away from a landmark something is located based on a radial clock dial.
    */
  var clockFacePosition: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The distance in centimeters a certain observation is made from a body landmark.
    */
  var distanceFromLandmark: js.UndefOr[
    js.Array[BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmark]
  ] = js.undefined
  
  /**
    * A description of a landmark on the body used as a reference to locate something else.
    */
  var landmarkDescription: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The surface area a body location is in relation to a landmark.
    */
  var surfaceOrientation: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object BodyStructureIncludedStructureBodyLandmarkOrientation {
  
  inline def apply(): BodyStructureIncludedStructureBodyLandmarkOrientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyStructureIncludedStructureBodyLandmarkOrientation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyStructureIncludedStructureBodyLandmarkOrientation] (val x: Self) extends AnyVal {
    
    inline def setClockFacePosition(value: js.Array[CodeableConcept]): Self = StObject.set(x, "clockFacePosition", value.asInstanceOf[js.Any])
    
    inline def setClockFacePositionUndefined: Self = StObject.set(x, "clockFacePosition", js.undefined)
    
    inline def setClockFacePositionVarargs(value: CodeableConcept*): Self = StObject.set(x, "clockFacePosition", js.Array(value*))
    
    inline def setDistanceFromLandmark(value: js.Array[BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmark]): Self = StObject.set(x, "distanceFromLandmark", value.asInstanceOf[js.Any])
    
    inline def setDistanceFromLandmarkUndefined: Self = StObject.set(x, "distanceFromLandmark", js.undefined)
    
    inline def setDistanceFromLandmarkVarargs(value: BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmark*): Self = StObject.set(x, "distanceFromLandmark", js.Array(value*))
    
    inline def setLandmarkDescription(value: js.Array[CodeableConcept]): Self = StObject.set(x, "landmarkDescription", value.asInstanceOf[js.Any])
    
    inline def setLandmarkDescriptionUndefined: Self = StObject.set(x, "landmarkDescription", js.undefined)
    
    inline def setLandmarkDescriptionVarargs(value: CodeableConcept*): Self = StObject.set(x, "landmarkDescription", js.Array(value*))
    
    inline def setSurfaceOrientation(value: js.Array[CodeableConcept]): Self = StObject.set(x, "surfaceOrientation", value.asInstanceOf[js.Any])
    
    inline def setSurfaceOrientationUndefined: Self = StObject.set(x, "surfaceOrientation", js.undefined)
    
    inline def setSurfaceOrientationVarargs(value: CodeableConcept*): Self = StObject.set(x, "surfaceOrientation", js.Array(value*))
  }
}
