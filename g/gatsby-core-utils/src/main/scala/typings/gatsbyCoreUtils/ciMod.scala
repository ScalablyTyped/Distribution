package typings.gatsbyCoreUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ciMod {
  
  @JSImport("gatsby-core-utils/dist/ci", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCIName(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCIName")().asInstanceOf[String | Null]
  
  inline def isCI(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCI")().asInstanceOf[Boolean]
}
