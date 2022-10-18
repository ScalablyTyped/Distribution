package typings.egg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieField extends StObject {
  
  /**
    * The locale value key in the cookie, default is locale.
    */
  var cookieField: String
  
  /**
    * Locale cookie expire time, default `1y`, If pass number value, the unit will be ms
    */
  var cookieMaxAge: String | Double
  
  /**
    * default value EN_US
    */
  var defaultLocale: String
  
  /**
    * i18n resource file dir, not recommend to change default value
    */
  var dir: String
  
  /**
    * custom the locale value field, default `query.locale`, you can modify this config, such as `query.lang`
    */
  var queryField: String
}
object CookieField {
  
  inline def apply(
    cookieField: String,
    cookieMaxAge: String | Double,
    defaultLocale: String,
    dir: String,
    queryField: String
  ): CookieField = {
    val __obj = js.Dynamic.literal(cookieField = cookieField.asInstanceOf[js.Any], cookieMaxAge = cookieMaxAge.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], queryField = queryField.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieField]
  }
  
  extension [Self <: CookieField](x: Self) {
    
    inline def setCookieField(value: String): Self = StObject.set(x, "cookieField", value.asInstanceOf[js.Any])
    
    inline def setCookieMaxAge(value: String | Double): Self = StObject.set(x, "cookieMaxAge", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setQueryField(value: String): Self = StObject.set(x, "queryField", value.asInstanceOf[js.Any])
  }
}
