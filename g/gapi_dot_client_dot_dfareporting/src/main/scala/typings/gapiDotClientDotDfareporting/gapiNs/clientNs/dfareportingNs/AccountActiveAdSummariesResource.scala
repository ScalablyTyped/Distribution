package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountActiveAdSummariesResource extends js.Object {
  /** Gets the account's active ad summary by account ID. */
  def get(request: Anon_Alt): Request[AccountActiveAdSummary]
}

object AccountActiveAdSummariesResource {
  @scala.inline
  def apply(get: Anon_Alt => Request[AccountActiveAdSummary]): AccountActiveAdSummariesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[AccountActiveAdSummariesResource]
  }
}

