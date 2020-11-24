package typings.encodingJapanese.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("encoding-japanese", "convert")
@js.native
object convert extends js.Object {
  
  def apply(data: String, options: ConvertArrayBufferOptions): ArrayBuffer = js.native
  def apply(data: String, options: ConvertArrayOptions): js.Array[Double] = js.native
  def apply(data: String, options: ConvertStringOptions): String = js.native
  def apply(data: String, options: ConvertUnknownOptions): String = js.native
  def apply(data: String, to: Encoding): String = js.native
  def apply(data: String, to: Encoding, from: Encoding): String = js.native
  def apply(data: RawType, options: ConvertArrayBufferOptions): ArrayBuffer = js.native
  def apply(data: RawType, options: ConvertArrayOptions): js.Array[Double] = js.native
  def apply(data: RawType, options: ConvertStringOptions): String = js.native
  def apply(data: RawType, options: ConvertUnknownOptions): js.Array[Double] = js.native
  def apply(data: RawType, to: Encoding): js.Array[Double] = js.native
  def apply(data: RawType, to: Encoding, from: Encoding): js.Array[Double] = js.native
}
