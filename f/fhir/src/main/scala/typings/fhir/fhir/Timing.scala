package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A timing schedule that specifies an event that may occur multiple times
  */
@js.native
trait Timing extends Element {
  /**
    * Contains extended information for property 'event'.
    */
  var _event: js.UndefOr[js.Array[Element]] = js.native
  /**
    * BID | TID | QID | AM | PM | QD | QOD | Q4H | Q6H +
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  /**
    * When the event occurs
    */
  var event: js.UndefOr[js.Array[dateTime]] = js.native
  /**
    * When the event is to occur
    */
  var repeat: js.UndefOr[TimingRepeat] = js.native
}

object Timing {
  @scala.inline
  def apply(): Timing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timing]
  }
  @scala.inline
  implicit class TimingOps[Self <: Timing] (val x: Self) extends AnyVal {
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
    def set_eventVarargs(value: Element*): Self = this.set("_event", js.Array(value :_*))
    @scala.inline
    def set_event(value: js.Array[Element]): Self = this.set("_event", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_event: Self = this.set("_event", js.undefined)
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setEventVarargs(value: dateTime*): Self = this.set("event", js.Array(value :_*))
    @scala.inline
    def setEvent(value: js.Array[dateTime]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setRepeat(value: TimingRepeat): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
  }
  
}

