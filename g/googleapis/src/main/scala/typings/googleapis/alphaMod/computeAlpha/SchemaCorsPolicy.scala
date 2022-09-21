package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCorsPolicy extends StObject {
  
  /**
    * In response to a preflight request, setting this to true indicates that the actual request can include user credentials. This field translates to the Access-Control-Allow-Credentials header. Default is false.
    */
  var allowCredentials: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the content for the Access-Control-Allow-Headers header.
    */
  var allowHeaders: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Specifies the content for the Access-Control-Allow-Methods header.
    */
  var allowMethods: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Specifies a regular expression that matches allowed origins. For more information about the regular expression syntax, see Syntax. An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
    */
  var allowOriginRegexes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Specifies the list of origins that is allowed to do CORS requests. An origin is allowed if it matches either an item in allowOrigins or an item in allowOriginRegexes.
    */
  var allowOrigins: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * If true, the setting specifies the CORS policy is disabled. The default value of false, which indicates that the CORS policy is in effect.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the content for the Access-Control-Expose-Headers header.
    */
  var exposeHeaders: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Specifies how long results of a preflight request can be cached in seconds. This field translates to the Access-Control-Max-Age header.
    */
  var maxAge: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCorsPolicy {
  
  inline def apply(): SchemaCorsPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCorsPolicy]
  }
  
  extension [Self <: SchemaCorsPolicy](x: Self) {
    
    inline def setAllowCredentials(value: Boolean): Self = StObject.set(x, "allowCredentials", value.asInstanceOf[js.Any])
    
    inline def setAllowCredentialsNull: Self = StObject.set(x, "allowCredentials", null)
    
    inline def setAllowCredentialsUndefined: Self = StObject.set(x, "allowCredentials", js.undefined)
    
    inline def setAllowHeaders(value: js.Array[String]): Self = StObject.set(x, "allowHeaders", value.asInstanceOf[js.Any])
    
    inline def setAllowHeadersNull: Self = StObject.set(x, "allowHeaders", null)
    
    inline def setAllowHeadersUndefined: Self = StObject.set(x, "allowHeaders", js.undefined)
    
    inline def setAllowHeadersVarargs(value: String*): Self = StObject.set(x, "allowHeaders", js.Array(value*))
    
    inline def setAllowMethods(value: js.Array[String]): Self = StObject.set(x, "allowMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowMethodsNull: Self = StObject.set(x, "allowMethods", null)
    
    inline def setAllowMethodsUndefined: Self = StObject.set(x, "allowMethods", js.undefined)
    
    inline def setAllowMethodsVarargs(value: String*): Self = StObject.set(x, "allowMethods", js.Array(value*))
    
    inline def setAllowOriginRegexes(value: js.Array[String]): Self = StObject.set(x, "allowOriginRegexes", value.asInstanceOf[js.Any])
    
    inline def setAllowOriginRegexesNull: Self = StObject.set(x, "allowOriginRegexes", null)
    
    inline def setAllowOriginRegexesUndefined: Self = StObject.set(x, "allowOriginRegexes", js.undefined)
    
    inline def setAllowOriginRegexesVarargs(value: String*): Self = StObject.set(x, "allowOriginRegexes", js.Array(value*))
    
    inline def setAllowOrigins(value: js.Array[String]): Self = StObject.set(x, "allowOrigins", value.asInstanceOf[js.Any])
    
    inline def setAllowOriginsNull: Self = StObject.set(x, "allowOrigins", null)
    
    inline def setAllowOriginsUndefined: Self = StObject.set(x, "allowOrigins", js.undefined)
    
    inline def setAllowOriginsVarargs(value: String*): Self = StObject.set(x, "allowOrigins", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExposeHeaders(value: js.Array[String]): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
    
    inline def setExposeHeadersNull: Self = StObject.set(x, "exposeHeaders", null)
    
    inline def setExposeHeadersUndefined: Self = StObject.set(x, "exposeHeaders", js.undefined)
    
    inline def setExposeHeadersVarargs(value: String*): Self = StObject.set(x, "exposeHeaders", js.Array(value*))
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeNull: Self = StObject.set(x, "maxAge", null)
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
  }
}
