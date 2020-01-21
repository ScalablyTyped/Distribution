package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAlt
import typings.gapiClientBooks.AnonAltCountry
import typings.gapiClientBooks.AnonAltCountryFields
import typings.gapiClientBooks.AnonAltDownload
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
  def get(request: AnonAltCountryFields): Request_[Volume] = js.native
  /** Retrieves volumes in a specific bookshelf for the specified user. */
  def list(request: AnonAlt): Request_[Volumes] = js.native
  /** Gets volume information for volumes on a bookshelf. */
  def list(request: AnonAltCountry): Request_[Volumes] = js.native
  /** Performs a book search. */
  def list(request: AnonAltDownload): Request_[Volumes] = js.native
}

