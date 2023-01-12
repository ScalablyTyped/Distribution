package typings.expressValidator.srcOptionsMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsBase64Options] (val x: Self) extends AnyVal {
    
    inline def setUrlSafe(value: Boolean): Self = StObject.set(x, "urlSafe", value.asInstanceOf[js.Any])
    
    inline def setUrlSafeUndefined: Self = StObject.set(x, "urlSafe", js.undefined)
  }
}
