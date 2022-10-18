package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthAuthNamespaceMod {
  
  object auth {
    
    inline def apply(): Auth = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Auth]
    inline def apply(app: App): Auth = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
    
    @JSImport("firebase-admin/lib/auth/auth-namespace", "auth")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.auth#ActionCodeSettings}.
      */
    type ActionCodeSettings = typings.firebaseAdmin.libAuthActionCodeSettingsBuilderMod.ActionCodeSettings
    
    /**
      * Type alias to {@link firebase-admin.auth#Auth}.
      */
    type Auth = typings.firebaseAdmin.libAuthAuthMod.Auth
    
    /**
      * Type alias to {@link firebase-admin.auth#AuthFactorType}.
      */
    type AuthFactorType = typings.firebaseAdmin.libAuthAuthConfigMod.AuthFactorType
    
    /**
      * Type alias to {@link firebase-admin.auth#AuthProviderConfig}.
      */
    type AuthProviderConfig = typings.firebaseAdmin.libAuthAuthConfigMod.AuthProviderConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#AuthProviderConfigFilter}.
      */
    type AuthProviderConfigFilter = typings.firebaseAdmin.libAuthAuthConfigMod.AuthProviderConfigFilter
    
    /**
      * Type alias to {@link firebase-admin.auth#BaseAuth}.
      */
    type BaseAuth = typings.firebaseAdmin.libAuthBaseAuthMod.BaseAuth
    
    /**
      * Type alias to {@link firebase-admin.auth#CreateMultiFactorInfoRequest}.
      */
    type CreateMultiFactorInfoRequest = typings.firebaseAdmin.libAuthAuthConfigMod.CreateMultiFactorInfoRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#CreatePhoneMultiFactorInfoRequest}.
      */
    type CreatePhoneMultiFactorInfoRequest = typings.firebaseAdmin.libAuthAuthConfigMod.CreatePhoneMultiFactorInfoRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#CreateRequest}.
      */
    type CreateRequest = typings.firebaseAdmin.libAuthAuthConfigMod.CreateRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#CreateTenantRequest}.
      */
    type CreateTenantRequest = typings.firebaseAdmin.libAuthTenantMod.CreateTenantRequest
    
    /** @alpha */
    type DecodedAuthBlockingToken = typings.firebaseAdmin.libAuthTokenVerifierMod.DecodedAuthBlockingToken
    
    /**
      * Type alias to {@link firebase-admin.auth#DecodedIdToken}.
      */
    type DecodedIdToken = typings.firebaseAdmin.libAuthTokenVerifierMod.DecodedIdToken
    
    /**
      * Type alias to {@link firebase-admin.auth#DeleteUsersResult}.
      */
    type DeleteUsersResult = typings.firebaseAdmin.libAuthBaseAuthMod.DeleteUsersResult
    
    /**
      * Type alias to {@link firebase-admin.auth#EmailIdentifier}.
      */
    type EmailIdentifier = typings.firebaseAdmin.libAuthIdentifierMod.EmailIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#EmailSignInProviderConfig}.
      */
    type EmailSignInProviderConfig = typings.firebaseAdmin.libAuthAuthConfigMod.EmailSignInProviderConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#GetUsersResult}.
      */
    type GetUsersResult = typings.firebaseAdmin.libAuthBaseAuthMod.GetUsersResult
    
    /**
      * Type alias to {@link firebase-admin.auth#HashAlgorithmType}.
      */
    type HashAlgorithmType = typings.firebaseAdmin.libAuthUserImportBuilderMod.HashAlgorithmType
    
    /**
      * Type alias to {@link firebase-admin.auth#ListProviderConfigResults}.
      */
    type ListProviderConfigResults = typings.firebaseAdmin.libAuthAuthConfigMod.ListProviderConfigResults
    
    /**
      * Type alias to {@link firebase-admin.auth#ListTenantsResult}.
      */
    type ListTenantsResult = typings.firebaseAdmin.libAuthTenantManagerMod.ListTenantsResult
    
    /**
      * Type alias to {@link firebase-admin.auth#ListUsersResult}.
      */
    type ListUsersResult = typings.firebaseAdmin.libAuthBaseAuthMod.ListUsersResult
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorConfig}.
      */
    type MultiFactorConfig = typings.firebaseAdmin.libAuthAuthConfigMod.MultiFactorConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorConfigState}.
      */
    type MultiFactorConfigState = typings.firebaseAdmin.libAuthAuthConfigMod.MultiFactorConfigState
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorCreateSettings}.
      */
    type MultiFactorCreateSettings = typings.firebaseAdmin.libAuthAuthConfigMod.MultiFactorCreateSettings
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorInfo}.
      */
    type MultiFactorInfo = typings.firebaseAdmin.libAuthUserRecordMod.MultiFactorInfo
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorSettings}.
      */
    type MultiFactorSettings = typings.firebaseAdmin.libAuthUserRecordMod.MultiFactorSettings
    
    /**
      * Type alias to {@link firebase-admin.auth#MultiFactorUpdateSettings}.
      */
    type MultiFactorUpdateSettings = typings.firebaseAdmin.libAuthAuthConfigMod.MultiFactorUpdateSettings
    
    /**
      * Type alias to {@link firebase-admin.auth#OIDCAuthProviderConfig}.
      */
    type OIDCAuthProviderConfig = typings.firebaseAdmin.libAuthAuthConfigMod.OIDCAuthProviderConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#OIDCUpdateAuthProviderRequest}.
      */
    type OIDCUpdateAuthProviderRequest = typings.firebaseAdmin.libAuthAuthConfigMod.OIDCUpdateAuthProviderRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#PhoneIdentifier}.
      */
    type PhoneIdentifier = typings.firebaseAdmin.libAuthIdentifierMod.PhoneIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#PhoneMultiFactorInfo}.
      */
    type PhoneMultiFactorInfo = typings.firebaseAdmin.libAuthUserRecordMod.PhoneMultiFactorInfo
    
    /**
      * Type alias to {@link firebase-admin.auth#ProviderIdentifier}.
      */
    type ProviderIdentifier = typings.firebaseAdmin.libAuthIdentifierMod.ProviderIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#SAMLAuthProviderConfig}.
      */
    type SAMLAuthProviderConfig = typings.firebaseAdmin.libAuthAuthConfigMod.SAMLAuthProviderConfig
    
    /**
      * Type alias to {@link firebase-admin.auth#SAMLUpdateAuthProviderRequest}.
      */
    type SAMLUpdateAuthProviderRequest = typings.firebaseAdmin.libAuthAuthConfigMod.SAMLUpdateAuthProviderRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#SessionCookieOptions}.
      */
    type SessionCookieOptions = typings.firebaseAdmin.libAuthBaseAuthMod.SessionCookieOptions
    
    /**
      * Type alias to {@link firebase-admin.auth#Tenant}.
      */
    type Tenant = typings.firebaseAdmin.libAuthTenantMod.Tenant
    
    /**
      * Type alias to {@link firebase-admin.auth#TenantAwareAuth}.
      */
    type TenantAwareAuth = typings.firebaseAdmin.libAuthTenantManagerMod.TenantAwareAuth
    
    /**
      * Type alias to {@link firebase-admin.auth#TenantManager}.
      */
    type TenantManager = typings.firebaseAdmin.libAuthTenantManagerMod.TenantManager
    
    /**
      * Type alias to {@link firebase-admin.auth#UidIdentifier}.
      */
    type UidIdentifier = typings.firebaseAdmin.libAuthIdentifierMod.UidIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdateAuthProviderRequest}.
      */
    type UpdateAuthProviderRequest = typings.firebaseAdmin.libAuthAuthConfigMod.UpdateAuthProviderRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdateMultiFactorInfoRequest}.
      */
    type UpdateMultiFactorInfoRequest = typings.firebaseAdmin.libAuthAuthConfigMod.UpdateMultiFactorInfoRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdatePhoneMultiFactorInfoRequest}.
      */
    type UpdatePhoneMultiFactorInfoRequest = typings.firebaseAdmin.libAuthAuthConfigMod.UpdatePhoneMultiFactorInfoRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdateRequest}.
      */
    type UpdateRequest = typings.firebaseAdmin.libAuthAuthConfigMod.UpdateRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UpdateTenantRequest}.
      */
    type UpdateTenantRequest = typings.firebaseAdmin.libAuthTenantMod.UpdateTenantRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UserIdentifier}.
      */
    type UserIdentifier = typings.firebaseAdmin.libAuthIdentifierMod.UserIdentifier
    
    /**
      * Type alias to {@link firebase-admin.auth#UserImportOptions}.
      */
    type UserImportOptions = typings.firebaseAdmin.libAuthUserImportBuilderMod.UserImportOptions
    
    /**
      * Type alias to {@link firebase-admin.auth#UserImportRecord}.
      */
    type UserImportRecord = typings.firebaseAdmin.libAuthUserImportBuilderMod.UserImportRecord
    
    /**
      * Type alias to {@link firebase-admin.auth#UserImportResult}.
      */
    type UserImportResult = typings.firebaseAdmin.libAuthUserImportBuilderMod.UserImportResult
    
    /**
      * Type alias to {@link firebase-admin.auth#UserInfo}.
      */
    type UserInfo = typings.firebaseAdmin.libAuthUserRecordMod.UserInfo
    
    /**
      * Type alias to {@link firebase-admin.auth#UserMetadata}.
      */
    type UserMetadata = typings.firebaseAdmin.libAuthUserRecordMod.UserMetadata
    
    /**
      * Type alias to {@link firebase-admin.auth#UserMetadataRequest}.
      */
    type UserMetadataRequest = typings.firebaseAdmin.libAuthUserImportBuilderMod.UserMetadataRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UserProviderRequest}.
      */
    type UserProviderRequest = typings.firebaseAdmin.libAuthUserImportBuilderMod.UserProviderRequest
    
    /**
      * Type alias to {@link firebase-admin.auth#UserRecord}.
      */
    type UserRecord = typings.firebaseAdmin.libAuthUserRecordMod.UserRecord
  }
}
