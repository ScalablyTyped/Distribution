package typings.famous

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilitiesMod {
  
  @JSImport("famous/utilities", "CallbackStore")
  @js.native
  open class CallbackStore () extends StObject {
    
    def on(event: String, callback: js.Function1[/* payload */ Any, Unit]): Unit = js.native
    
    def trigger(event: String, payload: Any): Unit = js.native
  }
}
