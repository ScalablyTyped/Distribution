package typings.encodingDashJapanese.encodingDashJapaneseMod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("encoding-japanese", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def base64Decode(data: String): js.Array[Double] = js.native
  def base64Encode(data: js.Array[Double]): String = js.native
  def base64Encode(data: Uint8Array): String = js.native
  def codeToString(data: js.Array[Double]): String = js.native
  def codeToString(data: Uint8Array): String = js.native
  def convert(data: RawType, options: ConvertOptions): String | ArrayBuffer | js.Array[Double] = js.native
  def convert(data: RawType, to: Encoding): js.Array[Double] = js.native
  def convert(data: RawType, to: Encoding, from: Encoding): js.Array[Double] = js.native
  def detect(data: RawType): Encoding = js.native
  def detect(data: RawType, encodings: js.Array[Encoding]): Encoding = js.native
  def detect(data: RawType, encodings: Encoding): Encoding = js.native
  def stringToCode(data: String): js.Array[Double] = js.native
  def toHankakuCase(data: String): String = js.native
  def toHankakuCase(data: js.Array[Double]): js.Array[Double] = js.native
  def toHankakuSpace(data: String): String = js.native
  def toHankakuSpace(data: js.Array[Double]): js.Array[Double] = js.native
  def toHankanaCase(data: String): String = js.native
  def toHankanaCase(data: js.Array[Double]): js.Array[Double] = js.native
  def toHiraganaCase(data: String): String = js.native
  def toHiraganaCase(data: js.Array[Double]): js.Array[Double] = js.native
  def toKatakanaCase(data: String): String = js.native
  def toKatakanaCase(data: js.Array[Double]): js.Array[Double] = js.native
  def toZenkakuCase(data: String): String = js.native
  def toZenkakuCase(data: js.Array[Double]): js.Array[Double] = js.native
  def toZenkakuSpace(data: String): String = js.native
  def toZenkakuSpace(data: js.Array[Double]): js.Array[Double] = js.native
  def toZenkanaCase(data: String): String = js.native
  def toZenkanaCase(data: js.Array[Double]): js.Array[Double] = js.native
  def urlDecode(data: String): js.Array[Double] = js.native
  def urlEncode(data: js.Array[Double]): String = js.native
  def urlEncode(data: Uint8Array): String = js.native
}

