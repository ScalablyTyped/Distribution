package typings.eev

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eev", JSImport.Default)
  @js.native
  open class default () extends Eev
  
  @JSImport("eev", "Eev")
  @js.native
  open class Eev () extends StObject {
    
    def emit(name: String): Unit = js.native
    def emit(name: String, data: Any): Unit = js.native
    
    def off(names: String, fn: CallbackFunction): Unit = js.native
    
    def on(names: String, fn: CallbackFunction): Unit = js.native
  }
  
  type CallbackFunction = js.Function1[/* data */ Any, Unit]
}
