package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait gridOptions extends js.Object {
  var aboveData: js.UndefOr[Boolean] = js.undefined
  var autoHighlight: js.UndefOr[Boolean] = js.undefined
  var axisMargin: js.UndefOr[Double] = js.undefined
                  // color
  var backgroundColor: js.UndefOr[js.Any] = js.undefined
            // number or width object
  var borderColor: js.UndefOr[js.Any] = js.undefined
               //array of markings or (fn: axes -> array of markings)
  var borderWidth: js.UndefOr[js.Any] = js.undefined
         // or null
  var clickable: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[js.Any] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
                  // number or margin object
  var labelMargin: js.UndefOr[Double] = js.undefined
        //color/gradient or null
  var margin: js.UndefOr[js.Any] = js.undefined
  var markings: js.UndefOr[js.Any] = js.undefined
  var markingsColor: js.UndefOr[js.Any] = js.undefined
  var markingsLineWidth: js.UndefOr[Double] = js.undefined
            // color or null
  var minBorderMargin: js.UndefOr[Double] = js.undefined
  var mouseActiveRadius: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var tickColor: js.UndefOr[js.Any] = js.undefined
}

object gridOptions {
  @scala.inline
  def apply(
    aboveData: js.UndefOr[Boolean] = js.undefined,
    autoHighlight: js.UndefOr[Boolean] = js.undefined,
    axisMargin: js.UndefOr[Double] = js.undefined,
    backgroundColor: js.Any = null,
    borderColor: js.Any = null,
    borderWidth: js.Any = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    color: js.Any = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    labelMargin: js.UndefOr[Double] = js.undefined,
    margin: js.Any = null,
    markings: js.Any = null,
    markingsColor: js.Any = null,
    markingsLineWidth: js.UndefOr[Double] = js.undefined,
    minBorderMargin: js.UndefOr[Double] = js.undefined,
    mouseActiveRadius: js.UndefOr[Double] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    tickColor: js.Any = null
  ): gridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aboveData)) __obj.updateDynamic("aboveData")(aboveData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHighlight)) __obj.updateDynamic("autoHighlight")(autoHighlight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(axisMargin)) __obj.updateDynamic("axisMargin")(axisMargin.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelMargin)) __obj.updateDynamic("labelMargin")(labelMargin.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markings != null) __obj.updateDynamic("markings")(markings.asInstanceOf[js.Any])
    if (markingsColor != null) __obj.updateDynamic("markingsColor")(markingsColor.asInstanceOf[js.Any])
    if (!js.isUndefined(markingsLineWidth)) __obj.updateDynamic("markingsLineWidth")(markingsLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minBorderMargin)) __obj.updateDynamic("minBorderMargin")(minBorderMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseActiveRadius)) __obj.updateDynamic("mouseActiveRadius")(mouseActiveRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (tickColor != null) __obj.updateDynamic("tickColor")(tickColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[gridOptions]
  }
}

