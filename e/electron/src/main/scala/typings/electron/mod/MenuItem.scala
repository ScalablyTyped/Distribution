package typings.electron.mod

import typings.electron.Electron.MenuItemConstructorOptions
import typings.electron.electronStrings.checkbox
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.radio
import typings.electron.electronStrings.separator
import typings.electron.electronStrings.submenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("electron", "MenuItem")
@js.native
class MenuItem protected ()
  extends StObject
     with typings.electron.Electron.MenuItem {
  // Docs: https://electronjs.org/docs/api/menu-item
  /**
    * MenuItem
    */
  def this(options: MenuItemConstructorOptions) = this()
  
  /* CompleteClass */
  var checked: Boolean = js.native
  
  /* CompleteClass */
  var click: js.Function = js.native
  
  /* CompleteClass */
  var commandId: Double = js.native
  
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /* CompleteClass */
  var id: String = js.native
  
  /* CompleteClass */
  var label: String = js.native
  
  /* CompleteClass */
  var menu: typings.electron.Electron.Menu = js.native
  
  /* CompleteClass */
  var registerAccelerator: Boolean = js.native
  
  /* CompleteClass */
  var sublabel: String = js.native
  
  /* CompleteClass */
  var toolTip: String = js.native
  
  /* CompleteClass */
  var `type`: normal | separator | submenu | checkbox | radio = js.native
  
  /* CompleteClass */
  var visible: Boolean = js.native
}
