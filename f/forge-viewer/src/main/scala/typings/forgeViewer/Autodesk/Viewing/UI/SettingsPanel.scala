package typings.forgeViewer.Autodesk.Viewing.UI

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsPanel
  extends StObject
     with DockingPanel {
  
  def addCheckbox(tabId: String, caption: String, initialState: Boolean, onchange: js.Function0[Unit]): String = js.native
  def addCheckbox(
    tabId: String,
    caption: String,
    initialState: Boolean,
    onchange: js.Function0[Unit],
    options: js.Object
  ): String = js.native
  
  def addControl(tabId: String, control: js.Object): String = js.native
  def addControl(tabId: String, control: js.Object, options: js.Object): String = js.native
  def addControl(tabId: String, control: HTMLElement): String = js.native
  def addControl(tabId: String, control: HTMLElement, options: js.Object): String = js.native
  
  def addDropDownMenu(
    tabId: String,
    caption: String,
    items: js.Array[MenuItem],
    initialItemIndex: Double,
    onchange: js.Function0[Unit]
  ): String = js.native
  def addDropDownMenu(
    tabId: String,
    caption: String,
    items: js.Array[MenuItem],
    initialItemIndex: Double,
    onchange: js.Function0[Unit],
    options: js.Object
  ): String = js.native
  
  def addSlider(
    tabId: String,
    caption: String,
    min: Double,
    max: Double,
    initialValue: Double,
    onchange: js.Function0[Unit]
  ): String = js.native
  def addSlider(
    tabId: String,
    caption: String,
    min: Double,
    max: Double,
    initialValue: Double,
    onchange: js.Function0[Unit],
    options: js.Object
  ): String = js.native
  
  def addTab(tabId: String, tabTitle: String): Boolean = js.native
  def addTab(tabId: String, tabTitle: String, options: js.Object): Boolean = js.native
  
  def getControl(controlId: String): js.Object = js.native
  
  def hasTab(tabId: String): Boolean = js.native
  
  def isTabSelected(tabId: String): Boolean = js.native
  
  def removeCheckbox(checkboxId: String): Boolean = js.native
  def removeCheckbox(checkboxId: Control): Boolean = js.native
  
  def removeControl(controlId: String): Boolean = js.native
  def removeControl(controlId: Control): Boolean = js.native
  
  def removeDropdownMenu(dropdownMenuId: String): Boolean = js.native
  def removeDropdownMenu(dropdownMenuId: Control): Boolean = js.native
  
  def removeSlider(sliderId: String): Boolean = js.native
  def removeSlider(sliderId: Control): Boolean = js.native
  
  def removeTab(tabId: String): Boolean = js.native
  
  def selectTab(tabId: String): Boolean = js.native
  
  def setVisible(show: Boolean, skipTransition: Boolean): Unit = js.native
}
