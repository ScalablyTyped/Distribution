package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPendingMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/utils/async/is-pending", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPending(promise: js.Promise[Any]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("isPending")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def isPending(promise: js.Promise[Any], timeout: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("isPending")(promise.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
