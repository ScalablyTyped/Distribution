package typings.firebaseMessaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcHelpersArrayBase64TranslatorMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/helpers/array-base64-translator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayToBase64(array: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayToBase64")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def arrayToBase64(array: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayToBase64")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base64ToArray(base64String: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("base64ToArray")(base64String.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
