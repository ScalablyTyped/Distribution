package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDrive.anon.DriveId
import typings.gapiClientDrive.anon.Fields
import typings.gapiClientDrive.anon.IncludeCorpusRemovals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangesResource extends js.Object {
  /** Gets the starting pageToken for listing future changes. */
  def getStartPageToken(): Request[StartPageToken] = js.native
  def getStartPageToken(request: DriveId): Request[StartPageToken] = js.native
  /** Lists the changes for a user or shared drive. */
  def list(): Request[ChangeList] = js.native
  def list(request: Fields): Request[ChangeList] = js.native
  def watch(request: Fields, body: Channel): Request[Channel] = js.native
  /** Subscribes to changes for a user. */
  def watch(request: IncludeCorpusRemovals): Request[Channel] = js.native
}

