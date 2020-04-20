package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonConfigId
import typings.gapiClientAdexchangebuyer.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PretargetingConfigResource extends js.Object {
  /** Deletes an existing pretargeting config. */
  def delete(request: AnonConfigId): Request_[Unit]
  /** Gets a specific pretargeting configuration */
  def get(request: AnonConfigId): Request_[PretargetingConfig]
  /** Inserts a new pretargeting configuration. */
  def insert(request: AnonQuotaUser): Request_[PretargetingConfig]
  /** Retrieves a list of the authenticated user's pretargeting configurations. */
  def list(request: AnonQuotaUser): Request_[PretargetingConfigList]
  /** Updates an existing pretargeting config. This method supports patch semantics. */
  def patch(request: AnonConfigId): Request_[PretargetingConfig]
  /** Updates an existing pretargeting config. */
  def update(request: AnonConfigId): Request_[PretargetingConfig]
}

object PretargetingConfigResource {
  @scala.inline
  def apply(
    delete: AnonConfigId => Request_[Unit],
    get: AnonConfigId => Request_[PretargetingConfig],
    insert: AnonQuotaUser => Request_[PretargetingConfig],
    list: AnonQuotaUser => Request_[PretargetingConfigList],
    patch: AnonConfigId => Request_[PretargetingConfig],
    update: AnonConfigId => Request_[PretargetingConfig]
  ): PretargetingConfigResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PretargetingConfigResource]
  }
}

