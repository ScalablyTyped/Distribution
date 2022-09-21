package typings.expoCodeSigningCertificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@expo/code-signing-certificates/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toPositiveHex(hexString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPositiveHex")(hexString.asInstanceOf[js.Any]).asInstanceOf[String]
}
