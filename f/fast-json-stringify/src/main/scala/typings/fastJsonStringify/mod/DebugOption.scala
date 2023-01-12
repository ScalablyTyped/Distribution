package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.debug
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugOption
  extends StObject
     with Options {
  
  @JSName("mode")
  var mode_DebugOption: debug
}
object DebugOption {
  
  inline def apply(): DebugOption = {
    val __obj = js.Dynamic.literal(mode = "debug")
    __obj.asInstanceOf[DebugOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebugOption] (val x: Self) extends AnyVal {
    
    inline def setMode(value: debug): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
