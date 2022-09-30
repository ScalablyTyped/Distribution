package typings.gatsbyCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loginMod {
  
  @JSImport("gatsby-cli/lib/login", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def login(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("login")().asInstanceOf[js.Promise[Unit]]
}
