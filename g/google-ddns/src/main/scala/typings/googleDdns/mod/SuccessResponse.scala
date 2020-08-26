package typings.googleDdns.mod

import typings.googleDdns.googleDdnsStrings.good
import typings.googleDdns.googleDdnsStrings.nochg
import typings.googleDdns.googleDdnsStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessResponse extends js.Object {
  /**
    * The IP address in the DNS record.
    */
  var ip: String = js.native
  /**
    * A human-readable response message
    */
  var message: String = js.native
  /**
    * The response code
    */
  var response: good | nochg = js.native
  /**
    * The response status
    */
  var status: success = js.native
}

object SuccessResponse {
  @scala.inline
  def apply(ip: String, message: String, response: good | nochg, status: success): SuccessResponse = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessResponse]
  }
  @scala.inline
  implicit class SuccessResponseOps[Self <: SuccessResponse] (val x: Self) extends AnyVal {
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
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: good | nochg): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: success): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

