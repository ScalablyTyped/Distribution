package typings.gatsbyCoreUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getGatsbyVersionMod {
  
  @JSImport("gatsby-core-utils/dist/get-gatsby-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGatsbyVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGatsbyVersion")().asInstanceOf[String]
}
