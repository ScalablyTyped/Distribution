package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The clinical service(s) being documented
  */
@js.native
trait CompositionEvent extends BackboneElement {
  /**
    * Code(s) that apply to the event being documented
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * The event(s) being documented
    */
  var detail: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * The period covered by the documentation
    */
  var period: js.UndefOr[Period] = js.native
}

object CompositionEvent {
  @scala.inline
  def apply(): CompositionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositionEvent]
  }
  @scala.inline
  implicit class CompositionEventOps[Self <: CompositionEvent] (val x: Self) extends AnyVal {
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
    def setCodeVarargs(value: CodeableConcept*): Self = this.set("code", js.Array(value :_*))
    @scala.inline
    def setCode(value: js.Array[CodeableConcept]): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDetailVarargs(value: Reference*): Self = this.set("detail", js.Array(value :_*))
    @scala.inline
    def setDetail(value: js.Array[Reference]): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
  }
  
}

