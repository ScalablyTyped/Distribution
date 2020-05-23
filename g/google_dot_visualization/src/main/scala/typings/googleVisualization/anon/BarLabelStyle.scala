package typings.googleVisualization.anon

import typings.googleVisualization.google.visualization.LabelStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarLabelStyle extends js.Object {
  var barLabelStyle: js.UndefOr[LabelStyle] = js.undefined
  var colorByRowLabel: js.UndefOr[Boolean] = js.undefined
  var groupByRowLabel: js.UndefOr[Boolean] = js.undefined
  var rowLabelStyle: js.UndefOr[LabelStyle] = js.undefined
  var showRowLabels: js.UndefOr[Boolean] = js.undefined
  var singleColor: js.UndefOr[String] = js.undefined
}

object BarLabelStyle {
  @scala.inline
  def apply(
    barLabelStyle: LabelStyle = null,
    colorByRowLabel: js.UndefOr[Boolean] = js.undefined,
    groupByRowLabel: js.UndefOr[Boolean] = js.undefined,
    rowLabelStyle: LabelStyle = null,
    showRowLabels: js.UndefOr[Boolean] = js.undefined,
    singleColor: String = null
  ): BarLabelStyle = {
    val __obj = js.Dynamic.literal()
    if (barLabelStyle != null) __obj.updateDynamic("barLabelStyle")(barLabelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(colorByRowLabel)) __obj.updateDynamic("colorByRowLabel")(colorByRowLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupByRowLabel)) __obj.updateDynamic("groupByRowLabel")(groupByRowLabel.get.asInstanceOf[js.Any])
    if (rowLabelStyle != null) __obj.updateDynamic("rowLabelStyle")(rowLabelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowLabels)) __obj.updateDynamic("showRowLabels")(showRowLabels.get.asInstanceOf[js.Any])
    if (singleColor != null) __obj.updateDynamic("singleColor")(singleColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarLabelStyle]
  }
}

