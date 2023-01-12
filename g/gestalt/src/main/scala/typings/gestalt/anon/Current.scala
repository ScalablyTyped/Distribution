package typings.gestalt.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Current extends StObject {
  
  var current: js.UndefOr[HTMLElement] = js.undefined
}
object Current {
  
  inline def apply(): Current = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: HTMLElement): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
  }
}
