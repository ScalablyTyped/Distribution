package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * URL pattern and description of how the URL should be handled. App Engine
  * can handle URLs by executing application code or by serving static files
  * uploaded with the version, such as images, CSS, or JavaScript.
  */
trait SchemaUrlMap extends StObject {
  
  /**
    * Uses API Endpoints to handle requests.
    */
  var apiEndpoint: js.UndefOr[SchemaApiEndpointHandler] = js.undefined
  
  /**
    * Action to take when users access resources that require authentication.
    * Defaults to redirect.
    */
  var authFailAction: js.UndefOr[String] = js.undefined
  
  /**
    * Level of login required to access this resource. Not supported for
    * Node.js in the App Engine standard environment.
    */
  var login: js.UndefOr[String] = js.undefined
  
  /**
    * 30x code to use when performing redirects for the secure field. Defaults
    * to 302.
    */
  var redirectHttpResponseCode: js.UndefOr[String] = js.undefined
  
  /**
    * Executes a script to handle the requests that match this URL pattern.
    * Only the auto value is supported for Node.js in the App Engine standard
    * environment, for example &quot;script&quot;: &quot;auto&quot;.
    */
  var script: js.UndefOr[SchemaScriptHandler] = js.undefined
  
  /**
    * Security (HTTPS) enforcement for this URL.
    */
  var securityLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Returns the contents of a file, such as an image, as the response.
    */
  var staticFiles: js.UndefOr[SchemaStaticFilesHandler] = js.undefined
  
  /**
    * URL prefix. Uses regular expression syntax, which means regexp special
    * characters must be escaped, but should not contain groupings. All URLs
    * that begin with this prefix are handled by this handler, using the
    * portion of the URL after the prefix as part of the file path.
    */
  var urlRegex: js.UndefOr[String] = js.undefined
}
object SchemaUrlMap {
  
  inline def apply(): SchemaUrlMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMap]
  }
  
  extension [Self <: SchemaUrlMap](x: Self) {
    
    inline def setApiEndpoint(value: SchemaApiEndpointHandler): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
    
    inline def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
    
    inline def setAuthFailAction(value: String): Self = StObject.set(x, "authFailAction", value.asInstanceOf[js.Any])
    
    inline def setAuthFailActionUndefined: Self = StObject.set(x, "authFailAction", js.undefined)
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    inline def setRedirectHttpResponseCode(value: String): Self = StObject.set(x, "redirectHttpResponseCode", value.asInstanceOf[js.Any])
    
    inline def setRedirectHttpResponseCodeUndefined: Self = StObject.set(x, "redirectHttpResponseCode", js.undefined)
    
    inline def setScript(value: SchemaScriptHandler): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setSecurityLevel(value: String): Self = StObject.set(x, "securityLevel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLevelUndefined: Self = StObject.set(x, "securityLevel", js.undefined)
    
    inline def setStaticFiles(value: SchemaStaticFilesHandler): Self = StObject.set(x, "staticFiles", value.asInstanceOf[js.Any])
    
    inline def setStaticFilesUndefined: Self = StObject.set(x, "staticFiles", js.undefined)
    
    inline def setUrlRegex(value: String): Self = StObject.set(x, "urlRegex", value.asInstanceOf[js.Any])
    
    inline def setUrlRegexUndefined: Self = StObject.set(x, "urlRegex", js.undefined)
  }
}
