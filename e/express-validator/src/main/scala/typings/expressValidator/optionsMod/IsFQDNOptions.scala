package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFQDNOptions extends StObject {
  
  var allow_numeric_tld: js.UndefOr[Boolean] = js.undefined
  
  var allow_trailing_dot: js.UndefOr[Boolean] = js.undefined
  
  var allow_underscores: js.UndefOr[Boolean] = js.undefined
  
  var allow_wildcard: js.UndefOr[Boolean] = js.undefined
  
  var require_tld: js.UndefOr[Boolean] = js.undefined
}
object IsFQDNOptions {
  
  inline def apply(): IsFQDNOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsFQDNOptions]
  }
  
  extension [Self <: IsFQDNOptions](x: Self) {
    
    inline def setAllow_numeric_tld(value: Boolean): Self = StObject.set(x, "allow_numeric_tld", value.asInstanceOf[js.Any])
    
    inline def setAllow_numeric_tldUndefined: Self = StObject.set(x, "allow_numeric_tld", js.undefined)
    
    inline def setAllow_trailing_dot(value: Boolean): Self = StObject.set(x, "allow_trailing_dot", value.asInstanceOf[js.Any])
    
    inline def setAllow_trailing_dotUndefined: Self = StObject.set(x, "allow_trailing_dot", js.undefined)
    
    inline def setAllow_underscores(value: Boolean): Self = StObject.set(x, "allow_underscores", value.asInstanceOf[js.Any])
    
    inline def setAllow_underscoresUndefined: Self = StObject.set(x, "allow_underscores", js.undefined)
    
    inline def setAllow_wildcard(value: Boolean): Self = StObject.set(x, "allow_wildcard", value.asInstanceOf[js.Any])
    
    inline def setAllow_wildcardUndefined: Self = StObject.set(x, "allow_wildcard", js.undefined)
    
    inline def setRequire_tld(value: Boolean): Self = StObject.set(x, "require_tld", value.asInstanceOf[js.Any])
    
    inline def setRequire_tldUndefined: Self = StObject.set(x, "require_tld", js.undefined)
  }
}
