package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltFields
import typings.gapiClientBooks.AnonAltFieldsKey
import typings.gapiClientBooks.AnonAltFieldsKeyOauthtoken
import typings.gapiClientBooks.AnonAltFieldsKeyOauthtokenPrettyPrint
import typings.gapiClientBooks.AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUser
import typings.gapiClientBooks.AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserShelf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookshelvesResource extends js.Object {
  var volumes: VolumesResource = js.native
  /** Adds a volume to a bookshelf. */
  def addVolume(request: AnonAltFieldsKeyOauthtoken): Request_[Unit] = js.native
  /** Clears all volumes from a bookshelf. */
  def clearVolumes(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Unit] = js.native
  /** Retrieves metadata for a specific bookshelf for the specified user. */
  def get(request: AnonAltFields): Request_[Bookshelf] = js.native
  /** Retrieves metadata for a specific bookshelf belonging to the authenticated user. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[Bookshelf] = js.native
  /** Retrieves a list of public bookshelves for the specified user. */
  def list(request: AnonAltFieldsKey): Request_[Bookshelves] = js.native
  /** Retrieves a list of bookshelves belonging to the authenticated user. */
  def list(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request_[Bookshelves] = js.native
  /** Moves a volume within a bookshelf. */
  def moveVolume(request: AnonAltFieldsKeyOauthtokenPrettyPrintQuotaUserShelf): Request_[Unit] = js.native
  /** Removes a volume from a bookshelf. */
  def removeVolume(request: AnonAltFieldsKeyOauthtoken): Request_[Unit] = js.native
}

