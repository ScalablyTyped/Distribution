package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseIdFields
import typings.gapiDotClientDotAndroidenterprise.Anon_AltEnterpriseIdFieldsKeyKeyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceaccountkeysResource extends js.Object {
  /**
    * Removes and invalidates the specified credentials for the service account associated with this enterprise. The calling service account must have been
    * retrieved by calling Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling Enterprises.SetAccount.
    */
  def delete(request: Anon_AltEnterpriseIdFieldsKeyKeyId): Request[Unit]
  /**
    * Generates new credentials for the service account associated with this enterprise. The calling service account must have been retrieved by calling
    * Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling Enterprises.SetAccount.
    *
    * Only the type of the key should be populated in the resource to be inserted.
    */
  def insert(request: Anon_AltEnterpriseIdFields): Request[ServiceAccountKey]
  /**
    * Lists all active credentials for the service account associated with this enterprise. Only the ID and key type are returned. The calling service
    * account must have been retrieved by calling Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling
    * Enterprises.SetAccount.
    */
  def list(request: Anon_AltEnterpriseIdFields): Request[ServiceAccountKeysListResponse]
}

object ServiceaccountkeysResource {
  @scala.inline
  def apply(
    delete: Anon_AltEnterpriseIdFieldsKeyKeyId => Request[Unit],
    insert: Anon_AltEnterpriseIdFields => Request[ServiceAccountKey],
    list: Anon_AltEnterpriseIdFields => Request[ServiceAccountKeysListResponse]
  ): ServiceaccountkeysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ServiceaccountkeysResource]
  }
}

