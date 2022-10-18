package typings.esfxDisposable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object disposableStackMod {
  
  @JSImport("@esfx/disposable/disposableStack", "DisposableStack")
  @js.native
  /**
    * Creates a new DisposableStack.
    */
  open class DisposableStack ()
    extends typings.esfxDisposable.distTypesDisposableStackMod.DisposableStack
  /* static members */
  object DisposableStack {
    
    @JSImport("@esfx/disposable/disposableStack", "DisposableStack")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@esfx/disposable/disposableStack", "DisposableStack.get")
    @js.native
    def get: Any = js.native
    inline def get_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  }
}
