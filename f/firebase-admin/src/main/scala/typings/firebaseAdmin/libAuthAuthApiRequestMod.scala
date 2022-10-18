package typings.firebaseAdmin

import typings.firebaseAdmin.anon.NextPageToken
import typings.firebaseAdmin.libAppCoreMod.App
import typings.firebaseAdmin.libAuthProjectConfigMod.ProjectConfigServerResponse
import typings.firebaseAdmin.libAuthProjectConfigMod.UpdateProjectConfigRequest
import typings.firebaseAdmin.libAuthTenantMod.CreateTenantRequest
import typings.firebaseAdmin.libAuthTenantMod.TenantServerResponse
import typings.firebaseAdmin.libAuthTenantMod.UpdateTenantRequest
import typings.firebaseAdmin.libAuthUserImportBuilderMod.UserImportOptions
import typings.firebaseAdmin.libAuthUserImportBuilderMod.UserImportRecord
import typings.firebaseAdmin.libAuthUserImportBuilderMod.UserImportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthAuthApiRequestMod {
  
  @JSImport("firebase-admin/lib/auth/auth-api-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractAuthRequestHandler * / any */ @JSImport("firebase-admin/lib/auth/auth-api-request", "AuthRequestHandler")
  @js.native
  open class AuthRequestHandler protected () extends StObject {
    /**
      * The FirebaseAuthRequestHandler constructor used to initialize an instance using a FirebaseApp.
      *
      * @param app - The app used to fetch access tokens to sign API requests.
      * @constructor.
      */
    def this(app: App) = this()
    
    /* protected */ val authResourceUrlBuilder: AuthResourceUrlBuilder = js.native
    
    /**
      * Creates a new tenant with the properties provided.
      *
      * @param tenantOptions - The properties to set on the new tenant to be created.
      * @returns A promise that resolves with the newly created tenant object.
      */
    def createTenant(tenantOptions: CreateTenantRequest): js.Promise[TenantServerResponse] = js.native
    
    /**
      * Deletes a tenant identified by a tenantId.
      *
      * @param tenantId - The identifier of the tenant to delete.
      * @returns A promise that resolves when the tenant is deleted.
      */
    def deleteTenant(tenantId: String): js.Promise[Unit] = js.native
    
    /**
      * Get the current project's config
      * @returns A promise that resolves with the project config information.
      */
    def getProjectConfig(): js.Promise[ProjectConfigServerResponse] = js.native
    
    /**
      * Looks up a tenant by tenant ID.
      *
      * @param tenantId - The tenant identifier of the tenant to lookup.
      * @returns A promise that resolves with the tenant information.
      */
    def getTenant(tenantId: String): js.Promise[TenantServerResponse] = js.native
    
    /**
      * Exports the tenants (single batch only) with a size of maxResults and starting from
      * the offset as specified by pageToken.
      *
      * @param maxResults - The page size, 1000 if undefined. This is also the maximum
      *     allowed limit.
      * @param pageToken - The next page token. If not specified, returns tenants starting
      *     without any offset. Tenants are returned in the order they were created from oldest to
      *     newest, relative to the page token offset.
      * @returns A promise that resolves with the current batch of downloaded
      *     tenants and the next page token if available. For the last page, an empty list of tenants
      *     and no page token are returned.
      */
    def listTenants(): js.Promise[NextPageToken] = js.native
    def listTenants(maxResults: Double): js.Promise[NextPageToken] = js.native
    def listTenants(maxResults: Double, pageToken: String): js.Promise[NextPageToken] = js.native
    def listTenants(maxResults: Unit, pageToken: String): js.Promise[NextPageToken] = js.native
    
    /**
      * @returns A new Auth user management resource URL builder instance.
      */
    /* protected */ def newAuthUrlBuilder(): AuthResourceUrlBuilder = js.native
    
    /**
      * @returns A new project config resource URL builder instance.
      */
    /* protected */ def newProjectConfigUrlBuilder(): AuthResourceUrlBuilder = js.native
    
    /**
      * Update the current project's config.
      * @returns A promise that resolves with the project config information.
      */
    def updateProjectConfig(options: UpdateProjectConfigRequest): js.Promise[ProjectConfigServerResponse] = js.native
    
    /**
      * Updates an existing tenant with the properties provided.
      *
      * @param tenantId - The tenant identifier of the tenant to update.
      * @param tenantOptions - The properties to update on the existing tenant.
      * @returns A promise that resolves with the modified tenant object.
      */
    def updateTenant(tenantId: String, tenantOptions: UpdateTenantRequest): js.Promise[TenantServerResponse] = js.native
  }
  
  @JSImport("firebase-admin/lib/auth/auth-api-request", "EMAIL_ACTION_REQUEST_TYPES")
  @js.native
  val EMAIL_ACTION_REQUEST_TYPES: js.Array[String] = js.native
  
  @JSImport("firebase-admin/lib/auth/auth-api-request", "RESERVED_CLAIMS")
  @js.native
  val RESERVED_CLAIMS: js.Array[String] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbstractAuthRequestHandler * / any */ @JSImport("firebase-admin/lib/auth/auth-api-request", "TenantAwareAuthRequestHandler")
  @js.native
  open class TenantAwareAuthRequestHandler protected () extends StObject {
    /**
      * The FirebaseTenantRequestHandler constructor used to initialize an instance using a
      * FirebaseApp and a tenant ID.
      *
      * @param app - The app used to fetch access tokens to sign API requests.
      * @param tenantId - The request handler's tenant ID.
      * @constructor
      */
    def this(app: App, tenantId: String) = this()
    
    /**
      * @returns A new Auth user management resource URL builder instance.
      */
    /* protected */ def newAuthUrlBuilder(): AuthResourceUrlBuilder = js.native
    
    /**
      * @returns A new project config resource URL builder instance.
      */
    /* protected */ def newProjectConfigUrlBuilder(): AuthResourceUrlBuilder = js.native
    
    /* private */ val tenantId: Any = js.native
    
    /**
      * Imports the list of users provided to Firebase Auth. This is useful when
      * migrating from an external authentication system without having to use the Firebase CLI SDK.
      * At most, 1000 users are allowed to be imported one at a time.
      * When importing a list of password users, UserImportOptions are required to be specified.
      *
      * Overrides the superclass methods by adding an additional check to match tenant IDs of
      * imported user records if present.
      *
      * @param users - The list of user records to import to Firebase Auth.
      * @param options - The user import options, required when the users provided
      *     include password credentials.
      * @returns A promise that resolves when the operation completes
      *     with the result of the import. This includes the number of successful imports, the number
      *     of failed uploads and their corresponding errors.
      */
    def uploadAccount(users: js.Array[UserImportRecord]): js.Promise[UserImportResult] = js.native
    def uploadAccount(users: js.Array[UserImportRecord], options: UserImportOptions): js.Promise[UserImportResult] = js.native
  }
  
  inline def useEmulator(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useEmulator")().asInstanceOf[Boolean]
  
  /** Defines a base utility to help with resource URL construction. */
  @js.native
  trait AuthResourceUrlBuilder extends StObject {
    
    /* protected */ var app: App = js.native
    
    /* private */ var getProjectId: Any = js.native
    
    /**
      * Returns the resource URL corresponding to the provided parameters.
      *
      * @param api - The backend API name.
      * @param params - The optional additional parameters to substitute in the
      *     URL path.
      * @returns The corresponding resource URL.
      */
    def getUrl(): js.Promise[String] = js.native
    def getUrl(api: String): js.Promise[String] = js.native
    def getUrl(api: String, params: js.Object): js.Promise[String] = js.native
    def getUrl(api: Unit, params: js.Object): js.Promise[String] = js.native
    
    /* private */ var projectId: Any = js.native
    
    /* protected */ var urlFormat: String = js.native
    
    /* protected */ var version: String = js.native
  }
  
  trait BatchDeleteAccountsResponse extends StObject {
    
    var errors: js.UndefOr[js.Array[BatchDeleteErrorInfo]] = js.undefined
  }
  object BatchDeleteAccountsResponse {
    
    inline def apply(): BatchDeleteAccountsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchDeleteAccountsResponse]
    }
    
    extension [Self <: BatchDeleteAccountsResponse](x: Self) {
      
      inline def setErrors(value: js.Array[BatchDeleteErrorInfo]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: BatchDeleteErrorInfo*): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
  
  trait BatchDeleteErrorInfo extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var localId: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object BatchDeleteErrorInfo {
    
    inline def apply(): BatchDeleteErrorInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchDeleteErrorInfo]
    }
    
    extension [Self <: BatchDeleteErrorInfo](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
      
      inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
