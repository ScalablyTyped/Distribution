package typings.forkTsCheckerWebpackPlugin

import typings.nodeAbortController.mod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poolMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/utils/async/pool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPool(size: Double): Pool = ^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(size.asInstanceOf[js.Any]).asInstanceOf[Pool]
  
  @js.native
  trait Pool extends StObject {
    
    val drained: js.Promise[Unit] = js.native
    
    val pending: Double = js.native
    
    var size: Double = js.native
    
    def submit[T](task: Task[T]): js.Promise[T] = js.native
    def submit[T](task: Task[T], signal: AbortSignal): js.Promise[T] = js.native
  }
  
  type Task[T] = js.Function1[/* signal */ js.UndefOr[AbortSignal], js.Promise[T]]
}
