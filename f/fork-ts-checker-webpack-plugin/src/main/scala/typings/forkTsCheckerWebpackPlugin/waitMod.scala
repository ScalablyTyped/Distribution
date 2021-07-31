package typings.forkTsCheckerWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waitMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/utils/async/wait", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(timeout: Double): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
