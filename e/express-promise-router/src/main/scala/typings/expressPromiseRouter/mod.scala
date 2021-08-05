package typings.expressPromiseRouter

import typings.express.mod.Router
import typings.express.mod.RouterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-promise-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Router]
  inline def default(options: RouterOptions): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Router]
}
