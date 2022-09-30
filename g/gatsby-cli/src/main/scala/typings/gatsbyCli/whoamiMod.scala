package typings.gatsbyCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whoamiMod {
  
  @JSImport("gatsby-cli/lib/whoami", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def whoami(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("whoami")().asInstanceOf[js.Promise[Unit]]
}
