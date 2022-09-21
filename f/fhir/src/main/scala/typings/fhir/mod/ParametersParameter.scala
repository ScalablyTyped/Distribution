package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersParameter
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _valueBase64Binary: js.UndefOr[Element] = js.undefined
  
  var _valueBoolean: js.UndefOr[Element] = js.undefined
  
  var _valueCode: js.UndefOr[Element] = js.undefined
  
  var _valueDate: js.UndefOr[Element] = js.undefined
  
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  
  var _valueId: js.UndefOr[Element] = js.undefined
  
  var _valueInstant: js.UndefOr[Element] = js.undefined
  
  var _valueMarkdown: js.UndefOr[Element] = js.undefined
  
  var _valueOid: js.UndefOr[Element] = js.undefined
  
  var _valueString: js.UndefOr[Element] = js.undefined
  
  var _valueTime: js.UndefOr[Element] = js.undefined
  
  var _valueUri: js.UndefOr[Element] = js.undefined
  
  /**
    * The name of the parameter (reference to the operation definition).
    */
  var name: String
  
  /**
    * A named part of a parameter. In many implementation context, a set of named parts is known as a "Tuple".
    */
  var part: js.UndefOr[js.Array[ParametersParameter]] = js.undefined
  
  /**
    * If the parameter is a whole resource.
    */
  var resource: js.UndefOr[FhirResource] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueAnnotation: js.UndefOr[Annotation] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueBase64Binary: js.UndefOr[String] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueCode: js.UndefOr[String] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueCoding: js.UndefOr[Coding] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueContactPoint: js.UndefOr[ContactPoint] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueDate: js.UndefOr[String] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueDecimal: js.UndefOr[Double] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueHumanName: js.UndefOr[HumanName] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueId: js.UndefOr[String] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueInstant: js.UndefOr[String] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueMarkdown: js.UndefOr[String] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueMeta: js.UndefOr[Meta] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueOid: js.UndefOr[String] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valuePositiveInt: js.UndefOr[Double] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueRange: js.UndefOr[Range] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueSampledData: js.UndefOr[SampledData] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueSignature: js.UndefOr[Signature] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueString: js.UndefOr[String] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueTime: js.UndefOr[String] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueUnsignedInt: js.UndefOr[Double] = js.undefined
  
  /**
    * If the parameter is a data type.
    */
  var valueUri: js.UndefOr[String] = js.undefined
}
object ParametersParameter {
  
  inline def apply(name: String): ParametersParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersParameter]
  }
  
  extension [Self <: ParametersParameter](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPart(value: js.Array[ParametersParameter]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: ParametersParameter*): Self = StObject.set(x, "part", js.Array(value*))
    
    inline def setResource(value: FhirResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setValueAddress(value: Address): Self = StObject.set(x, "valueAddress", value.asInstanceOf[js.Any])
    
    inline def setValueAddressUndefined: Self = StObject.set(x, "valueAddress", js.undefined)
    
    inline def setValueAnnotation(value: Annotation): Self = StObject.set(x, "valueAnnotation", value.asInstanceOf[js.Any])
    
    inline def setValueAnnotationUndefined: Self = StObject.set(x, "valueAnnotation", js.undefined)
    
    inline def setValueAttachment(value: Attachment): Self = StObject.set(x, "valueAttachment", value.asInstanceOf[js.Any])
    
    inline def setValueAttachmentUndefined: Self = StObject.set(x, "valueAttachment", js.undefined)
    
    inline def setValueBase64Binary(value: String): Self = StObject.set(x, "valueBase64Binary", value.asInstanceOf[js.Any])
    
    inline def setValueBase64BinaryUndefined: Self = StObject.set(x, "valueBase64Binary", js.undefined)
    
    inline def setValueBoolean(value: Boolean): Self = StObject.set(x, "valueBoolean", value.asInstanceOf[js.Any])
    
    inline def setValueBooleanUndefined: Self = StObject.set(x, "valueBoolean", js.undefined)
    
    inline def setValueCode(value: String): Self = StObject.set(x, "valueCode", value.asInstanceOf[js.Any])
    
    inline def setValueCodeUndefined: Self = StObject.set(x, "valueCode", js.undefined)
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueCoding(value: Coding): Self = StObject.set(x, "valueCoding", value.asInstanceOf[js.Any])
    
    inline def setValueCodingUndefined: Self = StObject.set(x, "valueCoding", js.undefined)
    
    inline def setValueContactPoint(value: ContactPoint): Self = StObject.set(x, "valueContactPoint", value.asInstanceOf[js.Any])
    
    inline def setValueContactPointUndefined: Self = StObject.set(x, "valueContactPoint", js.undefined)
    
    inline def setValueDate(value: String): Self = StObject.set(x, "valueDate", value.asInstanceOf[js.Any])
    
    inline def setValueDateTime(value: String): Self = StObject.set(x, "valueDateTime", value.asInstanceOf[js.Any])
    
    inline def setValueDateTimeUndefined: Self = StObject.set(x, "valueDateTime", js.undefined)
    
    inline def setValueDateUndefined: Self = StObject.set(x, "valueDate", js.undefined)
    
    inline def setValueDecimal(value: Double): Self = StObject.set(x, "valueDecimal", value.asInstanceOf[js.Any])
    
    inline def setValueDecimalUndefined: Self = StObject.set(x, "valueDecimal", js.undefined)
    
    inline def setValueHumanName(value: HumanName): Self = StObject.set(x, "valueHumanName", value.asInstanceOf[js.Any])
    
    inline def setValueHumanNameUndefined: Self = StObject.set(x, "valueHumanName", js.undefined)
    
    inline def setValueId(value: String): Self = StObject.set(x, "valueId", value.asInstanceOf[js.Any])
    
    inline def setValueIdUndefined: Self = StObject.set(x, "valueId", js.undefined)
    
    inline def setValueIdentifier(value: Identifier): Self = StObject.set(x, "valueIdentifier", value.asInstanceOf[js.Any])
    
    inline def setValueIdentifierUndefined: Self = StObject.set(x, "valueIdentifier", js.undefined)
    
    inline def setValueInstant(value: String): Self = StObject.set(x, "valueInstant", value.asInstanceOf[js.Any])
    
    inline def setValueInstantUndefined: Self = StObject.set(x, "valueInstant", js.undefined)
    
    inline def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    inline def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    inline def setValueMarkdown(value: String): Self = StObject.set(x, "valueMarkdown", value.asInstanceOf[js.Any])
    
    inline def setValueMarkdownUndefined: Self = StObject.set(x, "valueMarkdown", js.undefined)
    
    inline def setValueMeta(value: Meta): Self = StObject.set(x, "valueMeta", value.asInstanceOf[js.Any])
    
    inline def setValueMetaUndefined: Self = StObject.set(x, "valueMeta", js.undefined)
    
    inline def setValueOid(value: String): Self = StObject.set(x, "valueOid", value.asInstanceOf[js.Any])
    
    inline def setValueOidUndefined: Self = StObject.set(x, "valueOid", js.undefined)
    
    inline def setValuePeriod(value: Period): Self = StObject.set(x, "valuePeriod", value.asInstanceOf[js.Any])
    
    inline def setValuePeriodUndefined: Self = StObject.set(x, "valuePeriod", js.undefined)
    
    inline def setValuePositiveInt(value: Double): Self = StObject.set(x, "valuePositiveInt", value.asInstanceOf[js.Any])
    
    inline def setValuePositiveIntUndefined: Self = StObject.set(x, "valuePositiveInt", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueRange(value: Range): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    inline def setValueRatio(value: Ratio): Self = StObject.set(x, "valueRatio", value.asInstanceOf[js.Any])
    
    inline def setValueRatioUndefined: Self = StObject.set(x, "valueRatio", js.undefined)
    
    inline def setValueReference(value: Reference): Self = StObject.set(x, "valueReference", value.asInstanceOf[js.Any])
    
    inline def setValueReferenceUndefined: Self = StObject.set(x, "valueReference", js.undefined)
    
    inline def setValueSampledData(value: SampledData): Self = StObject.set(x, "valueSampledData", value.asInstanceOf[js.Any])
    
    inline def setValueSampledDataUndefined: Self = StObject.set(x, "valueSampledData", js.undefined)
    
    inline def setValueSignature(value: Signature): Self = StObject.set(x, "valueSignature", value.asInstanceOf[js.Any])
    
    inline def setValueSignatureUndefined: Self = StObject.set(x, "valueSignature", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    
    inline def setValueTime(value: String): Self = StObject.set(x, "valueTime", value.asInstanceOf[js.Any])
    
    inline def setValueTimeUndefined: Self = StObject.set(x, "valueTime", js.undefined)
    
    inline def setValueTiming(value: Timing): Self = StObject.set(x, "valueTiming", value.asInstanceOf[js.Any])
    
    inline def setValueTimingUndefined: Self = StObject.set(x, "valueTiming", js.undefined)
    
    inline def setValueUnsignedInt(value: Double): Self = StObject.set(x, "valueUnsignedInt", value.asInstanceOf[js.Any])
    
    inline def setValueUnsignedIntUndefined: Self = StObject.set(x, "valueUnsignedInt", js.undefined)
    
    inline def setValueUri(value: String): Self = StObject.set(x, "valueUri", value.asInstanceOf[js.Any])
    
    inline def setValueUriUndefined: Self = StObject.set(x, "valueUri", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_valueBase64Binary(value: Element): Self = StObject.set(x, "_valueBase64Binary", value.asInstanceOf[js.Any])
    
    inline def set_valueBase64BinaryUndefined: Self = StObject.set(x, "_valueBase64Binary", js.undefined)
    
    inline def set_valueBoolean(value: Element): Self = StObject.set(x, "_valueBoolean", value.asInstanceOf[js.Any])
    
    inline def set_valueBooleanUndefined: Self = StObject.set(x, "_valueBoolean", js.undefined)
    
    inline def set_valueCode(value: Element): Self = StObject.set(x, "_valueCode", value.asInstanceOf[js.Any])
    
    inline def set_valueCodeUndefined: Self = StObject.set(x, "_valueCode", js.undefined)
    
    inline def set_valueDate(value: Element): Self = StObject.set(x, "_valueDate", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTime(value: Element): Self = StObject.set(x, "_valueDateTime", value.asInstanceOf[js.Any])
    
    inline def set_valueDateTimeUndefined: Self = StObject.set(x, "_valueDateTime", js.undefined)
    
    inline def set_valueDateUndefined: Self = StObject.set(x, "_valueDate", js.undefined)
    
    inline def set_valueId(value: Element): Self = StObject.set(x, "_valueId", value.asInstanceOf[js.Any])
    
    inline def set_valueIdUndefined: Self = StObject.set(x, "_valueId", js.undefined)
    
    inline def set_valueInstant(value: Element): Self = StObject.set(x, "_valueInstant", value.asInstanceOf[js.Any])
    
    inline def set_valueInstantUndefined: Self = StObject.set(x, "_valueInstant", js.undefined)
    
    inline def set_valueMarkdown(value: Element): Self = StObject.set(x, "_valueMarkdown", value.asInstanceOf[js.Any])
    
    inline def set_valueMarkdownUndefined: Self = StObject.set(x, "_valueMarkdown", js.undefined)
    
    inline def set_valueOid(value: Element): Self = StObject.set(x, "_valueOid", value.asInstanceOf[js.Any])
    
    inline def set_valueOidUndefined: Self = StObject.set(x, "_valueOid", js.undefined)
    
    inline def set_valueString(value: Element): Self = StObject.set(x, "_valueString", value.asInstanceOf[js.Any])
    
    inline def set_valueStringUndefined: Self = StObject.set(x, "_valueString", js.undefined)
    
    inline def set_valueTime(value: Element): Self = StObject.set(x, "_valueTime", value.asInstanceOf[js.Any])
    
    inline def set_valueTimeUndefined: Self = StObject.set(x, "_valueTime", js.undefined)
    
    inline def set_valueUri(value: Element): Self = StObject.set(x, "_valueUri", value.asInstanceOf[js.Any])
    
    inline def set_valueUriUndefined: Self = StObject.set(x, "_valueUri", js.undefined)
  }
}
