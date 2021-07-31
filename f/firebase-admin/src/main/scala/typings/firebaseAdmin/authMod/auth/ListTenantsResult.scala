package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing the object returned from a
  * {@link auth.TenantManager.listTenants `listTenants()`}
  * operation.
  * Contains the list of tenants for the current batch and the next page token if available.
  */
trait ListTenantsResult extends StObject {
  
  /**
    * The next page token if available. This is needed for the next batch download.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of {@link auth.Tenant `Tenant`} objects for the downloaded batch.
    */
  var tenants: js.Array[Tenant]
}
object ListTenantsResult {
  
  @scala.inline
  def apply(tenants: js.Array[Tenant]): ListTenantsResult = {
    val __obj = js.Dynamic.literal(tenants = tenants.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTenantsResult]
  }
  
  @scala.inline
  implicit class ListTenantsResultMutableBuilder[Self <: ListTenantsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setTenants(value: js.Array[Tenant]): Self = StObject.set(x, "tenants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantsVarargs(value: Tenant*): Self = StObject.set(x, "tenants", js.Array(value :_*))
  }
}
