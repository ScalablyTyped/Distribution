package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBooks.Anon_AltFields
import typings.gapiDotClientDotBooks.Anon_AltFieldsKey
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyOauthtoken
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserShelf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookshelvesResource extends js.Object {
  var volumes: VolumesResource = js.native
  /** Adds a volume to a bookshelf. */
  def addVolume(request: Anon_AltFieldsKeyOauthtoken): Request[Unit] = js.native
  /** Clears all volumes from a bookshelf. */
  def clearVolumes(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Unit] = js.native
  /** Retrieves metadata for a specific bookshelf for the specified user. */
  def get(request: Anon_AltFields): Request[Bookshelf] = js.native
  /** Retrieves metadata for a specific bookshelf belonging to the authenticated user. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Bookshelf] = js.native
  /** Retrieves a list of public bookshelves for the specified user. */
  def list(request: Anon_AltFieldsKey): Request[Bookshelves] = js.native
  /** Retrieves a list of bookshelves belonging to the authenticated user. */
  def list(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request[Bookshelves] = js.native
  /** Moves a volume within a bookshelf. */
  def moveVolume(request: Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserShelf): Request[Unit] = js.native
  /** Removes a volume from a bookshelf. */
  def removeVolume(request: Anon_AltFieldsKeyOauthtoken): Request[Unit] = js.native
}

