package typings
package atFirebaseUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ByteToCharMap extends js.Object {
  val ENCODED_VALS: java.lang.String = js.native
  var ENCODED_VALS_BASE: java.lang.String = js.native
  val ENCODED_VALS_WEBSAFE: java.lang.String = js.native
  var HAS_NATIVE_SUPPORT: scala.Boolean = js.native
  var `byteToCharMapWebSafe_`: js.Any = js.native
  var `byteToCharMap_`: js.Any = js.native
  var `charToByteMapWebSafe_`: js.Any = js.native
  var `charToByteMap_`: js.Any = js.native
  def decodeString(input: js.Any, opt_webSafe: js.Any): java.lang.String = js.native
  def decodeStringToByteArray(input: js.Any, opt_webSafe: js.Any): js.Array[_] = js.native
  def encodeByteArray(input: js.Any): java.lang.String = js.native
  def encodeByteArray(input: js.Any, opt_webSafe: js.Any): java.lang.String = js.native
  def encodeString(input: js.Any, opt_webSafe: js.Any): js.Any = js.native
  def `init_`(): scala.Unit = js.native
}

