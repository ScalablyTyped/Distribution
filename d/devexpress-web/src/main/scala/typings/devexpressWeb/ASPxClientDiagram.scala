package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxDiagram control.
  */
trait ASPxClientDiagram
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientDiagram]]
  
  /**
    * Fires after a diagram model's data (mapped to a data source) is changed and the client-server synchronization starts to apply the change on the server.
    */
  var BeginSynchronization: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]]
  
  /**
    * Fires on the client if any unhandled server error occurs during server-side processing of a callback sent by the ASPxClientDiagram.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientDiagram]]
  
  /**
    * Allows you to create a template for custom shapes.
    */
  var CustomShapeCreateTemplate: ASPxClientEvent[ASPxClientDiagramCustomShapeCreateTemplateEventHandler[ASPxClientDiagram]]
  
  /**
    * Allows you to create a template for custom shapes in the toolbox.
    */
  var CustomShapeCreateToolboxTemplate: ASPxClientEvent[ASPxClientDiagramCustomShapeCreateTemplateEventHandler[ASPxClientDiagram]]
  
  /**
    * Fires when the diagram's data is changed.
    */
  var DiagramChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]]
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientDiagram]]
  
  /**
    * Fires after a diagram model's data change is applied to the server (the server and client document models have been synchronized).
    */
  var EndSynchronization: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]]
  
  /**
    * Exports the diagram data in JSON format.
    */
  def Export(): String
  
  /**
    * Exports the diagram to an image format.
    * @param format The image format. Acceptable values: svg, png, jpg.
    * @param callback A function to be executed after a diagram image is prepared and allows you to save the image.
    */
  def ExportTo(format: String, callback: js.Function1[/* arg */ String, Unit]): Unit
  
  /**
    * Focuses the Diagram control.
    */
  def Focus(): Unit
  
  /**
    * Returns a shape or connector object specified by its internal identifier. The DiagramShape or DiagramConnector object with the specified identifier.
    * @param id The item identifier.
    */
  def GetItemById(id: String): DiagramItem
  
  /**
    * Returns a shape or connector object specified by its key. The DiagramShape or DiagramConnector object with the specified key.
    * @param key The item key.
    */
  def GetItemByKey(key: Any): DiagramItem
  
  /**
    * Returns a value that indicates whether the control's status is read-only.
    */
  def GetReadOnly(): Boolean
  
  /**
    * Imports the diagram data.
    * @param data The diagram data in JSON format.
    */
  def Import(data: String): Unit
  
  /**
    * Fires after a shape or connector is clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientDiagramItemClickEventHandler[ASPxClientDiagram]]
  
  /**
    * Fires after a shape or connector is double-clicked.
    */
  var ItemDblClick: ASPxClientEvent[ASPxClientDiagramItemClickEventHandler[ASPxClientDiagram]]
  
  /**
    * Allows you to prohibit an edit operation at run time.
    */
  var RequestEditOperation: ASPxClientEvent[ASPxClientDiagramRequestEditOperationEventHandler[ASPxClientDiagram]]
  
  /**
    * Fires after the selection changes in the Diagram.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientDiagramSelectionChangedEventHandler[ASPxClientDiagram]]
  
  /**
    * Allows you to enable/disable full-screen mode.
    * @param fullscreen true to activate full-screen mode; false to deactivate full-screen mode.
    */
  def SetFullscreenMode(fullscreen: Boolean): Unit
  
  /**
    * Allows you to enable/disable read-only mode.
    * @param readOnly true to make the diagram read-only; otherwise, false.
    */
  def SetReadOnly(readOnly: Boolean): Unit
}
object ASPxClientDiagram {
  
  inline def apply(
    AdjustControl: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientDiagram]],
    BeginSynchronization: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientDiagram]],
    CustomShapeCreateTemplate: ASPxClientEvent[ASPxClientDiagramCustomShapeCreateTemplateEventHandler[ASPxClientDiagram]],
    CustomShapeCreateToolboxTemplate: ASPxClientEvent[ASPxClientDiagramCustomShapeCreateTemplateEventHandler[ASPxClientDiagram]],
    DiagramChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientDiagram]],
    EndSynchronization: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]],
    Export: () => String,
    ExportTo: (String, js.Function1[/* arg */ String, Unit]) => Unit,
    Focus: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetItemById: String => DiagramItem,
    GetItemByKey: Any => DiagramItem,
    GetMainElement: () => Any,
    GetParentControl: () => Any,
    GetReadOnly: () => Boolean,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    Import: String => Unit,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientDiagramItemClickEventHandler[ASPxClientDiagram]],
    ItemDblClick: ASPxClientEvent[ASPxClientDiagramItemClickEventHandler[ASPxClientDiagram]],
    RequestEditOperation: ASPxClientEvent[ASPxClientDiagramRequestEditOperationEventHandler[ASPxClientDiagram]],
    SelectionChanged: ASPxClientEvent[ASPxClientDiagramSelectionChangedEventHandler[ASPxClientDiagram]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetFullscreenMode: Boolean => Unit,
    SetHeight: Double => Unit,
    SetReadOnly: Boolean => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): ASPxClientDiagram = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback.asInstanceOf[js.Any], BeginSynchronization = BeginSynchronization.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], CustomShapeCreateTemplate = CustomShapeCreateTemplate.asInstanceOf[js.Any], CustomShapeCreateToolboxTemplate = CustomShapeCreateToolboxTemplate.asInstanceOf[js.Any], DiagramChanged = DiagramChanged.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], EndSynchronization = EndSynchronization.asInstanceOf[js.Any], Export = js.Any.fromFunction0(Export), ExportTo = js.Any.fromFunction2(ExportTo), Focus = js.Any.fromFunction0(Focus), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetItemById = js.Any.fromFunction1(GetItemById), GetItemByKey = js.Any.fromFunction1(GetItemByKey), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), Import = js.Any.fromFunction1(Import), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], ItemDblClick = ItemDblClick.asInstanceOf[js.Any], RequestEditOperation = RequestEditOperation.asInstanceOf[js.Any], SelectionChanged = SelectionChanged.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetFullscreenMode = js.Any.fromFunction1(SetFullscreenMode), SetHeight = js.Any.fromFunction1(SetHeight), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagram]
  }
  
  extension [Self <: ASPxClientDiagram](x: Self) {
    
    inline def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientDiagram]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    inline def setBeginSynchronization(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]]): Self = StObject.set(x, "BeginSynchronization", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientDiagram]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    inline def setCustomShapeCreateTemplate(value: ASPxClientEvent[ASPxClientDiagramCustomShapeCreateTemplateEventHandler[ASPxClientDiagram]]): Self = StObject.set(x, "CustomShapeCreateTemplate", value.asInstanceOf[js.Any])
    
    inline def setCustomShapeCreateToolboxTemplate(value: ASPxClientEvent[ASPxClientDiagramCustomShapeCreateTemplateEventHandler[ASPxClientDiagram]]): Self = StObject.set(x, "CustomShapeCreateToolboxTemplate", value.asInstanceOf[js.Any])
    
    inline def setDiagramChanged(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]]): Self = StObject.set(x, "DiagramChanged", value.asInstanceOf[js.Any])
    
    inline def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientDiagram]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    inline def setEndSynchronization(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]]): Self = StObject.set(x, "EndSynchronization", value.asInstanceOf[js.Any])
    
    inline def setExport(value: () => String): Self = StObject.set(x, "Export", js.Any.fromFunction0(value))
    
    inline def setExportTo(value: (String, js.Function1[/* arg */ String, Unit]) => Unit): Self = StObject.set(x, "ExportTo", js.Any.fromFunction2(value))
    
    inline def setFocus(value: () => Unit): Self = StObject.set(x, "Focus", js.Any.fromFunction0(value))
    
    inline def setGetItemById(value: String => DiagramItem): Self = StObject.set(x, "GetItemById", js.Any.fromFunction1(value))
    
    inline def setGetItemByKey(value: Any => DiagramItem): Self = StObject.set(x, "GetItemByKey", js.Any.fromFunction1(value))
    
    inline def setGetReadOnly(value: () => Boolean): Self = StObject.set(x, "GetReadOnly", js.Any.fromFunction0(value))
    
    inline def setImport(value: String => Unit): Self = StObject.set(x, "Import", js.Any.fromFunction1(value))
    
    inline def setItemClick(value: ASPxClientEvent[ASPxClientDiagramItemClickEventHandler[ASPxClientDiagram]]): Self = StObject.set(x, "ItemClick", value.asInstanceOf[js.Any])
    
    inline def setItemDblClick(value: ASPxClientEvent[ASPxClientDiagramItemClickEventHandler[ASPxClientDiagram]]): Self = StObject.set(x, "ItemDblClick", value.asInstanceOf[js.Any])
    
    inline def setRequestEditOperation(value: ASPxClientEvent[ASPxClientDiagramRequestEditOperationEventHandler[ASPxClientDiagram]]): Self = StObject.set(x, "RequestEditOperation", value.asInstanceOf[js.Any])
    
    inline def setSelectionChanged(value: ASPxClientEvent[ASPxClientDiagramSelectionChangedEventHandler[ASPxClientDiagram]]): Self = StObject.set(x, "SelectionChanged", value.asInstanceOf[js.Any])
    
    inline def setSetFullscreenMode(value: Boolean => Unit): Self = StObject.set(x, "SetFullscreenMode", js.Any.fromFunction1(value))
    
    inline def setSetReadOnly(value: Boolean => Unit): Self = StObject.set(x, "SetReadOnly", js.Any.fromFunction1(value))
  }
}
