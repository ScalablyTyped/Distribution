package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Compatibilities
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import typings.gapiClientDfareporting.anon.PlacementIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementsResource extends js.Object {
  /** Generates tags for a placement. */
  def generatetags(request: PlacementIds): Request[PlacementsGenerateTagsResponse]
  /** Gets one placement by ID. */
  def get(request: Fields): Request[Placement]
  /** Inserts a new placement. */
  def insert(request: Key): Request[Placement]
  /** Retrieves a list of placements, possibly filtered. This method supports paging. */
  def list(request: Compatibilities): Request[PlacementsListResponse]
  /** Updates an existing placement. This method supports patch semantics. */
  def patch(request: Fields): Request[Placement]
  /** Updates an existing placement. */
  def update(request: Key): Request[Placement]
}

object PlacementsResource {
  @scala.inline
  def apply(
    generatetags: PlacementIds => Request[PlacementsGenerateTagsResponse],
    get: Fields => Request[Placement],
    insert: Key => Request[Placement],
    list: Compatibilities => Request[PlacementsListResponse],
    patch: Fields => Request[Placement],
    update: Key => Request[Placement]
  ): PlacementsResource = {
    val __obj = js.Dynamic.literal(generatetags = js.Any.fromFunction1(generatetags), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlacementsResource]
  }
}

