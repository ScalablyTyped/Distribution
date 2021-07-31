package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Results of a measure evaluation
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait MeasureReport
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * When the report was generated
    */
  var date: js.UndefOr[dateTime] = js.undefined
  
  /**
    * What data was evaluated to produce the measure score
    */
  var evaluatedResources: js.UndefOr[Reference] = js.undefined
  
  /**
    * Measure results for each group
    */
  var group: js.UndefOr[js.Array[MeasureReportGroup]] = js.undefined
  
  /**
    * Additional identifier for the Report
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * What measure was evaluated
    */
  var measure: Reference
  
  /**
    * What patient the report is for
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * What period the report covers
    */
  var period: Period
  
  /**
    * Who is reporting the data
    */
  var reportingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * complete | pending | error
    */
  var status: code
  
  /**
    * individual | patient-list | summary
    */
  var `type`: code
}
object MeasureReport {
  
  @scala.inline
  def apply(measure: Reference, period: Period, status: code, `type`: code): MeasureReport = {
    val __obj = js.Dynamic.literal(measure = measure.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReport]
  }
  
  @scala.inline
  implicit class MeasureReportMutableBuilder[Self <: MeasureReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setEvaluatedResources(value: Reference): Self = StObject.set(x, "evaluatedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluatedResourcesUndefined: Self = StObject.set(x, "evaluatedResources", js.undefined)
    
    @scala.inline
    def setGroup(value: js.Array[MeasureReportGroup]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: MeasureReportGroup*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setMeasure(value: Reference): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportingOrganization(value: Reference): Self = StObject.set(x, "reportingOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportingOrganizationUndefined: Self = StObject.set(x, "reportingOrganization", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
