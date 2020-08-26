package typings.devtoolsProtocol.mod.Protocol.Security

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateErrorEvent extends js.Object {
  /**
    * The type of the error.
    */
  var errorType: String = js.native
  /**
    * The ID of the event.
    */
  var eventId: integer = js.native
  /**
    * The url that was requested.
    */
  var requestURL: String = js.native
}

object CertificateErrorEvent {
  @scala.inline
  def apply(errorType: String, eventId: integer, requestURL: String): CertificateErrorEvent = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], requestURL = requestURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateErrorEvent]
  }
  @scala.inline
  implicit class CertificateErrorEventOps[Self <: CertificateErrorEvent] (val x: Self) extends AnyVal {
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
    def setErrorType(value: String): Self = this.set("errorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventId(value: integer): Self = this.set("eventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestURL(value: String): Self = this.set("requestURL", value.asInstanceOf[js.Any])
  }
  
}

