package typings.firebaseInstallations

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferToBase64UrlSafeMod {
  
  @JSImport("@firebase/installations/dist/src/helpers/buffer-to-base64-url-safe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bufferToBase64UrlSafe(array: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToBase64UrlSafe")(array.asInstanceOf[js.Any]).asInstanceOf[String]
}
