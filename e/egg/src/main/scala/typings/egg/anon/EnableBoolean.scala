package typings.egg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableBoolean extends StObject {
  
  var enable: Boolean
}
object EnableBoolean {
  
  inline def apply(enable: Boolean): EnableBoolean = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableBoolean] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
  }
}
