package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsIdsKey
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightConfigurationsResource extends js.Object {
  /** Gets one floodlight configuration by ID. */
  def get(request: AnonAltFields): Request_[FloodlightConfiguration]
  /** Retrieves a list of floodlight configurations, possibly filtered. */
  def list(request: AnonAltFieldsIdsKey): Request_[FloodlightConfigurationsListResponse]
  /** Updates an existing floodlight configuration. This method supports patch semantics. */
  def patch(request: AnonAltFields): Request_[FloodlightConfiguration]
  /** Updates an existing floodlight configuration. */
  def update(request: AnonAltFieldsKey): Request_[FloodlightConfiguration]
}

object FloodlightConfigurationsResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[FloodlightConfiguration],
    list: AnonAltFieldsIdsKey => Request_[FloodlightConfigurationsListResponse],
    patch: AnonAltFields => Request_[FloodlightConfiguration],
    update: AnonAltFieldsKey => Request_[FloodlightConfiguration]
  ): FloodlightConfigurationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FloodlightConfigurationsResource]
  }
}

