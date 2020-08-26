package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidenterprise.anon.EnterpriseId
import typings.gapiClientAndroidenterprise.anon.ManagedConfigurationForUserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedconfigurationsforuserResource extends js.Object {
  /** Removes a per-user managed configuration for an app for the specified user. */
  def delete(request: ManagedConfigurationForUserId): Request[Unit] = js.native
  /** Retrieves details of a per-user managed configuration for an app for the specified user. */
  def get(request: ManagedConfigurationForUserId): Request[ManagedConfiguration] = js.native
  /** Lists all the per-user managed configurations for the specified user. Only the ID is set. */
  def list(request: EnterpriseId): Request[ManagedConfigurationsForUserListResponse] = js.native
  /** Adds or updates a per-user managed configuration for an app for the specified user. This method supports patch semantics. */
  def patch(request: ManagedConfigurationForUserId): Request[ManagedConfiguration] = js.native
  /** Adds or updates a per-user managed configuration for an app for the specified user. */
  def update(request: ManagedConfigurationForUserId): Request[ManagedConfiguration] = js.native
}

object ManagedconfigurationsforuserResource {
  @scala.inline
  def apply(
    delete: ManagedConfigurationForUserId => Request[Unit],
    get: ManagedConfigurationForUserId => Request[ManagedConfiguration],
    list: EnterpriseId => Request[ManagedConfigurationsForUserListResponse],
    patch: ManagedConfigurationForUserId => Request[ManagedConfiguration],
    update: ManagedConfigurationForUserId => Request[ManagedConfiguration]
  ): ManagedconfigurationsforuserResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ManagedconfigurationsforuserResource]
  }
  @scala.inline
  implicit class ManagedconfigurationsforuserResourceOps[Self <: ManagedconfigurationsforuserResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: ManagedConfigurationForUserId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: ManagedConfigurationForUserId => Request[ManagedConfiguration]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: EnterpriseId => Request[ManagedConfigurationsForUserListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: ManagedConfigurationForUserId => Request[ManagedConfiguration]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: ManagedConfigurationForUserId => Request[ManagedConfiguration]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

