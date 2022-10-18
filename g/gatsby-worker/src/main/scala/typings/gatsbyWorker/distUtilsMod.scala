package typings.gatsbyWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("gatsby-worker/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPromise(obj: Any): /* is std.PromiseLike<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<unknown> */ Boolean]
  
  inline def isRunning(pid: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRunning")(pid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
