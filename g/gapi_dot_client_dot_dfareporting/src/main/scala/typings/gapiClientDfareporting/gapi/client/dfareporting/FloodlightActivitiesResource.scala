package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.FloodlightActivityGroupIds
import typings.gapiClientDfareporting.anon.FloodlightActivityId
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivitiesResource extends js.Object {
  /** Deletes an existing floodlight activity. */
  def delete(request: Fields): Request[Unit]
  /** Generates a tag for a floodlight activity. */
  def generatetag(request: FloodlightActivityId): Request[FloodlightActivitiesGenerateTagResponse]
  /** Gets one floodlight activity by ID. */
  def get(request: Fields): Request[FloodlightActivity]
  /** Inserts a new floodlight activity. */
  def insert(request: Key): Request[FloodlightActivity]
  /** Retrieves a list of floodlight activities, possibly filtered. This method supports paging. */
  def list(request: FloodlightActivityGroupIds): Request[FloodlightActivitiesListResponse]
  /** Updates an existing floodlight activity. This method supports patch semantics. */
  def patch(request: Fields): Request[FloodlightActivity]
  /** Updates an existing floodlight activity. */
  def update(request: Key): Request[FloodlightActivity]
}

object FloodlightActivitiesResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    generatetag: FloodlightActivityId => Request[FloodlightActivitiesGenerateTagResponse],
    get: Fields => Request[FloodlightActivity],
    insert: Key => Request[FloodlightActivity],
    list: FloodlightActivityGroupIds => Request[FloodlightActivitiesListResponse],
    patch: Fields => Request[FloodlightActivity],
    update: Key => Request[FloodlightActivity]
  ): FloodlightActivitiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), generatetag = js.Any.fromFunction1(generatetag), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FloodlightActivitiesResource]
  }
}

