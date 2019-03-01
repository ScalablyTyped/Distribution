package typings
package googleDotVisualizationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BarLabelStyle extends js.Object {
  var barLabelStyle: js.UndefOr[googleDotVisualizationLib.googleNs.visualizationNs.LabelStyle] = js.undefined
  var colorByRowLabel: js.UndefOr[scala.Boolean] = js.undefined
  var groupByRowLabel: js.UndefOr[scala.Boolean] = js.undefined
  var rowLabelStyle: js.UndefOr[googleDotVisualizationLib.googleNs.visualizationNs.LabelStyle] = js.undefined
  var showRowLabels: js.UndefOr[scala.Boolean] = js.undefined
  var singleColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BarLabelStyle {
  @scala.inline
  def apply(
    barLabelStyle: googleDotVisualizationLib.googleNs.visualizationNs.LabelStyle = null,
    colorByRowLabel: js.UndefOr[scala.Boolean] = js.undefined,
    groupByRowLabel: js.UndefOr[scala.Boolean] = js.undefined,
    rowLabelStyle: googleDotVisualizationLib.googleNs.visualizationNs.LabelStyle = null,
    showRowLabels: js.UndefOr[scala.Boolean] = js.undefined,
    singleColor: java.lang.String = null
  ): Anon_BarLabelStyle = {
    val __obj = js.Dynamic.literal()
    if (barLabelStyle != null) __obj.updateDynamic("barLabelStyle")(barLabelStyle)
    if (!js.isUndefined(colorByRowLabel)) __obj.updateDynamic("colorByRowLabel")(colorByRowLabel)
    if (!js.isUndefined(groupByRowLabel)) __obj.updateDynamic("groupByRowLabel")(groupByRowLabel)
    if (rowLabelStyle != null) __obj.updateDynamic("rowLabelStyle")(rowLabelStyle)
    if (!js.isUndefined(showRowLabels)) __obj.updateDynamic("showRowLabels")(showRowLabels)
    if (singleColor != null) __obj.updateDynamic("singleColor")(singleColor)
    __obj.asInstanceOf[Anon_BarLabelStyle]
  }
}

