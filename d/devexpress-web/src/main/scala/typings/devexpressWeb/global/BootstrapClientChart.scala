package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.BootstrapClientChartBaseDoneEventHandler
import typings.devexpressWeb.BootstrapClientChartBaseLegendClickEventHandler
import typings.devexpressWeb.BootstrapClientChartBasePointClickEventHandler
import typings.devexpressWeb.BootstrapClientChartBasePointHoverChangedEventHandler
import typings.devexpressWeb.BootstrapClientChartBasePointSelectionChangedEventHandler
import typings.devexpressWeb.BootstrapClientChartBaseTooltipHiddenEventHandler
import typings.devexpressWeb.BootstrapClientChartBaseTooltipShownEventHandler
import typings.devexpressWeb.BootstrapClientChartZoomEndEventHandler
import typings.devexpressWeb.BootstrapClientChartZoomStartEventHandler
import typings.devexpressWeb.BootstrapClientCoordinateSystemChartArgumentAxisClickEventHandler
import typings.devexpressWeb.BootstrapClientCoordinateSystemChartSeriesClickEventHandler
import typings.devexpressWeb.BootstrapClientCoordinateSystemChartSeriesHoverChangedEventHandler
import typings.devexpressWeb.BootstrapClientCoordinateSystemChartSeriesSelectionChangedEventHandler
import typings.devexpressWeb.BootstrapUIWidgetDisposingEventHandler
import typings.devexpressWeb.BootstrapUIWidgetDrawnEventHandler
import typings.devexpressWeb.BootstrapUIWidgetErrorEventHandler
import typings.devexpressWeb.BootstrapUIWidgetExportedEventHandler
import typings.devexpressWeb.BootstrapUIWidgetExportingEventHandler
import typings.devexpressWeb.BootstrapUIWidgetFileSavingEventHandler
import typings.devexpressWeb.BootstrapUIWidgetInitializedEventHandler
import typings.devexpressWeb.BootstrapUIWidgetOptionChangedEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the Chart control.
  */
@JSGlobal("BootstrapClientChart")
@js.native
class BootstrapClientChart ()
  extends typings.devexpressWeb.BootstrapClientChart {
  /**
    * Fires when a user clicks a label on the argument axis.
    */
  /* CompleteClass */
  override var ArgumentAxisClick: typings.devexpressWeb.ASPxClientEvent[
    BootstrapClientCoordinateSystemChartArgumentAxisClickEventHandler[typings.devexpressWeb.BootstrapClientChartBase]
  ] = js.native
  /**
    * Fires when the widget is removed from the DOM using the remove(), empty(), or html() jQuery methods only.
    */
  /* CompleteClass */
  override var Disposing: typings.devexpressWeb.ASPxClientEvent[
    BootstrapUIWidgetDisposingEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]
  ] = js.native
  /**
    * Fires when the Series and Points chart elements are ready to be accessed.
    */
  /* CompleteClass */
  override var Done: typings.devexpressWeb.ASPxClientEvent[
    BootstrapClientChartBaseDoneEventHandler[typings.devexpressWeb.BootstrapClientChartBase]
  ] = js.native
  /**
    * Fires when the widget has finished drawing itself.
    */
  /* CompleteClass */
  override var Drawn: typings.devexpressWeb.ASPxClientEvent[BootstrapUIWidgetDrawnEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]] = js.native
  /**
    * Fires after data from the widget is exported.
    */
  /* CompleteClass */
  override var Exported: typings.devexpressWeb.ASPxClientEvent[
    BootstrapUIWidgetExportedEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]
  ] = js.native
  /**
    * Fires before data from the widget is exported.
    */
  /* CompleteClass */
  override var Exporting: typings.devexpressWeb.ASPxClientEvent[
    BootstrapUIWidgetExportingEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]
  ] = js.native
  /**
    * Raised before a file with exported data is saved on the user's local storage.
    */
  /* CompleteClass */
  override var FileSaving: typings.devexpressWeb.ASPxClientEvent[
    BootstrapUIWidgetFileSavingEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]
  ] = js.native
  /**
    * Fires when an error or warning appears in the widget.
    */
  /* CompleteClass */
  override var IncidentOccurred: typings.devexpressWeb.ASPxClientEvent[BootstrapUIWidgetErrorEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]] = js.native
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  override var Init: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientControlBase]] = js.native
  /**
    * Fires once, after the widget is initialized.
    */
  /* CompleteClass */
  @JSName("Init")
  override var Init_BootstrapUIWidgetBase: typings.devexpressWeb.ASPxClientEvent[
    BootstrapUIWidgetInitializedEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]
  ] = js.native
  /**
    * Fires when an item on the chart legend is clicked.
    */
  /* CompleteClass */
  override var LegendClick: typings.devexpressWeb.ASPxClientEvent[
    BootstrapClientChartBaseLegendClickEventHandler[typings.devexpressWeb.BootstrapClientChartBase]
  ] = js.native
  /**
    * Fires after an option of the widget has been changed.
    */
  /* CompleteClass */
  override var OptionChanged: typings.devexpressWeb.ASPxClientEvent[
    BootstrapUIWidgetOptionChangedEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]
  ] = js.native
  /**
    * Fires when a user clicks a series point.
    */
  /* CompleteClass */
  override var PointClick: typings.devexpressWeb.ASPxClientEvent[
    BootstrapClientChartBasePointClickEventHandler[typings.devexpressWeb.BootstrapClientChartBase]
  ] = js.native
  /**
    * Fires when the hover state of a series point has been changed.
    */
  /* CompleteClass */
  override var PointHoverChanged: typings.devexpressWeb.ASPxClientEvent[
    BootstrapClientChartBasePointHoverChangedEventHandler[typings.devexpressWeb.BootstrapClientChartBase]
  ] = js.native
  /**
    * Fires when the selection state of a series point has been changed.
    */
  /* CompleteClass */
  override var PointSelectionChanged: typings.devexpressWeb.ASPxClientEvent[
    BootstrapClientChartBasePointSelectionChangedEventHandler[typings.devexpressWeb.BootstrapClientChartBase]
  ] = js.native
  /**
    * Fires when a user clicks a series.
    */
  /* CompleteClass */
  override var SeriesClick: typings.devexpressWeb.ASPxClientEvent[
    BootstrapClientCoordinateSystemChartSeriesClickEventHandler[typings.devexpressWeb.BootstrapClientChartBase]
  ] = js.native
  /**
    * Fires when the hover state of a series has been changed.
    */
  /* CompleteClass */
  override var SeriesHoverChanged: typings.devexpressWeb.ASPxClientEvent[
    BootstrapClientCoordinateSystemChartSeriesHoverChangedEventHandler[typings.devexpressWeb.BootstrapClientChartBase]
  ] = js.native
  /**
    * Fires when the selection state of a series has been changed.
    */
  /* CompleteClass */
  override var SeriesSelectionChanged: typings.devexpressWeb.ASPxClientEvent[
    BootstrapClientCoordinateSystemChartSeriesSelectionChangedEventHandler[typings.devexpressWeb.BootstrapClientChartBase]
  ] = js.native
  /**
    * Fires when a point's tooltip becomes hidden.
    */
  /* CompleteClass */
  override var TooltipHidden: typings.devexpressWeb.ASPxClientEvent[
    BootstrapClientChartBaseTooltipHiddenEventHandler[typings.devexpressWeb.BootstrapClientChartBase]
  ] = js.native
  /**
    * Fires when a point's tooltip appears.
    */
  /* CompleteClass */
  override var TooltipShown: typings.devexpressWeb.ASPxClientEvent[
    BootstrapClientChartBaseTooltipShownEventHandler[typings.devexpressWeb.BootstrapClientChartBase]
  ] = js.native
  /**
    * Fires when a chart zooming or scrolling ends.
    */
  /* CompleteClass */
  override var ZoomEnd: typings.devexpressWeb.ASPxClientEvent[
    BootstrapClientChartZoomEndEventHandler[typings.devexpressWeb.BootstrapClientChart]
  ] = js.native
  /**
    * Fires when a chart zooming or scrolling begins.
    */
  /* CompleteClass */
  override var ZoomStart: typings.devexpressWeb.ASPxClientEvent[
    BootstrapClientChartZoomStartEventHandler[typings.devexpressWeb.BootstrapClientChart]
  ] = js.native
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  /**
    * Exports the widget.
    * @param format A string specifying the target file format.
    * @param fileName A string specifying the file name.
    */
  /* CompleteClass */
  override def ExportTo(format: String, fileName: String): Unit = js.native
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  /**
    * Gets the client data source instance.
    */
  /* CompleteClass */
  override def GetDataSource(): js.Any = js.native
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  /**
    * Gets an instance of the widget.
    */
  /* CompleteClass */
  override def GetInstance(): js.Any = js.native
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): js.Any = js.native
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): js.Any = js.native
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  /**
    * Invokes the browser's Print window to print the widget's contents.
    */
  /* CompleteClass */
  override def Print(): Unit = js.native
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  /**
    * Sets the client data source instance.
    * @param dataSource A DevExtreme <a href="https://js.devexpress.com/DevExtreme/ApiReference/Data_Layer/DataSource/">DataSource</a> object.
    */
  /* CompleteClass */
  override def SetDataSource(dataSource: js.Any): Unit = js.native
  /* CompleteClass */
  override def SetEnabled(enabled: Boolean): Unit = js.native
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  /**
    * Sets the widget's options to values specified in the passed object.
    * @param options An object containing key-value pairs specifying new option values.
    */
  /* CompleteClass */
  override def SetOptions(options: js.Any): Unit = js.native
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
}

