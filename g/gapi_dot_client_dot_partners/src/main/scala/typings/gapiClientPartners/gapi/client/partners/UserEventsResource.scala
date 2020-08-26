package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPartners.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserEventsResource extends js.Object {
  /** Logs a user event. */
  def log(request: Alt): Request[LogUserEventResponse] = js.native
}

object UserEventsResource {
  @scala.inline
  def apply(log: Alt => Request[LogUserEventResponse]): UserEventsResource = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
    __obj.asInstanceOf[UserEventsResource]
  }
  @scala.inline
  implicit class UserEventsResourceOps[Self <: UserEventsResource] (val x: Self) extends AnyVal {
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
    def setLog(value: Alt => Request[LogUserEventResponse]): Self = this.set("log", js.Any.fromFunction1(value))
  }
  
}

