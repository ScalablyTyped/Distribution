package typings.googleDashDdns.googleDashDdnsMod

import typings.googleDashDdns.googleDashDdnsStrings.`911`
import typings.googleDashDdns.googleDashDdnsStrings.abuse
import typings.googleDashDdns.googleDashDdnsStrings.badagent
import typings.googleDashDdns.googleDashDdnsStrings.badauth
import typings.googleDashDdns.googleDashDdnsStrings.error
import typings.googleDashDdns.googleDashDdnsStrings.good
import typings.googleDashDdns.googleDashDdnsStrings.nochg
import typings.googleDashDdns.googleDashDdnsStrings.nohost
import typings.googleDashDdns.googleDashDdnsStrings.notfqdn
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
    val __obj = js.Dynamic.literal(message = message, response = response.asInstanceOf[js.Any], status = status)
    if (!js.isUndefined(ip)) __obj.updateDynamic("ip")(ip)
    __obj.asInstanceOf[ErrorResponse]
  }
}

