package typings.fluentuiUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResourcesMod {
  
  @JSImport("@fluentui/utilities/lib/resources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getResourceUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setBaseUrl(baseUrl: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBaseUrl")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
