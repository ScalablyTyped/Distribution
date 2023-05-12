package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureGroup
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates a meaning for the group. This can be as simple as a unique identifier, or it can establish meaning in a broader context by drawing from a terminology, allowing groups to be correlated across measures.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The human readable description of this population group.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A population criteria for the measure.
    */
  var population: js.UndefOr[js.Array[MeasureGroupPopulation]] = js.undefined
  
  /**
    * The stratifier criteria for the measure report, specified as either the name of a valid CQL expression defined within a referenced library or a valid FHIR Resource Path.
    */
  var stratifier: js.UndefOr[js.Array[MeasureGroupStratifier]] = js.undefined
}
object MeasureGroup {
  
  inline def apply(): MeasureGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureGroup] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPopulation(value: js.Array[MeasureGroupPopulation]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: MeasureGroupPopulation*): Self = StObject.set(x, "population", js.Array(value*))
    
    inline def setStratifier(value: js.Array[MeasureGroupStratifier]): Self = StObject.set(x, "stratifier", value.asInstanceOf[js.Any])
    
    inline def setStratifierUndefined: Self = StObject.set(x, "stratifier", js.undefined)
    
    inline def setStratifierVarargs(value: MeasureGroupStratifier*): Self = StObject.set(x, "stratifier", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
