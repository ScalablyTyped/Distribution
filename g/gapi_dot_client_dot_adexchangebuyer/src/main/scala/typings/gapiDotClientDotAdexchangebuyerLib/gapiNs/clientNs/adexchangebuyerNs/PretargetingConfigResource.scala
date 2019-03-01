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
    delete: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltConfigId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltConfigId, 
      gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig]
    ],
    insert: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig]
    ],
    list: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfigList]
    ],
    patch: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltConfigId, 
      gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig]
    ],
    update: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AccountIdAltConfigId, 
      gapiDotClientLib.gapiNs.clientNs.Request[PretargetingConfig]
    ]
  ): PretargetingConfigResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[PretargetingConfigResource]
  }
}

