package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountActiveAdSummariesResource extends js.Object {
  /** Gets the account's active ad summary by account ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[AccountActiveAdSummary]
}

object AccountActiveAdSummariesResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotDfareportingLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[AccountActiveAdSummary]
  ): AccountActiveAdSummariesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[AccountActiveAdSummariesResource]
  }
}

