package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementsResource extends js.Object {
  /** Generates tags for a placement. */
  def generatetags(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrintQuotaUserKeyPlacementIds): gapiDotClientLib.gapiNs.clientNs.Request[PlacementsGenerateTagsResponse]
  /** Gets one placement by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Placement]
  /** Inserts a new placement. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[Placement]
  /** Retrieves a list of placements, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_MinEndDate): gapiDotClientLib.gapiNs.clientNs.Request[PlacementsListResponse]
  /** Updates an existing placement. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Placement]
  /** Updates an existing placement. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[Placement]
}

