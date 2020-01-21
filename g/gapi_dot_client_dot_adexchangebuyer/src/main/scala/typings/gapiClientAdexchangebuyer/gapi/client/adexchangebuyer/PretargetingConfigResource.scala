package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer.AnonAccountIdAltConfigId
import typings.gapiClientAdexchangebuyer.AnonAccountIdAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PretargetingConfigResource extends js.Object {
  /** Deletes an existing pretargeting config. */
  def delete(request: AnonAccountIdAltConfigId): Request_[Unit]
  /** Gets a specific pretargeting configuration */
  def get(request: AnonAccountIdAltConfigId): Request_[PretargetingConfig]
  /** Inserts a new pretargeting configuration. */
  def insert(request: AnonAccountIdAltFields): Request_[PretargetingConfig]
  /** Retrieves a list of the authenticated user's pretargeting configurations. */
  def list(request: AnonAccountIdAltFields): Request_[PretargetingConfigList]
  /** Updates an existing pretargeting config. This method supports patch semantics. */
  def patch(request: AnonAccountIdAltConfigId): Request_[PretargetingConfig]
  /** Updates an existing pretargeting config. */
  def update(request: AnonAccountIdAltConfigId): Request_[PretargetingConfig]
}

object PretargetingConfigResource {
  @scala.inline
  def apply(
    delete: AnonAccountIdAltConfigId => Request_[Unit],
    get: AnonAccountIdAltConfigId => Request_[PretargetingConfig],
    insert: AnonAccountIdAltFields => Request_[PretargetingConfig],
    list: AnonAccountIdAltFields => Request_[PretargetingConfigList],
    patch: AnonAccountIdAltConfigId => Request_[PretargetingConfig],
    update: AnonAccountIdAltConfigId => Request_[PretargetingConfig]
  ): PretargetingConfigResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PretargetingConfigResource]
  }
}

