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

