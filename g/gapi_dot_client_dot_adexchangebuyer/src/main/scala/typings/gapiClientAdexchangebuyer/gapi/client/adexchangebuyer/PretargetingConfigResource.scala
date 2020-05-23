package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer.anon.ConfigId
import typings.gapiClientAdexchangebuyer.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PretargetingConfigResource extends js.Object {
  /** Deletes an existing pretargeting config. */
  def delete(request: ConfigId): Request[Unit]
  /** Gets a specific pretargeting configuration */
  def get(request: ConfigId): Request[PretargetingConfig]
  /** Inserts a new pretargeting configuration. */
  def insert(request: QuotaUser): Request[PretargetingConfig]
  /** Retrieves a list of the authenticated user's pretargeting configurations. */
  def list(request: QuotaUser): Request[PretargetingConfigList]
  /** Updates an existing pretargeting config. This method supports patch semantics. */
  def patch(request: ConfigId): Request[PretargetingConfig]
  /** Updates an existing pretargeting config. */
  def update(request: ConfigId): Request[PretargetingConfig]
}

object PretargetingConfigResource {
  @scala.inline
  def apply(
    delete: ConfigId => Request[Unit],
    get: ConfigId => Request[PretargetingConfig],
    insert: QuotaUser => Request[PretargetingConfig],
    list: QuotaUser => Request[PretargetingConfigList],
    patch: ConfigId => Request[PretargetingConfig],
    update: ConfigId => Request[PretargetingConfig]
  ): PretargetingConfigResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PretargetingConfigResource]
  }
}

