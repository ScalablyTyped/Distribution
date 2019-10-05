package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapPieChartEventMap extends ControlEventMap {
  var disposing: BootstrapChartEventArgsBase
  var done: BootstrapChartEventArgsBase
  var drawn: BootstrapChartEventArgsBase
  var exported: BootstrapChartEventArgsBase
  var exporting: BootstrapChartExportEventArgs
  var fileSaving: BootstrapChartExportEventArgs
  var incidentOccurred: BootstrapChartErrorEventArgs
  @JSName("init")
  var init_BootstrapPieChartEventMap: BootstrapChartEventArgsBase
  var legendClick: BootstrapChartElementClickEventArgs
  var optionChanged: BootstrapChartOptionChangedEventArgs
  var pointClick: BootstrapChartElementClickEventArgs
  var pointHoverChanged: BootstrapChartElementActionEventArgs
  var pointSelectionChanged: BootstrapChartElementActionEventArgs
  var tooltipHidden: BootstrapChartElementActionEventArgs
  var tooltipShown: BootstrapChartElementActionEventArgs
}

object BootstrapPieChartEventMap {
  @scala.inline
  def apply(
    disposing: BootstrapChartEventArgsBase,
    done: BootstrapChartEventArgsBase,
    drawn: BootstrapChartEventArgsBase,
    exported: BootstrapChartEventArgsBase,
    exporting: BootstrapChartExportEventArgs,
    fileSaving: BootstrapChartExportEventArgs,
    incidentOccurred: BootstrapChartErrorEventArgs,
    init: BootstrapChartEventArgsBase,
    legendClick: BootstrapChartElementClickEventArgs,
    optionChanged: BootstrapChartOptionChangedEventArgs,
    pointClick: BootstrapChartElementClickEventArgs,
    pointHoverChanged: BootstrapChartElementActionEventArgs,
    pointSelectionChanged: BootstrapChartElementActionEventArgs,
    tooltipHidden: BootstrapChartElementActionEventArgs,
    tooltipShown: BootstrapChartElementActionEventArgs
  ): BootstrapPieChartEventMap = {
    val __obj = js.Dynamic.literal(disposing = disposing, done = done, drawn = drawn, exported = exported, exporting = exporting, fileSaving = fileSaving, incidentOccurred = incidentOccurred, init = init, legendClick = legendClick, optionChanged = optionChanged, pointClick = pointClick, pointHoverChanged = pointHoverChanged, pointSelectionChanged = pointSelectionChanged, tooltipHidden = tooltipHidden, tooltipShown = tooltipShown)
  
    __obj.asInstanceOf[BootstrapPieChartEventMap]
  }
}

