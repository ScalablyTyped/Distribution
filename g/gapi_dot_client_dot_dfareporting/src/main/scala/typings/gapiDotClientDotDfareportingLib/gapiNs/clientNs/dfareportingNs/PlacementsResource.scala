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

object PlacementsResource {
  @scala.inline
  def apply(
    generatetags: gapiDotClientDotDfareportingLib.Anon_AltCampaignIdFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[PlacementsGenerateTagsResponse],
    get: gapiDotClientDotDfareportingLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Placement],
    insert: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Placement],
    list: gapiDotClientDotDfareportingLib.Anon_AdvertiserIdsAltArchivedCampaignIds => gapiDotClientLib.gapiNs.clientNs.Request[PlacementsListResponse],
    patch: gapiDotClientDotDfareportingLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Placement],
    update: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Placement]
  ): PlacementsResource = {
    val __obj = js.Dynamic.literal(generatetags = js.Any.fromFunction1(generatetags), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlacementsResource]
  }
}

