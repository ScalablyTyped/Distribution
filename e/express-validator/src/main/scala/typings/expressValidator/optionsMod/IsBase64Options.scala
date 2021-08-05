package typings.expressValidator.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsBase64Options extends StObject {
  
  var urlSafe: js.UndefOr[Boolean] = js.undefined
}
object IsBase64Options {
  
  inline def apply(): IsBase64Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsBase64Options]
  }
  
  extension [Self <: IsBase64Options](x: Self) {
    
    inline def setUrlSafe(value: Boolean): Self = StObject.set(x, "urlSafe", value.asInstanceOf[js.Any])
    
    inline def setUrlSafeUndefined: Self = StObject.set(x, "urlSafe", js.undefined)
  }
}
