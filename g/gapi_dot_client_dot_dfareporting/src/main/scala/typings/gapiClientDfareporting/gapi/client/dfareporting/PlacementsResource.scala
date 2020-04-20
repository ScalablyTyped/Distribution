package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonCompatibilities
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonKey
import typings.gapiClientDfareporting.AnonPlacementIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementsResource extends js.Object {
  /** Generates tags for a placement. */
  def generatetags(request: AnonPlacementIds): Request_[PlacementsGenerateTagsResponse]
  /** Gets one placement by ID. */
  def get(request: AnonFields): Request_[Placement]
  /** Inserts a new placement. */
  def insert(request: AnonKey): Request_[Placement]
  /** Retrieves a list of placements, possibly filtered. This method supports paging. */
  def list(request: AnonCompatibilities): Request_[PlacementsListResponse]
  /** Updates an existing placement. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Placement]
  /** Updates an existing placement. */
  def update(request: AnonKey): Request_[Placement]
}

object PlacementsResource {
  @scala.inline
  def apply(
    generatetags: AnonPlacementIds => Request_[PlacementsGenerateTagsResponse],
    get: AnonFields => Request_[Placement],
    insert: AnonKey => Request_[Placement],
    list: AnonCompatibilities => Request_[PlacementsListResponse],
    patch: AnonFields => Request_[Placement],
    update: AnonKey => Request_[Placement]
  ): PlacementsResource = {
    val __obj = js.Dynamic.literal(generatetags = js.Any.fromFunction1(generatetags), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlacementsResource]
  }
}

