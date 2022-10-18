package typings.googleAuthLibrary

import typings.googleAuthLibrary.anon.Environmentid
import typings.googleAuthLibrary.anon.Executable
import typings.googleAuthLibrary.anon.File
import typings.googleAuthLibrary.buildSrcAuthBaseexternalclientMod.BaseExternalAccountClient
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthExternalclientMod {
  
  @JSImport("google-auth-library/build/src/auth/externalclient", "ExternalAccountClient")
  @js.native
  open class ExternalAccountClient () extends StObject
  /* static members */
  object ExternalAccountClient {
    
    @JSImport("google-auth-library/build/src/auth/externalclient", "ExternalAccountClient")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This static method will instantiate the
      * corresponding type of external account credential depending on the
      * underlying credential source.
      * @param options The external account options object typically loaded
      *   from the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      * @return A BaseExternalAccountClient instance or null if the options
      *   provided do not correspond to an external account credential.
      */
    inline def fromJSON(options: ExternalAccountClientOptions): BaseExternalAccountClient | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(options.asInstanceOf[js.Any]).asInstanceOf[BaseExternalAccountClient | Null]
    inline def fromJSON(options: ExternalAccountClientOptions, additionalOptions: RefreshOptions): BaseExternalAccountClient | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(options.asInstanceOf[js.Any], additionalOptions.asInstanceOf[js.Any])).asInstanceOf[BaseExternalAccountClient | Null]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleAuthLibrary.buildSrcAuthIdentitypoolclientMod.IdentityPoolClientOptions
    - typings.googleAuthLibrary.buildSrcAuthAwsclientMod.AwsClientOptions
    - typings.googleAuthLibrary.buildSrcAuthPluggableAuthClientMod.PluggableAuthClientOptions
  */
  trait ExternalAccountClientOptions extends StObject
  object ExternalAccountClientOptions {
    
    inline def AwsClientOptions(
      audience: String,
      credential_source: Environmentid,
      subject_token_type: String,
      token_url: String,
      `type`: String
    ): typings.googleAuthLibrary.buildSrcAuthAwsclientMod.AwsClientOptions = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], credential_source = credential_source.asInstanceOf[js.Any], subject_token_type = subject_token_type.asInstanceOf[js.Any], token_url = token_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.googleAuthLibrary.buildSrcAuthAwsclientMod.AwsClientOptions]
    }
    
    inline def IdentityPoolClientOptions(
      audience: String,
      credential_source: File,
      subject_token_type: String,
      token_url: String,
      `type`: String
    ): typings.googleAuthLibrary.buildSrcAuthIdentitypoolclientMod.IdentityPoolClientOptions = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], credential_source = credential_source.asInstanceOf[js.Any], subject_token_type = subject_token_type.asInstanceOf[js.Any], token_url = token_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.googleAuthLibrary.buildSrcAuthIdentitypoolclientMod.IdentityPoolClientOptions]
    }
    
    inline def PluggableAuthClientOptions(
      audience: String,
      credential_source: Executable,
      subject_token_type: String,
      token_url: String,
      `type`: String
    ): typings.googleAuthLibrary.buildSrcAuthPluggableAuthClientMod.PluggableAuthClientOptions = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], credential_source = credential_source.asInstanceOf[js.Any], subject_token_type = subject_token_type.asInstanceOf[js.Any], token_url = token_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.googleAuthLibrary.buildSrcAuthPluggableAuthClientMod.PluggableAuthClientOptions]
    }
  }
}
