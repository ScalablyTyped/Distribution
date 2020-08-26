package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Chart control.
  */
@js.native
trait BootstrapClientChart extends BootstrapClientChartBase {
  /**
    * Fires when a chart zooming or scrolling ends.
    */
  var ZoomEnd: ASPxClientEvent[BootstrapClientChartZoomEndEventHandler[BootstrapClientChart]] = js.native
  /**
    * Fires when a chart zooming or scrolling begins.
    */
  var ZoomStart: ASPxClientEvent[BootstrapClientChartZoomStartEventHandler[BootstrapClientChart]] = js.native
}

object BootstrapClientChart {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    ArgumentAxisClick: ASPxClientEvent[
      BootstrapClientCoordinateSystemChartArgumentAxisClickEventHandler[BootstrapClientChartBase]
    ],
    Disposing: ASPxClientEvent[BootstrapUIWidgetDisposingEventHandler[BootstrapUIWidgetBase]],
    Done: ASPxClientEvent[BootstrapClientChartBaseDoneEventHandler[BootstrapClientChartBase]],
    Drawn: ASPxClientEvent[BootstrapUIWidgetDrawnEventHandler[BootstrapUIWidgetBase]],
    ExportTo: (String, String) => Unit,
    Exported: ASPxClientEvent[BootstrapUIWidgetExportedEventHandler[BootstrapUIWidgetBase]],
    Exporting: ASPxClientEvent[BootstrapUIWidgetExportingEventHandler[BootstrapUIWidgetBase]],
    FileSaving: ASPxClientEvent[BootstrapUIWidgetFileSavingEventHandler[BootstrapUIWidgetBase]],
    GetClientVisible: () => Boolean,
    GetDataSource: () => js.Any,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetInstance: () => js.Any,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    IncidentOccurred: ASPxClientEvent[BootstrapUIWidgetErrorEventHandler[BootstrapUIWidgetBase]],
    Init: ASPxClientEvent[BootstrapUIWidgetInitializedEventHandler[BootstrapUIWidgetBase]],
    LegendClick: ASPxClientEvent[BootstrapClientChartBaseLegendClickEventHandler[BootstrapClientChartBase]],
    OptionChanged: ASPxClientEvent[BootstrapUIWidgetOptionChangedEventHandler[BootstrapUIWidgetBase]],
    PointClick: ASPxClientEvent[BootstrapClientChartBasePointClickEventHandler[BootstrapClientChartBase]],
    PointHoverChanged: ASPxClientEvent[BootstrapClientChartBasePointHoverChangedEventHandler[BootstrapClientChartBase]],
    PointSelectionChanged: ASPxClientEvent[
      BootstrapClientChartBasePointSelectionChangedEventHandler[BootstrapClientChartBase]
    ],
    Print: () => Unit,
    SendMessageToAssistiveTechnology: String => Unit,
    SeriesClick: ASPxClientEvent[
      BootstrapClientCoordinateSystemChartSeriesClickEventHandler[BootstrapClientChartBase]
    ],
    SeriesHoverChanged: ASPxClientEvent[
      BootstrapClientCoordinateSystemChartSeriesHoverChangedEventHandler[BootstrapClientChartBase]
    ],
    SeriesSelectionChanged: ASPxClientEvent[
      BootstrapClientCoordinateSystemChartSeriesSelectionChangedEventHandler[BootstrapClientChartBase]
    ],
    SetClientVisible: Boolean => Unit,
    SetDataSource: js.Any => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetOptions: js.Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    TooltipHidden: ASPxClientEvent[BootstrapClientChartBaseTooltipHiddenEventHandler[BootstrapClientChartBase]],
    TooltipShown: ASPxClientEvent[BootstrapClientChartBaseTooltipShownEventHandler[BootstrapClientChartBase]],
    ZoomEnd: ASPxClientEvent[BootstrapClientChartZoomEndEventHandler[BootstrapClientChart]],
    ZoomStart: ASPxClientEvent[BootstrapClientChartZoomStartEventHandler[BootstrapClientChart]],
    name: String
  ): BootstrapClientChart = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), ArgumentAxisClick = ArgumentAxisClick.asInstanceOf[js.Any], Disposing = Disposing.asInstanceOf[js.Any], Done = Done.asInstanceOf[js.Any], Drawn = Drawn.asInstanceOf[js.Any], ExportTo = js.Any.fromFunction2(ExportTo), Exported = Exported.asInstanceOf[js.Any], Exporting = Exporting.asInstanceOf[js.Any], FileSaving = FileSaving.asInstanceOf[js.Any], GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetDataSource = js.Any.fromFunction0(GetDataSource), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetInstance = js.Any.fromFunction0(GetInstance), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), IncidentOccurred = IncidentOccurred.asInstanceOf[js.Any], Init = Init.asInstanceOf[js.Any], LegendClick = LegendClick.asInstanceOf[js.Any], OptionChanged = OptionChanged.asInstanceOf[js.Any], PointClick = PointClick.asInstanceOf[js.Any], PointHoverChanged = PointHoverChanged.asInstanceOf[js.Any], PointSelectionChanged = PointSelectionChanged.asInstanceOf[js.Any], Print = js.Any.fromFunction0(Print), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SeriesClick = SeriesClick.asInstanceOf[js.Any], SeriesHoverChanged = SeriesHoverChanged.asInstanceOf[js.Any], SeriesSelectionChanged = SeriesSelectionChanged.asInstanceOf[js.Any], SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetDataSource = js.Any.fromFunction1(SetDataSource), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetOptions = js.Any.fromFunction1(SetOptions), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), TooltipHidden = TooltipHidden.asInstanceOf[js.Any], TooltipShown = TooltipShown.asInstanceOf[js.Any], ZoomEnd = ZoomEnd.asInstanceOf[js.Any], ZoomStart = ZoomStart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientChart]
  }
  @scala.inline
  implicit class BootstrapClientChartOps[Self <: BootstrapClientChart] (val x: Self) extends AnyVal {
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
    def setZoomEnd(value: ASPxClientEvent[BootstrapClientChartZoomEndEventHandler[BootstrapClientChart]]): Self = this.set("ZoomEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomStart(value: ASPxClientEvent[BootstrapClientChartZoomStartEventHandler[BootstrapClientChart]]): Self = this.set("ZoomStart", value.asInstanceOf[js.Any])
  }
  
}

