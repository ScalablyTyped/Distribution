package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer.Anon_AccountIdAltConfigId
import typings.gapiDotClientDotAdexchangebuyer.Anon_AccountIdAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PretargetingConfigResource extends js.Object {
  /** Deletes an existing pretargeting config. */
  def delete(request: Anon_AccountIdAltConfigId): Request[Unit]
  /** Gets a specific pretargeting configuration */
  def get(request: Anon_AccountIdAltConfigId): Request[PretargetingConfig]
  /** Inserts a new pretargeting configuration. */
  def insert(request: Anon_AccountIdAltFields): Request[PretargetingConfig]
  /** Retrieves a list of the authenticated user's pretargeting configurations. */
  def list(request: Anon_AccountIdAltFields): Request[PretargetingConfigList]
  /** Updates an existing pretargeting config. This method supports patch semantics. */
  def patch(request: Anon_AccountIdAltConfigId): Request[PretargetingConfig]
  /** Updates an existing pretargeting config. */
  def update(request: Anon_AccountIdAltConfigId): Request[PretargetingConfig]
}

object PretargetingConfigResource {
  @scala.inline
  def apply(
    delete: Anon_AccountIdAltConfigId => Request[Unit],
    get: Anon_AccountIdAltConfigId => Request[PretargetingConfig],
    insert: Anon_AccountIdAltFields => Request[PretargetingConfig],
    list: Anon_AccountIdAltFields => Request[PretargetingConfigList],
    patch: Anon_AccountIdAltConfigId => Request[PretargetingConfig],
    update: Anon_AccountIdAltConfigId => Request[PretargetingConfig]
  ): PretargetingConfigResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PretargetingConfigResource]
  }
}

