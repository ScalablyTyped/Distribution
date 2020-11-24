package typings.encodingJapanese.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("encoding-japanese", "detect")
@js.native
object detect extends js.Object {
  
  def apply(data: String): EncodingDetection = js.native
  def apply(data: String, encodings: js.Array[Encoding]): EncodingDetection = js.native
  def apply(data: String, encodings: Encoding): EncodingDetection = js.native
  def apply(data: RawType): EncodingDetection = js.native
  def apply(data: RawType, encodings: js.Array[Encoding]): EncodingDetection = js.native
  def apply(data: RawType, encodings: Encoding): EncodingDetection = js.native
}
