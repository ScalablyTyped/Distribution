package typings
package flexmonsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveMeasure extends js.Object {
  var activeMeasure: js.UndefOr[flexmonsterLib.flexmonsterMod.FlexmonsterNs.MeasureObject] = js.undefined
  var activeTupleIndex: js.UndefOr[scala.Double] = js.undefined
  var autoRange: js.UndefOr[scala.Boolean] = js.undefined
  var labelsHierarchy: js.UndefOr[java.lang.String] = js.undefined
  var multipleMeasures: js.UndefOr[scala.Boolean] = js.undefined
  var oneLevel: js.UndefOr[scala.Boolean] = js.undefined
  var pieDataIndex: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var reversedAxes: js.UndefOr[scala.Boolean] = js.undefined
  var showAllLabels: js.UndefOr[scala.Boolean] = js.undefined
  var showDataLabels: js.UndefOr[scala.Boolean] = js.undefined
  var showFilter: js.UndefOr[scala.Boolean] = js.undefined
  var showLegend: js.UndefOr[scala.Boolean] = js.undefined
  var showLegendButton: js.UndefOr[scala.Boolean] = js.undefined
  var showMeasures: js.UndefOr[scala.Boolean] = js.undefined
  var showOneMeasureSelection: js.UndefOr[scala.Boolean] = js.undefined
  var showWarning: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ActiveMeasure {
  @scala.inline
  def apply(
    activeMeasure: flexmonsterLib.flexmonsterMod.FlexmonsterNs.MeasureObject = null,
    activeTupleIndex: scala.Int | scala.Double = null,
    autoRange: js.UndefOr[scala.Boolean] = js.undefined,
    labelsHierarchy: java.lang.String = null,
    multipleMeasures: js.UndefOr[scala.Boolean] = js.undefined,
    oneLevel: js.UndefOr[scala.Boolean] = js.undefined,
    pieDataIndex: java.lang.String = null,
    position: java.lang.String = null,
    reversedAxes: js.UndefOr[scala.Boolean] = js.undefined,
    showAllLabels: js.UndefOr[scala.Boolean] = js.undefined,
    showDataLabels: js.UndefOr[scala.Boolean] = js.undefined,
    showFilter: js.UndefOr[scala.Boolean] = js.undefined,
    showLegend: js.UndefOr[scala.Boolean] = js.undefined,
    showLegendButton: js.UndefOr[scala.Boolean] = js.undefined,
    showMeasures: js.UndefOr[scala.Boolean] = js.undefined,
    showOneMeasureSelection: js.UndefOr[scala.Boolean] = js.undefined,
    showWarning: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_ActiveMeasure = {
    val __obj = js.Dynamic.literal()
    if (activeMeasure != null) __obj.updateDynamic("activeMeasure")(activeMeasure)
    if (activeTupleIndex != null) __obj.updateDynamic("activeTupleIndex")(activeTupleIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRange)) __obj.updateDynamic("autoRange")(autoRange)
    if (labelsHierarchy != null) __obj.updateDynamic("labelsHierarchy")(labelsHierarchy)
    if (!js.isUndefined(multipleMeasures)) __obj.updateDynamic("multipleMeasures")(multipleMeasures)
    if (!js.isUndefined(oneLevel)) __obj.updateDynamic("oneLevel")(oneLevel)
    if (pieDataIndex != null) __obj.updateDynamic("pieDataIndex")(pieDataIndex)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(reversedAxes)) __obj.updateDynamic("reversedAxes")(reversedAxes)
    if (!js.isUndefined(showAllLabels)) __obj.updateDynamic("showAllLabels")(showAllLabels)
    if (!js.isUndefined(showDataLabels)) __obj.updateDynamic("showDataLabels")(showDataLabels)
    if (!js.isUndefined(showFilter)) __obj.updateDynamic("showFilter")(showFilter)
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend)
    if (!js.isUndefined(showLegendButton)) __obj.updateDynamic("showLegendButton")(showLegendButton)
    if (!js.isUndefined(showMeasures)) __obj.updateDynamic("showMeasures")(showMeasures)
    if (!js.isUndefined(showOneMeasureSelection)) __obj.updateDynamic("showOneMeasureSelection")(showOneMeasureSelection)
    if (!js.isUndefined(showWarning)) __obj.updateDynamic("showWarning")(showWarning)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ActiveMeasure]
  }
}

