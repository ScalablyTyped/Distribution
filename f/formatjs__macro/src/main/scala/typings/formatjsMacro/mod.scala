package typings.formatjsMacro

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/macro", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @JSName("_")
  def _underscore[T](msg: T): T = js.native
  def defineMessages[T, U /* <: Record[String, T] */](msgs: U): U = js.native
}

