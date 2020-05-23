package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.Key
import typings.gapiClientBooks.anon.Oauthtoken
import typings.gapiClientBooks.anon.PrettyPrint
import typings.gapiClientBooks.anon.QuotaUser
import typings.gapiClientBooks.anon.Shelf
import typings.gapiClientBooks.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookshelvesResource extends js.Object {
  var volumes: VolumesResource = js.native
  /** Adds a volume to a bookshelf. */
  def addVolume(request: PrettyPrint): Request[Unit] = js.native
  /** Clears all volumes from a bookshelf. */
  def clearVolumes(request: QuotaUser): Request[Unit] = js.native
  /** Retrieves metadata for a specific bookshelf for the specified user. */
  def get(request: Key): Request[Bookshelf] = js.native
  /** Retrieves metadata for a specific bookshelf belonging to the authenticated user. */
  def get(request: QuotaUser): Request[Bookshelf] = js.native
  /** Retrieves a list of public bookshelves for the specified user. */
  def list(request: Oauthtoken): Request[Bookshelves] = js.native
  /** Retrieves a list of bookshelves belonging to the authenticated user. */
  def list(request: UserIp): Request[Bookshelves] = js.native
  /** Moves a volume within a bookshelf. */
  def moveVolume(request: Shelf): Request[Unit] = js.native
  /** Removes a volume from a bookshelf. */
  def removeVolume(request: PrettyPrint): Request[Unit] = js.native
}

