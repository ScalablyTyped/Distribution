package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var lgSpan: js.UndefOr[UnsignedUpTo12] = js.undefined
  var mdSpan: js.UndefOr[UnsignedUpTo12] = js.undefined
  var smSpan: js.UndefOr[UnsignedUpTo12] = js.undefined
  var span: UnsignedUpTo12
}

object ColumnProps {
  @scala.inline
  def apply(
    span: UnsignedUpTo12,
    children: reactLib.reactMod.ReactNode = null,
    lgSpan: UnsignedUpTo12 = null,
    mdSpan: UnsignedUpTo12 = null,
    smSpan: UnsignedUpTo12 = null
  ): ColumnProps = {
    val __obj = js.Dynamic.literal(span = span)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (lgSpan != null) __obj.updateDynamic("lgSpan")(lgSpan)
    if (mdSpan != null) __obj.updateDynamic("mdSpan")(mdSpan)
    if (smSpan != null) __obj.updateDynamic("smSpan")(smSpan)
    __obj.asInstanceOf[ColumnProps]
  }
}

