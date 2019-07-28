package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AdvertiserIdsAltArchivedCampaignIds
import typings.gapiDotClientDotDfareporting.Anon_AltCampaignIdFieldsKey
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementsResource extends js.Object {
  /** Generates tags for a placement. */
  def generatetags(request: Anon_AltCampaignIdFieldsKey): Request[PlacementsGenerateTagsResponse]
  /** Gets one placement by ID. */
  def get(request: Anon_AltFields): Request[Placement]
  /** Inserts a new placement. */
  def insert(request: Anon_AltFieldsKey): Request[Placement]
  /** Retrieves a list of placements, possibly filtered. This method supports paging. */
  def list(request: Anon_AdvertiserIdsAltArchivedCampaignIds): Request[PlacementsListResponse]
  /** Updates an existing placement. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[Placement]
  /** Updates an existing placement. */
  def update(request: Anon_AltFieldsKey): Request[Placement]
}

object PlacementsResource {
  @scala.inline
  def apply(
    generatetags: Anon_AltCampaignIdFieldsKey => Request[PlacementsGenerateTagsResponse],
    get: Anon_AltFields => Request[Placement],
    insert: Anon_AltFieldsKey => Request[Placement],
    list: Anon_AdvertiserIdsAltArchivedCampaignIds => Request[PlacementsListResponse],
    patch: Anon_AltFields => Request[Placement],
    update: Anon_AltFieldsKey => Request[Placement]
  ): PlacementsResource = {
    val __obj = js.Dynamic.literal(generatetags = js.Any.fromFunction1(generatetags), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlacementsResource]
  }
}

