package typings.gatsbyCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isTtyMod {
  
  @JSImport("gatsby-cli/lib/util/is-tty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTTY(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTTY")().asInstanceOf[Boolean]
}
