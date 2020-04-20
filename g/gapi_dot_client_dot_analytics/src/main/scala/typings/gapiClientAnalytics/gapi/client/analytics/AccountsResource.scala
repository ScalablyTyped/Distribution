package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Lists all accounts to which the user has access. */
  def list(request: AnonKey): Request_[Accounts]
}

object AccountsResource {
  @scala.inline
  def apply(list: AnonKey => Request_[Accounts]): AccountsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AccountsResource]
  }
}

