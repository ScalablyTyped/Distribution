package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAdvertiserIdsAltArchivedCampaignIds
import typings.gapiClientDfareporting.AnonAltCampaignIdFieldsKey
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementsResource extends js.Object {
  /** Generates tags for a placement. */
  def generatetags(request: AnonAltCampaignIdFieldsKey): Request_[PlacementsGenerateTagsResponse]
  /** Gets one placement by ID. */
  def get(request: AnonAltFields): Request_[Placement]
  /** Inserts a new placement. */
  def insert(request: AnonAltFieldsKey): Request_[Placement]
  /** Retrieves a list of placements, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserIdsAltArchivedCampaignIds): Request_[PlacementsListResponse]
  /** Updates an existing placement. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[Placement]
  /** Updates an existing placement. */
  def update(request: AnonAltFieldsKey): Request_[Placement]
}

object PlacementsResource {
  @scala.inline
  def apply(
    generatetags: AnonAltCampaignIdFieldsKey => Request_[PlacementsGenerateTagsResponse],
    get: AnonAltFields => Request_[Placement],
    insert: AnonAltFieldsKey => Request_[Placement],
    list: AnonAdvertiserIdsAltArchivedCampaignIds => Request_[PlacementsListResponse],
    patch: AnonAltFields => Request_[Placement],
    update: AnonAltFieldsKey => Request_[Placement]
  ): PlacementsResource = {
    val __obj = js.Dynamic.literal(generatetags = js.Any.fromFunction1(generatetags), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlacementsResource]
  }
}

