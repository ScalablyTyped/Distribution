package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsIdsKey
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightConfigurationsResource extends js.Object {
  /** Gets one floodlight configuration by ID. */
  def get(request: Anon_AltFields): Request[FloodlightConfiguration]
  /** Retrieves a list of floodlight configurations, possibly filtered. */
  def list(request: Anon_AltFieldsIdsKey): Request[FloodlightConfigurationsListResponse]
  /** Updates an existing floodlight configuration. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[FloodlightConfiguration]
  /** Updates an existing floodlight configuration. */
  def update(request: Anon_AltFieldsKey): Request[FloodlightConfiguration]
}

object FloodlightConfigurationsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[FloodlightConfiguration],
    list: Anon_AltFieldsIdsKey => Request[FloodlightConfigurationsListResponse],
    patch: Anon_AltFields => Request[FloodlightConfiguration],
    update: Anon_AltFieldsKey => Request[FloodlightConfiguration]
  ): FloodlightConfigurationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FloodlightConfigurationsResource]
  }
}

