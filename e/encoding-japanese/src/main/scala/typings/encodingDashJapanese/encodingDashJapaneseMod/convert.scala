package typings.encodingDashJapanese.encodingDashJapaneseMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("encoding-japanese", "convert")
@js.native
object convert extends js.Object {
  def apply(data: RawType, options: ConvertOptions): String | ArrayBuffer | js.Array[Double] = js.native
  def apply(data: RawType, to: Encoding): js.Array[Double] = js.native
  def apply(data: RawType, to: Encoding, from: Encoding): js.Array[Double] = js.native
}

