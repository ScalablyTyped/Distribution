package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapSparklineEventMap extends ControlEventMap {
  var disposing: BootstrapChartEventArgsBase
  var drawn: BootstrapChartEventArgsBase
  var exported: BootstrapChartEventArgsBase
  var exporting: BootstrapChartExportEventArgs
  var fileSaving: BootstrapChartExportEventArgs
  var incidentOccurred: BootstrapChartErrorEventArgs
  @JSName("init")
  var init_BootstrapSparklineEventMap: BootstrapChartEventArgsBase
  var optionChanged: BootstrapChartOptionChangedEventArgs
  var tooltipHidden: BootstrapChartEventArgsBase
  var tooltipShown: BootstrapChartEventArgsBase
}

object BootstrapSparklineEventMap {
  @scala.inline
  def apply(
    disposing: BootstrapChartEventArgsBase,
    drawn: BootstrapChartEventArgsBase,
    exported: BootstrapChartEventArgsBase,
    exporting: BootstrapChartExportEventArgs,
    fileSaving: BootstrapChartExportEventArgs,
    incidentOccurred: BootstrapChartErrorEventArgs,
    init: BootstrapChartEventArgsBase,
    optionChanged: BootstrapChartOptionChangedEventArgs,
    tooltipHidden: BootstrapChartEventArgsBase,
    tooltipShown: BootstrapChartEventArgsBase
  ): BootstrapSparklineEventMap = {
    val __obj = js.Dynamic.literal(disposing = disposing.asInstanceOf[js.Any], drawn = drawn.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], exporting = exporting.asInstanceOf[js.Any], fileSaving = fileSaving.asInstanceOf[js.Any], incidentOccurred = incidentOccurred.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], optionChanged = optionChanged.asInstanceOf[js.Any], tooltipHidden = tooltipHidden.asInstanceOf[js.Any], tooltipShown = tooltipShown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BootstrapSparklineEventMap]
  }
}

