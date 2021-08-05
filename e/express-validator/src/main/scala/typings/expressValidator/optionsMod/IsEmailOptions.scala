package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEmailOptions extends StObject {
  
  var allow_display_name: js.UndefOr[Boolean] = js.undefined
  
  var allow_utf8_local_part: js.UndefOr[Boolean] = js.undefined
  
  var require_tld: js.UndefOr[Boolean] = js.undefined
}
object IsEmailOptions {
  
  inline def apply(): IsEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsEmailOptions]
  }
  
  extension [Self <: IsEmailOptions](x: Self) {
    
    inline def setAllow_display_name(value: Boolean): Self = StObject.set(x, "allow_display_name", value.asInstanceOf[js.Any])
    
    inline def setAllow_display_nameUndefined: Self = StObject.set(x, "allow_display_name", js.undefined)
    
    inline def setAllow_utf8_local_part(value: Boolean): Self = StObject.set(x, "allow_utf8_local_part", value.asInstanceOf[js.Any])
    
    inline def setAllow_utf8_local_partUndefined: Self = StObject.set(x, "allow_utf8_local_part", js.undefined)
    
    inline def setRequire_tld(value: Boolean): Self = StObject.set(x, "require_tld", value.asInstanceOf[js.Any])
    
    inline def setRequire_tldUndefined: Self = StObject.set(x, "require_tld", js.undefined)
  }
}
