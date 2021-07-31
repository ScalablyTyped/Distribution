package typings.eev

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eev", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Eev
  
  type CallbackFunction = js.Function1[/* data */ js.Any, Unit]
  
  @js.native
  trait Eev extends StObject {
    
    def emit(name: String): Unit = js.native
    def emit(name: String, data: js.Any): Unit = js.native
    
    def off(names: String, fn: CallbackFunction): Unit = js.native
    
    def on(names: String, fn: CallbackFunction): Unit = js.native
  }
}
