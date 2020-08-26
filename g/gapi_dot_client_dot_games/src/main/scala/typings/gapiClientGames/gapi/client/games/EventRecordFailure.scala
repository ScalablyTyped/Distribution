package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventRecordFailure extends js.Object {
  /** The ID of the event that was not updated. */
  var eventId: js.UndefOr[String] = js.native
  /**
    * The cause for the update failure.
    * Possible values are:
    * - "NOT_FOUND" - An attempt was made to set an event that was not defined.
    * - "INVALID_UPDATE_VALUE" - An attempt was made to increment an event by a non-positive value.
    */
  var failureCause: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventRecordFailure. */
  var kind: js.UndefOr[String] = js.native
}

object EventRecordFailure {
  @scala.inline
  def apply(): EventRecordFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventRecordFailure]
  }
  @scala.inline
  implicit class EventRecordFailureOps[Self <: EventRecordFailure] (val x: Self) extends AnyVal {
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
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
    @scala.inline
    def setFailureCause(value: String): Self = this.set("failureCause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureCause: Self = this.set("failureCause", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

