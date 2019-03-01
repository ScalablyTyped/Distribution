package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceaccountkeysResource extends js.Object {
  /**
    * Removes and invalidates the specified credentials for the service account associated with this enterprise. The calling service account must have been
    * retrieved by calling Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling Enterprises.SetAccount.
    */
  def delete(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyKeyId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
    * Generates new credentials for the service account associated with this enterprise. The calling service account must have been retrieved by calling
    * Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling Enterprises.SetAccount.
    *
    * Only the type of the key should be populated in the resource to be inserted.
    */
  def insert(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFields): gapiDotClientLib.gapiNs.clientNs.Request[ServiceAccountKey]
  /**
    * Lists all active credentials for the service account associated with this enterprise. Only the ID and key type are returned. The calling service
    * account must have been retrieved by calling Enterprises.GetServiceAccount and must have been set as the enterprise service account by calling
    * Enterprises.SetAccount.
    */
  def list(request: gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFields): gapiDotClientLib.gapiNs.clientNs.Request[ServiceAccountKeysListResponse]
}

object ServiceaccountkeysResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFieldsKeyKeyId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    insert: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ServiceAccountKey]
    ],
    list: js.Function1[
      gapiDotClientDotAndroidenterpriseLib.Anon_AltEnterpriseIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ServiceAccountKeysListResponse]
    ]
  ): ServiceaccountkeysResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[ServiceaccountkeysResource]
  }
}

