package typings.googleDdns.mod

import typings.googleDdns.googleDdnsStrings.`911`
import typings.googleDdns.googleDdnsStrings.abuse
import typings.googleDdns.googleDdnsStrings.badagent
import typings.googleDdns.googleDdnsStrings.badauth
import typings.googleDdns.googleDdnsStrings.error
import typings.googleDdns.googleDdnsStrings.good
import typings.googleDdns.googleDdnsStrings.nochg
import typings.googleDdns.googleDdnsStrings.nohost
import typings.googleDdns.googleDdnsStrings.notfqdn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorResponse extends js.Object {
  // This definition is here to make it possible to access the `ip`
  // property in the union `SuccessResponse | ErrorResponse`
  // See https://github.com/Microsoft/TypeScript/issues/12815
  var ip: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * A human-readable response message
    */
  var message: String
  /**
    * The response code (may include `good` or `nochg` in edge cases)
    */
  var response: nohost | badauth | notfqdn | badagent | abuse | `911` | good | nochg
  /**
    * The response status
    */
  var status: error
}

object ErrorResponse {
  @scala.inline
  def apply(
    message: String,
    response: nohost | badauth | notfqdn | badagent | abuse | `911` | good | nochg,
    status: error,
    ip: js.UndefOr[scala.Nothing] = js.undefined
  ): ErrorResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (!js.isUndefined(ip)) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponse]
  }
}

