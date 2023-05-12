package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyStructureIncludedStructure
  extends StObject
     with BackboneElement {
  
  /**
    * Body locations in relation to a specific body landmark (tatoo, scar, other body structure).
    */
  var bodyLandmarkOrientation: js.UndefOr[js.Array[BodyStructureIncludedStructureBodyLandmarkOrientation]] = js.undefined
  
  /**
    * Code that represents the included structure laterality.
    */
  var laterality: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Code that represents the included structure qualifier.
    */
  var qualifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * XY or XYZ-coordinate orientation for structure.
    */
  var spatialReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Code that represents the included structure.
    */
  var structure: CodeableConcept
}
object BodyStructureIncludedStructure {
  
  inline def apply(structure: CodeableConcept): BodyStructureIncludedStructure = {
    val __obj = js.Dynamic.literal(structure = structure.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyStructureIncludedStructure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyStructureIncludedStructure] (val x: Self) extends AnyVal {
    
    inline def setBodyLandmarkOrientation(value: js.Array[BodyStructureIncludedStructureBodyLandmarkOrientation]): Self = StObject.set(x, "bodyLandmarkOrientation", value.asInstanceOf[js.Any])
    
    inline def setBodyLandmarkOrientationUndefined: Self = StObject.set(x, "bodyLandmarkOrientation", js.undefined)
    
    inline def setBodyLandmarkOrientationVarargs(value: BodyStructureIncludedStructureBodyLandmarkOrientation*): Self = StObject.set(x, "bodyLandmarkOrientation", js.Array(value*))
    
    inline def setLaterality(value: CodeableConcept): Self = StObject.set(x, "laterality", value.asInstanceOf[js.Any])
    
    inline def setLateralityUndefined: Self = StObject.set(x, "laterality", js.undefined)
    
    inline def setQualifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    
    inline def setQualifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "qualifier", js.Array(value*))
    
    inline def setSpatialReference(value: js.Array[Reference]): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setSpatialReferenceVarargs(value: Reference*): Self = StObject.set(x, "spatialReference", js.Array(value*))
    
    inline def setStructure(value: CodeableConcept): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
  }
}
