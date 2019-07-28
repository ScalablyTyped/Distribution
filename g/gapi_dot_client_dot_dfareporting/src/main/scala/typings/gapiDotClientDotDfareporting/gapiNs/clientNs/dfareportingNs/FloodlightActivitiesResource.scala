package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AdvertiserIdAltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsFloodlightActivityId
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivitiesResource extends js.Object {
  /** Deletes an existing floodlight activity. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Generates a tag for a floodlight activity. */
  def generatetag(request: Anon_AltFieldsFloodlightActivityId): Request[FloodlightActivitiesGenerateTagResponse]
  /** Gets one floodlight activity by ID. */
  def get(request: Anon_AltFields): Request[FloodlightActivity]
  /** Inserts a new floodlight activity. */
  def insert(request: Anon_AltFieldsKey): Request[FloodlightActivity]
  /** Retrieves a list of floodlight activities, possibly filtered. This method supports paging. */
  def list(request: Anon_AdvertiserIdAltFields): Request[FloodlightActivitiesListResponse]
  /** Updates an existing floodlight activity. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[FloodlightActivity]
  /** Updates an existing floodlight activity. */
  def update(request: Anon_AltFieldsKey): Request[FloodlightActivity]
}

object FloodlightActivitiesResource {
  @scala.inline
  def apply(
    delete: Anon_AltFields => Request[Unit],
    generatetag: Anon_AltFieldsFloodlightActivityId => Request[FloodlightActivitiesGenerateTagResponse],
    get: Anon_AltFields => Request[FloodlightActivity],
    insert: Anon_AltFieldsKey => Request[FloodlightActivity],
    list: Anon_AdvertiserIdAltFields => Request[FloodlightActivitiesListResponse],
    patch: Anon_AltFields => Request[FloodlightActivity],
    update: Anon_AltFieldsKey => Request[FloodlightActivity]
  ): FloodlightActivitiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), generatetag = js.Any.fromFunction1(generatetag), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FloodlightActivitiesResource]
  }
}

