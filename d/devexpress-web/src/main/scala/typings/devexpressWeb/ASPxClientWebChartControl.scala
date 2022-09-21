package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class which provides access to the entire hierarchy of chart elements on the client side.
  */
@js.native
trait ASPxClientWebChartControl
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientWebChartControl]] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientWebChartControl.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientWebChartControl]] = js.native
  
  /**
    * Occurs before crosshair items are drawn when the chart's contents are being drawn.
    */
  var CustomDrawCrosshair: ASPxClientEvent[
    ASPxClientWebChartControlCustomDrawCrosshairEventHandler[ASPxClientWebChartControl]
  ] = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientWebChartControl]] = js.native
  
  /**
    * Returns an ASPxClientWebChart object, which contains information about the hierarchy of a chart control, and provides access to the main properties of chart elements  on the client side.
    */
  def GetChart(): ASPxClientWebChart = js.native
  
  /**
    * Gets the main DOM (Document Object Model) element on a Web Page representing this ASPxClientWebChartControl object.
    */
  def GetMainDOMElement(): Any = js.native
  
  /**
    * Returns the printing options of the chart control.
    */
  def GetPrintOptions(): ASPxClientChartPrintOptions = js.native
  
  /**
    * Returns the specific chart element which is located under the test point. An array collection of ASPxClientHitObject objects, that represent the chart elements located under the test point.
    * @param x An integer value that specifies the x coordinate of the test point.
    * @param y An integer value that specifies the y coordinate of the test point.
    */
  def HitTest(x: Double, y: Double): js.Array[ASPxClientHitObject] = js.native
  
  /**
    * Loads a chart which should be customized from its object model.
    * @param serializedChartObjectModel A String object representing the chart model.
    */
  def LoadFromObjectModel(serializedChartObjectModel: String): Unit = js.native
  
  /**
    * Occurs on the client side when any chart element is hot-tracked.
    */
  var ObjectHotTracked: ASPxClientEvent[ASPxClientWebChartControlHotTrackEventHandler[ASPxClientWebChartControl]] = js.native
  
  /**
    * Occurs on the client side when any chart element is selected.
    */
  var ObjectSelected: ASPxClientEvent[ASPxClientWebChartControlHotTrackEventHandler[ASPxClientWebChartControl]] = js.native
  
  /**
    * Sends a callback to the server and generates the server-side event, passing it the specified argument.
    * @param args A string value that represents any information that needs to be sent to the server-side event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(args: String): Unit = js.native
  def PerformCallback(args: String, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  
  /**
    * Prints the current chart on the client side.
    */
  def Print(): Unit = js.native
  
  /**
    * Exports a chart to a file in the specified format, and saves it to disk, using the specified file name.
    * @param format A string value specifying the format, to which a chart should be exported.
    * @param filename A string value specifying the file name, to which a chart should be exported. If this parameter is missing or set to an empty string, then the created file will be named using the client-side name of a chart.
    */
  def SaveToDisk(format: String): Unit = js.native
  def SaveToDisk(format: String, filename: String): Unit = js.native
  
  /**
    * Exports a report to the file of the specified format, and shows it in a new Web Browser window.
    * @param format A string  value specifying a format in which a report should be exported.
    */
  def SaveToWindow(format: String): Unit = js.native
  
  /**
    * Specifies the chart size.
    * @param width The chart width.
    * @param height The chart height.
    */
  def SetChartSize(width: Double, height: Double): Unit = js.native
  
  /**
    * Changes the mouse pointer, which is shown when the mouse is over the chart control, to the pointer with the specified name.
    * @param cursor A string value representing the name of the desired cursor.
    */
  def SetCursor(cursor: String): Unit = js.native
}
