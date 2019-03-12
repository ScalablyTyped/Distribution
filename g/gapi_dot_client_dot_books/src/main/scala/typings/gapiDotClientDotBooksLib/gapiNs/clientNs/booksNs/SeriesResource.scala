package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesResource extends js.Object {
  var membership: MembershipResource
  /** Returns Series metadata for the given series ids. */
  def get(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserSeriesid): gapiDotClientLib.gapiNs.clientNs.Request[Series]
}

object SeriesResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserSeriesid => gapiDotClientLib.gapiNs.clientNs.Request[Series],
    membership: MembershipResource
  ): SeriesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), membership = membership)
  
    __obj.asInstanceOf[SeriesResource]
  }
}

