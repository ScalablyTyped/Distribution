package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Lists all accounts to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Accounts]
}

object AccountsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotAnalyticsLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Accounts]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

