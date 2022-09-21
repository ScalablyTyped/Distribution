package typings.googleAuthLibrary

import typings.googleAuthLibrary.anon.File
import typings.googleAuthLibrary.baseexternalclientMod.BaseExternalAccountClient
import typings.googleAuthLibrary.baseexternalclientMod.BaseExternalAccountClientOptions
import typings.googleAuthLibrary.externalclientMod.ExternalAccountClientOptions
import typings.googleAuthLibrary.oauth2clientMod.RefreshOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identitypoolclientMod {
  
  @JSImport("google-auth-library/build/src/auth/identitypoolclient", "IdentityPoolClient")
  @js.native
  open class IdentityPoolClient protected () extends BaseExternalAccountClient {
    /**
      * Instantiate an IdentityPoolClient instance using the provided JSON
      * object loaded from an external account credentials file.
      * An error is thrown if the credential is not a valid file-sourced or
      * url-sourced credential or a workforce pool user project is provided
      * with a non workforce audience.
      * @param options The external account options object typically loaded
      *   from the external account JSON credential file.
      * @param additionalOptions Optional additional behavior customization
      *   options. These currently customize expiration threshold time and
      *   whether to retry on 401/403 API request errors.
      */
    def this(options: IdentityPoolClientOptions) = this()
    def this(options: IdentityPoolClientOptions, additionalOptions: RefreshOptions) = this()
    
    /* private */ val file: Any = js.native
    
    /* private */ val formatSubjectTokenFieldName: Any = js.native
    
    /* private */ val formatType: Any = js.native
    
    /**
      * Looks up the external subject token in the file path provided and
      * resolves with that token.
      * @param file The file path where the external credential is located.
      * @param formatType The token file or URL response type (JSON or text).
      * @param formatSubjectTokenFieldName For JSON response types, this is the
      *   subject_token field name. For Azure, this is access_token. For text
      *   response types, this is ignored.
      * @return A promise that resolves with the external subject token.
      */
    /* private */ var getTokenFromFile: Any = js.native
    
    /**
      * Sends a GET request to the URL provided and resolves with the returned
      * external subject token.
      * @param url The URL to call to retrieve the subject token. This is typically
      *   a local metadata server.
      * @param formatType The token file or URL response type (JSON or text).
      * @param formatSubjectTokenFieldName For JSON response types, this is the
      *   subject_token field name. For Azure, this is access_token. For text
      *   response types, this is ignored.
      * @param headers The optional additional headers to send with the request to
      *   the metadata server url.
      * @return A promise that resolves with the external subject token.
      */
    /* private */ var getTokenFromUrl: Any = js.native
    
    /* private */ val headers: Any = js.native
    
    /* private */ val url: Any = js.native
  }
  
  trait IdentityPoolClientOptions
    extends StObject
       with BaseExternalAccountClientOptions
       with ExternalAccountClientOptions {
    
    var credential_source: File
  }
  object IdentityPoolClientOptions {
    
    inline def apply(
      audience: String,
      credential_source: File,
      subject_token_type: String,
      token_url: String,
      `type`: String
    ): IdentityPoolClientOptions = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], credential_source = credential_source.asInstanceOf[js.Any], subject_token_type = subject_token_type.asInstanceOf[js.Any], token_url = token_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityPoolClientOptions]
    }
    
    extension [Self <: IdentityPoolClientOptions](x: Self) {
      
      inline def setCredential_source(value: File): Self = StObject.set(x, "credential_source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleAuthLibrary.googleAuthLibraryStrings.json
    - typings.googleAuthLibrary.googleAuthLibraryStrings.text
  */
  trait SubjectTokenFormatType extends StObject
  object SubjectTokenFormatType {
    
    inline def json: typings.googleAuthLibrary.googleAuthLibraryStrings.json = "json".asInstanceOf[typings.googleAuthLibrary.googleAuthLibraryStrings.json]
    
    inline def text: typings.googleAuthLibrary.googleAuthLibraryStrings.text = "text".asInstanceOf[typings.googleAuthLibrary.googleAuthLibraryStrings.text]
  }
}
