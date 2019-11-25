package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: js.UndefOr[X86Register] = js.undefined
  var disp: Double
  var index: js.UndefOr[X86Register] = js.undefined
  var scale: Double
  var segment: js.UndefOr[X86Register] = js.undefined
}

object Anon_Base {
  @scala.inline
  def apply(
    disp: Double,
    scale: Double,
    base: X86Register = null,
    index: X86Register = null,
    segment: X86Register = null
  ): Anon_Base = {
    val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Base]
  }
}

