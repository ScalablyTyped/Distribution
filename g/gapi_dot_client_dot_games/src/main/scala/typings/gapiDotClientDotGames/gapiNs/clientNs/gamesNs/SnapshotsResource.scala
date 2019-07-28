package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKeyLanguageMaxResults
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUserSnapshotId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotsResource extends js.Object {
  /** Retrieves the metadata for a given snapshot ID. */
  def get(request: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUserSnapshotId): Request[Snapshot]
  /** Retrieves a list of snapshots created by your application for the player corresponding to the player ID. */
  def list(request: Anon_AltConsistencyTokenFieldsKeyLanguageMaxResults): Request[SnapshotListResponse]
}

object SnapshotsResource {
  @scala.inline
  def apply(
    get: Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUserSnapshotId => Request[Snapshot],
    list: Anon_AltConsistencyTokenFieldsKeyLanguageMaxResults => Request[SnapshotListResponse]
  ): SnapshotsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SnapshotsResource]
  }
}

