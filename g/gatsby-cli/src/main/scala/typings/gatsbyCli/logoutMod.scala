package typings.gatsbyCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logoutMod {
  
  @JSImport("gatsby-cli/lib/logout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logout(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[js.Promise[Unit]]
}
