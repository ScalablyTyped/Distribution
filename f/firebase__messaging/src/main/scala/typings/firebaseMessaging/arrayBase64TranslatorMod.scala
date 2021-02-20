package typings.firebaseMessaging

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayBase64TranslatorMod {
  
  @JSImport("@firebase/messaging/dist/helpers/array-base64-translator", "arrayToBase64")
  @js.native
  def arrayToBase64(array: ArrayBuffer): String = js.native
  @JSImport("@firebase/messaging/dist/helpers/array-base64-translator", "arrayToBase64")
  @js.native
  def arrayToBase64(array: Uint8Array): String = js.native
  
  @JSImport("@firebase/messaging/dist/helpers/array-base64-translator", "base64ToArray")
  @js.native
  def base64ToArray(base64String: String): Uint8Array = js.native
}
