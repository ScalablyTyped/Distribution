package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Cloud Endpoints
  * (https://cloud.google.com/appengine/docs/python/endpoints/) configuration
  * for API handlers.
  */
trait SchemaApiConfigHandler extends StObject {
  
  /**
    * Action to take when users access resources that require authentication.
    * Defaults to redirect.
    */
  var authFailAction: js.UndefOr[String] = js.undefined
  
  /**
    * Level of login required to access this resource. Defaults to optional.
    */
  var login: js.UndefOr[String] = js.undefined
  
  /**
    * Path to the script from the application root directory.
    */
  var script: js.UndefOr[String] = js.undefined
  
  /**
    * Security (HTTPS) enforcement for this URL.
    */
  var securityLevel: js.UndefOr[String] = js.undefined
  
  /**
    * URL to serve the endpoint at.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaApiConfigHandler {
  
  inline def apply(): SchemaApiConfigHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiConfigHandler]
  }
  
  extension [Self <: SchemaApiConfigHandler](x: Self) {
    
    inline def setAuthFailAction(value: String): Self = StObject.set(x, "authFailAction", value.asInstanceOf[js.Any])
    
    inline def setAuthFailActionUndefined: Self = StObject.set(x, "authFailAction", js.undefined)
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setSecurityLevel(value: String): Self = StObject.set(x, "securityLevel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLevelUndefined: Self = StObject.set(x, "securityLevel", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
