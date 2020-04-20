package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonFloodlightActivityGroupIds
import typings.gapiClientDfareporting.AnonFloodlightActivityId
import typings.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivitiesResource extends js.Object {
  /** Deletes an existing floodlight activity. */
  def delete(request: AnonFields): Request_[Unit]
  /** Generates a tag for a floodlight activity. */
  def generatetag(request: AnonFloodlightActivityId): Request_[FloodlightActivitiesGenerateTagResponse]
  /** Gets one floodlight activity by ID. */
  def get(request: AnonFields): Request_[FloodlightActivity]
  /** Inserts a new floodlight activity. */
  def insert(request: AnonKey): Request_[FloodlightActivity]
  /** Retrieves a list of floodlight activities, possibly filtered. This method supports paging. */
  def list(request: AnonFloodlightActivityGroupIds): Request_[FloodlightActivitiesListResponse]
  /** Updates an existing floodlight activity. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[FloodlightActivity]
  /** Updates an existing floodlight activity. */
  def update(request: AnonKey): Request_[FloodlightActivity]
}

object FloodlightActivitiesResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    generatetag: AnonFloodlightActivityId => Request_[FloodlightActivitiesGenerateTagResponse],
    get: AnonFields => Request_[FloodlightActivity],
    insert: AnonKey => Request_[FloodlightActivity],
    list: AnonFloodlightActivityGroupIds => Request_[FloodlightActivitiesListResponse],
    patch: AnonFields => Request_[FloodlightActivity],
    update: AnonKey => Request_[FloodlightActivity]
  ): FloodlightActivitiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), generatetag = js.Any.fromFunction1(generatetag), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FloodlightActivitiesResource]
  }
}

