package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureGroup
  extends StObject
     with BackboneElement {
  
  var _basis: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * When specified at the group level, defines the population basis for this specific group. If not specified, the basis for the group is determined by the root basis element
    */
  var basis: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates a meaning for the group. This can be as simple as a unique identifier, or it can establish meaning in a broader context by drawing from a terminology, allowing groups to be correlated across measures.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The human readable description of this population group.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * When specified at the group level, this element defines the improvementNotation for this specific group. If not specified, improvementNotation for this group is determined by the root improvementNotation element
    */
  var improvementNotation: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A population criteria for the measure.
    */
  var population: js.UndefOr[js.Array[MeasureGroupPopulation]] = js.undefined
  
  /**
    * When specified at the group level, defines the scoring for this specific group. If not specified, scoring for this group is determined by the root scoring element
    */
  var scoring: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * When specified at the group level, this defines the scoringUnit for this specific group. If not specified, the scoringUnit for this group is determined by the root scoringUnit element. As with the root element, when this element is specified, implementations are expected to report measure scores in the specified units. Note that this may involve unit conversion if the expected units are different than the units of the resulting score calculation. In this case, unit conversions SHALL be performed according to the unit conversion semantics specified by UCUM.
    */
  var scoringUnit: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The stratifier criteria for the measure report, specified as either the name of a valid CQL expression defined within a referenced library or a valid FHIR Resource Path.
    */
  var stratifier: js.UndefOr[js.Array[MeasureGroupStratifier]] = js.undefined
  
  /**
    * When specified at the group level, defines the measure type for this specific group. If not specified, the measureType of the group is determined by the root type element
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object MeasureGroup {
  
  inline def apply(): MeasureGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureGroup] (val x: Self) extends AnyVal {
    
    inline def setBasis(value: String): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
    
    inline def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setImprovementNotation(value: CodeableConcept): Self = StObject.set(x, "improvementNotation", value.asInstanceOf[js.Any])
    
    inline def setImprovementNotationUndefined: Self = StObject.set(x, "improvementNotation", js.undefined)
    
    inline def setPopulation(value: js.Array[MeasureGroupPopulation]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: MeasureGroupPopulation*): Self = StObject.set(x, "population", js.Array(value*))
    
    inline def setScoring(value: CodeableConcept): Self = StObject.set(x, "scoring", value.asInstanceOf[js.Any])
    
    inline def setScoringUndefined: Self = StObject.set(x, "scoring", js.undefined)
    
    inline def setScoringUnit(value: CodeableConcept): Self = StObject.set(x, "scoringUnit", value.asInstanceOf[js.Any])
    
    inline def setScoringUnitUndefined: Self = StObject.set(x, "scoringUnit", js.undefined)
    
    inline def setStratifier(value: js.Array[MeasureGroupStratifier]): Self = StObject.set(x, "stratifier", value.asInstanceOf[js.Any])
    
    inline def setStratifierUndefined: Self = StObject.set(x, "stratifier", js.undefined)
    
    inline def setStratifierVarargs(value: MeasureGroupStratifier*): Self = StObject.set(x, "stratifier", js.Array(value*))
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_basis(value: Element): Self = StObject.set(x, "_basis", value.asInstanceOf[js.Any])
    
    inline def set_basisUndefined: Self = StObject.set(x, "_basis", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
