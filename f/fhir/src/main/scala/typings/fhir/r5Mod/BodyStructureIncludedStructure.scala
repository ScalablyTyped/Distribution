package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyStructureIncludedStructure
  extends StObject
     with BackboneElement {
  
  /**
    * Code that represents the included structure laterality.
    */
  var laterality: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Code that represents the included structure qualifier.
    */
  var qualifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
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
    
    inline def setLaterality(value: CodeableConcept): Self = StObject.set(x, "laterality", value.asInstanceOf[js.Any])
    
    inline def setLateralityUndefined: Self = StObject.set(x, "laterality", js.undefined)
    
    inline def setQualifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    
    inline def setQualifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "qualifier", js.Array(value*))
    
    inline def setStructure(value: CodeableConcept): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
  }
}
