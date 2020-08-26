package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results of a measure evaluation
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait MeasureReport extends DomainResource {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * When the report was generated
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * What data was evaluated to produce the measure score
    */
  var evaluatedResources: js.UndefOr[Reference] = js.native
  /**
    * Measure results for each group
    */
  var group: js.UndefOr[js.Array[MeasureReportGroup]] = js.native
  /**
    * Additional identifier for the Report
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * What measure was evaluated
    */
  var measure: Reference = js.native
  /**
    * What patient the report is for
    */
  var patient: js.UndefOr[Reference] = js.native
  /**
    * What period the report covers
    */
  var period: Period = js.native
  /**
    * Who is reporting the data
    */
  var reportingOrganization: js.UndefOr[Reference] = js.native
  /**
    * complete | pending | error
    */
  var status: code = js.native
  /**
    * individual | patient-list | summary
    */
  var `type`: code = js.native
}

object MeasureReport {
  @scala.inline
  def apply(measure: Reference, period: Period, status: code, `type`: code): MeasureReport = {
    val __obj = js.Dynamic.literal(measure = measure.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReport]
  }
  @scala.inline
  implicit class MeasureReportOps[Self <: MeasureReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMeasure(value: Reference): Self = this.set("measure", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setEvaluatedResources(value: Reference): Self = this.set("evaluatedResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluatedResources: Self = this.set("evaluatedResources", js.undefined)
    @scala.inline
    def setGroupVarargs(value: MeasureReportGroup*): Self = this.set("group", js.Array(value :_*))
    @scala.inline
    def setGroup(value: js.Array[MeasureReportGroup]): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatient: Self = this.set("patient", js.undefined)
    @scala.inline
    def setReportingOrganization(value: Reference): Self = this.set("reportingOrganization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportingOrganization: Self = this.set("reportingOrganization", js.undefined)
  }
  
}

