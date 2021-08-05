package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDefault extends StObject {
  
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object IsDefault {
  
  inline def apply(): IsDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsDefault]
  }
  
  extension [Self <: IsDefault](x: Self) {
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
