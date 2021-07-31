package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This special Tool is responsible for managing all of the Diagram's
  * mode-less tools.
  */
@JSImport("go", "ToolManager")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the Diagram.toolManager, which you can modify.
  */
class ToolManager () extends Tool {
  
  /**Gets or sets the mode-less ActionTool, normally one of the .mouseDownTools.*/
  var actionTool: ActionTool = js.native
  
  /**Gets or sets the mode-less ClickCreatingTool, normally one of the .mouseUpTools.*/
  var clickCreatingTool: ClickCreatingTool = js.native
  
  /**Gets or sets the mode-less ClickSelectingTool, normally one of the .mouseUpTools.*/
  var clickSelectingTool: ClickSelectingTool = js.native
  
  /**Gets or sets the mode-less ContextMenuTool, normally one of the .mouseUpTools.*/
  var contextMenuTool: ContextMenuTool = js.native
  
  /**This read-only property returns the currently showing tooltip, or null if there is none.*/
  var currentToolTip: Adornment = js.native
  
  /**
    * Implement the standard behavior for mouse hover and mouse hold events, called by .doWaitAfter when the mouse has not moved for a period of time.
    */
  def doMouseHover(): Unit = js.native
  
  /**
    * Implement the standard behavior for tooltips, called by .doWaitAfter when the mouse has not moved for a period of time.
    */
  def doToolTip(): Unit = js.native
  
  /**Gets or sets the mode-less DragSelectingTool, normally one of the .mouseMoveTools.*/
  var dragSelectingTool: DragSelectingTool = js.native
  
  /**Gets or sets the distance in view coordinates within which a mouse down-and-up is considered a click and beyond which a mouse movement is considered a drag.*/
  var dragSize: Size = js.native
  
  /**Gets or sets the mode-less DraggingTool, normally one of the .mouseMoveTools.*/
  var draggingTool: DraggingTool = js.native
  
  /**
    * Find a mouse tool of a given name.
    * @param {string} name
    */
  def findTool(name: String): Tool = js.native
  
  /**
    * Hide any tooltip.
    */
  def hideToolTip(): Unit = js.native
  
  /**Gets or sets the time between when the mouse stops moving and a hold event, in milliseconds.*/
  var holdDelay: Double = js.native
  
  /**Gets or sets the time between when the mouse stops moving and a hover event, in milliseconds.*/
  var hoverDelay: Double = js.native
  
  /**
    * Initialize the three mouse tool lists with instances of the standard tools.
    */
  def initializeStandardTools(): Unit = js.native
  
  /**Gets or sets the mode-less LinkReshapingTool, normally one of the .mouseDownTools.*/
  var linkReshapingTool: LinkReshapingTool = js.native
  
  /**Gets or sets the mode-less LinkingTool, normally one of the .mouseMoveTools.*/
  var linkingTool: LinkingTool = js.native
  
  /**This read-only property returns the list of Tools that might be started upon a mouse-down event.*/
  var mouseDownTools: List[Tool] = js.native
  
  /**This read-only property returns the list of Tools that might be started upon a mouse-move event.*/
  var mouseMoveTools: List[Tool] = js.native
  
  /**This read-only property returns the list of Tools that might be started upon a mouse-up event.*/
  var mouseUpTools: List[Tool] = js.native
  
  /**Gets or sets the ToolManager's mouse wheel behavior.*/
  var mouseWheelBehavior: EnumValue = js.native
  
  /**Gets or sets the mode-less PanningTool, normally one of the .mouseMoveTools.*/
  var panningTool: PanningTool = js.native
  
  /**
    * This is called by .showToolTip to position the part within the viewport.
    * @param {Adornment} tooltip
    * @param {GraphObject} obj The GraphObject getting the tooltip.
    */
  def positionToolTip(tooltip: Adornment, obj: GraphObject): Unit = js.native
  
  /**Gets or sets the mode-less RelinkingTool, normally one of the .mouseDownTools.*/
  var relinkingTool: RelinkingTool = js.native
  
  /**
    * Replace a mouse tool of a given name with a new tool.
    * @param {string} name the type of tool, such as "Dragging" or "ClickSelecting".
    * @param {Tool} newtool If null, any tool that the search finds will just be removed
    * from the list in which it was found.
    */
  def replaceTool(name: String, newtool: Tool): Tool = js.native
  
  /**Gets or sets the mode-less ResizingTool, normally one of the .mouseDownTools.*/
  var resizingTool: ResizingTool = js.native
  
  /**Gets or sets the mode-less RotatingTool, normally one of the .mouseDownTools.*/
  var rotatingTool: RotatingTool = js.native
  
  /**
    * Show a tooltip Adornment.
    * @param {Adornment} tooltip
    * @param {GraphObject} obj The GraphObject getting the tooltip; this is null if the tooltip is being shown for the diagram background.
    */
  def showToolTip(tooltip: Adornment, obj: GraphObject): Unit = js.native
  
  /**Gets or sets the mode-less TextEditingTool, normally one of the .mouseUpTools.*/
  var textEditingTool: TextEditingTool = js.native
}
object ToolManager {
  
  @JSImport("go", "ToolManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**This value for gestureBehavior indicates that the pointer/touch pinch gestures on the canvas intend to have no effect on the Diagram, but also no effect on the page.*/
  /* static member */
  @JSImport("go", "ToolManager.GestureCancel")
  @js.native
  def GestureCancel: EnumValue = js.native
  @scala.inline
  def GestureCancel_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GestureCancel")(x.asInstanceOf[js.Any])
  
  /**This value for gestureBehavior indicates that the pointer/touch pinch gestures on the canvas intend to have no effect on the Diagram, but will not be prevented, and may bubble up the page to have other effects (such as zooming the page).*/
  /* static member */
  @JSImport("go", "ToolManager.GestureNone")
  @js.native
  def GestureNone: EnumValue = js.native
  @scala.inline
  def GestureNone_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GestureNone")(x.asInstanceOf[js.Any])
  
  /**This value for gestureBehavior indicates that the pointer/touch pinch gestures on the canvas intend to zoom the Diagram.*/
  /* static member */
  @JSImport("go", "ToolManager.GestureZoom")
  @js.native
  def GestureZoom: EnumValue = js.native
  @scala.inline
  def GestureZoom_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GestureZoom")(x.asInstanceOf[js.Any])
  
  /**This value for .mouseWheelBehavior indicates that the mouse wheel events are ignored, although scrolling or zooming by other means may still be allowed.*/
  /* static member */
  @JSImport("go", "ToolManager.WheelNone")
  @js.native
  def WheelNone: EnumValue = js.native
  @scala.inline
  def WheelNone_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelNone")(x.asInstanceOf[js.Any])
  
  /**This default value for .mouseWheelBehavior indicates that mouse wheel events scroll the diagram.*/
  /* static member */
  @JSImport("go", "ToolManager.WheelScroll")
  @js.native
  def WheelScroll: EnumValue = js.native
  @scala.inline
  def WheelScroll_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelScroll")(x.asInstanceOf[js.Any])
  
  /**This value for .mouseWheelBehavior indicates that the mouse wheel events change the scale of the diagram.*/
  /* static member */
  @JSImport("go", "ToolManager.WheelZoom")
  @js.native
  def WheelZoom: EnumValue = js.native
  @scala.inline
  def WheelZoom_=(x: EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WheelZoom")(x.asInstanceOf[js.Any])
}
