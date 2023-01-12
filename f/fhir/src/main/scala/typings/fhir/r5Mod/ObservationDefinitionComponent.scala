package typings.fhir.r5Mod

import typings.fhir.fhirStrings.boolean
import typings.fhir.fhirStrings.dateTime
import typings.fhir.fhirStrings.integer
import typings.fhir.fhirStrings.string
import typings.fhir.fhirStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservationDefinitionComponent
  extends StObject
     with BackboneElement {
  
  var _permittedDataType: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Describes what will be observed.
    */
  var code: CodeableConcept
  
  /**
    * The data types allowed for the value element of the instance of this component observations.
    */
  var permittedDataType: js.UndefOr[
    js.Array[
      typings.fhir.fhirStrings.Quantity | typings.fhir.fhirStrings.CodeableConcept | string | boolean | integer | typings.fhir.fhirStrings.Range | typings.fhir.fhirStrings.Ratio | typings.fhir.fhirStrings.SampledData | time | dateTime | typings.fhir.fhirStrings.Period
    ]
  ] = js.undefined
  
  /**
    * A set of qualified values associated with a context and a set of conditions -  provides a range for quantitative and ordinal observations and a collection of value sets for qualitative observations.
    */
  var qualifiedValue: js.UndefOr[js.Array[ObservationDefinitionQualifiedValue]] = js.undefined
  
  /**
    * Characteristics for quantitative results of this observation.
    */
  var quantitativeDetails: js.UndefOr[ObservationDefinitionQuantitativeDetails] = js.undefined
}
object ObservationDefinitionComponent {
  
  inline def apply(code: CodeableConcept): ObservationDefinitionComponent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservationDefinitionComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObservationDefinitionComponent] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setPermittedDataType(
      value: js.Array[
          typings.fhir.fhirStrings.Quantity | typings.fhir.fhirStrings.CodeableConcept | string | boolean | integer | typings.fhir.fhirStrings.Range | typings.fhir.fhirStrings.Ratio | typings.fhir.fhirStrings.SampledData | time | dateTime | typings.fhir.fhirStrings.Period
        ]
    ): Self = StObject.set(x, "permittedDataType", value.asInstanceOf[js.Any])
    
    inline def setPermittedDataTypeUndefined: Self = StObject.set(x, "permittedDataType", js.undefined)
    
    inline def setPermittedDataTypeVarargs(
      value: (typings.fhir.fhirStrings.Quantity | typings.fhir.fhirStrings.CodeableConcept | string | boolean | integer | typings.fhir.fhirStrings.Range | typings.fhir.fhirStrings.Ratio | typings.fhir.fhirStrings.SampledData | time | dateTime | typings.fhir.fhirStrings.Period)*
    ): Self = StObject.set(x, "permittedDataType", js.Array(value*))
    
    inline def setQualifiedValue(value: js.Array[ObservationDefinitionQualifiedValue]): Self = StObject.set(x, "qualifiedValue", value.asInstanceOf[js.Any])
    
    inline def setQualifiedValueUndefined: Self = StObject.set(x, "qualifiedValue", js.undefined)
    
    inline def setQualifiedValueVarargs(value: ObservationDefinitionQualifiedValue*): Self = StObject.set(x, "qualifiedValue", js.Array(value*))
    
    inline def setQuantitativeDetails(value: ObservationDefinitionQuantitativeDetails): Self = StObject.set(x, "quantitativeDetails", value.asInstanceOf[js.Any])
    
    inline def setQuantitativeDetailsUndefined: Self = StObject.set(x, "quantitativeDetails", js.undefined)
    
    inline def set_permittedDataType(value: js.Array[Element]): Self = StObject.set(x, "_permittedDataType", value.asInstanceOf[js.Any])
    
    inline def set_permittedDataTypeUndefined: Self = StObject.set(x, "_permittedDataType", js.undefined)
    
    inline def set_permittedDataTypeVarargs(value: Element*): Self = StObject.set(x, "_permittedDataType", js.Array(value*))
  }
}
