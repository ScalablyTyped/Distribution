package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIPostMessageOptions extends StObject {
  
  var origin: js.UndefOr[String] = js.undefined
}
object UIPostMessageOptions {
  
  inline def apply(): UIPostMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIPostMessageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UIPostMessageOptions] (val x: Self) extends AnyVal {
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
