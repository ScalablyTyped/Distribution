package typings.escpos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: String
  var `type`: String
}

object Anon_Mode {
  @scala.inline
  def apply(mode: String, `type`: String): Anon_Mode = {
    val __obj = js.Dynamic.literal(mode = mode)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Mode]
  }
}

