package typings.electron.Electron

import typings.electron.electronStrings.about
import typings.electron.electronStrings.appMenu
import typings.electron.electronStrings.checkbox
import typings.electron.electronStrings.clearRecentDocuments
import typings.electron.electronStrings.close
import typings.electron.electronStrings.copy
import typings.electron.electronStrings.cut
import typings.electron.electronStrings.delete
import typings.electron.electronStrings.editMenu
import typings.electron.electronStrings.fileMenu
import typings.electron.electronStrings.forceReload
import typings.electron.electronStrings.front
import typings.electron.electronStrings.help
import typings.electron.electronStrings.hide
import typings.electron.electronStrings.hideOthers
import typings.electron.electronStrings.mergeAllWindows
import typings.electron.electronStrings.minimize
import typings.electron.electronStrings.moveTabToNewWindow
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.paste
import typings.electron.electronStrings.pasteAndMatchStyle
import typings.electron.electronStrings.quit
import typings.electron.electronStrings.radio
import typings.electron.electronStrings.recentDocuments
import typings.electron.electronStrings.redo
import typings.electron.electronStrings.reload
import typings.electron.electronStrings.resetZoom
import typings.electron.electronStrings.selectAll
import typings.electron.electronStrings.selectNextTab
import typings.electron.electronStrings.selectPreviousTab
import typings.electron.electronStrings.separator
import typings.electron.electronStrings.services
import typings.electron.electronStrings.startSpeaking
import typings.electron.electronStrings.stopSpeaking
import typings.electron.electronStrings.submenu
import typings.electron.electronStrings.toggleDevTools
import typings.electron.electronStrings.toggleTabBar
import typings.electron.electronStrings.togglefullscreen
import typings.electron.electronStrings.undo
import typings.electron.electronStrings.unhide
import typings.electron.electronStrings.viewMenu
import typings.electron.electronStrings.window
import typings.electron.electronStrings.windowMenu
import typings.electron.electronStrings.zoom
import typings.electron.electronStrings.zoomIn
import typings.electron.electronStrings.zoomOut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItem extends StObject {
  
  var accelerator: js.UndefOr[Accelerator] = js.undefined
  
  var checked: Boolean
  
  var click: js.Function
  
  var commandId: Double
  
  var enabled: Boolean
  
  var icon: js.UndefOr[NativeImage_ | String] = js.undefined
  
  var id: String
  
  var label: String
  
  var menu: Menu
  
  var registerAccelerator: Boolean
  
  var role: js.UndefOr[
    undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
  ] = js.undefined
  
  var sublabel: String
  
  var submenu: js.UndefOr[Menu] = js.undefined
  
  var toolTip: String
  
  var `type`: normal | separator | submenu | checkbox | radio
  
  var visible: Boolean
}
object MenuItem {
  
  inline def apply(
    checked: Boolean,
    click: js.Function,
    commandId: Double,
    enabled: Boolean,
    id: String,
    label: String,
    menu: Menu,
    registerAccelerator: Boolean,
    sublabel: String,
    toolTip: String,
    `type`: normal | separator | submenu | checkbox | radio,
    visible: Boolean
  ): MenuItem = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], commandId = commandId.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], registerAccelerator = registerAccelerator.asInstanceOf[js.Any], sublabel = sublabel.asInstanceOf[js.Any], toolTip = toolTip.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
  
  extension [Self <: MenuItem](x: Self) {
    
    inline def setAccelerator(value: Accelerator): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setClick(value: js.Function): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setCommandId(value: Double): Self = StObject.set(x, "commandId", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setRegisterAccelerator(value: Boolean): Self = StObject.set(x, "registerAccelerator", value.asInstanceOf[js.Any])
    
    inline def setRole(
      value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
    ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSublabel(value: String): Self = StObject.set(x, "sublabel", value.asInstanceOf[js.Any])
    
    inline def setSubmenu(value: Menu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
    
    inline def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
    
    inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    
    inline def setType(value: normal | separator | submenu | checkbox | radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
