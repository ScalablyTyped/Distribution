package typings.atFortawesomeReactDashFontawesome.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.FaSymbol
import typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.FlipProp
import typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.IconProp
import typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.PullProp
import typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.RotateProp
import typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.SizeProp
import typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: tabIndex, style, color, className, title */
object FontAwesomeIcon
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.atFortawesomeReactDashFontawesome.atFortawesomeReactDashFontawesomeMod.^.asInstanceOf[js.Dynamic].selectDynamic("FontAwesomeIcon").asInstanceOf[String | js.Object]
  def apply(
    icon: IconProp,
    border: js.UndefOr[Boolean] = js.undefined,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    flip: FlipProp = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    listItem: js.UndefOr[Boolean] = js.undefined,
    mask: IconProp = null,
    pull: PullProp = null,
    pulse: js.UndefOr[Boolean] = js.undefined,
    rotation: RotateProp = null,
    size: SizeProp = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    symbol: FaSymbol = null,
    transform: String | Transform = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border)
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
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typings.atFortawesomeReactDashFontawesome.atFortawesomeReactDashFontawesomeMod.Props
}

