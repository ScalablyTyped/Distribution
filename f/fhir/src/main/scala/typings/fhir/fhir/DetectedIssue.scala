package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Clinical issue with action
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait DetectedIssue extends DomainResource {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'detail'.
    */
  var _detail: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'reference'.
    */
  var _reference: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'severity'.
    */
  var _severity: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * The provider or device that identified the issue
    */
  var author: js.UndefOr[Reference] = js.native
  /**
    * Issue Category, e.g. drug-drug, duplicate therapy, etc.
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * When identified
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * Description and context
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * Unique id for the detected issue
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Problem resource
    */
  var implicated: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Step taken to address
    */
  var mitigation: js.UndefOr[js.Array[DetectedIssueMitigation]] = js.native
  /**
    * Associated patient
    */
  var patient: js.UndefOr[Reference] = js.native
  /**
    * Authority for issue
    */
  var reference: js.UndefOr[uri] = js.native
  /**
    * high | moderate | low
    */
  var severity: js.UndefOr[code] = js.native
  /**
    * registered | preliminary | final | amended +
    */
  var status: code = js.native
}

object DetectedIssue {
  @scala.inline
  def apply(status: code): DetectedIssue = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedIssue]
  }
  @scala.inline
  implicit class DetectedIssueOps[Self <: DetectedIssue] (val x: Self) extends AnyVal {
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
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    @scala.inline
    def set_detail(value: Element): Self = this.set("_detail", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_detail: Self = this.set("_detail", js.undefined)
    @scala.inline
    def set_reference(value: Element): Self = this.set("_reference", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_reference: Self = this.set("_reference", js.undefined)
    @scala.inline
    def set_severity(value: Element): Self = this.set("_severity", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_severity: Self = this.set("_severity", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setAuthor(value: Reference): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setCategory(value: CodeableConcept): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setImplicatedVarargs(value: Reference*): Self = this.set("implicated", js.Array(value :_*))
    @scala.inline
    def setImplicated(value: js.Array[Reference]): Self = this.set("implicated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplicated: Self = this.set("implicated", js.undefined)
    @scala.inline
    def setMitigationVarargs(value: DetectedIssueMitigation*): Self = this.set("mitigation", js.Array(value :_*))
    @scala.inline
    def setMitigation(value: js.Array[DetectedIssueMitigation]): Self = this.set("mitigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMitigation: Self = this.set("mitigation", js.undefined)
    @scala.inline
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatient: Self = this.set("patient", js.undefined)
    @scala.inline
    def setReference(value: uri): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    @scala.inline
    def setSeverity(value: code): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
  }
  
}

