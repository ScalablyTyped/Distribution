package typings.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the tenant manager used to help manage tenant related operations.
  * This includes:
  * <ul>
  * <li>The ability to create, update, list, get and delete tenants for the underlying
  *     project.</li>
  * <li>Getting a `TenantAwareAuth` instance for running Auth related operations
  *     (user management, provider configuration management, token verification,
  *     email link generation, etc) in the context of a specified tenant.</li>
  * </ul>
  */
@js.native
trait TenantManager extends js.Object {
  /** 
    * @param tenantId The tenant ID whose `TenantAwareAuth` instance is to be returned.
    *
    * @return The `TenantAwareAuth` instance corresponding to this tenant identifier.
    */
  def authForTenant(tenantId: String): TenantAwareAuth = js.native
  /** 
    * Creates a new tenant.
    * When creating new tenants, tenants that use separate billing and quota will require their
    * own project and must be defined as `full_service`.
    *
    * @param tenantOptions The properties to set on the new tenant configuration to be created.
    *
    * @return A promise fulfilled with the tenant configuration corresponding to the newly
    *   created tenant.
    */
  def createTenant(tenantOptions: CreateTenantRequest): js.Promise[Tenant] = js.native
  /**
    * Deletes an existing tenant.
    *
    * @param tenantId The `tenantId` corresponding to the tenant to delete.
    *
    * @return An empty promise fulfilled once the tenant has been deleted.
    */
  def deleteTenant(tenantId: String): js.Promise[Unit] = js.native
  /**
    * Gets the tenant configuration for the tenant corresponding to a given `tenantId`.
    *
    * @param tenantId The tenant identifier corresponding to the tenant whose data to fetch.
    *
    * @return A promise fulfilled with the tenant configuration to the provided `tenantId`.
    */
  def getTenant(tenantId: String): js.Promise[Tenant] = js.native
  /**
    * Retrieves a list of tenants (single batch only) with a size of `maxResults`
    * starting from the offset as specified by `pageToken`. This is used to
    * retrieve all the tenants of a specified project in batches.
    *
    * @param maxResults The page size, 1000 if undefined. This is also
    *   the maximum allowed limit.
    * @param pageToken The next page token. If not specified, returns
    *   tenants starting without any offset.
    *
    * @return A promise that resolves with
    *   a batch of downloaded tenants and the next page token.
    */
  def listTenants(): js.Promise[ListTenantsResult] = js.native
  def listTenants(maxResults: Double): js.Promise[ListTenantsResult] = js.native
  def listTenants(maxResults: Double, pageToken: String): js.Promise[ListTenantsResult] = js.native
  /**
    * Updates an existing tenant configuration.
    *
    * @param tenantId The `tenantId` corresponding to the tenant to delete.
    * @param tenantOptions The properties to update on the provided tenant.
    *
    * @return A promise fulfilled with the update tenant data.
    */
  def updateTenant(tenantId: String, tenantOptions: UpdateTenantRequest): js.Promise[Tenant] = js.native
}

