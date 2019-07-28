package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseDispMipsRegister extends js.Object {
  var base: js.UndefOr[MipsRegister] = js.undefined
  var disp: Double
}

object Anon_BaseDispMipsRegister {
  @scala.inline
  def apply(disp: Double, base: MipsRegister = null): Anon_BaseDispMipsRegister = {
    val __obj = js.Dynamic.literal(disp = disp)
    if (base != null) __obj.updateDynamic("base")(base)
    __obj.asInstanceOf[Anon_BaseDispMipsRegister]
  }
}

