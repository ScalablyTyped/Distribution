package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountActiveAdSummariesResource extends js.Object {
  /** Gets the account's active ad summary by account ID. */
  def get(request: Alt): Request[AccountActiveAdSummary]
}

object AccountActiveAdSummariesResource {
  @scala.inline
  def apply(get: Alt => Request[AccountActiveAdSummary]): AccountActiveAdSummariesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[AccountActiveAdSummariesResource]
  }
}

