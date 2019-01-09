package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookshelvesResource extends js.Object {
  var volumes: VolumesResource = js.native
  /** Adds a volume to a bookshelf. */
  def addVolume(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit] = js.native
  /** Clears all volumes from a bookshelf. */
  def clearVolumes(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit] = js.native
  /** Retrieves metadata for a specific bookshelf for the specified user. */
  def get(request: gapiDotClientDotBooksLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Bookshelf] = js.native
  /** Retrieves metadata for a specific bookshelf belonging to the authenticated user. */
  def get(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Bookshelf] = js.native
  /** Retrieves a list of public bookshelves for the specified user. */
  def list(request: gapiDotClientDotBooksLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Bookshelves] = js.native
  /** Retrieves a list of bookshelves belonging to the authenticated user. */
  def list(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Bookshelves] = js.native
  /** Moves a volume within a bookshelf. */
  def moveVolume(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtokenPrettyPrintQuotaUserShelf): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit] = js.native
  /** Removes a volume from a bookshelf. */
  def removeVolume(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit] = js.native
}

