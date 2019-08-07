package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapWebClientUIWidget class.
  */
@JSGlobal("BootstrapUIWidgetBase")
@js.native
class BootstrapUIWidgetBase () extends ASPxClientControl {
  /**
    * Fires when the widget is removed from the DOM using the remove(), empty(), or html() jQuery methods only.
    */
  var Disposing: ASPxClientEvent[BootstrapUIWidgetDisposingEventHandler[BootstrapUIWidgetBase]] = js.native
  /**
    * Fires when the widget has finished drawing itself.
    */
  var Drawn: ASPxClientEvent[BootstrapUIWidgetDrawnEventHandler[BootstrapUIWidgetBase]] = js.native
  /**
    * Fires after data from the widget is exported.
    */
  var Exported: ASPxClientEvent[BootstrapUIWidgetExportedEventHandler[BootstrapUIWidgetBase]] = js.native
  /**
    * Fires before data from the widget is exported.
    */
  var Exporting: ASPxClientEvent[BootstrapUIWidgetExportingEventHandler[BootstrapUIWidgetBase]] = js.native
  /**
    * Raised before a file with exported data is saved on the user's local storage.
    */
  var FileSaving: ASPxClientEvent[BootstrapUIWidgetFileSavingEventHandler[BootstrapUIWidgetBase]] = js.native
  /**
    * Fires when an error or warning appears in the widget.
    */
  var IncidentOccurred: ASPxClientEvent[BootstrapUIWidgetErrorEventHandler[BootstrapUIWidgetBase]] = js.native
  /**
    * Fires once, after the widget is initialized.
    */
  @JSName("Init")
  var Init_BootstrapUIWidgetBase: ASPxClientEvent[BootstrapUIWidgetInitializedEventHandler[BootstrapUIWidgetBase]] = js.native
  /**
    * Fires after an option of the widget has been changed.
    */
  var OptionChanged: ASPxClientEvent[BootstrapUIWidgetOptionChangedEventHandler[BootstrapUIWidgetBase]] = js.native
  /**
    * Exports the widget.
    * @param format A string specifying the target file format.
    * @param fileName A string specifying the file name.
    */
  def ExportTo(format: String, fileName: String): Unit = js.native
  /**
    * Gets the client data source instance.
    */
  def GetDataSource(): js.Any = js.native
  def GetEnabled(): Boolean = js.native
  /**
    * Gets an instance of the widget.
    */
  def GetInstance(): js.Any = js.native
  /**
    * Invokes the browser's Print window to print the widget's contents.
    */
  def Print(): Unit = js.native
  /**
    * Sets the client data source instance.
    * @param dataSource A DevExtreme <a href="https://js.devexpress.com/DevExtreme/ApiReference/Data_Layer/DataSource/">DataSource</a> object.
    */
  def SetDataSource(dataSource: js.Any): Unit = js.native
  def SetEnabled(enabled: Boolean): Unit = js.native
  /**
    * Sets the widget's options to values specified in the passed object.
    * @param options An object containing key-value pairs specifying new option values.
    */
  def SetOptions(options: js.Any): Unit = js.native
}

