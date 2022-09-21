package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`mean-of-mean`
import typings.fhir.fhirStrings.`mean-of-median`
import typings.fhir.fhirStrings.`median-of-mean`
import typings.fhir.fhirStrings.`median-of-median`
import typings.fhir.fhirStrings.mean
import typings.fhir.fhirStrings.median
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceVariableCharacteristic
  extends StObject
     with BackboneElement {
  
  var _definitionCanonical: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _exclude: js.UndefOr[Element] = js.undefined
  
  var _groupMeasure: js.UndefOr[Element] = js.undefined
  
  /**
    * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
    */
  var definitionCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
    */
  var definitionCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
    */
  var definitionExpression: js.UndefOr[Expression] = js.undefined
  
  /**
    * Define members of the evidence element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
    */
  var definitionReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A short, natural language description of the characteristic that could be used to communicate the criteria to an end-user.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Device used for determining characteristic.
    */
  var device: js.UndefOr[Reference] = js.undefined
  
  /**
    * When true, members with this characteristic are excluded from the element.
    */
  var exclude: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates how elements are aggregated within the study effective period.
    */
  var groupMeasure: js.UndefOr[
    mean | median | `mean-of-mean` | `mean-of-median` | `median-of-mean` | `median-of-median`
  ] = js.undefined
  
  /**
    * Method used for describing characteristic.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates duration, period, or point of observation from the participant's study entry.
    */
  var timeFromStart: js.UndefOr[EvidenceVariableCharacteristicTimeFromStart] = js.undefined
}
object EvidenceVariableCharacteristic {
  
  inline def apply(): EvidenceVariableCharacteristic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvidenceVariableCharacteristic]
  }
  
  extension [Self <: EvidenceVariableCharacteristic](x: Self) {
    
    inline def setDefinitionCanonical(value: String): Self = StObject.set(x, "definitionCanonical", value.asInstanceOf[js.Any])
    
    inline def setDefinitionCanonicalUndefined: Self = StObject.set(x, "definitionCanonical", js.undefined)
    
    inline def setDefinitionCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "definitionCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setDefinitionCodeableConceptUndefined: Self = StObject.set(x, "definitionCodeableConcept", js.undefined)
    
    inline def setDefinitionExpression(value: Expression): Self = StObject.set(x, "definitionExpression", value.asInstanceOf[js.Any])
    
    inline def setDefinitionExpressionUndefined: Self = StObject.set(x, "definitionExpression", js.undefined)
    
    inline def setDefinitionReference(value: Reference): Self = StObject.set(x, "definitionReference", value.asInstanceOf[js.Any])
    
    inline def setDefinitionReferenceUndefined: Self = StObject.set(x, "definitionReference", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setGroupMeasure(value: mean | median | `mean-of-mean` | `mean-of-median` | `median-of-mean` | `median-of-median`): Self = StObject.set(x, "groupMeasure", value.asInstanceOf[js.Any])
    
    inline def setGroupMeasureUndefined: Self = StObject.set(x, "groupMeasure", js.undefined)
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setTimeFromStart(value: EvidenceVariableCharacteristicTimeFromStart): Self = StObject.set(x, "timeFromStart", value.asInstanceOf[js.Any])
    
    inline def setTimeFromStartUndefined: Self = StObject.set(x, "timeFromStart", js.undefined)
    
    inline def set_definitionCanonical(value: Element): Self = StObject.set(x, "_definitionCanonical", value.asInstanceOf[js.Any])
    
    inline def set_definitionCanonicalUndefined: Self = StObject.set(x, "_definitionCanonical", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_exclude(value: Element): Self = StObject.set(x, "_exclude", value.asInstanceOf[js.Any])
    
    inline def set_excludeUndefined: Self = StObject.set(x, "_exclude", js.undefined)
    
    inline def set_groupMeasure(value: Element): Self = StObject.set(x, "_groupMeasure", value.asInstanceOf[js.Any])
    
    inline def set_groupMeasureUndefined: Self = StObject.set(x, "_groupMeasure", js.undefined)
  }
}
