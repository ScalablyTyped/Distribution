package typings.atFormatjsMacro

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/macro", JSImport.Namespace)
@js.native
object atFormatjsMacroMod extends js.Object {
  def `_`[T](msg: T): T = js.native
  def defineMessages[T](msgs: Record[String, T]): Record[String, T] = js.native
}

