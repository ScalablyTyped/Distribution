package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: js.UndefOr[X86Register] = js.undefined
  var disp: scala.Double
  var index: js.UndefOr[X86Register] = js.undefined
  var scale: scala.Double
  var segment: js.UndefOr[X86Register] = js.undefined
}

object Anon_Base {
  @scala.inline
  def apply(
    disp: scala.Double,
    scale: scala.Double,
    base: X86Register = null,
    index: X86Register = null,
    segment: X86Register = null
  ): Anon_Base = {
    val __obj = js.Dynamic.literal(disp = disp, scale = scale)
    if (base != null) __obj.updateDynamic("base")(base)
    if (index != null) __obj.updateDynamic("index")(index)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    __obj.asInstanceOf[Anon_Base]
  }
}

