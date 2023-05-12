package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureGroup
  extends StObject
     with BackboneElement {
  
  var _basis: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _library: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  var _rateAggregation: js.UndefOr[Element] = js.undefined
  
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
    * A reference to a Library resource containing the formal logic used by the measure group.
    */
  var library: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This ''can'' be a meaningful identifier (e.g. a LOINC code) but is not intended to have any meaning.  GUIDs or sequential numbers are appropriate here.
    * LinkIds can have whitespaces and slashes by design. Tooling should not rely on linkIds being valid XHTML element IDs, and should not directly embed them as such
    */
  var linkId: js.UndefOr[String] = js.undefined
  
  /**
    * A population criteria for the measure.
    */
  var population: js.UndefOr[js.Array[MeasureGroupPopulation]] = js.undefined
  
  /**
    * The measure rate for an organization or clinician is based upon the entities’ aggregate data and summarizes the performance of the entity over a given time period (e.g., monthly, quarterly, yearly). The aggregated data are derived from the results of a specific measure algorithm and, if appropriate, the application of specific risk adjustment models.  Can also be used to describe how to risk adjust the data based on supplemental data elements described in the eMeasure (e.g., pneumonia hospital measures antibiotic selection in the ICU versus non-ICU and then the roll-up of the two). This could be applied to aggregated cohort measure definitions (e.g., CDC's aggregate reporting for TB at the state level).
    */
  var rateAggregation: js.UndefOr[String] = js.undefined
  
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
    * The subject of the measure is critical in interpreting the criteria definitions, as the logic in the measures is evaluated with respect to a particular subject. This corresponds roughly to the notion of a Compartment in that it limits what content is available based on its relationship to the subject. In CQL, this corresponds to the context declaration.
    */
  var subjectCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The subject of the measure is critical in interpreting the criteria definitions, as the logic in the measures is evaluated with respect to a particular subject. This corresponds roughly to the notion of a Compartment in that it limits what content is available based on its relationship to the subject. In CQL, this corresponds to the context declaration.
    */
  var subjectReference: js.UndefOr[Reference] = js.undefined
  
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
    
    inline def setLibrary(value: js.Array[String]): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
    
    inline def setLibraryVarargs(value: String*): Self = StObject.set(x, "library", js.Array(value*))
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setPopulation(value: js.Array[MeasureGroupPopulation]): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    
    inline def setPopulationUndefined: Self = StObject.set(x, "population", js.undefined)
    
    inline def setPopulationVarargs(value: MeasureGroupPopulation*): Self = StObject.set(x, "population", js.Array(value*))
    
    inline def setRateAggregation(value: String): Self = StObject.set(x, "rateAggregation", value.asInstanceOf[js.Any])
    
    inline def setRateAggregationUndefined: Self = StObject.set(x, "rateAggregation", js.undefined)
    
    inline def setScoring(value: CodeableConcept): Self = StObject.set(x, "scoring", value.asInstanceOf[js.Any])
    
    inline def setScoringUndefined: Self = StObject.set(x, "scoring", js.undefined)
    
    inline def setScoringUnit(value: CodeableConcept): Self = StObject.set(x, "scoringUnit", value.asInstanceOf[js.Any])
    
    inline def setScoringUnitUndefined: Self = StObject.set(x, "scoringUnit", js.undefined)
    
    inline def setStratifier(value: js.Array[MeasureGroupStratifier]): Self = StObject.set(x, "stratifier", value.asInstanceOf[js.Any])
    
    inline def setStratifierUndefined: Self = StObject.set(x, "stratifier", js.undefined)
    
    inline def setStratifierVarargs(value: MeasureGroupStratifier*): Self = StObject.set(x, "stratifier", js.Array(value*))
    
    inline def setSubjectCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "subjectCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setSubjectCodeableConceptUndefined: Self = StObject.set(x, "subjectCodeableConcept", js.undefined)
    
    inline def setSubjectReference(value: Reference): Self = StObject.set(x, "subjectReference", value.asInstanceOf[js.Any])
    
    inline def setSubjectReferenceUndefined: Self = StObject.set(x, "subjectReference", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_basis(value: Element): Self = StObject.set(x, "_basis", value.asInstanceOf[js.Any])
    
    inline def set_basisUndefined: Self = StObject.set(x, "_basis", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_library(value: js.Array[Element]): Self = StObject.set(x, "_library", value.asInstanceOf[js.Any])
    
    inline def set_libraryUndefined: Self = StObject.set(x, "_library", js.undefined)
    
    inline def set_libraryVarargs(value: Element*): Self = StObject.set(x, "_library", js.Array(value*))
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    inline def set_rateAggregation(value: Element): Self = StObject.set(x, "_rateAggregation", value.asInstanceOf[js.Any])
    
    inline def set_rateAggregationUndefined: Self = StObject.set(x, "_rateAggregation", js.undefined)
  }
}
