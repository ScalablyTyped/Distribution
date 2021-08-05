package typings.googleAuthLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentialsMod {
  
  trait CredentialBody extends StObject {
    
    var client_email: js.UndefOr[String] = js.undefined
    
    var private_key: js.UndefOr[String] = js.undefined
  }
  object CredentialBody {
    
    inline def apply(): CredentialBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialBody]
    }
    
    extension [Self <: CredentialBody](x: Self) {
      
      inline def setClient_email(value: String): Self = StObject.set(x, "client_email", value.asInstanceOf[js.Any])
      
      inline def setClient_emailUndefined: Self = StObject.set(x, "client_email", js.undefined)
      
      inline def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      inline def setPrivate_keyUndefined: Self = StObject.set(x, "private_key", js.undefined)
    }
  }
  
  trait CredentialRequest extends StObject {
    
    /**
      * A token that can be sent to a Google API.
      */
    var access_token: js.UndefOr[String] = js.undefined
    
    /**
      * The remaining lifetime of the access token in seconds.
      */
    var expires_in: js.UndefOr[Double] = js.undefined
    
    /**
      * A JWT that contains identity information about the user that is digitally signed by Google.
      */
    var id_token: js.UndefOr[String] = js.undefined
    
    /**
      * This field is only present if the access_type parameter was set to offline in the authentication request. For details, see Refresh tokens.
      */
    var refresh_token: js.UndefOr[String] = js.undefined
    
    /**
      * The scopes of access granted by the access_token expressed as a list of space-delimited, case-sensitive strings.
      */
    var scope: js.UndefOr[String] = js.undefined
    
    /**
      * Identifies the type of token returned. At this time, this field always has the value Bearer.
      */
    var token_type: js.UndefOr[String] = js.undefined
  }
  object CredentialRequest {
    
    inline def apply(): CredentialRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialRequest]
    }
    
    extension [Self <: CredentialRequest](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
      
      inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    }
  }
  
  trait Credentials extends StObject {
    
    /**
      * A token that can be sent to a Google API.
      */
    var access_token: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The time in ms at which this token is thought to expire.
      */
    var expiry_date: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * A JWT that contains identity information about the user that is digitally signed by Google.
      */
    var id_token: js.UndefOr[String | Null] = js.undefined
    
    /**
      * This field is only present if the access_type parameter was set to offline in the authentication request. For details, see Refresh tokens.
      */
    var refresh_token: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The scopes of access granted by the access_token expressed as a list of space-delimited, case-sensitive strings.
      */
    var scope: js.UndefOr[String] = js.undefined
    
    /**
      * Identifies the type of token returned. At this time, this field always has the value Bearer.
      */
    var token_type: js.UndefOr[String | Null] = js.undefined
  }
  object Credentials {
    
    inline def apply(): Credentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenNull: Self = StObject.set(x, "access_token", null)
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setExpiry_date(value: Double): Self = StObject.set(x, "expiry_date", value.asInstanceOf[js.Any])
      
      inline def setExpiry_dateNull: Self = StObject.set(x, "expiry_date", null)
      
      inline def setExpiry_dateUndefined: Self = StObject.set(x, "expiry_date", js.undefined)
      
      inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
      
      inline def setId_tokenNull: Self = StObject.set(x, "id_token", null)
      
      inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setRefresh_tokenNull: Self = StObject.set(x, "refresh_token", null)
      
      inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
      
      inline def setToken_typeNull: Self = StObject.set(x, "token_type", null)
      
      inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    }
  }
  
  trait JWTInput extends StObject {
    
    var client_email: js.UndefOr[String] = js.undefined
    
    var client_id: js.UndefOr[String] = js.undefined
    
    var client_secret: js.UndefOr[String] = js.undefined
    
    var private_key: js.UndefOr[String] = js.undefined
    
    var private_key_id: js.UndefOr[String] = js.undefined
    
    var project_id: js.UndefOr[String] = js.undefined
    
    var quota_project_id: js.UndefOr[String] = js.undefined
    
    var refresh_token: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object JWTInput {
    
    inline def apply(): JWTInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JWTInput]
    }
    
    extension [Self <: JWTInput](x: Self) {
      
      inline def setClient_email(value: String): Self = StObject.set(x, "client_email", value.asInstanceOf[js.Any])
      
      inline def setClient_emailUndefined: Self = StObject.set(x, "client_email", js.undefined)
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      inline def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
      
      inline def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      inline def setPrivate_keyUndefined: Self = StObject.set(x, "private_key", js.undefined)
      
      inline def setPrivate_key_id(value: String): Self = StObject.set(x, "private_key_id", value.asInstanceOf[js.Any])
      
      inline def setPrivate_key_idUndefined: Self = StObject.set(x, "private_key_id", js.undefined)
      
      inline def setProject_id(value: String): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
      
      inline def setProject_idUndefined: Self = StObject.set(x, "project_id", js.undefined)
      
      inline def setQuota_project_id(value: String): Self = StObject.set(x, "quota_project_id", value.asInstanceOf[js.Any])
      
      inline def setQuota_project_idUndefined: Self = StObject.set(x, "quota_project_id", js.undefined)
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
