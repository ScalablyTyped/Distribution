package typings.firebaseAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcCoreUtilLocationMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/core/util/location", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCurrentScheme(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("_getCurrentScheme")().asInstanceOf[String | Null]
  
  inline def getCurrentUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_getCurrentUrl")().asInstanceOf[String]
  
  inline def isHttpOrHttps(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isHttpOrHttps")().asInstanceOf[Boolean]
}
