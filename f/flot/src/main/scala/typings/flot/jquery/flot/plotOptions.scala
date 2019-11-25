package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait plotOptions extends js.Object {
  var colors: js.UndefOr[js.Array[_]] = js.undefined
  var grid: js.UndefOr[gridOptions] = js.undefined
  var hooks: js.UndefOr[typings.flot.jquery.flot.hooks] = js.undefined
  var interaction: js.UndefOr[typings.flot.jquery.flot.interaction] = js.undefined
  var legend: js.UndefOr[legendOptions] = js.undefined
  var series: js.UndefOr[seriesOptions] = js.undefined
  var xaxes: js.UndefOr[js.Array[axisOptions]] = js.undefined
  var xaxis: js.UndefOr[axisOptions] = js.undefined
  var yaxes: js.UndefOr[js.Array[axisOptions]] = js.undefined
  var yaxis: js.UndefOr[axisOptions] = js.undefined
}

object plotOptions {
  @scala.inline
  def apply(
    colors: js.Array[_] = null,
    grid: gridOptions = null,
    hooks: hooks = null,
    interaction: interaction = null,
    legend: legendOptions = null,
    series: seriesOptions = null,
    xaxes: js.Array[axisOptions] = null,
    xaxis: axisOptions = null,
    yaxes: js.Array[axisOptions] = null,
    yaxis: axisOptions = null
  ): plotOptions = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (interaction != null) __obj.updateDynamic("interaction")(interaction.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (xaxes != null) __obj.updateDynamic("xaxes")(xaxes.asInstanceOf[js.Any])
    if (xaxis != null) __obj.updateDynamic("xaxis")(xaxis.asInstanceOf[js.Any])
    if (yaxes != null) __obj.updateDynamic("yaxes")(yaxes.asInstanceOf[js.Any])
    if (yaxis != null) __obj.updateDynamic("yaxis")(yaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[plotOptions]
  }
}

