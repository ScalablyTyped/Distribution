package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information summarized from a list of other resources
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait List extends DomainResource {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  /**
    * What the purpose of this list is
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * When the list was prepared
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * Why list is empty
    */
  var emptyReason: js.UndefOr[CodeableConcept] = js.native
  /**
    * Context in which list created
    */
  var encounter: js.UndefOr[Reference] = js.native
  /**
    * Entries in the list
    */
  var entry: js.UndefOr[js.Array[ListEntry]] = js.native
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * working | snapshot | changes
    */
  var mode: code = js.native
  /**
    * Comments about the list
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * What order the list has
    */
  var orderedBy: js.UndefOr[CodeableConcept] = js.native
  /**
    * Who and/or what defined the list contents (aka Author)
    */
  var source: js.UndefOr[Reference] = js.native
  /**
    * current | retired | entered-in-error
    */
  var status: code = js.native
  /**
    * If all resources have the same subject
    */
  var subject: js.UndefOr[Reference] = js.native
  /**
    * Descriptive name for the list
    */
  var title: js.UndefOr[String] = js.native
}

object List {
  @scala.inline
  def apply(mode: code, status: code): List = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
  @scala.inline
  implicit class ListOps[Self <: List] (val x: Self) extends AnyVal {
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
    def setMode(value: code): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    @scala.inline
    def set_mode(value: Element): Self = this.set("_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_mode: Self = this.set("_mode", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setEmptyReason(value: CodeableConcept): Self = this.set("emptyReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyReason: Self = this.set("emptyReason", js.undefined)
    @scala.inline
    def setEncounter(value: Reference): Self = this.set("encounter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncounter: Self = this.set("encounter", js.undefined)
    @scala.inline
    def setEntryVarargs(value: ListEntry*): Self = this.set("entry", js.Array(value :_*))
    @scala.inline
    def setEntry(value: js.Array[ListEntry]): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setOrderedBy(value: CodeableConcept): Self = this.set("orderedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderedBy: Self = this.set("orderedBy", js.undefined)
    @scala.inline
    def setSource(value: Reference): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

