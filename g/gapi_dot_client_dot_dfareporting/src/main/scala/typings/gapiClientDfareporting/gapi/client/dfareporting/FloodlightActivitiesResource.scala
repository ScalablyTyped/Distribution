package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAdvertiserIdAltFields
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsFloodlightActivityId
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivitiesResource extends js.Object {
  /** Deletes an existing floodlight activity. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Generates a tag for a floodlight activity. */
  def generatetag(request: AnonAltFieldsFloodlightActivityId): Request_[FloodlightActivitiesGenerateTagResponse]
  /** Gets one floodlight activity by ID. */
  def get(request: AnonAltFields): Request_[FloodlightActivity]
  /** Inserts a new floodlight activity. */
  def insert(request: AnonAltFieldsKey): Request_[FloodlightActivity]
  /** Retrieves a list of floodlight activities, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserIdAltFields): Request_[FloodlightActivitiesListResponse]
  /** Updates an existing floodlight activity. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[FloodlightActivity]
  /** Updates an existing floodlight activity. */
  def update(request: AnonAltFieldsKey): Request_[FloodlightActivity]
}

object FloodlightActivitiesResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => Request_[Unit],
    generatetag: AnonAltFieldsFloodlightActivityId => Request_[FloodlightActivitiesGenerateTagResponse],
    get: AnonAltFields => Request_[FloodlightActivity],
    insert: AnonAltFieldsKey => Request_[FloodlightActivity],
    list: AnonAdvertiserIdAltFields => Request_[FloodlightActivitiesListResponse],
    patch: AnonAltFields => Request_[FloodlightActivity],
    update: AnonAltFieldsKey => Request_[FloodlightActivity]
  ): FloodlightActivitiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), generatetag = js.Any.fromFunction1(generatetag), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FloodlightActivitiesResource]
  }
}

