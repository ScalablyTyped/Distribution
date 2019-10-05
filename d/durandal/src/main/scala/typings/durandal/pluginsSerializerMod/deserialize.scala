package typings.durandal.pluginsSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugins/serializer", "deserialize")
@js.native
object deserialize extends js.Object {
  def apply[T](text: String): T = js.native
  def apply[T](text: String, settings: DeserializerOptions): T = js.native
}

