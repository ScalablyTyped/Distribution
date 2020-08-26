package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidenterprise.anon.EnterpriseId
import typings.gapiClientAndroidenterprise.anon.EntitlementId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntitlementsResource extends js.Object {
  /** Removes an entitlement to an app for a user. */
  def delete(request: EntitlementId): Request[Unit] = js.native
  /** Retrieves details of an entitlement. */
  def get(request: EntitlementId): Request[Entitlement] = js.native
  /** Lists all entitlements for the specified user. Only the ID is set. */
  def list(request: EnterpriseId): Request[EntitlementsListResponse] = js.native
  /** Adds or updates an entitlement to an app for a user. This method supports patch semantics. */
  def patch(request: typings.gapiClientAndroidenterprise.anon.Install): Request[Entitlement] = js.native
  /** Adds or updates an entitlement to an app for a user. */
  def update(request: typings.gapiClientAndroidenterprise.anon.Install): Request[Entitlement] = js.native
}

object EntitlementsResource {
  @scala.inline
  def apply(
    delete: EntitlementId => Request[Unit],
    get: EntitlementId => Request[Entitlement],
    list: EnterpriseId => Request[EntitlementsListResponse],
    patch: typings.gapiClientAndroidenterprise.anon.Install => Request[Entitlement],
    update: typings.gapiClientAndroidenterprise.anon.Install => Request[Entitlement]
  ): EntitlementsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EntitlementsResource]
  }
  @scala.inline
  implicit class EntitlementsResourceOps[Self <: EntitlementsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: EntitlementId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: EntitlementId => Request[Entitlement]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: EnterpriseId => Request[EntitlementsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: typings.gapiClientAndroidenterprise.anon.Install => Request[Entitlement]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: typings.gapiClientAndroidenterprise.anon.Install => Request[Entitlement]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

