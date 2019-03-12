package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PretargetingConfigResource extends js.Object {
  /** Deletes an existing pretargeting config. */
  def delete(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltConfigId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a specific pretargeting configuration */
  def get(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltConfigId): gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig]
  /** Inserts a new pretargeting configuration. */
  def insert(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig]
  /** Retrieves a list of the authenticated user's pretargeting configurations. */
  def list(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfigList]
  /** Updates an existing pretargeting config. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltConfigId): gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig]
  /** Updates an existing pretargeting config. */
  def update(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltConfigId): gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig]
}

object PretargetingConfigResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltConfigId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltConfigId => gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig],
    insert: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltFields => gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig],
    list: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltFields => gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfigList],
    patch: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltConfigId => gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig],
    update: gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltConfigId => gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig]
  ): PretargetingConfigResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PretargetingConfigResource]
  }
}

