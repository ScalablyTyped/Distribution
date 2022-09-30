package typings.gatsbyCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @JSImport("gatsby-cli/lib/handlers/plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(root: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(root.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(root: String, cmd: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(root.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
