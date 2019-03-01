package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Chart control.
  */
trait BootstrapClientChart extends BootstrapClientChartBase {
  /**
    * Fires when a chart zooming or scrolling ends.
    */
  var ZoomEnd: ASPxClientEvent[BootstrapClientChartZoomEndEventHandler[BootstrapClientChart]]
  /**
    * Fires when a chart zooming or scrolling begins.
    */
  var ZoomStart: ASPxClientEvent[BootstrapClientChartZoomStartEventHandler[BootstrapClientChart]]
}

object BootstrapClientChart {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    ArgumentAxisClick: ASPxClientEvent[
      BootstrapClientCoordinateSystemChartArgumentAxisClickEventHandler[BootstrapClientChartBase]
    ],
    Disposing: ASPxClientEvent[BootstrapUIWidgetDisposingEventHandler[BootstrapUIWidgetBase]],
    Done: ASPxClientEvent[BootstrapClientChartBaseDoneEventHandler[BootstrapClientChartBase]],
    Drawn: ASPxClientEvent[BootstrapUIWidgetDrawnEventHandler[BootstrapUIWidgetBase]],
    ExportTo: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    Exported: ASPxClientEvent[BootstrapUIWidgetExportedEventHandler[BootstrapUIWidgetBase]],
    Exporting: ASPxClientEvent[BootstrapUIWidgetExportingEventHandler[BootstrapUIWidgetBase]],
    FileSaving: ASPxClientEvent[BootstrapUIWidgetFileSavingEventHandler[BootstrapUIWidgetBase]],
    GetClientVisible: js.Function0[scala.Boolean],
    GetDataSource: js.Function0[js.Object],
    GetHeight: js.Function0[scala.Double],
    GetInstance: js.Function0[js.Object],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    IncidentOccurred: ASPxClientEvent[BootstrapUIWidgetErrorEventHandler[BootstrapUIWidgetBase]],
    Init: ASPxClientEvent[BootstrapUIWidgetInitializedEventHandler[BootstrapUIWidgetBase]],
    LegendClick: ASPxClientEvent[BootstrapClientChartBaseLegendClickEventHandler[BootstrapClientChartBase]],
    OptionChanged: ASPxClientEvent[BootstrapUIWidgetOptionChangedEventHandler[BootstrapUIWidgetBase]],
    PointClick: ASPxClientEvent[BootstrapClientChartBasePointClickEventHandler[BootstrapClientChartBase]],
    PointHoverChanged: ASPxClientEvent[BootstrapClientChartBasePointHoverChangedEventHandler[BootstrapClientChartBase]],
    PointSelectionChanged: ASPxClientEvent[
      BootstrapClientChartBasePointSelectionChangedEventHandler[BootstrapClientChartBase]
    ],
    Print: js.Function0[scala.Unit],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SeriesClick: ASPxClientEvent[
      BootstrapClientCoordinateSystemChartSeriesClickEventHandler[BootstrapClientChartBase]
    ],
    SeriesHoverChanged: ASPxClientEvent[
      BootstrapClientCoordinateSystemChartSeriesHoverChangedEventHandler[BootstrapClientChartBase]
    ],
    SeriesSelectionChanged: ASPxClientEvent[
      BootstrapClientCoordinateSystemChartSeriesSelectionChangedEventHandler[BootstrapClientChartBase]
    ],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetDataSource: js.Function1[js.Object, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetOptions: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    TooltipHidden: ASPxClientEvent[BootstrapClientChartBaseTooltipHiddenEventHandler[BootstrapClientChartBase]],
    TooltipShown: ASPxClientEvent[BootstrapClientChartBaseTooltipShownEventHandler[BootstrapClientChartBase]],
    ZoomEnd: ASPxClientEvent[BootstrapClientChartZoomEndEventHandler[BootstrapClientChart]],
    ZoomStart: ASPxClientEvent[BootstrapClientChartZoomStartEventHandler[BootstrapClientChart]],
    name: java.lang.String
  ): BootstrapClientChart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("ArgumentAxisClick")(ArgumentAxisClick)
    __obj.updateDynamic("Disposing")(Disposing)
    __obj.updateDynamic("Done")(Done)
    __obj.updateDynamic("Drawn")(Drawn)
    __obj.updateDynamic("ExportTo")(ExportTo)
    __obj.updateDynamic("Exported")(Exported)
    __obj.updateDynamic("Exporting")(Exporting)
    __obj.updateDynamic("FileSaving")(FileSaving)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetDataSource")(GetDataSource)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetInstance")(GetInstance)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("IncidentOccurred")(IncidentOccurred)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("LegendClick")(LegendClick)
    __obj.updateDynamic("OptionChanged")(OptionChanged)
    __obj.updateDynamic("PointClick")(PointClick)
    __obj.updateDynamic("PointHoverChanged")(PointHoverChanged)
    __obj.updateDynamic("PointSelectionChanged")(PointSelectionChanged)
    __obj.updateDynamic("Print")(Print)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SeriesClick")(SeriesClick)
    __obj.updateDynamic("SeriesHoverChanged")(SeriesHoverChanged)
    __obj.updateDynamic("SeriesSelectionChanged")(SeriesSelectionChanged)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetDataSource")(SetDataSource)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetOptions")(SetOptions)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("TooltipHidden")(TooltipHidden)
    __obj.updateDynamic("TooltipShown")(TooltipShown)
    __obj.updateDynamic("ZoomEnd")(ZoomEnd)
    __obj.updateDynamic("ZoomStart")(ZoomStart)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BootstrapClientChart]
  }
}

