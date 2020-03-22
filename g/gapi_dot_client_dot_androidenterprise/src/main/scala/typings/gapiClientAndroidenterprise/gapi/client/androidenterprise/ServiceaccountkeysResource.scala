package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidenterprise.AnonKey
import typings.gapiClientAndroidenterprise.AnonKeyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceaccountkeysResource extends js.Object {
  /**
    * Removes and invalidates the specified credentials for the service account associated with this enterprise. The calling service account must have been
    * retrieved by calling Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling Enterprises.SetAccount.
    */
  def delete(request: AnonKeyId): Request_[Unit]
  /**
    * Generates new credentials for the service account associated with this enterprise. The calling service account must have been retrieved by calling
    * Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling Enterprises.SetAccount.
    *
    * Only the type of the key should be populated in the resource to be inserted.
    */
  def insert(request: AnonKey): Request_[ServiceAccountKey]
  /**
    * Lists all active credentials for the service account associated with this enterprise. Only the ID and key type are returned. The calling service
    * account must have been retrieved by calling Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling
    * Enterprises.SetAccount.
    */
  def list(request: AnonKey): Request_[ServiceAccountKeysListResponse]
}

object ServiceaccountkeysResource {
  @scala.inline
  def apply(
    delete: AnonKeyId => Request_[Unit],
    insert: AnonKey => Request_[ServiceAccountKey],
    list: AnonKey => Request_[ServiceAccountKeysListResponse]
  ): ServiceaccountkeysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ServiceaccountkeysResource]
  }
}

