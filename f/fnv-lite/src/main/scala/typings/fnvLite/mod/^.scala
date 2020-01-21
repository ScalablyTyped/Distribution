package typings.fnvLite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fnv-lite", JSImport.Namespace)
@js.native
class ^ () extends FNV

@JSImport("fnv-lite", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def base36(input: Input): String = js.native
  def base64(input: Input): String = js.native
  def base64Url(input: Input): String = js.native
  def hex(input: Input): String = js.native
}

