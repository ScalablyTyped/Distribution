package typings.googleDdns.mod

import typings.googleDdns.googleDdnsStrings.good
import typings.googleDdns.googleDdnsStrings.nochg
import typings.googleDdns.googleDdnsStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessResponse extends js.Object {
  /**
    * The IP address in the DNS record.
    */
  var ip: String
  /**
    * A human-readable response message
    */
  var message: String
  /**
    * The response code
    */
  var response: good | nochg
  /**
    * The response status
    */
  var status: success
}

object SuccessResponse {
  @scala.inline
  def apply(ip: String, message: String, response: good | nochg, status: success): SuccessResponse = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuccessResponse]
  }
}

