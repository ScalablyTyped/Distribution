package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlledPromiseMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/utils/async/controlled-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createControlledPromise[T](): Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createControlledPromise")().asInstanceOf[Promise[T]]
}
