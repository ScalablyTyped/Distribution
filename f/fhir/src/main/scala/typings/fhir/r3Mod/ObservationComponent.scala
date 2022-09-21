package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservationComponent
  extends StObject
     with BackboneElement {
  
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  var _valueTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes what was observed. Sometimes this is called the observation "code".
    */
  var code: CodeableConcept
  
  /**
    * "Null" or exceptional values can be represented two ways in FHIR Observations.  One way is to simply include them in the value set and represent the exceptions in the value.  For example, measurement values for a serology test could be  "detected", "not detected", "inconclusive", or  "test not done".   The alternate way is to use the value element for actual observations and use the explicit dataAbsentReason element to record exceptional values.  For example, the dataAbsentReason code "error" could be used when the measurement was not completed.  Because of these options, use-case agreements are required to interpret general observations for exceptional values.
    */
  var dataAbsentReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The component interpretation applies only to the individual component value.  For an overall interpretation all components together use thes Observation.interpretation element.
    */
  var interpretation: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Most observations only have one generic reference range. Systems MAY choose to restrict to only supplying the relevant reference range based on knowledge about the patient (e.g., specific to the patient's age, gender, weight and other factors), but this may not be possible or appropriate. Whenever more than one reference range is supplied, the differences between them SHOULD be provided in the reference range and/or age properties.
    */
  var referenceRange: js.UndefOr[js.Array[ObservationReferenceRange]] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Observation.code defines a coded value.   For boolean values use valueCodeableConcept and select codes from <http://hl7.org/fhir/ValueSet/v2-0136> (these "yes/no" concepts can be mapped to the display name "true/false" or other mutually exclusive terms that may be needed").  The element, Observation.value[x], has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueRatio, valueChoice, valuePeriod, valueSampleData, or valueString (the name format is "'value' + the type name" with a capital on the first letter of the type).
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Observation.code defines a coded value.   For boolean values use valueCodeableConcept and select codes from <http://hl7.org/fhir/ValueSet/v2-0136> (these "yes/no" concepts can be mapped to the display name "true/false" or other mutually exclusive terms that may be needed").  The element, Observation.value[x], has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueRatio, valueChoice, valuePeriod, valueSampleData, or valueString (the name format is "'value' + the type name" with a capital on the first letter of the type).
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Observation.code defines a coded value.   For boolean values use valueCodeableConcept and select codes from <http://hl7.org/fhir/ValueSet/v2-0136> (these "yes/no" concepts can be mapped to the display name "true/false" or other mutually exclusive terms that may be needed").  The element, Observation.value[x], has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueRatio, valueChoice, valuePeriod, valueSampleData, or valueString (the name format is "'value' + the type name" with a capital on the first letter of the type).
    */
  var valueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Observation.code defines a coded value.   For boolean values use valueCodeableConcept and select codes from <http://hl7.org/fhir/ValueSet/v2-0136> (these "yes/no" concepts can be mapped to the display name "true/false" or other mutually exclusive terms that may be needed").  The element, Observation.value[x], has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueRatio, valueChoice, valuePeriod, valueSampleData, or valueString (the name format is "'value' + the type name" with a capital on the first letter of the type).
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Observation.code defines a coded value.   For boolean values use valueCodeableConcept and select codes from <http://hl7.org/fhir/ValueSet/v2-0136> (these "yes/no" concepts can be mapped to the display name "true/false" or other mutually exclusive terms that may be needed").  The element, Observation.value[x], has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueRatio, valueChoice, valuePeriod, valueSampleData, or valueString (the name format is "'value' + the type name" with a capital on the first letter of the type).
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Observation.code defines a coded value.   For boolean values use valueCodeableConcept and select codes from <http://hl7.org/fhir/ValueSet/v2-0136> (these "yes/no" concepts can be mapped to the display name "true/false" or other mutually exclusive terms that may be needed").  The element, Observation.value[x], has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueRatio, valueChoice, valuePeriod, valueSampleData, or valueString (the name format is "'value' + the type name" with a capital on the first letter of the type).
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Observation.code defines a coded value.   For boolean values use valueCodeableConcept and select codes from <http://hl7.org/fhir/ValueSet/v2-0136> (these "yes/no" concepts can be mapped to the display name "true/false" or other mutually exclusive terms that may be needed").  The element, Observation.value[x], has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueRatio, valueChoice, valuePeriod, valueSampleData, or valueString (the name format is "'value' + the type name" with a capital on the first letter of the type).
    */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Observation.code defines a coded value.   For boolean values use valueCodeableConcept and select codes from <http://hl7.org/fhir/ValueSet/v2-0136> (these "yes/no" concepts can be mapped to the display name "true/false" or other mutually exclusive terms that may be needed").  The element, Observation.value[x], has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueRatio, valueChoice, valuePeriod, valueSampleData, or valueString (the name format is "'value' + the type name" with a capital on the first letter of the type).
    */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Observation.code defines a coded value.   For boolean values use valueCodeableConcept and select codes from <http://hl7.org/fhir/ValueSet/v2-0136> (these "yes/no" concepts can be mapped to the display name "true/false" or other mutually exclusive terms that may be needed").  The element, Observation.value[x], has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueRatio, valueChoice, valuePeriod, valueSampleData, or valueString (the name format is "'value' + the type name" with a capital on the first letter of the type).
    */
  var valueString: js.UndefOr[String] = js.undefined
  
  /**
    * Normally, an observation will have either a single value or a set of related observations. A few observations (e.g. Apgar score) may have both a value and related observations (for an Apgar score, the observations from which the measure is derived). If a value is present, the datatype for this element should be determined by Observation.code. A CodeableConcept with just a text would be used instead of a string if the field was usually coded, or if the type associated with the Observation.code defines a coded value.   For boolean values use valueCodeableConcept and select codes from <http://hl7.org/fhir/ValueSet/v2-0136> (these "yes/no" concepts can be mapped to the display name "true/false" or other mutually exclusive terms that may be needed").  The element, Observation.value[x], has a variable name depending on the type as follows: valueQuantity, valueCodeableConcept, valueRatio, valueChoice, valuePeriod, valueSampleData, or valueString (the name format is "'value' + the type name" with a capital on the first letter of the type).
    */
  var valueTime: js.UndefOr[String] = js.undefined
}
object ObservationComponent {
  
  inline def apply(code: CodeableConcept): ObservationComponent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservationComponent]
  }
  
  extension [Self <: ObservationComponent](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDataAbsentReason(value: CodeableConcept): Self = StObject.set(x, "dataAbsentReason", value.asInstanceOf[js.Any])
    
    inline def setDataAbsentReasonUndefined: Self = StObject.set(x, "dataAbsentReason", js.undefined)
    
    inline def setInterpretation(value: CodeableConcept): Self = StObject.set(x, "interpretation", value.asInstanceOf[js.Any])
    
    inline def setInterpretationUndefined: Self = StObject.set(x, "interpretation", js.undefined)
    
    inline def setReferenceRange(value: js.Array[ObservationReferenceRange]): Self = StObject.set(x, "referenceRange", value.asInstanceOf[js.Any])
    
    inline def setReferenceRangeUndefined: Self = StObject.set(x, "referenceRange", js.undefined)
    
    inline def setReferenceRangeVarargs(value: ObservationReferenceRange*): Self = StObject.set(x, "referenceRange", js.Array(value*))
    
    inline def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    inline def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueDateTime(value: String): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    inline def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    inline def setValuePeriod(value: Period): Self = StObject.set(x, "valuePeriod", value.asInstanceOf[js.Any])
    
    inline def setValuePeriodUndefined: Self = StObject.set(x, "valuePeriod", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    inline def setValueRatio(value: Ratio): Self = StObject.set(x, "valueRatio", value.asInstanceOf[js.Any])
    
    inline def setValueRatioUndefined: Self = StObject.set(x, "valueRatio", js.undefined)
    
    inline def setValueSampledData(value: SampledData): Self = StObject.set(x, "valueSampledData", value.asInstanceOf[js.Any])
    
    inline def setValueSampledDataUndefined: Self = StObject.set(x, "valueSampledData", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def setValueTime(value: String): Self = StObject.set(x, "valueTime", value.asInstanceOf[js.Any])
    
    inline def setValueTimeUndefined: Self = StObject.set(x, "valueTime", js.undefined)
    
    inline def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
    
    inline def set_valueTime(value: Element): Self = StObject.set(x, "_valueTime", value.asInstanceOf[js.Any])
    
    inline def set_valueTimeUndefined: Self = StObject.set(x, "_valueTime", js.undefined)
  }
}
