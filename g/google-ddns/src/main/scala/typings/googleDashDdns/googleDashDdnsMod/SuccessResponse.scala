package typings.googleDashDdns.googleDashDdnsMod

import typings.googleDashDdns.googleDashDdnsStrings.good
import typings.googleDashDdns.googleDashDdnsStrings.nochg
import typings.googleDashDdns.googleDashDdnsStrings.success
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
    val __obj = js.Dynamic.literal(ip = ip, message = message, response = response.asInstanceOf[js.Any], status = status)
  
    __obj.asInstanceOf[SuccessResponse]
  }
}

