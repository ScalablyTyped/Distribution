package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapWebClientUIWidget class.
  */
@js.native
trait BootstrapUIWidgetBase extends ASPxClientControl {
  
  /**
    * Fires when the widget is removed from the DOM using the remove(), empty(), or html() jQuery methods only.
    */
  var Disposing: ASPxClientEvent[BootstrapUIWidgetDisposingEventHandler[BootstrapUIWidgetBase]] = js.native
  
  /**
    * Fires when the widget has finished drawing itself.
    */
  var Drawn: ASPxClientEvent[BootstrapUIWidgetDrawnEventHandler[BootstrapUIWidgetBase]] = js.native
  
  /**
    * Exports the widget.
    * @param format A string specifying the target file format.
    * @param fileName A string specifying the file name.
    */
  def ExportTo(format: String, fileName: String): Unit = js.native
  
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
    * Gets the client data source instance.
    */
  def GetDataSource(): js.Any = js.native
  
  def GetEnabled(): Boolean = js.native
  
  /**
    * Gets an instance of the widget.
    */
  def GetInstance(): js.Any = js.native
  
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
    * Invokes the browser's Print window to print the widget's contents.
    */
  def Print(): Unit = js.native
  
  /**
    * Sets the client data source instance.
    * @param dataSource A DevExtreme DataSource object.
    */
  def SetDataSource(dataSource: js.Any): Unit = js.native
  
  def SetEnabled(enabled: Boolean): Unit = js.native
  
  /**
    * Sets the widget's options to values specified in the passed object.
    * @param options An object containing key-value pairs specifying new option values.
    */
  def SetOptions(options: js.Any): Unit = js.native
}
object BootstrapUIWidgetBase {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    Disposing: ASPxClientEvent[BootstrapUIWidgetDisposingEventHandler[BootstrapUIWidgetBase]],
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
    OptionChanged: ASPxClientEvent[BootstrapUIWidgetOptionChangedEventHandler[BootstrapUIWidgetBase]],
    Print: () => Unit,
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetDataSource: js.Any => Unit,
    SetEnabled: Boolean => Unit,
    SetHeight: Double => Unit,
    SetOptions: js.Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): BootstrapUIWidgetBase = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Disposing = Disposing.asInstanceOf[js.Any], Drawn = Drawn.asInstanceOf[js.Any], ExportTo = js.Any.fromFunction2(ExportTo), Exported = Exported.asInstanceOf[js.Any], Exporting = Exporting.asInstanceOf[js.Any], FileSaving = FileSaving.asInstanceOf[js.Any], GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetDataSource = js.Any.fromFunction0(GetDataSource), GetEnabled = js.Any.fromFunction0(GetEnabled), GetHeight = js.Any.fromFunction0(GetHeight), GetInstance = js.Any.fromFunction0(GetInstance), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), IncidentOccurred = IncidentOccurred.asInstanceOf[js.Any], Init = Init.asInstanceOf[js.Any], OptionChanged = OptionChanged.asInstanceOf[js.Any], Print = js.Any.fromFunction0(Print), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetDataSource = js.Any.fromFunction1(SetDataSource), SetEnabled = js.Any.fromFunction1(SetEnabled), SetHeight = js.Any.fromFunction1(SetHeight), SetOptions = js.Any.fromFunction1(SetOptions), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapUIWidgetBase]
  }
  
  @scala.inline
  implicit class BootstrapUIWidgetBaseOps[Self <: BootstrapUIWidgetBase] (val x: Self) extends AnyVal {
    
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
    def setDisposing(value: ASPxClientEvent[BootstrapUIWidgetDisposingEventHandler[BootstrapUIWidgetBase]]): Self = this.set("Disposing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawn(value: ASPxClientEvent[BootstrapUIWidgetDrawnEventHandler[BootstrapUIWidgetBase]]): Self = this.set("Drawn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTo(value: (String, String) => Unit): Self = this.set("ExportTo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExported(value: ASPxClientEvent[BootstrapUIWidgetExportedEventHandler[BootstrapUIWidgetBase]]): Self = this.set("Exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExporting(value: ASPxClientEvent[BootstrapUIWidgetExportingEventHandler[BootstrapUIWidgetBase]]): Self = this.set("Exporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSaving(value: ASPxClientEvent[BootstrapUIWidgetFileSavingEventHandler[BootstrapUIWidgetBase]]): Self = this.set("FileSaving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDataSource(value: () => js.Any): Self = this.set("GetDataSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = this.set("GetEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInstance(value: () => js.Any): Self = this.set("GetInstance", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIncidentOccurred(value: ASPxClientEvent[BootstrapUIWidgetErrorEventHandler[BootstrapUIWidgetBase]]): Self = this.set("IncidentOccurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: ASPxClientEvent[BootstrapUIWidgetInitializedEventHandler[BootstrapUIWidgetBase]]): Self = this.set("Init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionChanged(value: ASPxClientEvent[BootstrapUIWidgetOptionChangedEventHandler[BootstrapUIWidgetBase]]): Self = this.set("OptionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: () => Unit): Self = this.set("Print", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDataSource(value: js.Any => Unit): Self = this.set("SetDataSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = this.set("SetEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOptions(value: js.Any => Unit): Self = this.set("SetOptions", js.Any.fromFunction1(value))
  }
}
