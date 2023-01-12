package typings.fabric.anon

import typings.fabric.fabricImplMod.Object
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait E extends StObject {
  
  var e: js.UndefOr[Event] = js.undefined
  
  var `object`: js.UndefOr[Object] = js.undefined
}
object E {
  
  inline def apply(): E = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[E]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: E] (val x: Self) extends AnyVal {
    
    inline def setE(value: Event): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
