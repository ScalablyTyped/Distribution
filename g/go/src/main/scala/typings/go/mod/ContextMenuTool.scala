package typings.go.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ContextMenuTool is used to create and show a context menu.
  * It automatically disables any browser context menu.
  */
@JSImport("go", "ContextMenuTool")
@js.native
/**
  * You do not normally need to create an instance of this tool because one already exists as the ToolManager.contextMenuTool, which you can modify.
  */
class ContextMenuTool () extends Tool {
  
  /**Gets or sets the currently showing context menu, or null if there is none.*/
  var currentContextMenu: Adornment = js.native
  
  /**Gets or sets the GraphObject found at the mouse point that has a context menu.*/
  var currentObject: GraphObject = js.native
  
  /**
    * Find a GraphObject at the current mouse point with a GraphObject.contextMenu, or return the Diagram if there is a Diagram.contextMenu.
    */
  def findObjectWithContextMenu(): GraphObject | Diagram = js.native
  
  /**
    * Hide any context menu.
    */
  def hideContextMenu(): Unit = js.native
  
  /**
    * Hide the default context menu.
    */
  def hideDefaultContextMenu(): Unit = js.native
  
  /**This read-only property returns the original mouse-down point in document coordinates.*/
  var mouseDownPoint: Point = js.native
  
  /**
    * This is called by .showContextMenu to position the context menu within the viewport.
    * @param {Adornment} contextmenu
    * @param {GraphObject} obj
    */
  def positionContextMenu(contextmenu: Adornment, obj: GraphObject): Unit = js.native
  
  /**
    * Show an Adornment as a context menu.
    * @param {Adornment} contextmenu
    * @param {GraphObject} obj
    */
  def showContextMenu(contextmenu: Adornment, obj: GraphObject): Unit = js.native
  
  /**
    * Show a series of HTML elements acting as a context menu.
    */
  def showDefaultContextMenu(): Unit = js.native
}
