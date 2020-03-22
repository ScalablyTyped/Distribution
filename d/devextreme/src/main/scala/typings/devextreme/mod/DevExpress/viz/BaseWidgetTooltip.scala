package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonBlur
import typings.devextreme.AnonDashStyleOpacity
import typings.devextreme.mod.DevExpress.ui.format
import typings.devextreme.mod._Global_.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures tooltips - small pop-up rectangles that display information about a data-visualizing widget element being pressed or hovered over with the mouse pointer. */
trait BaseWidgetTooltip extends js.Object {
  /** Specifies the length of a tooltip's arrow in pixels. */
  var arrowLength: js.UndefOr[Double] = js.undefined
  /** Configures a tooltip's border. */
  var border: js.UndefOr[AnonDashStyleOpacity] = js.undefined
  /** Colors all tooltips. */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the container in which to draw tooltips. The default container is the HTML DOM `` element. */
  var container: js.UndefOr[String | Element | JQuery] = js.undefined
  /** Makes all the tooltip's corners rounded. */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  /** Enables tooltips. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies tooltips' font options. */
  var font: js.UndefOr[Font] = js.undefined
  /** Formats a value before it is displayed it in a tooltip. */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  /** Specifies tooltips' transparency. */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Generates an empty space, measured in pixels, between a tooltip's left/right border and its text. */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  /** Generates an empty space, measured in pixels, between a tooltip's top/bottom border and its text. */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  /** Configures a tooltip's shadow. */
  var shadow: js.UndefOr[AnonBlur] = js.undefined
  /** Specifies a tooltip's z-index. */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object BaseWidgetTooltip {
  @scala.inline
  def apply(
    arrowLength: Int | Double = null,
    border: AnonDashStyleOpacity = null,
    color: String = null,
    container: String | Element | JQuery = null,
    cornerRadius: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    font: Font = null,
    format: format = null,
    opacity: Int | Double = null,
    paddingLeftRight: Int | Double = null,
    paddingTopBottom: Int | Double = null,
    shadow: AnonBlur = null,
    zIndex: Int | Double = null
  ): BaseWidgetTooltip = {
    val __obj = js.Dynamic.literal()
    if (arrowLength != null) __obj.updateDynamic("arrowLength")(arrowLength.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (paddingLeftRight != null) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.asInstanceOf[js.Any])
    if (paddingTopBottom != null) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWidgetTooltip]
  }
}

