package typings
package atFortawesomeReactDashFontawesomeLib.atFortawesomeReactDashFontawesomeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var border: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fixedWidth: js.UndefOr[scala.Boolean] = js.undefined
  var flip: js.UndefOr[
    atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.FlipProp
  ] = js.undefined
  var icon: atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.IconProp
  var inverse: js.UndefOr[scala.Boolean] = js.undefined
  var listItem: js.UndefOr[scala.Boolean] = js.undefined
  var mask: js.UndefOr[
    atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.IconProp
  ] = js.undefined
  var pull: js.UndefOr[
    atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.PullProp
  ] = js.undefined
  var pulse: js.UndefOr[scala.Boolean] = js.undefined
  var rotation: js.UndefOr[
    atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.RotateProp
  ] = js.undefined
  var size: js.UndefOr[
    atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.SizeProp
  ] = js.undefined
  var spin: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var symbol: js.UndefOr[
    atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.FaSymbol
  ] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var transform: js.UndefOr[
    java.lang.String | atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.Transform
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    icon: atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.IconProp,
    border: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    color: java.lang.String = null,
    fixedWidth: js.UndefOr[scala.Boolean] = js.undefined,
    flip: atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.FlipProp = null,
    inverse: js.UndefOr[scala.Boolean] = js.undefined,
    listItem: js.UndefOr[scala.Boolean] = js.undefined,
    mask: atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.IconProp = null,
    pull: atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.PullProp = null,
    pulse: js.UndefOr[scala.Boolean] = js.undefined,
    rotation: atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.RotateProp = null,
    size: atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.SizeProp = null,
    spin: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    symbol: atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.FaSymbol = null,
    tabIndex: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    transform: java.lang.String | atFortawesomeFontawesomeDashSvgDashCoreLib.atFortawesomeFontawesomeDashSvgDashCoreMod.Transform = null
  ): Props = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth)
    if (flip != null) __obj.updateDynamic("flip")(flip)
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (!js.isUndefined(listItem)) __obj.updateDynamic("listItem")(listItem)
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull)
    if (!js.isUndefined(pulse)) __obj.updateDynamic("pulse")(pulse)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin)
    if (style != null) __obj.updateDynamic("style")(style)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

