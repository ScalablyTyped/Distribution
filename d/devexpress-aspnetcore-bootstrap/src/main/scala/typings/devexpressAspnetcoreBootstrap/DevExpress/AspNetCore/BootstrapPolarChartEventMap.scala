package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapPolarChartEventMap extends ControlEventMap {
  var argumentAxisClick: BootstrapChartElementClickEventArgs = js.native
  var disposing: BootstrapChartEventArgsBase = js.native
  var done: BootstrapChartEventArgsBase = js.native
  var drawn: BootstrapChartEventArgsBase = js.native
  var exported: BootstrapChartEventArgsBase = js.native
  var exporting: BootstrapChartExportEventArgs = js.native
  var fileSaving: BootstrapChartExportEventArgs = js.native
  var incidentOccurred: BootstrapChartErrorEventArgs = js.native
  @JSName("init")
  var init_BootstrapPolarChartEventMap: BootstrapChartEventArgsBase = js.native
  var legendClick: BootstrapChartElementClickEventArgs = js.native
  var optionChanged: BootstrapChartOptionChangedEventArgs = js.native
  var pointClick: BootstrapChartElementClickEventArgs = js.native
  var pointHoverChanged: BootstrapChartElementActionEventArgs = js.native
  var pointSelectionChanged: BootstrapChartElementActionEventArgs = js.native
  var seriesClick: BootstrapChartElementClickEventArgs = js.native
  var seriesHoverChanged: BootstrapChartElementActionEventArgs = js.native
  var seriesSelectionChanged: BootstrapChartElementActionEventArgs = js.native
  var tooltipHidden: BootstrapChartElementActionEventArgs = js.native
  var tooltipShown: BootstrapChartElementActionEventArgs = js.native
}

object BootstrapPolarChartEventMap {
  @scala.inline
  def apply(
    argumentAxisClick: BootstrapChartElementClickEventArgs,
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
    seriesClick: BootstrapChartElementClickEventArgs,
    seriesHoverChanged: BootstrapChartElementActionEventArgs,
    seriesSelectionChanged: BootstrapChartElementActionEventArgs,
    tooltipHidden: BootstrapChartElementActionEventArgs,
    tooltipShown: BootstrapChartElementActionEventArgs
  ): BootstrapPolarChartEventMap = {
    val __obj = js.Dynamic.literal(argumentAxisClick = argumentAxisClick.asInstanceOf[js.Any], disposing = disposing.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], drawn = drawn.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], exporting = exporting.asInstanceOf[js.Any], fileSaving = fileSaving.asInstanceOf[js.Any], incidentOccurred = incidentOccurred.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], legendClick = legendClick.asInstanceOf[js.Any], optionChanged = optionChanged.asInstanceOf[js.Any], pointClick = pointClick.asInstanceOf[js.Any], pointHoverChanged = pointHoverChanged.asInstanceOf[js.Any], pointSelectionChanged = pointSelectionChanged.asInstanceOf[js.Any], seriesClick = seriesClick.asInstanceOf[js.Any], seriesHoverChanged = seriesHoverChanged.asInstanceOf[js.Any], seriesSelectionChanged = seriesSelectionChanged.asInstanceOf[js.Any], tooltipHidden = tooltipHidden.asInstanceOf[js.Any], tooltipShown = tooltipShown.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapPolarChartEventMap]
  }
  @scala.inline
  implicit class BootstrapPolarChartEventMapOps[Self <: BootstrapPolarChartEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgumentAxisClick(value: BootstrapChartElementClickEventArgs): Self = this.set("argumentAxisClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisposing(value: BootstrapChartEventArgsBase): Self = this.set("disposing", value.asInstanceOf[js.Any])
    @scala.inline
    def setDone(value: BootstrapChartEventArgsBase): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawn(value: BootstrapChartEventArgsBase): Self = this.set("drawn", value.asInstanceOf[js.Any])
    @scala.inline
    def setExported(value: BootstrapChartEventArgsBase): Self = this.set("exported", value.asInstanceOf[js.Any])
    @scala.inline
    def setExporting(value: BootstrapChartExportEventArgs): Self = this.set("exporting", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSaving(value: BootstrapChartExportEventArgs): Self = this.set("fileSaving", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncidentOccurred(value: BootstrapChartErrorEventArgs): Self = this.set("incidentOccurred", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: BootstrapChartEventArgsBase): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegendClick(value: BootstrapChartElementClickEventArgs): Self = this.set("legendClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionChanged(value: BootstrapChartOptionChangedEventArgs): Self = this.set("optionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointClick(value: BootstrapChartElementClickEventArgs): Self = this.set("pointClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointHoverChanged(value: BootstrapChartElementActionEventArgs): Self = this.set("pointHoverChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointSelectionChanged(value: BootstrapChartElementActionEventArgs): Self = this.set("pointSelectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeriesClick(value: BootstrapChartElementClickEventArgs): Self = this.set("seriesClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeriesHoverChanged(value: BootstrapChartElementActionEventArgs): Self = this.set("seriesHoverChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeriesSelectionChanged(value: BootstrapChartElementActionEventArgs): Self = this.set("seriesSelectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipHidden(value: BootstrapChartElementActionEventArgs): Self = this.set("tooltipHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipShown(value: BootstrapChartElementActionEventArgs): Self = this.set("tooltipShown", value.asInstanceOf[js.Any])
  }
  
}

