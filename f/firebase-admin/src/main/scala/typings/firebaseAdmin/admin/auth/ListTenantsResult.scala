package typings.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the object returned from a
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#listTenants `listTenants()`}
  * operation.
  * Contains the list of tenants for the current batch and the next page token if available.
  */
trait ListTenantsResult extends js.Object {
  /**
    * The next page token if available. This is needed for the next batch download.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The list of {@link admin.auth.Tenant `Tenant`} objects for the downloaded batch.
    */
  var tenants: js.Array[Tenant]
}

object ListTenantsResult {
  @scala.inline
  def apply(tenants: js.Array[Tenant], pageToken: String = null): ListTenantsResult = {
    val __obj = js.Dynamic.literal(tenants = tenants.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTenantsResult]
  }
}

