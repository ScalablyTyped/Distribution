package typings.gatsbyCoreUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("gatsby-core-utils/dist/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def urlResolve(segments: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlResolve")(segments.asInstanceOf[js.Any]).asInstanceOf[String]
}
