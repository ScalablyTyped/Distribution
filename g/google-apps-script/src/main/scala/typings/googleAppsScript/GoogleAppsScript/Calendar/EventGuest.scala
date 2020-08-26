package typings.googleAppsScript.GoogleAppsScript.Calendar

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a guest of an event.
  */
@js.native
trait EventGuest extends js.Object {
  def getAdditionalGuests(): Integer = js.native
  def getEmail(): String = js.native
  def getGuestStatus(): GuestStatus = js.native
  def getName(): String = js.native
  /** @deprecated DO NOT USE */ def getStatus(): String = js.native
}

object EventGuest {
  @scala.inline
  def apply(
    getAdditionalGuests: () => Integer,
    getEmail: () => String,
    getGuestStatus: () => GuestStatus,
    getName: () => String,
    getStatus: () => String
  ): EventGuest = {
    val __obj = js.Dynamic.literal(getAdditionalGuests = js.Any.fromFunction0(getAdditionalGuests), getEmail = js.Any.fromFunction0(getEmail), getGuestStatus = js.Any.fromFunction0(getGuestStatus), getName = js.Any.fromFunction0(getName), getStatus = js.Any.fromFunction0(getStatus))
    __obj.asInstanceOf[EventGuest]
  }
  @scala.inline
  implicit class EventGuestOps[Self <: EventGuest] (val x: Self) extends AnyVal {
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
    def setGetAdditionalGuests(value: () => Integer): Self = this.set("getAdditionalGuests", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEmail(value: () => String): Self = this.set("getEmail", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGuestStatus(value: () => GuestStatus): Self = this.set("getGuestStatus", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStatus(value: () => String): Self = this.set("getStatus", js.Any.fromFunction0(value))
  }
  
}

