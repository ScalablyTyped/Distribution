package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAnalytics.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Lists all accounts to which the user has access. */
  def list(request: Anon_AltFields): Request[Accounts]
}

object AccountsResource {
  @scala.inline
  def apply(list: Anon_AltFields => Request[Accounts]): AccountsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountsResource]
  }
}

