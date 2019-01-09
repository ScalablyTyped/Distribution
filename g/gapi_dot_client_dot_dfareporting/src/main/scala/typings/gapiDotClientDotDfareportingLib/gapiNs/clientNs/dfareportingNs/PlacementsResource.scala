package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementsResource extends js.Object {
  /** Generates tags for a placement. */
  def generatetags(request: gapiDotClientDotDfareportingLib.Anon_AltCampaignIdFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[PlacementsGenerateTagsResponse]
  /** Gets one placement by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Placement]
  /** Inserts a new placement. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Placement]
  /** Retrieves a list of placements, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AdvertiserIdsAltArchivedCampaignIds): gapiDotClientLib.gapiNs.clientNs.Request[PlacementsListResponse]
  /** Updates an existing placement. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Placement]
  /** Updates an existing placement. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Placement]
}

