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
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Accounts]
    ]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[AccountsResource]
  }
}

