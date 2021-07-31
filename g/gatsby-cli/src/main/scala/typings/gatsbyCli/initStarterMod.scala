package typings.gatsbyCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initStarterMod {
  
  @JSImport("gatsby-cli/lib/init-starter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def initStarter(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initStarter")().asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def initStarter(starter: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initStarter")(starter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def initStarter(starter: String, root: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("initStarter")(starter.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def initStarter(starter: Unit, root: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("initStarter")(starter.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
