package typings.gatsbyCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object versionMod {
  
  @JSImport("gatsby-cli/lib/util/version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getLocalGatsbyVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatsbyVersion")().asInstanceOf[String]
}
