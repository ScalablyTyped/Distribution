package typings.firebaseMessaging

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayBase64TranslatorMod {
  
  @JSImport("@firebase/messaging/dist/helpers/array-base64-translator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayToBase64(array: ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayToBase64")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def arrayToBase64(array: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayToBase64")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base64ToArray(base64String: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("base64ToArray")(base64String.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
}
