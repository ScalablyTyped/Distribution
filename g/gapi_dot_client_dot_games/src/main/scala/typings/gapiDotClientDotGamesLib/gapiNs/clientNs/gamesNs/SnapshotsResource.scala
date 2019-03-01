package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotsResource extends js.Object {
  /** Retrieves the metadata for a given snapshot ID. */
  def get(
    request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUserSnapshotId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Snapshot]
  /** Retrieves a list of snapshots created by your application for the player corresponding to the player ID. */
  def list(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[SnapshotListResponse]
}

object SnapshotsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageOauthtokenPrettyPrintQuotaUserSnapshotId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Snapshot]
    ],
    list: js.Function1[
      gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMaxResults, 
      gapiDotClientLib.gapiNs.clientNs.Request[SnapshotListResponse]
    ]
  ): SnapshotsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[SnapshotsResource]
  }
}

