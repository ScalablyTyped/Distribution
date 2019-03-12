package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountSummariesResource extends js.Object {
  /** Lists account summaries (lightweight tree comprised of accounts/properties/profiles) to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[AccountSummaries]
}

object AccountSummariesResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotAnalyticsLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[AccountSummaries]
  ): AccountSummariesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountSummariesResource]
  }
}

