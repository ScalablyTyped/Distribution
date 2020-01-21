package typings.firebaseMessaging

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/helpers/array-to-base64", JSImport.Namespace)
@js.native
object arrayToBase64Mod extends js.Object {
  def arrayToBase64(array: ArrayBuffer): String = js.native
  def arrayToBase64(array: Uint8Array): String = js.native
}

