package typings.fhir.r4bMod

import typings.fhir.fhirStrings.boolean
import typings.fhir.fhirStrings.dateTime
import typings.fhir.fhirStrings.integer
import typings.fhir.fhirStrings.string
import typings.fhir.fhirStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservationDefinition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _multipleResultsAllowed: js.UndefOr[Element] = js.undefined
  
  var _permittedDataType: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _preferredReportName: js.UndefOr[Element] = js.undefined
  
  /**
    * The set of abnormal coded results for the observation conforming to this ObservationDefinition.
    */
  var abnormalCodedValueSet: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element allows various categorization schemes based on the owner’s definition of the category and effectively multiple categories can be used for one instance of ObservationDefinition. The level of granularity is defined by the category concepts in the value set.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Describes what will be observed. Sometimes this is called the observation "name".
    */
  var code: CodeableConcept
  
  /**
    * The set of critical coded results for the observation conforming to this ObservationDefinition.
    */
  var criticalCodedValueSet: js.UndefOr[Reference] = js.undefined
  
  /**
    * A unique identifier assigned to this ObservationDefinition artifact.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Only used if not implicit in observation code.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * An example of observation allowing multiple results is "bacteria identified by culture". Conversely, the measurement of a potassium level allows a single result.
    */
  var multipleResultsAllowed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The set of normal coded results for the observations conforming to this ObservationDefinition.
    */
  var normalCodedValueSet: js.UndefOr[Reference] = js.undefined
  
  /**
    * The data types allowed for the value element of the instance observations conforming to this ObservationDefinition.
    */
  var permittedDataType: js.UndefOr[
    js.Array[
      typings.fhir.fhirStrings.Quantity | typings.fhir.fhirStrings.CodeableConcept | string | boolean | integer | typings.fhir.fhirStrings.Range | typings.fhir.fhirStrings.Ratio | typings.fhir.fhirStrings.SampledData | time | dateTime | typings.fhir.fhirStrings.Period
    ]
  ] = js.undefined
  
  /**
    * The preferred name to be used when reporting the results of observations conforming to this ObservationDefinition.
    */
  var preferredReportName: js.UndefOr[String] = js.undefined
  
  /**
    * Multiple  ranges of results qualified by different contexts for ordinal or continuous observations conforming to this ObservationDefinition.
    */
  var qualifiedInterval: js.UndefOr[js.Array[ObservationDefinitionQualifiedInterval]] = js.undefined
  
  /**
    * Characteristics for quantitative results of this observation.
    */
  var quantitativeDetails: js.UndefOr[ObservationDefinitionQuantitativeDetails] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ObservationDefinition: typings.fhir.fhirStrings.ObservationDefinition
  
  /**
    * The set of valid coded results for the observations  conforming to this ObservationDefinition.
    */
  var validCodedValueSet: js.UndefOr[Reference] = js.undefined
}
object ObservationDefinition {
  
  inline def apply(code: CodeableConcept): ObservationDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "ObservationDefinition")
    __obj.asInstanceOf[ObservationDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObservationDefinition] (val x: Self) extends AnyVal {
    
    inline def setAbnormalCodedValueSet(value: Reference): Self = StObject.set(x, "abnormalCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def setAbnormalCodedValueSetUndefined: Self = StObject.set(x, "abnormalCodedValueSet", js.undefined)
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCriticalCodedValueSet(value: Reference): Self = StObject.set(x, "criticalCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def setCriticalCodedValueSetUndefined: Self = StObject.set(x, "criticalCodedValueSet", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMultipleResultsAllowed(value: Boolean): Self = StObject.set(x, "multipleResultsAllowed", value.asInstanceOf[js.Any])
    
    inline def setMultipleResultsAllowedUndefined: Self = StObject.set(x, "multipleResultsAllowed", js.undefined)
    
    inline def setNormalCodedValueSet(value: Reference): Self = StObject.set(x, "normalCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def setNormalCodedValueSetUndefined: Self = StObject.set(x, "normalCodedValueSet", js.undefined)
    
    inline def setPermittedDataType(
      value: js.Array[
          typings.fhir.fhirStrings.Quantity | typings.fhir.fhirStrings.CodeableConcept | string | boolean | integer | typings.fhir.fhirStrings.Range | typings.fhir.fhirStrings.Ratio | typings.fhir.fhirStrings.SampledData | time | dateTime | typings.fhir.fhirStrings.Period
        ]
    ): Self = StObject.set(x, "permittedDataType", value.asInstanceOf[js.Any])
    
    inline def setPermittedDataTypeUndefined: Self = StObject.set(x, "permittedDataType", js.undefined)
    
    inline def setPermittedDataTypeVarargs(
      value: (typings.fhir.fhirStrings.Quantity | typings.fhir.fhirStrings.CodeableConcept | string | boolean | integer | typings.fhir.fhirStrings.Range | typings.fhir.fhirStrings.Ratio | typings.fhir.fhirStrings.SampledData | time | dateTime | typings.fhir.fhirStrings.Period)*
    ): Self = StObject.set(x, "permittedDataType", js.Array(value*))
    
    inline def setPreferredReportName(value: String): Self = StObject.set(x, "preferredReportName", value.asInstanceOf[js.Any])
    
    inline def setPreferredReportNameUndefined: Self = StObject.set(x, "preferredReportName", js.undefined)
    
    inline def setQualifiedInterval(value: js.Array[ObservationDefinitionQualifiedInterval]): Self = StObject.set(x, "qualifiedInterval", value.asInstanceOf[js.Any])
    
    inline def setQualifiedIntervalUndefined: Self = StObject.set(x, "qualifiedInterval", js.undefined)
    
    inline def setQualifiedIntervalVarargs(value: ObservationDefinitionQualifiedInterval*): Self = StObject.set(x, "qualifiedInterval", js.Array(value*))
    
    inline def setQuantitativeDetails(value: ObservationDefinitionQuantitativeDetails): Self = StObject.set(x, "quantitativeDetails", value.asInstanceOf[js.Any])
    
    inline def setQuantitativeDetailsUndefined: Self = StObject.set(x, "quantitativeDetails", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ObservationDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setValidCodedValueSet(value: Reference): Self = StObject.set(x, "validCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def setValidCodedValueSetUndefined: Self = StObject.set(x, "validCodedValueSet", js.undefined)
    
    inline def set_multipleResultsAllowed(value: Element): Self = StObject.set(x, "_multipleResultsAllowed", value.asInstanceOf[js.Any])
    
    inline def set_multipleResultsAllowedUndefined: Self = StObject.set(x, "_multipleResultsAllowed", js.undefined)
    
    inline def set_permittedDataType(value: js.Array[Element]): Self = StObject.set(x, "_permittedDataType", value.asInstanceOf[js.Any])
    
    inline def set_permittedDataTypeUndefined: Self = StObject.set(x, "_permittedDataType", js.undefined)
    
    inline def set_permittedDataTypeVarargs(value: Element*): Self = StObject.set(x, "_permittedDataType", js.Array(value*))
    
    inline def set_preferredReportName(value: Element): Self = StObject.set(x, "_preferredReportName", value.asInstanceOf[js.Any])
    
    inline def set_preferredReportNameUndefined: Self = StObject.set(x, "_preferredReportName", js.undefined)
  }
}
