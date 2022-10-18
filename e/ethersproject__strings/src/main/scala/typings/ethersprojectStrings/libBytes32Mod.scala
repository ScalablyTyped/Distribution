package typings.ethersprojectStrings

import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBytes32Mod {
  
  @JSImport("@ethersproject/strings/lib/bytes32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatBytes32String(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatBytes32String")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseBytes32String(bytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBytes32String")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
}
