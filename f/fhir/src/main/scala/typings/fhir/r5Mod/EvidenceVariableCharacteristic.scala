package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceVariableCharacteristic
  extends StObject
     with BackboneElement {
  
  var _definitionCanonical: js.UndefOr[Element] = js.undefined
  
  var _definitionId: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _exclude: js.UndefOr[Element] = js.undefined
  
  var _linkId: js.UndefOr[Element] = js.undefined
  
  /**
    * Defines the characteristic as a combination of two or more characteristics.
    */
  var definitionByCombination: js.UndefOr[EvidenceVariableCharacteristicDefinitionByCombination] = js.undefined
  
  /**
    * Defines the characteristic using both a type and value[x] elements.
    */
  var definitionByTypeAndValue: js.UndefOr[EvidenceVariableCharacteristicDefinitionByTypeAndValue] = js.undefined
  
  /**
    * Defines the characteristic using Canonical.
    */
  var definitionCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the characteristic using CodeableConcept.
    */
  var definitionCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * When another element provides a definition of the characteristic, the definitionExpression content SHALL match the definition (only adding technical concepts necessary for implementation) without changing the meaning.
    */
  var definitionExpression: js.UndefOr[Expression] = js.undefined
  
  /**
    * Defines the characteristic using id.
    */
  var definitionId: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the characteristic using a Reference.
    */
  var definitionReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A short, natural language description of the characteristic that could be used to communicate the criteria to an end-user.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Length of time in which the characteristic is met.
    */
  var durationQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Length of time in which the characteristic is met.
    */
  var durationRange: js.UndefOr[Range] = js.undefined
  
  /**
    * When true, this characteristic is an exclusion criterion. In other words, not matching this characteristic definition is equivalent to meeting this criterion.
    */
  var exclude: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of occurrences meeting the characteristic.
    */
  var instancesQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Number of occurrences meeting the characteristic.
    */
  var instancesRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Label used for when a characteristic refers to another characteristic.
    */
  var linkId: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable string to clarify or explain concepts about the characteristic.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Timing in which the characteristic is determined.
    */
  var timeFromEvent: js.UndefOr[js.Array[EvidenceVariableCharacteristicTimeFromEvent]] = js.undefined
}
object EvidenceVariableCharacteristic {
  
  inline def apply(): EvidenceVariableCharacteristic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvidenceVariableCharacteristic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceVariableCharacteristic] (val x: Self) extends AnyVal {
    
    inline def setDefinitionByCombination(value: EvidenceVariableCharacteristicDefinitionByCombination): Self = StObject.set(x, "definitionByCombination", value.asInstanceOf[js.Any])
    
    inline def setDefinitionByCombinationUndefined: Self = StObject.set(x, "definitionByCombination", js.undefined)
    
    inline def setDefinitionByTypeAndValue(value: EvidenceVariableCharacteristicDefinitionByTypeAndValue): Self = StObject.set(x, "definitionByTypeAndValue", value.asInstanceOf[js.Any])
    
    inline def setDefinitionByTypeAndValueUndefined: Self = StObject.set(x, "definitionByTypeAndValue", js.undefined)
    
    inline def setDefinitionCanonical(value: String): Self = StObject.set(x, "definitionCanonical", value.asInstanceOf[js.Any])
    
    inline def setDefinitionCanonicalUndefined: Self = StObject.set(x, "definitionCanonical", js.undefined)
    
    inline def setDefinitionCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "definitionCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setDefinitionCodeableConceptUndefined: Self = StObject.set(x, "definitionCodeableConcept", js.undefined)
    
    inline def setDefinitionExpression(value: Expression): Self = StObject.set(x, "definitionExpression", value.asInstanceOf[js.Any])
    
    inline def setDefinitionExpressionUndefined: Self = StObject.set(x, "definitionExpression", js.undefined)
    
    inline def setDefinitionId(value: String): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    inline def setDefinitionIdUndefined: Self = StObject.set(x, "definitionId", js.undefined)
    
    inline def setDefinitionReference(value: Reference): Self = StObject.set(x, "definitionReference", value.asInstanceOf[js.Any])
    
    inline def setDefinitionReferenceUndefined: Self = StObject.set(x, "definitionReference", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDurationQuantity(value: Quantity): Self = StObject.set(x, "durationQuantity", value.asInstanceOf[js.Any])
    
    inline def setDurationQuantityUndefined: Self = StObject.set(x, "durationQuantity", js.undefined)
    
    inline def setDurationRange(value: Range): Self = StObject.set(x, "durationRange", value.asInstanceOf[js.Any])
    
    inline def setDurationRangeUndefined: Self = StObject.set(x, "durationRange", js.undefined)
    
    inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setInstancesQuantity(value: Quantity): Self = StObject.set(x, "instancesQuantity", value.asInstanceOf[js.Any])
    
    inline def setInstancesQuantityUndefined: Self = StObject.set(x, "instancesQuantity", js.undefined)
    
    inline def setInstancesRange(value: Range): Self = StObject.set(x, "instancesRange", value.asInstanceOf[js.Any])
    
    inline def setInstancesRangeUndefined: Self = StObject.set(x, "instancesRange", js.undefined)
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setTimeFromEvent(value: js.Array[EvidenceVariableCharacteristicTimeFromEvent]): Self = StObject.set(x, "timeFromEvent", value.asInstanceOf[js.Any])
    
    inline def setTimeFromEventUndefined: Self = StObject.set(x, "timeFromEvent", js.undefined)
    
    inline def setTimeFromEventVarargs(value: EvidenceVariableCharacteristicTimeFromEvent*): Self = StObject.set(x, "timeFromEvent", js.Array(value*))
    
    inline def set_definitionCanonical(value: Element): Self = StObject.set(x, "_definitionCanonical", value.asInstanceOf[js.Any])
    
    inline def set_definitionCanonicalUndefined: Self = StObject.set(x, "_definitionCanonical", js.undefined)
    
    inline def set_definitionId(value: Element): Self = StObject.set(x, "_definitionId", value.asInstanceOf[js.Any])
    
    inline def set_definitionIdUndefined: Self = StObject.set(x, "_definitionId", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_exclude(value: Element): Self = StObject.set(x, "_exclude", value.asInstanceOf[js.Any])
    
    inline def set_excludeUndefined: Self = StObject.set(x, "_exclude", js.undefined)
    
    inline def set_linkId(value: Element): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
  }
}
