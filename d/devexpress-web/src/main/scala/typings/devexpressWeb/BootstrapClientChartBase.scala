package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapChartBase class.
  */
trait BootstrapClientChartBase
  extends StObject
     with BootstrapUIWidgetBase {
  
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
  
  inline def apply(
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
    GetDataSource: () => Any,
    GetEnabled: () => Boolean,
    GetHeight: () => Double,
    GetInstance: () => Any,
    GetMainElement: () => Any,
    GetParentControl: () => Any,
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
    SetDataSource: Any => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetOptions: Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    TooltipHidden: ASPxClientEvent[BootstrapClientChartBaseTooltipHiddenEventHandler[BootstrapClientChartBase]],
    TooltipShown: ASPxClientEvent[BootstrapClientChartBaseTooltipShownEventHandler[BootstrapClientChartBase]],
    name: String
  ): BootstrapClientChartBase = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), ArgumentAxisClick = ArgumentAxisClick.asInstanceOf[js.Any], Disposing = Disposing.asInstanceOf[js.Any], Done = Done.asInstanceOf[js.Any], Drawn = Drawn.asInstanceOf[js.Any], ExportTo = js.Any.fromFunction2(ExportTo), Exported = Exported.asInstanceOf[js.Any], Exporting = Exporting.asInstanceOf[js.Any], FileSaving = FileSaving.asInstanceOf[js.Any], GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetDataSource = js.Any.fromFunction0(GetDataSource), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetInstance = js.Any.fromFunction0(GetInstance), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), IncidentOccurred = IncidentOccurred.asInstanceOf[js.Any], Init = Init.asInstanceOf[js.Any], LegendClick = LegendClick.asInstanceOf[js.Any], OptionChanged = OptionChanged.asInstanceOf[js.Any], PointClick = PointClick.asInstanceOf[js.Any], PointHoverChanged = PointHoverChanged.asInstanceOf[js.Any], PointSelectionChanged = PointSelectionChanged.asInstanceOf[js.Any], Print = js.Any.fromFunction0(Print), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SeriesClick = SeriesClick.asInstanceOf[js.Any], SeriesHoverChanged = SeriesHoverChanged.asInstanceOf[js.Any], SeriesSelectionChanged = SeriesSelectionChanged.asInstanceOf[js.Any], SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetDataSource = js.Any.fromFunction1(SetDataSource), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetOptions = js.Any.fromFunction1(SetOptions), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), TooltipHidden = TooltipHidden.asInstanceOf[js.Any], TooltipShown = TooltipShown.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientChartBase]
  }
  
  extension [Self <: BootstrapClientChartBase](x: Self) {
    
    inline def setArgumentAxisClick(
      value: ASPxClientEvent[
          BootstrapClientCoordinateSystemChartArgumentAxisClickEventHandler[BootstrapClientChartBase]
        ]
    ): Self = StObject.set(x, "ArgumentAxisClick", value.asInstanceOf[js.Any])
    
    inline def setDone(value: ASPxClientEvent[BootstrapClientChartBaseDoneEventHandler[BootstrapClientChartBase]]): Self = StObject.set(x, "Done", value.asInstanceOf[js.Any])
    
    inline def setLegendClick(value: ASPxClientEvent[BootstrapClientChartBaseLegendClickEventHandler[BootstrapClientChartBase]]): Self = StObject.set(x, "LegendClick", value.asInstanceOf[js.Any])
    
    inline def setPointClick(value: ASPxClientEvent[BootstrapClientChartBasePointClickEventHandler[BootstrapClientChartBase]]): Self = StObject.set(x, "PointClick", value.asInstanceOf[js.Any])
    
    inline def setPointHoverChanged(
      value: ASPxClientEvent[BootstrapClientChartBasePointHoverChangedEventHandler[BootstrapClientChartBase]]
    ): Self = StObject.set(x, "PointHoverChanged", value.asInstanceOf[js.Any])
    
    inline def setPointSelectionChanged(
      value: ASPxClientEvent[
          BootstrapClientChartBasePointSelectionChangedEventHandler[BootstrapClientChartBase]
        ]
    ): Self = StObject.set(x, "PointSelectionChanged", value.asInstanceOf[js.Any])
    
    inline def setSeriesClick(
      value: ASPxClientEvent[
          BootstrapClientCoordinateSystemChartSeriesClickEventHandler[BootstrapClientChartBase]
        ]
    ): Self = StObject.set(x, "SeriesClick", value.asInstanceOf[js.Any])
    
    inline def setSeriesHoverChanged(
      value: ASPxClientEvent[
          BootstrapClientCoordinateSystemChartSeriesHoverChangedEventHandler[BootstrapClientChartBase]
        ]
    ): Self = StObject.set(x, "SeriesHoverChanged", value.asInstanceOf[js.Any])
    
    inline def setSeriesSelectionChanged(
      value: ASPxClientEvent[
          BootstrapClientCoordinateSystemChartSeriesSelectionChangedEventHandler[BootstrapClientChartBase]
        ]
    ): Self = StObject.set(x, "SeriesSelectionChanged", value.asInstanceOf[js.Any])
    
    inline def setTooltipHidden(
      value: ASPxClientEvent[BootstrapClientChartBaseTooltipHiddenEventHandler[BootstrapClientChartBase]]
    ): Self = StObject.set(x, "TooltipHidden", value.asInstanceOf[js.Any])
    
    inline def setTooltipShown(value: ASPxClientEvent[BootstrapClientChartBaseTooltipShownEventHandler[BootstrapClientChartBase]]): Self = StObject.set(x, "TooltipShown", value.asInstanceOf[js.Any])
  }
}
