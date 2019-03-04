package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightConfigurationsResource extends js.Object {
  /** Gets one floodlight configuration by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightConfiguration]
  /** Retrieves a list of floodlight configurations, possibly filtered. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsIdsKey): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightConfigurationsListResponse]
  /** Updates an existing floodlight configuration. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightConfiguration]
  /** Updates an existing floodlight configuration. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[FloodlightConfiguration]
}

object FloodlightConfigurationsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[FloodlightConfiguration]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsIdsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[FloodlightConfigurationsListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[FloodlightConfiguration]
    ],
    update: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[FloodlightConfiguration]
    ]
  ): FloodlightConfigurationsResource = {
    val __obj = js.Dynamic.literal(get = get, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[FloodlightConfigurationsResource]
  }
}

