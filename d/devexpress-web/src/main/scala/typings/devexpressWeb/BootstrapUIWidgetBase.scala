package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapWebClientUIWidget class.
  */
trait BootstrapUIWidgetBase
  extends StObject
     with ASPxClientControl {
  
  /**
    * Fires when the widget is removed from the DOM using the remove(), empty(), or html() jQuery methods only.
    */
  var Disposing: ASPxClientEvent[BootstrapUIWidgetDisposingEventHandler[BootstrapUIWidgetBase]]
  
  /**
    * Fires when the widget has finished drawing itself.
    */
  var Drawn: ASPxClientEvent[BootstrapUIWidgetDrawnEventHandler[BootstrapUIWidgetBase]]
  
  /**
    * Exports the widget.
    * @param format A string specifying the target file format.
    * @param fileName A string specifying the file name.
    */
  def ExportTo(format: String, fileName: String): Unit
  
  /**
    * Fires after data from the widget is exported.
    */
  var Exported: ASPxClientEvent[BootstrapUIWidgetExportedEventHandler[BootstrapUIWidgetBase]]
  
  /**
    * Fires before data from the widget is exported.
    */
  var Exporting: ASPxClientEvent[BootstrapUIWidgetExportingEventHandler[BootstrapUIWidgetBase]]
  
  /**
    * Raised before a file with exported data is saved on the user's local storage.
    */
  var FileSaving: ASPxClientEvent[BootstrapUIWidgetFileSavingEventHandler[BootstrapUIWidgetBase]]
  
  /**
    * Gets the client data source instance.
    */
  def GetDataSource(): js.Any
  
  def GetEnabled(): Boolean
  
  /**
    * Gets an instance of the widget.
    */
  def GetInstance(): js.Any
  
  /**
    * Fires when an error or warning appears in the widget.
    */
  var IncidentOccurred: ASPxClientEvent[BootstrapUIWidgetErrorEventHandler[BootstrapUIWidgetBase]]
  
  /**
    * Fires once, after the widget is initialized.
    */
  @JSName("Init")
  var Init_BootstrapUIWidgetBase: ASPxClientEvent[BootstrapUIWidgetInitializedEventHandler[BootstrapUIWidgetBase]]
  
  /**
    * Fires after an option of the widget has been changed.
    */
  var OptionChanged: ASPxClientEvent[BootstrapUIWidgetOptionChangedEventHandler[BootstrapUIWidgetBase]]
  
  /**
    * Invokes the browser's Print window to print the widget's contents.
    */
  def Print(): Unit
  
  /**
    * Sets the client data source instance.
    * @param dataSource A DevExtreme DataSource object.
    */
  def SetDataSource(dataSource: js.Any): Unit
  
  def SetEnabled(enabled: Boolean): Unit
  
  /**
    * Sets the widget's options to values specified in the passed object.
    * @param options An object containing key-value pairs specifying new option values.
    */
  def SetOptions(options: js.Any): Unit
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
  implicit class BootstrapUIWidgetBaseMutableBuilder[Self <: BootstrapUIWidgetBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisposing(value: ASPxClientEvent[BootstrapUIWidgetDisposingEventHandler[BootstrapUIWidgetBase]]): Self = StObject.set(x, "Disposing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawn(value: ASPxClientEvent[BootstrapUIWidgetDrawnEventHandler[BootstrapUIWidgetBase]]): Self = StObject.set(x, "Drawn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTo(value: (String, String) => Unit): Self = StObject.set(x, "ExportTo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExported(value: ASPxClientEvent[BootstrapUIWidgetExportedEventHandler[BootstrapUIWidgetBase]]): Self = StObject.set(x, "Exported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExporting(value: ASPxClientEvent[BootstrapUIWidgetExportingEventHandler[BootstrapUIWidgetBase]]): Self = StObject.set(x, "Exporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSaving(value: ASPxClientEvent[BootstrapUIWidgetFileSavingEventHandler[BootstrapUIWidgetBase]]): Self = StObject.set(x, "FileSaving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDataSource(value: () => js.Any): Self = StObject.set(x, "GetDataSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "GetEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInstance(value: () => js.Any): Self = StObject.set(x, "GetInstance", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIncidentOccurred(value: ASPxClientEvent[BootstrapUIWidgetErrorEventHandler[BootstrapUIWidgetBase]]): Self = StObject.set(x, "IncidentOccurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: ASPxClientEvent[BootstrapUIWidgetInitializedEventHandler[BootstrapUIWidgetBase]]): Self = StObject.set(x, "Init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionChanged(value: ASPxClientEvent[BootstrapUIWidgetOptionChangedEventHandler[BootstrapUIWidgetBase]]): Self = StObject.set(x, "OptionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: () => Unit): Self = StObject.set(x, "Print", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDataSource(value: js.Any => Unit): Self = StObject.set(x, "SetDataSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnabled(value: Boolean => Unit): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOptions(value: js.Any => Unit): Self = StObject.set(x, "SetOptions", js.Any.fromFunction1(value))
  }
}
