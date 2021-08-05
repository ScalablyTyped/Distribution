package typings.expressVersionRoute

import typings.express.mod.Handler
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-version-route", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def route(versionsMap: Map[String, Handler]): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("route")(versionsMap.asInstanceOf[js.Any]).asInstanceOf[Handler]
}
