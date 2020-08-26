package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Condition that the related person had
  */
@js.native
trait FamilyMemberHistoryCondition extends BackboneElement {
  /**
    * Contains extended information for property 'onsetString'.
    */
  var _onsetString: js.UndefOr[Element] = js.native
  /**
    * Condition suffered by relation
    */
  var code: CodeableConcept = js.native
  /**
    * Extra information about condition
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * When condition first manifested
    */
  var onsetAge: js.UndefOr[Age] = js.native
  /**
    * When condition first manifested
    */
  var onsetPeriod: js.UndefOr[Period] = js.native
  /**
    * When condition first manifested
    */
  var onsetRange: js.UndefOr[Range] = js.native
  /**
    * When condition first manifested
    */
  var onsetString: js.UndefOr[String] = js.native
  /**
    * deceased | permanent disability | etc.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.native
}

object FamilyMemberHistoryCondition {
  @scala.inline
  def apply(code: CodeableConcept): FamilyMemberHistoryCondition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyMemberHistoryCondition]
  }
  @scala.inline
  implicit class FamilyMemberHistoryConditionOps[Self <: FamilyMemberHistoryCondition] (val x: Self) extends AnyVal {
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
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def set_onsetString(value: Element): Self = this.set("_onsetString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_onsetString: Self = this.set("_onsetString", js.undefined)
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setOnsetAge(value: Age): Self = this.set("onsetAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsetAge: Self = this.set("onsetAge", js.undefined)
    @scala.inline
    def setOnsetPeriod(value: Period): Self = this.set("onsetPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsetPeriod: Self = this.set("onsetPeriod", js.undefined)
    @scala.inline
    def setOnsetRange(value: Range): Self = this.set("onsetRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsetRange: Self = this.set("onsetRange", js.undefined)
    @scala.inline
    def setOnsetString(value: String): Self = this.set("onsetString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnsetString: Self = this.set("onsetString", js.undefined)
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = this.set("outcome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutcome: Self = this.set("outcome", js.undefined)
  }
  
}

