package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.standalone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandaloneOption
  extends StObject
     with Options {
  
  @JSName("mode")
  var mode_StandaloneOption: standalone
}
object StandaloneOption {
  
  inline def apply(): StandaloneOption = {
    val __obj = js.Dynamic.literal(mode = "standalone")
    __obj.asInstanceOf[StandaloneOption]
  }
  
  extension [Self <: StandaloneOption](x: Self) {
    
    inline def setMode(value: standalone): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
