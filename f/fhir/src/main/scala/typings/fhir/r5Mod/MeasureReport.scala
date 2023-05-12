package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`data-exchange`
import typings.fhir.fhirStrings.`subject-list`
import typings.fhir.fhirStrings.complete
import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.incremental
import typings.fhir.fhirStrings.individual
import typings.fhir.fhirStrings.pending
import typings.fhir.fhirStrings.snapshot
import typings.fhir.fhirStrings.summary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureReport
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _dataUpdateType: js.UndefOr[Element] = js.undefined
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _measure: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * This element only applies to Data-collection reports used to communicate the data-of-interest for a measure
    */
  var dataUpdateType: js.UndefOr[incremental | snapshot] = js.undefined
  
  /**
    * The date this measure was calculated.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * Evaluated resources are only reported for individual reports.
    */
  var evaluatedResource: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The results of the calculation, one for each population group in the measure.
    */
  var group: js.UndefOr[js.Array[MeasureReportGroup]] = js.undefined
  
  /**
    * Typically, this is used for identifiers that can go in an HL7 V3 II data type - e.g. to identify this {{title}} outside of FHIR, where the logical URL is not possible to use.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * This element is typically defined by the measure, but reproduced here to ensure the measure score can be interpreted. The element is labeled as a modifier because it changes the interpretation of the reported measure score. Note also that a MeasureReport instance includes the improvementNotation as defined by the Measure being reported. It is duplicated in the MeasureReport because it is a critical aspect of interpreting the measure score but it is not intended to reflect whether the measure report is an increase or decrease. It helps interpret if the measure score is an increase or decrease, I.e., moving in the direction of the desired outcome.
    */
  var improvementNotation: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Whenever an operation returns a MeasureReport, the IN parameters from that operation can be returned to the caller of the operation using MeasureReport.inputParameters. Operations include but are not limited to $evaluate-measure, $care-gaps, $data-requirements, and $collect-data. The inputParameters can also be used in a MeasureReport used to define a test case (i.e., not as a result of an operation).
    */
  var inputParameters: js.UndefOr[Reference] = js.undefined
  
  /**
    * A reference to the location for which the data is being reported.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * A reference to the Measure that was calculated to produce this report.
    */
  var measure: js.UndefOr[String] = js.undefined
  
  /**
    * The reporting period for which the report was calculated.
    */
  var period: Period
  
  /**
    * The individual or organization that is reporting the data.
    */
  var reporter: js.UndefOr[Reference] = js.undefined
  
  /**
    * A reference to the vendor who queried the data, calculated results and/or generated the report. The ‘reporting vendor’ is intended to represent the submitting entity when it is not the same as the reporting entity. This extension is used when the Receiver is interested in getting vendor information in the report.
    */
  var reportingVendor: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MeasureReport: typings.fhir.fhirStrings.MeasureReport
  
  /**
    * Indicates how the calculation is performed for the measure, including proportion, ratio, continuous-variable, and cohort. The value set is extensible, allowing additional measure scoring types to be represented. It is expected to be the same as the scoring element on the referenced Measure.
    */
  var scoring: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: complete | pending | error
  
  /**
    * Optional subject identifying the individual or individuals the report is for.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * For individual measure reports, the supplementalData elements represent the direct result of evaluating the supplementalData expression for the subject of the report. For summary reports, supplementalData is reported as references to contained Observation resources that represent the number of times each value appeared as a supplementalData result for members of the population.
    */
  var supplementalData: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Data-exchange reports are used only to communicate data-of-interest for a measure. They do not necessarily include all the data for a particular subject or population, but they may.
    */
  var `type`: individual | `subject-list` | summary | `data-exchange`
}
object MeasureReport {
  
  inline def apply(
    period: Period,
    status: complete | pending | error,
    `type`: individual | `subject-list` | summary | `data-exchange`
  ): MeasureReport = {
    val __obj = js.Dynamic.literal(period = period.asInstanceOf[js.Any], resourceType = "MeasureReport", status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureReport] (val x: Self) extends AnyVal {
    
    inline def setDataUpdateType(value: incremental | snapshot): Self = StObject.set(x, "dataUpdateType", value.asInstanceOf[js.Any])
    
    inline def setDataUpdateTypeUndefined: Self = StObject.set(x, "dataUpdateType", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setEvaluatedResource(value: js.Array[Reference]): Self = StObject.set(x, "evaluatedResource", value.asInstanceOf[js.Any])
    
    inline def setEvaluatedResourceUndefined: Self = StObject.set(x, "evaluatedResource", js.undefined)
    
    inline def setEvaluatedResourceVarargs(value: Reference*): Self = StObject.set(x, "evaluatedResource", js.Array(value*))
    
    inline def setGroup(value: js.Array[MeasureReportGroup]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: MeasureReportGroup*): Self = StObject.set(x, "group", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setImprovementNotation(value: CodeableConcept): Self = StObject.set(x, "improvementNotation", value.asInstanceOf[js.Any])
    
    inline def setImprovementNotationUndefined: Self = StObject.set(x, "improvementNotation", js.undefined)
    
    inline def setInputParameters(value: Reference): Self = StObject.set(x, "inputParameters", value.asInstanceOf[js.Any])
    
    inline def setInputParametersUndefined: Self = StObject.set(x, "inputParameters", js.undefined)
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMeasure(value: String): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    inline def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setReporter(value: Reference): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setReportingVendor(value: Reference): Self = StObject.set(x, "reportingVendor", value.asInstanceOf[js.Any])
    
    inline def setReportingVendorUndefined: Self = StObject.set(x, "reportingVendor", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MeasureReport): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setScoring(value: CodeableConcept): Self = StObject.set(x, "scoring", value.asInstanceOf[js.Any])
    
    inline def setScoringUndefined: Self = StObject.set(x, "scoring", js.undefined)
    
    inline def setStatus(value: complete | pending | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSupplementalData(value: js.Array[Reference]): Self = StObject.set(x, "supplementalData", value.asInstanceOf[js.Any])
    
    inline def setSupplementalDataUndefined: Self = StObject.set(x, "supplementalData", js.undefined)
    
    inline def setSupplementalDataVarargs(value: Reference*): Self = StObject.set(x, "supplementalData", js.Array(value*))
    
    inline def setType(value: individual | `subject-list` | summary | `data-exchange`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_dataUpdateType(value: Element): Self = StObject.set(x, "_dataUpdateType", value.asInstanceOf[js.Any])
    
    inline def set_dataUpdateTypeUndefined: Self = StObject.set(x, "_dataUpdateType", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_measure(value: Element): Self = StObject.set(x, "_measure", value.asInstanceOf[js.Any])
    
    inline def set_measureUndefined: Self = StObject.set(x, "_measure", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
