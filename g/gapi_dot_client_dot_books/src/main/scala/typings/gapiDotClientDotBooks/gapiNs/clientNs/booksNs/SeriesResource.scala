package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserSeriesid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesResource extends js.Object {
  var membership: MembershipResource
  /** Returns Series metadata for the given series ids. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserSeriesid): Request[Series]
}

object SeriesResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserSeriesid => Request[Series],
    membership: MembershipResource
  ): SeriesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), membership = membership)
  
    __obj.asInstanceOf[SeriesResource]
  }
}

