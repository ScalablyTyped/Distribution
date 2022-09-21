package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApiConfigHandler extends StObject {
  
  /**
    * Action to take when users access resources that require authentication. Defaults to redirect.
    */
  var authFailAction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Level of login required to access this resource. Defaults to optional.
    */
  var login: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Path to the script from the application root directory.
    */
  var script: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Security (HTTPS) enforcement for this URL.
    */
  var securityLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL to serve the endpoint at.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaApiConfigHandler {
  
  inline def apply(): SchemaApiConfigHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiConfigHandler]
  }
  
  extension [Self <: SchemaApiConfigHandler](x: Self) {
    
    inline def setAuthFailAction(value: String): Self = StObject.set(x, "authFailAction", value.asInstanceOf[js.Any])
    
    inline def setAuthFailActionNull: Self = StObject.set(x, "authFailAction", null)
    
    inline def setAuthFailActionUndefined: Self = StObject.set(x, "authFailAction", js.undefined)
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginNull: Self = StObject.set(x, "login", null)
    
    inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptNull: Self = StObject.set(x, "script", null)
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setSecurityLevel(value: String): Self = StObject.set(x, "securityLevel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLevelNull: Self = StObject.set(x, "securityLevel", null)
    
    inline def setSecurityLevelUndefined: Self = StObject.set(x, "securityLevel", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
