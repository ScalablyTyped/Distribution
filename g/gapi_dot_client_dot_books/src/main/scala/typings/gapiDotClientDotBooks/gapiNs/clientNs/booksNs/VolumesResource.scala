package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBooks.Anon_Alt
import typings.gapiDotClientDotBooks.Anon_AltCountry
import typings.gapiDotClientDotBooks.Anon_AltCountryFields
import typings.gapiDotClientDotBooks.Anon_AltDownload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumesResource extends js.Object {
  var associated: AssociatedResource = js.native
  var mybooks: MybooksResource = js.native
  var recommended: RecommendedResource = js.native
  var useruploaded: UseruploadedResource = js.native
  /** Gets volume information for a single volume. */
  def get(request: Anon_AltCountryFields): Request[Volume] = js.native
  /** Retrieves volumes in a specific bookshelf for the specified user. */
  def list(request: Anon_Alt): Request[Volumes] = js.native
  /** Gets volume information for volumes on a bookshelf. */
  def list(request: Anon_AltCountry): Request[Volumes] = js.native
  /** Performs a book search. */
  def list(request: Anon_AltDownload): Request[Volumes] = js.native
}

