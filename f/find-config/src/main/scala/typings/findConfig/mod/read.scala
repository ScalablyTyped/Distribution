package typings.findConfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("find-config", "read")
@js.native
object read extends js.Object {
  def apply(): String | Null = js.native
  def apply(filename: String): String | Null = js.native
  def apply(filename: String, options: ReadOptions): String | Null = js.native
}

