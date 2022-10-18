package typings.firebaseAdmin

import typings.firebaseAdmin.libAuthBaseAuthMod.BaseAuth
import typings.firebaseAdmin.libAuthTenantMod.CreateTenantRequest
import typings.firebaseAdmin.libAuthTenantMod.Tenant
import typings.firebaseAdmin.libAuthTenantMod.UpdateTenantRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthTenantManagerMod {
  
  @JSImport("firebase-admin/lib/auth/tenant-manager", "TenantAwareAuth")
  @js.native
  open class TenantAwareAuth () extends BaseAuth {
    
    /**
      * The tenant identifier corresponding to this `TenantAwareAuth` instance.
      * All calls to the user management APIs, OIDC/SAML provider management APIs, email link
      * generation APIs, etc will only be applied within the scope of this tenant.
      */
    val tenantId: String = js.native
  }
  
  @JSImport("firebase-admin/lib/auth/tenant-manager", "TenantManager")
  @js.native
  open class TenantManager () extends StObject {
    
    /* private */ val app: Any = js.native
    
    /**
      * Returns a `TenantAwareAuth` instance bound to the given tenant ID.
      *
      * @param tenantId - The tenant ID whose `TenantAwareAuth` instance is to be returned.
      *
      * @returns The `TenantAwareAuth` instance corresponding to this tenant identifier.
      */
    def authForTenant(tenantId: String): TenantAwareAuth = js.native
    
    /* private */ val authRequestHandler: Any = js.native
    
    /**
      * Creates a new tenant.
      * When creating new tenants, tenants that use separate billing and quota will require their
      * own project and must be defined as `full_service`.
      *
      * @param tenantOptions - The properties to set on the new tenant configuration to be created.
      *
      * @returns A promise fulfilled with the tenant configuration corresponding to the newly
      *   created tenant.
      */
    def createTenant(tenantOptions: CreateTenantRequest): js.Promise[Tenant] = js.native
    
    /**
      * Deletes an existing tenant.
      *
      * @param tenantId - The `tenantId` corresponding to the tenant to delete.
      *
      * @returns An empty promise fulfilled once the tenant has been deleted.
      */
    def deleteTenant(tenantId: String): js.Promise[Unit] = js.native
    
    /**
      * Gets the tenant configuration for the tenant corresponding to a given `tenantId`.
      *
      * @param tenantId - The tenant identifier corresponding to the tenant whose data to fetch.
      *
      * @returns A promise fulfilled with the tenant configuration to the provided `tenantId`.
      */
    def getTenant(tenantId: String): js.Promise[Tenant] = js.native
    
    /**
      * Retrieves a list of tenants (single batch only) with a size of `maxResults`
      * starting from the offset as specified by `pageToken`. This is used to
      * retrieve all the tenants of a specified project in batches.
      *
      * @param maxResults - The page size, 1000 if undefined. This is also
      *   the maximum allowed limit.
      * @param pageToken - The next page token. If not specified, returns
      *   tenants starting without any offset.
      *
      * @returns A promise that resolves with
      *   a batch of downloaded tenants and the next page token.
      */
    def listTenants(): js.Promise[ListTenantsResult] = js.native
    def listTenants(maxResults: Double): js.Promise[ListTenantsResult] = js.native
    def listTenants(maxResults: Double, pageToken: String): js.Promise[ListTenantsResult] = js.native
    def listTenants(maxResults: Unit, pageToken: String): js.Promise[ListTenantsResult] = js.native
    
    /* private */ val tenantsMap: Any = js.native
    
    /**
      * Updates an existing tenant configuration.
      *
      * @param tenantId - The `tenantId` corresponding to the tenant to delete.
      * @param tenantOptions - The properties to update on the provided tenant.
      *
      * @returns A promise fulfilled with the update tenant data.
      */
    def updateTenant(tenantId: String, tenantOptions: UpdateTenantRequest): js.Promise[Tenant] = js.native
  }
  
  trait ListTenantsResult extends StObject {
    
    /**
      * The next page token if available. This is needed for the next batch download.
      */
    var pageToken: js.UndefOr[String] = js.undefined
    
    /**
      * The list of {@link Tenant} objects for the downloaded batch.
      */
    var tenants: js.Array[Tenant]
  }
  object ListTenantsResult {
    
    inline def apply(tenants: js.Array[Tenant]): ListTenantsResult = {
      val __obj = js.Dynamic.literal(tenants = tenants.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListTenantsResult]
    }
    
    extension [Self <: ListTenantsResult](x: Self) {
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      inline def setTenants(value: js.Array[Tenant]): Self = StObject.set(x, "tenants", value.asInstanceOf[js.Any])
      
      inline def setTenantsVarargs(value: Tenant*): Self = StObject.set(x, "tenants", js.Array(value*))
    }
  }
}
