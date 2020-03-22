package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountSummariesResource extends js.Object {
  /** Lists account summaries (lightweight tree comprised of accounts/properties/profiles) to which the user has access. */
  def list(request: AnonKey): Request_[AccountSummaries]
}

object AccountSummariesResource {
  @scala.inline
  def apply(list: AnonKey => Request_[AccountSummaries]): AccountSummariesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountSummariesResource]
  }
}

