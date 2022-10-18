package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsAsyncWaitMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/utils/async/wait", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wait_(timeout: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
