package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.ASPxClientSplitterPaneCancelEventHandler
import typings.devexpressWeb.ASPxClientSplitterPaneEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxSplitter object.
  */
@JSGlobal("ASPxClientSplitter")
@js.native
class ASPxClientSplitter ()
  extends StObject
     with typings.devexpressWeb.ASPxClientSplitter {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns a string value that represents the client state of splitter panes.
    */
  /* CompleteClass */
  override def GetLayoutData(): String = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): js.Any = js.native
  
  /**
    * Returns the splitter's root pane specified by its index within the ASPxSplitter.Panes collection. An ASPxClientSplitterPane object representing the root pane located at the specified index within the splitter's ASPxSplitter.Panes collection.
    * @param index An integer value specifying the zero-based index of the root pane to be retrieved.
    */
  /* CompleteClass */
  override def GetPane(index: Double): typings.devexpressWeb.ASPxClientSplitterPane = js.native
  
  /**
    * Returns a pane specified by its name. An ASPxClientSplitterPane object that represents the pane with the specified name.
    * @param name A string value specifying the name of the pane.
    */
  /* CompleteClass */
  override def GetPaneByName(name: String): typings.devexpressWeb.ASPxClientSplitterPane = js.native
  
  /**
    * Returns the number of panes at the root level of a splitter.
    */
  /* CompleteClass */
  override def GetPaneCount(): Double = js.native
  
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
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  var Init: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientControlBase]] = js.native
  
  /**
    * Fires after a pane has been collapsed.
    */
  /* CompleteClass */
  var PaneCollapsed: typings.devexpressWeb.ASPxClientEvent[ASPxClientSplitterPaneEventHandler[typings.devexpressWeb.ASPxClientSplitter]] = js.native
  
  /**
    * Fires before a pane is collapsed.
    */
  /* CompleteClass */
  var PaneCollapsing: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientSplitterPaneCancelEventHandler[typings.devexpressWeb.ASPxClientSplitter]
  ] = js.native
  
  /**
    * Fires after a specific web page has been loaded into a pane.
    */
  /* CompleteClass */
  var PaneContentUrlLoaded: typings.devexpressWeb.ASPxClientEvent[ASPxClientSplitterPaneEventHandler[typings.devexpressWeb.ASPxClientSplitter]] = js.native
  
  /**
    * Fires after a pane has been expanded.
    */
  /* CompleteClass */
  var PaneExpanded: typings.devexpressWeb.ASPxClientEvent[ASPxClientSplitterPaneEventHandler[typings.devexpressWeb.ASPxClientSplitter]] = js.native
  
  /**
    * Fires before a pane is expanded.
    */
  /* CompleteClass */
  var PaneExpanding: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientSplitterPaneCancelEventHandler[typings.devexpressWeb.ASPxClientSplitter]
  ] = js.native
  
  /**
    * Occurs when a pane resize operation has been completed.
    */
  /* CompleteClass */
  var PaneResizeCompleted: typings.devexpressWeb.ASPxClientEvent[ASPxClientSplitterPaneEventHandler[typings.devexpressWeb.ASPxClientSplitter]] = js.native
  
  /**
    * Fires after a pane has been resized.
    */
  /* CompleteClass */
  var PaneResized: typings.devexpressWeb.ASPxClientEvent[ASPxClientSplitterPaneEventHandler[typings.devexpressWeb.ASPxClientSplitter]] = js.native
  
  /**
    * Fires before a pane is resized.
    */
  /* CompleteClass */
  var PaneResizing: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientSplitterPaneCancelEventHandler[typings.devexpressWeb.ASPxClientSplitter]
  ] = js.native
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /**
    * Specifies whether the control's panes can be resized by end-users on the client side.
    * @param allowResize true if pane resizing is allowed; otherwise, false.
    */
  /* CompleteClass */
  override def SetAllowResize(allowResize: Boolean): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
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
object ASPxClientSplitter {
  
  @JSGlobal("ASPxClientSplitter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts the specified object to the ASPxClientSplitter type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  /* static member */
  @scala.inline
  def Cast(obj: js.Any): typings.devexpressWeb.ASPxClientSplitter = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.devexpressWeb.ASPxClientSplitter]
}
