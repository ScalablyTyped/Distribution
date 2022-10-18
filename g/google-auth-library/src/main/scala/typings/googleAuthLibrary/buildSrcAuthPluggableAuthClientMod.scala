package typings.googleAuthLibrary

import typings.googleAuthLibrary.anon.Executable
import typings.googleAuthLibrary.buildSrcAuthBaseexternalclientMod.BaseExternalAccountClient
import typings.googleAuthLibrary.buildSrcAuthBaseexternalclientMod.BaseExternalAccountClientOptions
import typings.googleAuthLibrary.buildSrcAuthExternalclientMod.ExternalAccountClientOptions
import typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.RefreshOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAuthPluggableAuthClientMod {
  
  @JSImport("google-auth-library/build/src/auth/pluggable-auth-client", "ExecutableError")
  @js.native
  open class ExecutableError protected ()
    extends StObject
       with Error {
    def this(message: String, code: String) = this()
    
    /**
      * The exit code returned by the executable.
      */
    val code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("google-auth-library/build/src/auth/pluggable-auth-client", "PluggableAuthClient")
  @js.native
  open class PluggableAuthClient protected () extends BaseExternalAccountClient {
    /**
      * Instantiates a PluggableAuthClient instance using the provided JSON
      * object loaded from an external account credentials file.
      * An error is thrown if the credential is not a valid pluggable auth credential.
      * @param options The external account options object typically loaded from
      *   the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      */
    def this(options: PluggableAuthClientOptions) = this()
    def this(options: PluggableAuthClientOptions, additionalOptions: RefreshOptions) = this()
    
    /**
      * The command used to retrieve the third party token.
      */
    /* private */ val command: Any = js.native
    
    /**
      * Executable and output file handler.
      */
    /* private */ val handler: Any = js.native
    
    /**
      * The path to file to check for cached executable response.
      */
    /* private */ val outputFile: Any = js.native
    
    /**
      * The timeout in milliseconds for running executable,
      * set to default if none provided.
      */
    /* private */ val timeoutMillis: Any = js.native
  }
  
  trait PluggableAuthClientOptions
    extends StObject
       with BaseExternalAccountClientOptions
       with ExternalAccountClientOptions {
    
    var credential_source: Executable
  }
  object PluggableAuthClientOptions {
    
    inline def apply(
      audience: String,
      credential_source: Executable,
      subject_token_type: String,
      token_url: String,
      `type`: String
    ): PluggableAuthClientOptions = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], credential_source = credential_source.asInstanceOf[js.Any], subject_token_type = subject_token_type.asInstanceOf[js.Any], token_url = token_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluggableAuthClientOptions]
    }
    
    extension [Self <: PluggableAuthClientOptions](x: Self) {
      
      inline def setCredential_source(value: Executable): Self = StObject.set(x, "credential_source", value.asInstanceOf[js.Any])
    }
  }
}
