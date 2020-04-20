package typings.fluentuiReactIcons.svgIconTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISvgIconStyles extends js.Object {
  var root: js.UndefOr[IStyle] = js.undefined
  var svg: js.UndefOr[IStyle] = js.undefined
}

object ISvgIconStyles {
  @scala.inline
  def apply(root: IStyle = null, svg: IStyle = null): ISvgIconStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISvgIconStyles]
  }
}

