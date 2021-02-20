package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Cloud Endpoints
  * (https://cloud.google.com/appengine/docs/python/endpoints/) configuration
  * for API handlers.
  */
@js.native
trait SchemaApiConfigHandler extends StObject {
  
  /**
    * Action to take when users access resources that require authentication.
    * Defaults to redirect.
    */
  var authFailAction: js.UndefOr[String] = js.native
  
  /**
    * Level of login required to access this resource. Defaults to optional.
    */
  var login: js.UndefOr[String] = js.native
  
  /**
    * Path to the script from the application root directory.
    */
  var script: js.UndefOr[String] = js.native
  
  /**
    * Security (HTTPS) enforcement for this URL.
    */
  var securityLevel: js.UndefOr[String] = js.native
  
  /**
    * URL to serve the endpoint at.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaApiConfigHandler {
  
  @scala.inline
  def apply(): SchemaApiConfigHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApiConfigHandler]
  }
  
  @scala.inline
  implicit class SchemaApiConfigHandlerMutableBuilder[Self <: SchemaApiConfigHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthFailAction(value: String): Self = StObject.set(x, "authFailAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthFailActionUndefined: Self = StObject.set(x, "authFailAction", js.undefined)
    
    @scala.inline
    def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    @scala.inline
    def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    @scala.inline
    def setSecurityLevel(value: String): Self = StObject.set(x, "securityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityLevelUndefined: Self = StObject.set(x, "securityLevel", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
