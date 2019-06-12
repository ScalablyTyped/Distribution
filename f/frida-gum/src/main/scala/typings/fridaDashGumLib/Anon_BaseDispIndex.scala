package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseDispIndex extends js.Object {
  var base: js.UndefOr[Arm64Register] = js.undefined
  var disp: scala.Double
  var index: js.UndefOr[Arm64Register] = js.undefined
}

object Anon_BaseDispIndex {
  @scala.inline
  def apply(disp: scala.Double, base: Arm64Register = null, index: Arm64Register = null): Anon_BaseDispIndex = {
    val __obj = js.Dynamic.literal(disp = disp)
    if (base != null) __obj.updateDynamic("base")(base)
    if (index != null) __obj.updateDynamic("index")(index)
    __obj.asInstanceOf[Anon_BaseDispIndex]
  }
}

