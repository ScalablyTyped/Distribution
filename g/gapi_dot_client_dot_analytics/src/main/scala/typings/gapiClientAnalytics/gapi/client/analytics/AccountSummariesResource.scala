package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountSummariesResource extends js.Object {
  /** Lists account summaries (lightweight tree comprised of accounts/properties/profiles) to which the user has access. */
  def list(request: Key): Request[AccountSummaries]
}

object AccountSummariesResource {
  @scala.inline
  def apply(list: Key => Request[AccountSummaries]): AccountSummariesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AccountSummariesResource]
  }
}

