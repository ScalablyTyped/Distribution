package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.Alt
import typings.gapiClientBooks.anon.Country
import typings.gapiClientBooks.anon.Download
import typings.gapiClientBooks.anon.Fields
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
  def get(request: Fields): Request[Volume] = js.native
  /** Retrieves volumes in a specific bookshelf for the specified user. */
  def list(request: Alt): Request[Volumes] = js.native
  /** Gets volume information for volumes on a bookshelf. */
  def list(request: Country): Request[Volumes] = js.native
  /** Performs a book search. */
  def list(request: Download): Request[Volumes] = js.native
}

