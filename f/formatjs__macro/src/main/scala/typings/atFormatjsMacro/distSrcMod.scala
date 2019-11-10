package typings.atFormatjsMacro

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/macro/dist/src", JSImport.Namespace)
@js.native
object distSrcMod extends js.Object {
  def defineMessage[T](msg: T): T = js.native
  def defineMessages[T](msgs: Record[String, T]): Record[String, T] = js.native
  @js.native
  object `_` extends js.Object {
    def apply[T](msg: T): T = js.native
  }
  
}

