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

trait ResearchElementDefinitionCharacteristic
  extends StObject
     with BackboneElement {
  
  var _definitionCanonical: js.UndefOr[Element] = js.undefined
  
  var _exclude: js.UndefOr[Element] = js.undefined
  
  var _participantEffectiveDateTime: js.UndefOr[Element] = js.undefined
  
  var _participantEffectiveDescription: js.UndefOr[Element] = js.undefined
  
  var _participantEffectiveGroupMeasure: js.UndefOr[Element] = js.undefined
  
  var _studyEffectiveDateTime: js.UndefOr[Element] = js.undefined
  
  var _studyEffectiveDescription: js.UndefOr[Element] = js.undefined
  
  var _studyEffectiveGroupMeasure: js.UndefOr[Element] = js.undefined
  
  /**
    * Define members of the research element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
    */
  var definitionCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * Define members of the research element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
    */
  var definitionCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Define members of the research element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
    */
  var definitionDataRequirement: js.UndefOr[DataRequirement] = js.undefined
  
  /**
    * Define members of the research element using Codes (such as condition, medication, or observation), Expressions ( using an expression language such as FHIRPath or CQL) or DataRequirements (such as Diabetes diagnosis onset in the last year).
    */
  var definitionExpression: js.UndefOr[Expression] = js.undefined
  
  /**
    * When true, members with this characteristic are excluded from the element.
    */
  var exclude: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates what effective period the study covers.
    */
  var participantEffectiveDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * A narrative description of the time period the study covers.
    */
  var participantEffectiveDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates what effective period the study covers.
    */
  var participantEffectiveDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * Indicates how elements are aggregated within the study effective period.
    */
  var participantEffectiveGroupMeasure: js.UndefOr[
    mean | median | `mean-of-mean` | `mean-of-median` | `median-of-mean` | `median-of-median`
  ] = js.undefined
  
  /**
    * Indicates what effective period the study covers.
    */
  var participantEffectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Indicates duration from the participant's study entry.
    */
  var participantEffectiveTimeFromStart: js.UndefOr[Duration] = js.undefined
  
  /**
    * Indicates what effective period the study covers.
    */
  var participantEffectiveTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Indicates what effective period the study covers.
    */
  var studyEffectiveDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * A narrative description of the time period the study covers.
    */
  var studyEffectiveDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates what effective period the study covers.
    */
  var studyEffectiveDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * Indicates how elements are aggregated within the study effective period.
    */
  var studyEffectiveGroupMeasure: js.UndefOr[
    mean | median | `mean-of-mean` | `mean-of-median` | `median-of-mean` | `median-of-median`
  ] = js.undefined
  
  /**
    * Indicates what effective period the study covers.
    */
  var studyEffectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Indicates duration from the study initiation.
    */
  var studyEffectiveTimeFromStart: js.UndefOr[Duration] = js.undefined
  
  /**
    * Indicates what effective period the study covers.
    */
  var studyEffectiveTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Specifies the UCUM unit for the outcome.
    */
  var unitOfMeasure: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Use UsageContext to define the members of the population, such as Age Ranges, Genders, Settings.
    */
  var usageContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
}
object ResearchElementDefinitionCharacteristic {
  
  inline def apply(): ResearchElementDefinitionCharacteristic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResearchElementDefinitionCharacteristic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResearchElementDefinitionCharacteristic] (val x: Self) extends AnyVal {
    
    inline def setDefinitionCanonical(value: String): Self = StObject.set(x, "definitionCanonical", value.asInstanceOf[js.Any])
    
    inline def setDefinitionCanonicalUndefined: Self = StObject.set(x, "definitionCanonical", js.undefined)
    
    inline def setDefinitionCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "definitionCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setDefinitionCodeableConceptUndefined: Self = StObject.set(x, "definitionCodeableConcept", js.undefined)
    
    inline def setDefinitionDataRequirement(value: DataRequirement): Self = StObject.set(x, "definitionDataRequirement", value.asInstanceOf[js.Any])
    
    inline def setDefinitionDataRequirementUndefined: Self = StObject.set(x, "definitionDataRequirement", js.undefined)
    
    inline def setDefinitionExpression(value: Expression): Self = StObject.set(x, "definitionExpression", value.asInstanceOf[js.Any])
    
    inline def setDefinitionExpressionUndefined: Self = StObject.set(x, "definitionExpression", js.undefined)
    
    inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setParticipantEffectiveDateTime(value: String): Self = StObject.set(x, "participantEffectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def setParticipantEffectiveDateTimeUndefined: Self = StObject.set(x, "participantEffectiveDateTime", js.undefined)
    
    inline def setParticipantEffectiveDescription(value: String): Self = StObject.set(x, "participantEffectiveDescription", value.asInstanceOf[js.Any])
    
    inline def setParticipantEffectiveDescriptionUndefined: Self = StObject.set(x, "participantEffectiveDescription", js.undefined)
    
    inline def setParticipantEffectiveDuration(value: Duration): Self = StObject.set(x, "participantEffectiveDuration", value.asInstanceOf[js.Any])
    
    inline def setParticipantEffectiveDurationUndefined: Self = StObject.set(x, "participantEffectiveDuration", js.undefined)
    
    inline def setParticipantEffectiveGroupMeasure(value: mean | median | `mean-of-mean` | `mean-of-median` | `median-of-mean` | `median-of-median`): Self = StObject.set(x, "participantEffectiveGroupMeasure", value.asInstanceOf[js.Any])
    
    inline def setParticipantEffectiveGroupMeasureUndefined: Self = StObject.set(x, "participantEffectiveGroupMeasure", js.undefined)
    
    inline def setParticipantEffectivePeriod(value: Period): Self = StObject.set(x, "participantEffectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setParticipantEffectivePeriodUndefined: Self = StObject.set(x, "participantEffectivePeriod", js.undefined)
    
    inline def setParticipantEffectiveTimeFromStart(value: Duration): Self = StObject.set(x, "participantEffectiveTimeFromStart", value.asInstanceOf[js.Any])
    
    inline def setParticipantEffectiveTimeFromStartUndefined: Self = StObject.set(x, "participantEffectiveTimeFromStart", js.undefined)
    
    inline def setParticipantEffectiveTiming(value: Timing): Self = StObject.set(x, "participantEffectiveTiming", value.asInstanceOf[js.Any])
    
    inline def setParticipantEffectiveTimingUndefined: Self = StObject.set(x, "participantEffectiveTiming", js.undefined)
    
    inline def setStudyEffectiveDateTime(value: String): Self = StObject.set(x, "studyEffectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def setStudyEffectiveDateTimeUndefined: Self = StObject.set(x, "studyEffectiveDateTime", js.undefined)
    
    inline def setStudyEffectiveDescription(value: String): Self = StObject.set(x, "studyEffectiveDescription", value.asInstanceOf[js.Any])
    
    inline def setStudyEffectiveDescriptionUndefined: Self = StObject.set(x, "studyEffectiveDescription", js.undefined)
    
    inline def setStudyEffectiveDuration(value: Duration): Self = StObject.set(x, "studyEffectiveDuration", value.asInstanceOf[js.Any])
    
    inline def setStudyEffectiveDurationUndefined: Self = StObject.set(x, "studyEffectiveDuration", js.undefined)
    
    inline def setStudyEffectiveGroupMeasure(value: mean | median | `mean-of-mean` | `mean-of-median` | `median-of-mean` | `median-of-median`): Self = StObject.set(x, "studyEffectiveGroupMeasure", value.asInstanceOf[js.Any])
    
    inline def setStudyEffectiveGroupMeasureUndefined: Self = StObject.set(x, "studyEffectiveGroupMeasure", js.undefined)
    
    inline def setStudyEffectivePeriod(value: Period): Self = StObject.set(x, "studyEffectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setStudyEffectivePeriodUndefined: Self = StObject.set(x, "studyEffectivePeriod", js.undefined)
    
    inline def setStudyEffectiveTimeFromStart(value: Duration): Self = StObject.set(x, "studyEffectiveTimeFromStart", value.asInstanceOf[js.Any])
    
    inline def setStudyEffectiveTimeFromStartUndefined: Self = StObject.set(x, "studyEffectiveTimeFromStart", js.undefined)
    
    inline def setStudyEffectiveTiming(value: Timing): Self = StObject.set(x, "studyEffectiveTiming", value.asInstanceOf[js.Any])
    
    inline def setStudyEffectiveTimingUndefined: Self = StObject.set(x, "studyEffectiveTiming", js.undefined)
    
    inline def setUnitOfMeasure(value: CodeableConcept): Self = StObject.set(x, "unitOfMeasure", value.asInstanceOf[js.Any])
    
    inline def setUnitOfMeasureUndefined: Self = StObject.set(x, "unitOfMeasure", js.undefined)
    
    inline def setUsageContext(value: js.Array[UsageContext]): Self = StObject.set(x, "usageContext", value.asInstanceOf[js.Any])
    
    inline def setUsageContextUndefined: Self = StObject.set(x, "usageContext", js.undefined)
    
    inline def setUsageContextVarargs(value: UsageContext*): Self = StObject.set(x, "usageContext", js.Array(value*))
    
    inline def set_definitionCanonical(value: Element): Self = StObject.set(x, "_definitionCanonical", value.asInstanceOf[js.Any])
    
    inline def set_definitionCanonicalUndefined: Self = StObject.set(x, "_definitionCanonical", js.undefined)
    
    inline def set_exclude(value: Element): Self = StObject.set(x, "_exclude", value.asInstanceOf[js.Any])
    
    inline def set_excludeUndefined: Self = StObject.set(x, "_exclude", js.undefined)
    
    inline def set_participantEffectiveDateTime(value: Element): Self = StObject.set(x, "_participantEffectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def set_participantEffectiveDateTimeUndefined: Self = StObject.set(x, "_participantEffectiveDateTime", js.undefined)
    
    inline def set_participantEffectiveDescription(value: Element): Self = StObject.set(x, "_participantEffectiveDescription", value.asInstanceOf[js.Any])
    
    inline def set_participantEffectiveDescriptionUndefined: Self = StObject.set(x, "_participantEffectiveDescription", js.undefined)
    
    inline def set_participantEffectiveGroupMeasure(value: Element): Self = StObject.set(x, "_participantEffectiveGroupMeasure", value.asInstanceOf[js.Any])
    
    inline def set_participantEffectiveGroupMeasureUndefined: Self = StObject.set(x, "_participantEffectiveGroupMeasure", js.undefined)
    
    inline def set_studyEffectiveDateTime(value: Element): Self = StObject.set(x, "_studyEffectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def set_studyEffectiveDateTimeUndefined: Self = StObject.set(x, "_studyEffectiveDateTime", js.undefined)
    
    inline def set_studyEffectiveDescription(value: Element): Self = StObject.set(x, "_studyEffectiveDescription", value.asInstanceOf[js.Any])
    
    inline def set_studyEffectiveDescriptionUndefined: Self = StObject.set(x, "_studyEffectiveDescription", js.undefined)
    
    inline def set_studyEffectiveGroupMeasure(value: Element): Self = StObject.set(x, "_studyEffectiveGroupMeasure", value.asInstanceOf[js.Any])
    
    inline def set_studyEffectiveGroupMeasureUndefined: Self = StObject.set(x, "_studyEffectiveGroupMeasure", js.undefined)
  }
}
