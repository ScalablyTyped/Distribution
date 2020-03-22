package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonPageToken
import typings.gapiClientGames.AnonSnapshotId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotsResource extends js.Object {
  /** Retrieves the metadata for a given snapshot ID. */
  def get(request: AnonSnapshotId): Request_[Snapshot]
  /** Retrieves a list of snapshots created by your application for the player corresponding to the player ID. */
  def list(request: AnonPageToken): Request_[SnapshotListResponse]
}

object SnapshotsResource {
  @scala.inline
  def apply(get: AnonSnapshotId => Request_[Snapshot], list: AnonPageToken => Request_[SnapshotListResponse]): SnapshotsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SnapshotsResource]
  }
}

