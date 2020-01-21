package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(disposing = disposing.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], drawn = drawn.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], exporting = exporting.asInstanceOf[js.Any], fileSaving = fileSaving.asInstanceOf[js.Any], incidentOccurred = incidentOccurred.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], legendClick = legendClick.asInstanceOf[js.Any], optionChanged = optionChanged.asInstanceOf[js.Any], pointClick = pointClick.asInstanceOf[js.Any], pointHoverChanged = pointHoverChanged.asInstanceOf[js.Any], pointSelectionChanged = pointSelectionChanged.asInstanceOf[js.Any], tooltipHidden = tooltipHidden.asInstanceOf[js.Any], tooltipShown = tooltipShown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BootstrapPieChartEventMap]
  }
}

