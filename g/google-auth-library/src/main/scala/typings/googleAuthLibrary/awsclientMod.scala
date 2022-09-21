package typings.googleAuthLibrary

import typings.googleAuthLibrary.anon.Environmentid
import typings.googleAuthLibrary.baseexternalclientMod.BaseExternalAccountClient
import typings.googleAuthLibrary.baseexternalclientMod.BaseExternalAccountClientOptions
import typings.googleAuthLibrary.externalclientMod.ExternalAccountClientOptions
import typings.googleAuthLibrary.oauth2clientMod.RefreshOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awsclientMod {
  
  @JSImport("google-auth-library/build/src/auth/awsclient", "AwsClient")
  @js.native
  open class AwsClient protected () extends BaseExternalAccountClient {
    /**
      * Instantiates an AwsClient instance using the provided JSON
      * object loaded from an external account credentials file.
      * An error is thrown if the credential is not a valid AWS credential.
      * @param options The external account options object typically loaded
      *   from the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      */
    def this(options: AwsClientOptions) = this()
    def this(options: AwsClientOptions, additionalOptions: RefreshOptions) = this()
    
    /* private */ var awsRequestSigner: Any = js.native
    
    /* private */ val environmentId: Any = js.native
    
    /**
      * @param headers The headers to be used in the metadata request.
      * @return A promise that resolves with the current AWS region.
      */
    /* private */ var getAwsRegion: Any = js.native
    
    /**
      * @param headers The headers to be used in the metadata request.
      * @return A promise that resolves with the assigned role to the current
      *   AWS VM. This is needed for calling the security-credentials endpoint.
      */
    /* private */ var getAwsRoleName: Any = js.native
    
    /**
      * Retrieves the temporary AWS credentials by calling the security-credentials
      * endpoint as specified in the `credential_source` object.
      * @param roleName The role attached to the current VM.
      * @param headers The headers to be used in the metadata request.
      * @return A promise that resolves with the temporary AWS credentials
      *   needed for creating the GetCallerIdentity signed request.
      */
    /* private */ var getAwsSecurityCredentials: Any = js.native
    
    /**
      * @return A promise that resolves with the IMDSv2 Session Token.
      */
    /* private */ var getImdsV2SessionToken: Any = js.native
    
    /* private */ val imdsV2SessionTokenUrl: Any = js.native
    
    /* private */ var region: Any = js.native
    
    /* private */ val regionUrl: Any = js.native
    
    /* private */ val regionalCredVerificationUrl: Any = js.native
    
    /* private */ val securityCredentialsUrl: Any = js.native
  }
  
  trait AwsClientOptions
    extends StObject
       with BaseExternalAccountClientOptions
       with ExternalAccountClientOptions {
    
    var credential_source: Environmentid
  }
  object AwsClientOptions {
    
    inline def apply(
      audience: String,
      credential_source: Environmentid,
      subject_token_type: String,
      token_url: String,
      `type`: String
    ): AwsClientOptions = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], credential_source = credential_source.asInstanceOf[js.Any], subject_token_type = subject_token_type.asInstanceOf[js.Any], token_url = token_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwsClientOptions]
    }
    
    extension [Self <: AwsClientOptions](x: Self) {
      
      inline def setCredential_source(value: Environmentid): Self = StObject.set(x, "credential_source", value.asInstanceOf[js.Any])
    }
  }
}
