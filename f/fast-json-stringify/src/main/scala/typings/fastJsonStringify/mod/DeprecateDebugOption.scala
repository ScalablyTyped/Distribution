package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecateDebugOption
  extends StObject
     with Options {
  
  @JSName("debugMode")
  var debugMode_DeprecateDebugOption: `true`
}
object DeprecateDebugOption {
  
  inline def apply(): DeprecateDebugOption = {
    val __obj = js.Dynamic.literal(debugMode = true)
    __obj.asInstanceOf[DeprecateDebugOption]
  }
  
  extension [Self <: DeprecateDebugOption](x: Self) {
    
    inline def setDebugMode(value: `true`): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
  }
}
