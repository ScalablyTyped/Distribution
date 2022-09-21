package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`patient-list`
import typings.fhir.fhirStrings.complete
import typings.fhir.fhirStrings.error
import typings.fhir.fhirStrings.individual
import typings.fhir.fhirStrings.pending
import typings.fhir.fhirStrings.summary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureReport
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The date this measure report was generated.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to a Bundle containing the Resources that were used in the evaluation of this report.
    */
  var evaluatedResources: js.UndefOr[Reference] = js.undefined
  
  /**
    * The results of the calculation, one for each population group in the measure.
    */
  var group: js.UndefOr[js.Array[MeasureReportGroup]] = js.undefined
  
  /**
    * Typically, this is used for identifiers that can go in an HL7 v3 II data type - e.g. to identify this {{title}} outside of FHIR, where the logical URL is not possible to use.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * A reference to the Measure that was evaluated to produce this report.
    */
  var measure: Reference
  
  /**
    * Optional Patient if the report was requested for a single patient.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * The reporting period for which the report was calculated.
    */
  var period: Period
  
  /**
    * Reporting Organization.
    */
  var reportingOrganization: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MeasureReport: typings.fhir.fhirStrings.MeasureReport
  
  /**
    * The report status. No data will be available until the report status is complete.
    */
  var status: complete | pending | error
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var `type`: individual | `patient-list` | summary
}
object MeasureReport {
  
  inline def apply(
    measure: Reference,
    period: Period,
    status: complete | pending | error,
    `type`: individual | `patient-list` | summary
  ): MeasureReport = {
    val __obj = js.Dynamic.literal(measure = measure.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], resourceType = "MeasureReport", status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReport]
  }
  
  extension [Self <: MeasureReport](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setEvaluatedResources(value: Reference): Self = StObject.set(x, "evaluatedResources", value.asInstanceOf[js.Any])
    
    inline def setEvaluatedResourcesUndefined: Self = StObject.set(x, "evaluatedResources", js.undefined)
    
    inline def setGroup(value: js.Array[MeasureReportGroup]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: MeasureReportGroup*): Self = StObject.set(x, "group", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setMeasure(value: Reference): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setReportingOrganization(value: Reference): Self = StObject.set(x, "reportingOrganization", value.asInstanceOf[js.Any])
    
    inline def setReportingOrganizationUndefined: Self = StObject.set(x, "reportingOrganization", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MeasureReport): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: complete | pending | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: individual | `patient-list` | summary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
