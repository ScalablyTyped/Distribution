package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAnalytics.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountSummariesResource extends js.Object {
  /** Lists account summaries (lightweight tree comprised of accounts/properties/profiles) to which the user has access. */
  def list(request: Anon_AltFields): Request[AccountSummaries]
}

object AccountSummariesResource {
  @scala.inline
  def apply(list: Anon_AltFields => Request[AccountSummaries]): AccountSummariesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountSummariesResource]
  }
}

