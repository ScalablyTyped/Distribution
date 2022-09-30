package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authNamespaceMod {
  
  object auth {
    
    inline def apply(): Auth = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Auth]
    inline def apply(app: App): Auth = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
    
    @JSImport("firebase-admin/lib/auth/auth-namespace", "auth")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.auth#ActionCodeSettings}.
      */
    type ActionCodeSettings = typings.firebaseAdmin.actionCodeSettingsBuilderMod.ActionCodeSettings
    
    /**
      * Type alias to {@link firebase-admin.auth#Auth}.
      */
    type Auth = typings.firebaseAdmin.authAuthMod.Auth
    
    /**
      * Type alias to {@link firebase-admin.auth#AuthFactorType}.
      */
    type AuthFactorType = typings.firebaseAdmin.authConfigMod.AuthFactorType
    
    /**
      * Type alias to {@link firebase-admin.auth#AuthProviderConfig}.
      */
    type AuthProviderConfig = typings.firebaseAdmin.authConfigMod.AuthProviderConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#AuthProviderConfigFilter}.
      */
    type AuthProviderConfigFilter = typings.firebaseAdmin.authConfigMod.AuthProviderConfigFilter
    
    /**
      * Type alias to {@link firebase-admin.auth#BaseAuth}.
      */
    type BaseAuth = typings.firebaseAdmin.baseAuthMod.BaseAuth
    
    /**
      * Type alias to {@link firebase-admin.auth#CreateMultiFactorInfoRequest}.
      */
    type CreateMultiFactorInfoRequest = typings.firebaseAdmin.authConfigMod.CreateMultiFactorInfoRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#CreatePhoneMultiFactorInfoRequest}.
      */
    type CreatePhoneMultiFactorInfoRequest = typings.firebaseAdmin.authConfigMod.CreatePhoneMultiFactorInfoRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#CreateRequest}.
      */
    type CreateRequest = typings.firebaseAdmin.authConfigMod.CreateRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#CreateTenantRequest}.
      */
    type CreateTenantRequest = typings.firebaseAdmin.tenantMod.CreateTenantRequest
    
    /** @alpha */
    type DecodedAuthBlockingToken = typings.firebaseAdmin.authTokenVerifierMod.DecodedAuthBlockingToken
    
    /**
      * Type alias to {@link firebase-admin.auth#DecodedIdToken}.
      */
    type DecodedIdToken = typings.firebaseAdmin.authTokenVerifierMod.DecodedIdToken
    
    /**
      * Type alias to {@link firebase-admin.auth#DeleteUsersResult}.
      */
    type DeleteUsersResult = typings.firebaseAdmin.baseAuthMod.DeleteUsersResult
    
    /**
      * Type alias to {@link firebase-admin.auth#EmailIdentifier}.
      */
    type EmailIdentifier = typings.firebaseAdmin.identifierMod.EmailIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#EmailSignInProviderConfig}.
      */
    type EmailSignInProviderConfig = typings.firebaseAdmin.authConfigMod.EmailSignInProviderConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#GetUsersResult}.
      */
    type GetUsersResult = typings.firebaseAdmin.baseAuthMod.GetUsersResult
    
    /**
      * Type alias to {@link firebase-admin.auth#HashAlgorithmType}.
      */
    type HashAlgorithmType = typings.firebaseAdmin.userImportBuilderMod.HashAlgorithmType
    
    /**
      * Type alias to {@link firebase-admin.auth#ListProviderConfigResults}.
      */
    type ListProviderConfigResults = typings.firebaseAdmin.authConfigMod.ListProviderConfigResults
    
    /**
      * Type alias to {@link firebase-admin.auth#ListTenantsResult}.
      */
    type ListTenantsResult = typings.firebaseAdmin.tenantManagerMod.ListTenantsResult
    
    /**
      * Type alias to {@link firebase-admin.auth#ListUsersResult}.
      */
    type ListUsersResult = typings.firebaseAdmin.baseAuthMod.ListUsersResult
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorConfig}.
      */
    type MultiFactorConfig = typings.firebaseAdmin.authConfigMod.MultiFactorConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorConfigState}.
      */
    type MultiFactorConfigState = typings.firebaseAdmin.authConfigMod.MultiFactorConfigState
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorCreateSettings}.
      */
    type MultiFactorCreateSettings = typings.firebaseAdmin.authConfigMod.MultiFactorCreateSettings
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorInfo}.
      */
    type MultiFactorInfo = typings.firebaseAdmin.userRecordMod.MultiFactorInfo
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorSettings}.
      */
    type MultiFactorSettings = typings.firebaseAdmin.userRecordMod.MultiFactorSettings
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorUpdateSettings}.
      */
    type MultiFactorUpdateSettings = typings.firebaseAdmin.authConfigMod.MultiFactorUpdateSettings
    
    /**
      * Type alias to {@link firebase-admin.auth#OIDCAuthProviderConfig}.
      */
    type OIDCAuthProviderConfig = typings.firebaseAdmin.authConfigMod.OIDCAuthProviderConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#OIDCUpdateAuthProviderRequest}.
      */
    type OIDCUpdateAuthProviderRequest = typings.firebaseAdmin.authConfigMod.OIDCUpdateAuthProviderRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#PhoneIdentifier}.
      */
    type PhoneIdentifier = typings.firebaseAdmin.identifierMod.PhoneIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#PhoneMultiFactorInfo}.
      */
    type PhoneMultiFactorInfo = typings.firebaseAdmin.userRecordMod.PhoneMultiFactorInfo
    
    /**
      * Type alias to {@link firebase-admin.auth#ProviderIdentifier}.
      */
    type ProviderIdentifier = typings.firebaseAdmin.identifierMod.ProviderIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#SAMLAuthProviderConfig}.
      */
    type SAMLAuthProviderConfig = typings.firebaseAdmin.authConfigMod.SAMLAuthProviderConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#SAMLUpdateAuthProviderRequest}.
      */
    type SAMLUpdateAuthProviderRequest = typings.firebaseAdmin.authConfigMod.SAMLUpdateAuthProviderRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#SessionCookieOptions}.
      */
    type SessionCookieOptions = typings.firebaseAdmin.baseAuthMod.SessionCookieOptions
    
    /**
      * Type alias to {@link firebase-admin.auth#Tenant}.
      */
    type Tenant = typings.firebaseAdmin.tenantMod.Tenant
    
    /**
      * Type alias to {@link firebase-admin.auth#TenantAwareAuth}.
      */
    type TenantAwareAuth = typings.firebaseAdmin.tenantManagerMod.TenantAwareAuth
    
    /**
      * Type alias to {@link firebase-admin.auth#TenantManager}.
      */
    type TenantManager = typings.firebaseAdmin.tenantManagerMod.TenantManager
    
    /**
      * Type alias to {@link firebase-admin.auth#UidIdentifier}.
      */
    type UidIdentifier = typings.firebaseAdmin.identifierMod.UidIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdateAuthProviderRequest}.
      */
    type UpdateAuthProviderRequest = typings.firebaseAdmin.authConfigMod.UpdateAuthProviderRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdateMultiFactorInfoRequest}.
      */
    type UpdateMultiFactorInfoRequest = typings.firebaseAdmin.authConfigMod.UpdateMultiFactorInfoRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdatePhoneMultiFactorInfoRequest}.
      */
    type UpdatePhoneMultiFactorInfoRequest = typings.firebaseAdmin.authConfigMod.UpdatePhoneMultiFactorInfoRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdateRequest}.
      */
    type UpdateRequest = typings.firebaseAdmin.authConfigMod.UpdateRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdateTenantRequest}.
      */
    type UpdateTenantRequest = typings.firebaseAdmin.tenantMod.UpdateTenantRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UserIdentifier}.
      */
    type UserIdentifier = typings.firebaseAdmin.identifierMod.UserIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#UserImportOptions}.
      */
    type UserImportOptions = typings.firebaseAdmin.userImportBuilderMod.UserImportOptions
    
    /**
      * Type alias to {@link firebase-admin.auth#UserImportRecord}.
      */
    type UserImportRecord = typings.firebaseAdmin.userImportBuilderMod.UserImportRecord
    
    /**
      * Type alias to {@link firebase-admin.auth#UserImportResult}.
      */
    type UserImportResult = typings.firebaseAdmin.userImportBuilderMod.UserImportResult
    
    /**
      * Type alias to {@link firebase-admin.auth#UserInfo}.
      */
    type UserInfo = typings.firebaseAdmin.userRecordMod.UserInfo
    
    /**
      * Type alias to {@link firebase-admin.auth#UserMetadata}.
      */
    type UserMetadata = typings.firebaseAdmin.userRecordMod.UserMetadata
    
    /**
      * Type alias to {@link firebase-admin.auth#UserMetadataRequest}.
      */
    type UserMetadataRequest = typings.firebaseAdmin.userImportBuilderMod.UserMetadataRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UserProviderRequest}.
      */
    type UserProviderRequest = typings.firebaseAdmin.userImportBuilderMod.UserProviderRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UserRecord}.
      */
    type UserRecord = typings.firebaseAdmin.userRecordMod.UserRecord
  }
}
