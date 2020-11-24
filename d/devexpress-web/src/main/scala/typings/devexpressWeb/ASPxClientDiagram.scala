package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side equivalent of the ASPxDiagram control.
  */
@js.native
trait ASPxClientDiagram extends ASPxClientControl {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientDiagram]] = js.native
  
  /**
    * Fires after a diagram model's data (mapped to a data source) is changed and the client-server synchronization starts to apply the change on the server.
    */
  var BeginSynchronization: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]] = js.native
  
  /**
    * Fires on the client if any unhandled server error occurs during server-side processing of a callback sent by the ASPxClientDiagram.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientDiagram]] = js.native
  
  /**
    * Allows you to create a template for custom shapes.
    */
  var CustomShapeCreateTemplate: ASPxClientEvent[ASPxClientDiagramCustomShapeCreateTemplateEventHandler[ASPxClientDiagram]] = js.native
  
  /**
    * Fires when the diagram's data is changed.
    */
  var DiagramChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]] = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientDiagram]] = js.native
  
  /**
    * Fires after a diagram model's data change is applied to the server and server and client document models have been synchronized.
    */
  var EndSynchronization: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]] = js.native
  
  /**
    * Exports the diagram data in JSON format.
    */
  def Export(): String = js.native
  
  /**
    * Exports the diagram to an image format.
    * @param format The image format. Acceptable values: svg, png, jpg.
    * @param callback A function to be executed after a diagram image is prepared and allows you to save the image.
    */
  def ExportTo(format: String, callback: js.Function1[/* arg */ String, Unit]): Unit = js.native
  
  /**
    * Imports the diagram data.
    * @param data The diagram data in JSON format.
    */
  def Import(data: String): Unit = js.native
  
  /**
    * Fires after a shape or connector is clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientDiagramItemClickEventHandler[ASPxClientDiagram]] = js.native
  
  /**
    * Fires after a shape or connector is double-clicked.
    */
  var ItemDblClick: ASPxClientEvent[ASPxClientDiagramItemClickEventHandler[ASPxClientDiagram]] = js.native
  
  /**
    * Fires after the selection changes in the Diagram.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientDiagramSelectionChangedEventHandler[ASPxClientDiagram]] = js.native
  
  /**
    * Allows you to enable/disable full-screen mode.
    * @param fullscreen true to activate full-screen mode; false to deactivate full-screen mode.
    */
  def SetFullscreenMode(fullscreen: Boolean): Unit = js.native
  
  /**
    * Allows you to enable/disable read-only mode.
    * @param readOnly true to make the diagram read-only; otherwise, false.
    */
  def SetReadOnly(readOnly: Boolean): Unit = js.native
}
object ASPxClientDiagram {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientDiagram]],
    BeginSynchronization: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientDiagram]],
    CustomShapeCreateTemplate: ASPxClientEvent[ASPxClientDiagramCustomShapeCreateTemplateEventHandler[ASPxClientDiagram]],
    DiagramChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientDiagram]],
    EndSynchronization: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]],
    Export: () => String,
    ExportTo: (String, js.Function1[/* arg */ String, Unit]) => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    Import: String => Unit,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientDiagramItemClickEventHandler[ASPxClientDiagram]],
    ItemDblClick: ASPxClientEvent[ASPxClientDiagramItemClickEventHandler[ASPxClientDiagram]],
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
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback.asInstanceOf[js.Any], BeginSynchronization = BeginSynchronization.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], CustomShapeCreateTemplate = CustomShapeCreateTemplate.asInstanceOf[js.Any], DiagramChanged = DiagramChanged.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], EndSynchronization = EndSynchronization.asInstanceOf[js.Any], Export = js.Any.fromFunction0(Export), ExportTo = js.Any.fromFunction2(ExportTo), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), Import = js.Any.fromFunction1(Import), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], ItemClick = ItemClick.asInstanceOf[js.Any], ItemDblClick = ItemDblClick.asInstanceOf[js.Any], SelectionChanged = SelectionChanged.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetFullscreenMode = js.Any.fromFunction1(SetFullscreenMode), SetHeight = js.Any.fromFunction1(SetHeight), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagram]
  }
  
  @scala.inline
  implicit class ASPxClientDiagramOps[Self <: ASPxClientDiagram] (val x: Self) extends AnyVal {
    
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
    def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientDiagram]]): Self = this.set("BeginCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginSynchronization(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]]): Self = this.set("BeginSynchronization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientDiagram]]): Self = this.set("CallbackError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomShapeCreateTemplate(value: ASPxClientEvent[ASPxClientDiagramCustomShapeCreateTemplateEventHandler[ASPxClientDiagram]]): Self = this.set("CustomShapeCreateTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagramChanged(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]]): Self = this.set("DiagramChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientDiagram]]): Self = this.set("EndCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndSynchronization(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDiagram]]): Self = this.set("EndSynchronization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExport(value: () => String): Self = this.set("Export", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExportTo(value: (String, js.Function1[/* arg */ String, Unit]) => Unit): Self = this.set("ExportTo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setImport(value: String => Unit): Self = this.set("Import", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemClick(value: ASPxClientEvent[ASPxClientDiagramItemClickEventHandler[ASPxClientDiagram]]): Self = this.set("ItemClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDblClick(value: ASPxClientEvent[ASPxClientDiagramItemClickEventHandler[ASPxClientDiagram]]): Self = this.set("ItemDblClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionChanged(value: ASPxClientEvent[ASPxClientDiagramSelectionChangedEventHandler[ASPxClientDiagram]]): Self = this.set("SelectionChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFullscreenMode(value: Boolean => Unit): Self = this.set("SetFullscreenMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetReadOnly(value: Boolean => Unit): Self = this.set("SetReadOnly", js.Any.fromFunction1(value))
  }
}
