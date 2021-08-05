package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPendingMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/utils/async/isPending", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(promise: js.Promise[js.Any]): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def default(promise: js.Promise[js.Any], timeout: Double): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
