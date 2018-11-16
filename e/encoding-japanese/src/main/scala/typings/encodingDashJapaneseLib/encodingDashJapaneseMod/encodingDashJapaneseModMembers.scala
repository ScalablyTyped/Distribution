package typings
package encodingDashJapaneseLib.encodingDashJapaneseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("encoding-japanese", JSImport.Namespace)
@js.native
object encodingDashJapaneseModMembers extends js.Object {
  def base64Decode(data: java.lang.String): js.Array[scala.Double] = js.native
  def base64Encode(data: js.Array[scala.Double]): java.lang.String = js.native
  def base64Encode(data: stdLib.Uint8Array): java.lang.String = js.native
  def codeToString(data: js.Array[scala.Double]): java.lang.String = js.native
  def codeToString(data: stdLib.Uint8Array): java.lang.String = js.native
  def convert(data: encodingDashJapaneseLib.RawType, options: ConvertOptions): java.lang.String | stdLib.ArrayBuffer | js.Array[scala.Double] = js.native
  def convert(data: encodingDashJapaneseLib.RawType, to: Encoding): js.Array[scala.Double] = js.native
  def convert(data: encodingDashJapaneseLib.RawType, to: Encoding, from: Encoding): js.Array[scala.Double] = js.native
  def detect(data: encodingDashJapaneseLib.RawType): Encoding = js.native
  def detect(data: encodingDashJapaneseLib.RawType, encodings: Encoding): Encoding = js.native
  def detect(data: encodingDashJapaneseLib.RawType, encodings: js.Array[Encoding]): Encoding = js.native
  def stringToCode(data: java.lang.String): js.Array[scala.Double] = js.native
  def toHankakuCase(data: java.lang.String): java.lang.String = js.native
  def toHankakuCase(data: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toHankakuSpace(data: java.lang.String): java.lang.String = js.native
  def toHankakuSpace(data: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toHankanaCase(data: java.lang.String): java.lang.String = js.native
  def toHankanaCase(data: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toHiraganaCase(data: java.lang.String): java.lang.String = js.native
  def toHiraganaCase(data: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toKatakanaCase(data: java.lang.String): java.lang.String = js.native
  def toKatakanaCase(data: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toZenkakuCase(data: java.lang.String): java.lang.String = js.native
  def toZenkakuCase(data: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toZenkakuSpace(data: java.lang.String): java.lang.String = js.native
  def toZenkakuSpace(data: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toZenkanaCase(data: java.lang.String): java.lang.String = js.native
  def toZenkanaCase(data: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def urlDecode(data: java.lang.String): js.Array[scala.Double] = js.native
  def urlEncode(data: js.Array[scala.Double]): java.lang.String = js.native
  def urlEncode(data: stdLib.Uint8Array): java.lang.String = js.native
}

