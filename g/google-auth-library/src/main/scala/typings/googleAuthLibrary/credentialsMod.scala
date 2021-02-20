package typings.googleAuthLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentialsMod {
  
  @js.native
  trait CredentialBody extends StObject {
    
    var client_email: js.UndefOr[String] = js.native
    
    var private_key: js.UndefOr[String] = js.native
  }
  object CredentialBody {
    
    @scala.inline
    def apply(): CredentialBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialBody]
    }
    
    @scala.inline
    implicit class CredentialBodyMutableBuilder[Self <: CredentialBody] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_email(value: String): Self = StObject.set(x, "client_email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_emailUndefined: Self = StObject.set(x, "client_email", js.undefined)
      
      @scala.inline
      def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate_keyUndefined: Self = StObject.set(x, "private_key", js.undefined)
    }
  }
  
  @js.native
  trait CredentialRequest extends StObject {
    
    /**
      * A token that can be sent to a Google API.
      */
    var access_token: js.UndefOr[String] = js.native
    
    /**
      * The remaining lifetime of the access token in seconds.
      */
    var expires_in: js.UndefOr[Double] = js.native
    
    /**
      * A JWT that contains identity information about the user that is digitally signed by Google.
      */
    var id_token: js.UndefOr[String] = js.native
    
    /**
      * This field is only present if the access_type parameter was set to offline in the authentication request. For details, see Refresh tokens.
      */
    var refresh_token: js.UndefOr[String] = js.native
    
    /**
      * The scopes of access granted by the access_token expressed as a list of space-delimited, case-sensitive strings.
      */
    var scope: js.UndefOr[String] = js.native
    
    /**
      * Identifies the type of token returned. At this time, this field always has the value Bearer.
      */
    var token_type: js.UndefOr[String] = js.native
  }
  object CredentialRequest {
    
    @scala.inline
    def apply(): CredentialRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialRequest]
    }
    
    @scala.inline
    implicit class CredentialRequestMutableBuilder[Self <: CredentialRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
      
      @scala.inline
      def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      @scala.inline
      def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    }
  }
  
  @js.native
  trait Credentials extends StObject {
    
    /**
      * A token that can be sent to a Google API.
      */
    var access_token: js.UndefOr[String | Null] = js.native
    
    /**
      * The time in ms at which this token is thought to expire.
      */
    var expiry_date: js.UndefOr[Double | Null] = js.native
    
    /**
      * A JWT that contains identity information about the user that is digitally signed by Google.
      */
    var id_token: js.UndefOr[String | Null] = js.native
    
    /**
      * This field is only present if the access_type parameter was set to offline in the authentication request. For details, see Refresh tokens.
      */
    var refresh_token: js.UndefOr[String | Null] = js.native
    
    /**
      * The scopes of access granted by the access_token expressed as a list of space-delimited, case-sensitive strings.
      */
    var scope: js.UndefOr[String] = js.native
    
    /**
      * Identifies the type of token returned. At this time, this field always has the value Bearer.
      */
    var token_type: js.UndefOr[String | Null] = js.native
  }
  object Credentials {
    
    @scala.inline
    def apply(): Credentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenNull: Self = StObject.set(x, "access_token", null)
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setExpiry_date(value: Double): Self = StObject.set(x, "expiry_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiry_dateNull: Self = StObject.set(x, "expiry_date", null)
      
      @scala.inline
      def setExpiry_dateUndefined: Self = StObject.set(x, "expiry_date", js.undefined)
      
      @scala.inline
      def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId_tokenNull: Self = StObject.set(x, "id_token", null)
      
      @scala.inline
      def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      @scala.inline
      def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefresh_tokenNull: Self = StObject.set(x, "refresh_token", null)
      
      @scala.inline
      def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken_typeNull: Self = StObject.set(x, "token_type", null)
      
      @scala.inline
      def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    }
  }
  
  @js.native
  trait JWTInput extends StObject {
    
    var client_email: js.UndefOr[String] = js.native
    
    var client_id: js.UndefOr[String] = js.native
    
    var client_secret: js.UndefOr[String] = js.native
    
    var private_key: js.UndefOr[String] = js.native
    
    var private_key_id: js.UndefOr[String] = js.native
    
    var project_id: js.UndefOr[String] = js.native
    
    var quota_project_id: js.UndefOr[String] = js.native
    
    var refresh_token: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object JWTInput {
    
    @scala.inline
    def apply(): JWTInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JWTInput]
    }
    
    @scala.inline
    implicit class JWTInputMutableBuilder[Self <: JWTInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_email(value: String): Self = StObject.set(x, "client_email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_emailUndefined: Self = StObject.set(x, "client_email", js.undefined)
      
      @scala.inline
      def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      @scala.inline
      def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
      
      @scala.inline
      def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate_keyUndefined: Self = StObject.set(x, "private_key", js.undefined)
      
      @scala.inline
      def setPrivate_key_id(value: String): Self = StObject.set(x, "private_key_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate_key_idUndefined: Self = StObject.set(x, "private_key_id", js.undefined)
      
      @scala.inline
      def setProject_id(value: String): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject_idUndefined: Self = StObject.set(x, "project_id", js.undefined)
      
      @scala.inline
      def setQuota_project_id(value: String): Self = StObject.set(x, "quota_project_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuota_project_idUndefined: Self = StObject.set(x, "quota_project_id", js.undefined)
      
      @scala.inline
      def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
