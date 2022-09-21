package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenu extends StObject {
  
  def addCallbackToMenuItem(menuItem: ContextMenuItem, target: js.Function0[Unit]): Unit = js.native
  
  def addSubmenuCallbackToMenuItem(menuItem: ContextMenuItem, menu: Any, x: Double, y: Double, shiftLeft: Boolean): Unit = js.native
  
  def createMenuItem(text: String): ContextMenuItem = js.native
  def createMenuItem(text: String, icon: String): ContextMenuItem = js.native
  def createMenuItem(text: String, icon: String, shortcut: String): ContextMenuItem = js.native
  def createMenuItem(text: String, icon: String, shortcut: String, expand: Boolean): ContextMenuItem = js.native
  def createMenuItem(text: String, icon: String, shortcut: Unit, expand: Boolean): ContextMenuItem = js.native
  def createMenuItem(text: String, icon: Unit, shortcut: String): ContextMenuItem = js.native
  def createMenuItem(text: String, icon: Unit, shortcut: String, expand: Boolean): ContextMenuItem = js.native
  def createMenuItem(text: String, icon: Unit, shortcut: Unit, expand: Boolean): ContextMenuItem = js.native
  
  def hide(menu: Any): Boolean = js.native
  
  def hideMenu(menu: Any): Unit = js.native
  
  def setMenuExpand(menuItem: ContextMenuItem, shiftLeft: Boolean, show: Boolean): Unit = js.native
  
  def setMenuItemIcon(menuItem: ContextMenuItem, iconClass: String): Unit = js.native
  
  def setMenuItemShortcut(menuItem: ContextMenuItem, shortcut: String): Unit = js.native
  
  def setMenuItemText(menuItem: ContextMenuItem, text: String): Unit = js.native
  
  def show(event: Any, menu: Any): Unit = js.native
  
  def showMenu(menu: Any, x: Double, y: Double): Unit = js.native
  def showMenu(menu: Any, x: Double, y: Double, shiftLeft: Boolean): Unit = js.native
}
