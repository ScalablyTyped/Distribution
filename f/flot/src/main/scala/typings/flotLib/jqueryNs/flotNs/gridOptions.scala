package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait gridOptions extends js.Object {
  var aboveData: js.UndefOr[scala.Boolean] = js.undefined
  var autoHighlight: js.UndefOr[scala.Boolean] = js.undefined
  var axisMargin: js.UndefOr[scala.Double] = js.undefined
                  // color
  var backgroundColor: js.UndefOr[js.Any] = js.undefined
            // number or width object
  var borderColor: js.UndefOr[js.Any] = js.undefined
               //array of markings or (fn: axes -> array of markings)
  var borderWidth: js.UndefOr[js.Any] = js.undefined
         // or null
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[js.Any] = js.undefined
  var hoverable: js.UndefOr[scala.Boolean] = js.undefined
                  // number or margin object
  var labelMargin: js.UndefOr[scala.Double] = js.undefined
        //color/gradient or null
  var margin: js.UndefOr[js.Any] = js.undefined
  var markings: js.UndefOr[js.Any] = js.undefined
  var markingsColor: js.UndefOr[js.Any] = js.undefined
  var markingsLineWidth: js.UndefOr[scala.Double] = js.undefined
            // color or null
  var minBorderMargin: js.UndefOr[scala.Double] = js.undefined
  var mouseActiveRadius: js.UndefOr[scala.Double] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var tickColor: js.UndefOr[js.Any] = js.undefined
}

object gridOptions {
  @scala.inline
  def apply(
    aboveData: js.UndefOr[scala.Boolean] = js.undefined,
    autoHighlight: js.UndefOr[scala.Boolean] = js.undefined,
    axisMargin: scala.Int | scala.Double = null,
    backgroundColor: js.Any = null,
    borderColor: js.Any = null,
    borderWidth: js.Any = null,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    color: js.Any = null,
    hoverable: js.UndefOr[scala.Boolean] = js.undefined,
    labelMargin: scala.Int | scala.Double = null,
    margin: js.Any = null,
    markings: js.Any = null,
    markingsColor: js.Any = null,
    markingsLineWidth: scala.Int | scala.Double = null,
    minBorderMargin: scala.Int | scala.Double = null,
    mouseActiveRadius: scala.Int | scala.Double = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    tickColor: js.Any = null
  ): gridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aboveData)) __obj.updateDynamic("aboveData")(aboveData)
    if (!js.isUndefined(autoHighlight)) __obj.updateDynamic("autoHighlight")(autoHighlight)
    if (axisMargin != null) __obj.updateDynamic("axisMargin")(axisMargin.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable)
    if (labelMargin != null) __obj.updateDynamic("labelMargin")(labelMargin.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (markings != null) __obj.updateDynamic("markings")(markings)
    if (markingsColor != null) __obj.updateDynamic("markingsColor")(markingsColor)
    if (markingsLineWidth != null) __obj.updateDynamic("markingsLineWidth")(markingsLineWidth.asInstanceOf[js.Any])
    if (minBorderMargin != null) __obj.updateDynamic("minBorderMargin")(minBorderMargin.asInstanceOf[js.Any])
    if (mouseActiveRadius != null) __obj.updateDynamic("mouseActiveRadius")(mouseActiveRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor)
    __obj.asInstanceOf[gridOptions]
  }
}

