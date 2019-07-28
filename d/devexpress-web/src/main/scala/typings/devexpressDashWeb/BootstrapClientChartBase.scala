package typings.devexpressDashWeb

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
    GetDataSource: () => js.Object,
    GetHeight: () => Double,
    GetInstance: () => js.Object,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
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
    SetDataSource: js.Object => Unit,
    SetHeight: Double => Unit,
    SetOptions: js.Object => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    TooltipHidden: ASPxClientEvent[BootstrapClientChartBaseTooltipHiddenEventHandler[BootstrapClientChartBase]],
    TooltipShown: ASPxClientEvent[BootstrapClientChartBaseTooltipShownEventHandler[BootstrapClientChartBase]],
    name: String
  ): BootstrapClientChartBase = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), ArgumentAxisClick = ArgumentAxisClick, Disposing = Disposing, Done = Done, Drawn = Drawn, ExportTo = js.Any.fromFunction2(ExportTo), Exported = Exported, Exporting = Exporting, FileSaving = FileSaving, GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetDataSource = js.Any.fromFunction0(GetDataSource), GetHeight = js.Any.fromFunction0(GetHeight), GetInstance = js.Any.fromFunction0(GetInstance), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), IncidentOccurred = IncidentOccurred, Init = Init, LegendClick = LegendClick, OptionChanged = OptionChanged, PointClick = PointClick, PointHoverChanged = PointHoverChanged, PointSelectionChanged = PointSelectionChanged, Print = js.Any.fromFunction0(Print), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SeriesClick = SeriesClick, SeriesHoverChanged = SeriesHoverChanged, SeriesSelectionChanged = SeriesSelectionChanged, SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetDataSource = js.Any.fromFunction1(SetDataSource), SetHeight = js.Any.fromFunction1(SetHeight), SetOptions = js.Any.fromFunction1(SetOptions), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), TooltipHidden = TooltipHidden, TooltipShown = TooltipShown, name = name)
  
    __obj.asInstanceOf[BootstrapClientChartBase]
  }
}

