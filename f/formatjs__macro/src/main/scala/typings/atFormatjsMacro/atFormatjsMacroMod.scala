package typings.atFormatjsMacro

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/macro", JSImport.Namespace)
@js.native
object atFormatjsMacroMod extends js.Object {
  @JSName("_")
  def _underscore[T](msg: T): T = js.native
  def defineMessages[T, U /* <: Record[String, T] */](msgs: U): U = js.native
}

