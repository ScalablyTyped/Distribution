package typings.devextremeRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object effectMod {
  
  @JSImport("@devextreme/runtime/cjs/inferno/effect", "InfernoEffect")
  @js.native
  open class InfernoEffect protected () extends StObject {
    def this(effect: js.Function0[js.Function0[Unit] | Unit], dependency: js.Array[Any]) = this()
    
    /* private */ var dependency: Any = js.native
    
    /* private */ var destroy: Any = js.native
    
    def dispose(): Unit = js.native
    
    /* private */ var effect: Any = js.native
    
    def update(): Unit = js.native
    def update(dependency: js.Array[Any]): Unit = js.native
  }
}
