package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.BootstrapUIWidgetDisposingEventHandler
import typings.devexpressWeb.BootstrapUIWidgetDrawnEventHandler
import typings.devexpressWeb.BootstrapUIWidgetErrorEventHandler
import typings.devexpressWeb.BootstrapUIWidgetExportedEventHandler
import typings.devexpressWeb.BootstrapUIWidgetExportingEventHandler
import typings.devexpressWeb.BootstrapUIWidgetFileSavingEventHandler
import typings.devexpressWeb.BootstrapUIWidgetInitializedEventHandler
import typings.devexpressWeb.BootstrapUIWidgetOptionChangedEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the BootstrapWebClientUIWidget class.
  */
@JSGlobal("BootstrapUIWidgetBase")
@js.native
class BootstrapUIWidgetBase ()
  extends StObject
     with typings.devexpressWeb.BootstrapUIWidgetBase {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Fires when the widget is removed from the DOM using the remove(), empty(), or html() jQuery methods only.
    */
  /* CompleteClass */
  var Disposing: typings.devexpressWeb.ASPxClientEvent[
    BootstrapUIWidgetDisposingEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]
  ] = js.native
  
  /**
    * Fires when the widget has finished drawing itself.
    */
  /* CompleteClass */
  var Drawn: typings.devexpressWeb.ASPxClientEvent[BootstrapUIWidgetDrawnEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]] = js.native
  
  /**
    * Exports the widget.
    * @param format A string specifying the target file format.
    * @param fileName A string specifying the file name.
    */
  /* CompleteClass */
  override def ExportTo(format: String, fileName: String): Unit = js.native
  
  /**
    * Fires after data from the widget is exported.
    */
  /* CompleteClass */
  var Exported: typings.devexpressWeb.ASPxClientEvent[
    BootstrapUIWidgetExportedEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]
  ] = js.native
  
  /**
    * Fires before data from the widget is exported.
    */
  /* CompleteClass */
  var Exporting: typings.devexpressWeb.ASPxClientEvent[
    BootstrapUIWidgetExportingEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]
  ] = js.native
  
  /**
    * Raised before a file with exported data is saved on the user's local storage.
    */
  /* CompleteClass */
  var FileSaving: typings.devexpressWeb.ASPxClientEvent[
    BootstrapUIWidgetFileSavingEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]
  ] = js.native
  
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
    * Fires when an error or warning appears in the widget.
    */
  /* CompleteClass */
  var IncidentOccurred: typings.devexpressWeb.ASPxClientEvent[BootstrapUIWidgetErrorEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]] = js.native
  
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  var Init: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientControlBase]] = js.native
  /**
    * Fires once, after the widget is initialized.
    */
  /* CompleteClass */
  @JSName("Init")
  var Init_BootstrapUIWidgetBase: typings.devexpressWeb.ASPxClientEvent[
    BootstrapUIWidgetInitializedEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]
  ] = js.native
  
  /**
    * Fires after an option of the widget has been changed.
    */
  /* CompleteClass */
  var OptionChanged: typings.devexpressWeb.ASPxClientEvent[
    BootstrapUIWidgetOptionChangedEventHandler[typings.devexpressWeb.BootstrapUIWidgetBase]
  ] = js.native
  
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
    * @param dataSource A DevExtreme DataSource object.
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
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
