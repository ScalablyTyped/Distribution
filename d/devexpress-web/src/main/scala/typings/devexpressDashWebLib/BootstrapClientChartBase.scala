package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapChartBase class.
  */
trait BootstrapClientChartBase extends BootstrapUIWidgetBase {
  /**
    * Fires when a user clicks a label on the argument axis.
    */
  var ArgumentAxisClick: ASPxClientEvent[
    BootstrapClientCoordinateSystemChartArgumentAxisClickEventHandler[BootstrapClientChartBase]
  ]
  /**
    * Fires when the Series and Points chart elements are ready to be accessed.
    */
  var Done: ASPxClientEvent[BootstrapClientChartBaseDoneEventHandler[BootstrapClientChartBase]]
  /**
    * Fires when an item on the chart legend is clicked.
    */
  var LegendClick: ASPxClientEvent[BootstrapClientChartBaseLegendClickEventHandler[BootstrapClientChartBase]]
  /**
    * Fires when a user clicks a series point.
    */
  var PointClick: ASPxClientEvent[BootstrapClientChartBasePointClickEventHandler[BootstrapClientChartBase]]
  /**
    * Fires when the hover state of a series point has been changed.
    */
  var PointHoverChanged: ASPxClientEvent[BootstrapClientChartBasePointHoverChangedEventHandler[BootstrapClientChartBase]]
  /**
    * Fires when the selection state of a series point has been changed.
    */
  var PointSelectionChanged: ASPxClientEvent[
    BootstrapClientChartBasePointSelectionChangedEventHandler[BootstrapClientChartBase]
  ]
  /**
    * Fires when a user clicks a series.
    */
  var SeriesClick: ASPxClientEvent[
    BootstrapClientCoordinateSystemChartSeriesClickEventHandler[BootstrapClientChartBase]
  ]
  /**
    * Fires when the hover state of a series has been changed.
    */
  var SeriesHoverChanged: ASPxClientEvent[
    BootstrapClientCoordinateSystemChartSeriesHoverChangedEventHandler[BootstrapClientChartBase]
  ]
  /**
    * Fires when the selection state of a series has been changed.
    */
  var SeriesSelectionChanged: ASPxClientEvent[
    BootstrapClientCoordinateSystemChartSeriesSelectionChangedEventHandler[BootstrapClientChartBase]
  ]
  /**
    * Fires when a point's tooltip becomes hidden.
    */
  var TooltipHidden: ASPxClientEvent[BootstrapClientChartBaseTooltipHiddenEventHandler[BootstrapClientChartBase]]
  /**
    * Fires when a point's tooltip appears.
    */
  var TooltipShown: ASPxClientEvent[BootstrapClientChartBaseTooltipShownEventHandler[BootstrapClientChartBase]]
}

object BootstrapClientChartBase {
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
    name: java.lang.String
  ): BootstrapClientChartBase = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, ArgumentAxisClick = ArgumentAxisClick, Disposing = Disposing, Done = Done, Drawn = Drawn, ExportTo = ExportTo, Exported = Exported, Exporting = Exporting, FileSaving = FileSaving, GetClientVisible = GetClientVisible, GetDataSource = GetDataSource, GetHeight = GetHeight, GetInstance = GetInstance, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, IncidentOccurred = IncidentOccurred, Init = Init, LegendClick = LegendClick, OptionChanged = OptionChanged, PointClick = PointClick, PointHoverChanged = PointHoverChanged, PointSelectionChanged = PointSelectionChanged, Print = Print, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SeriesClick = SeriesClick, SeriesHoverChanged = SeriesHoverChanged, SeriesSelectionChanged = SeriesSelectionChanged, SetClientVisible = SetClientVisible, SetDataSource = SetDataSource, SetHeight = SetHeight, SetOptions = SetOptions, SetVisible = SetVisible, SetWidth = SetWidth, TooltipHidden = TooltipHidden, TooltipShown = TooltipShown, name = name)
  
    __obj.asInstanceOf[BootstrapClientChartBase]
  }
}

