package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal(disposing = disposing, drawn = drawn, exported = exported, exporting = exporting, fileSaving = fileSaving, incidentOccurred = incidentOccurred, init = init, optionChanged = optionChanged, tooltipHidden = tooltipHidden, tooltipShown = tooltipShown)
  
    __obj.asInstanceOf[BootstrapSparklineEventMap]
  }
}

