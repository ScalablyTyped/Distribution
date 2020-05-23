package typings.fluentuiReactIcons.anon

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@fluentui/react-icons.@fluentui/react-icons/lib/utils/SvgIcon.types.ISvgIconStyles> */
trait PartialISvgIconStyles extends js.Object {
  var root: js.UndefOr[IStyle] = js.undefined
  var svg: js.UndefOr[IStyle] = js.undefined
}

object PartialISvgIconStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined, svg: js.UndefOr[Null | IStyle] = js.undefined): PartialISvgIconStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialISvgIconStyles]
  }
}

