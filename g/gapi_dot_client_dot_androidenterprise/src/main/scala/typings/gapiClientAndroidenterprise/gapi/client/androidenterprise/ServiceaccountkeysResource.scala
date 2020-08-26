package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidenterprise.anon.Key
import typings.gapiClientAndroidenterprise.anon.KeyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceaccountkeysResource extends js.Object {
  /**
    * Removes and invalidates the specified credentials for the service account associated with this enterprise. The calling service account must have been
    * retrieved by calling Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling Enterprises.SetAccount.
    */
  def delete(request: KeyId): Request[Unit] = js.native
  /**
    * Generates new credentials for the service account associated with this enterprise. The calling service account must have been retrieved by calling
    * Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling Enterprises.SetAccount.
    *
    * Only the type of the key should be populated in the resource to be inserted.
    */
  def insert(request: Key): Request[ServiceAccountKey] = js.native
  /**
    * Lists all active credentials for the service account associated with this enterprise. Only the ID and key type are returned. The calling service
    * account must have been retrieved by calling Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling
    * Enterprises.SetAccount.
    */
  def list(request: Key): Request[ServiceAccountKeysListResponse] = js.native
}

object ServiceaccountkeysResource {
  @scala.inline
  def apply(
    delete: KeyId => Request[Unit],
    insert: Key => Request[ServiceAccountKey],
    list: Key => Request[ServiceAccountKeysListResponse]
  ): ServiceaccountkeysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ServiceaccountkeysResource]
  }
  @scala.inline
  implicit class ServiceaccountkeysResourceOps[Self <: ServiceaccountkeysResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: KeyId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Key => Request[ServiceAccountKey]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[ServiceAccountKeysListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

