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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItemConstructorOptions extends js.Object {
  
  var accelerator: js.UndefOr[Accelerator] = js.native
  
  /**
    * default is `true`, and when `false` will prevent the accelerator from triggering
    * the item if the item is not visible`.
    *
    * @platform darwin
    */
  var acceleratorWorksWhenHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Inserts this item after the item with the specified label. If the referenced
    * item doesn't exist the item will be inserted at the end of the menu.
    */
  var after: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Provides a means for a single context menu to declare the placement of their
    * containing group after the containing group of the item with the specified
    * label.
    */
  var afterGroupContaining: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Inserts this item before the item with the specified label. If the referenced
    * item doesn't exist the item will be inserted at the end of  the menu. Also
    * implies that the menu item in question should be placed in the same “group” as
    * the item.
    */
  var before: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Provides a means for a single context menu to declare the placement of their
    * containing group before the containing group of the item with the specified
    * label.
    */
  var beforeGroupContaining: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Should only be specified for `checkbox` or `radio` type menu items.
    */
  var checked: js.UndefOr[Boolean] = js.native
  
  /**
    * Will be called with `click(menuItem, browserWindow, event)` when the menu item
    * is clicked.
    */
  var click: js.UndefOr[
    js.Function3[
      /* menuItem */ MenuItem, 
      /* browserWindow */ js.UndefOr[BrowserWindow], 
      /* event */ KeyboardEvent, 
      Unit
    ]
  ] = js.native
  
  /**
    * If false, the menu item will be greyed out and unclickable.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[NativeImage_ | String] = js.native
  
  /**
    * Unique within a single menu. If defined then it can be used as a reference to
    * this item by the position attribute.
    */
  var id: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  /**
    * If false, the accelerator won't be registered with the system, but it will still
    * be displayed. Defaults to true.
    *
    * @platform linux,win32
    */
  var registerAccelerator: js.UndefOr[Boolean] = js.native
  
  /**
    * Can be `undo`, `redo`, `cut`, `copy`, `paste`, `pasteAndMatchStyle`, `delete`,
    * `selectAll`, `reload`, `forceReload`, `toggleDevTools`, `resetZoom`, `zoomIn`,
    * `zoomOut`, `togglefullscreen`, `window`, `minimize`, `close`, `help`, `about`,
    * `services`, `hide`, `hideOthers`, `unhide`, `quit`, `startSpeaking`,
    * `stopSpeaking`, `zoom`, `front`, `appMenu`, `fileMenu`, `editMenu`, `viewMenu`,
    * `recentDocuments`, `toggleTabBar`, `selectNextTab`, `selectPreviousTab`,
    * `mergeAllWindows`, `clearRecentDocuments`, `moveTabToNewWindow` or `windowMenu`
    * - Define the action of the menu item, when specified the `click` property will
    * be ignored. See roles.
    */
  var role: js.UndefOr[
    undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
  ] = js.native
  
  var sublabel: js.UndefOr[String] = js.native
  
  /**
    * Should be specified for `submenu` type menu items. If `submenu` is specified,
    * the `type: 'submenu'` can be omitted. If the value is not a `Menu` then it will
    * be automatically converted to one using `Menu.buildFromTemplate`.
    */
  var submenu: js.UndefOr[js.Array[MenuItemConstructorOptions] | Menu] = js.native
  
  /**
    * Hover text for this menu item.
    *
    * @platform darwin
    */
  var toolTip: js.UndefOr[String] = js.native
  
  /**
    * Can be `normal`, `separator`, `submenu`, `checkbox` or `radio`.
    */
  var `type`: js.UndefOr[normal | separator | submenu | checkbox | radio] = js.native
  
  /**
    * If false, the menu item will be entirely hidden.
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object MenuItemConstructorOptions {
  
  @scala.inline
  def apply(): MenuItemConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemConstructorOptions]
  }
  
  @scala.inline
  implicit class MenuItemConstructorOptionsOps[Self <: MenuItemConstructorOptions] (val x: Self) extends AnyVal {
    
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
    def setAccelerator(value: Accelerator): Self = this.set("accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccelerator: Self = this.set("accelerator", js.undefined)
    
    @scala.inline
    def setAcceleratorWorksWhenHidden(value: Boolean): Self = this.set("acceleratorWorksWhenHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorWorksWhenHidden: Self = this.set("acceleratorWorksWhenHidden", js.undefined)
    
    @scala.inline
    def setAfterVarargs(value: String*): Self = this.set("after", js.Array(value :_*))
    
    @scala.inline
    def setAfter(value: js.Array[String]): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAfterGroupContainingVarargs(value: String*): Self = this.set("afterGroupContaining", js.Array(value :_*))
    
    @scala.inline
    def setAfterGroupContaining(value: js.Array[String]): Self = this.set("afterGroupContaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterGroupContaining: Self = this.set("afterGroupContaining", js.undefined)
    
    @scala.inline
    def setBeforeVarargs(value: String*): Self = this.set("before", js.Array(value :_*))
    
    @scala.inline
    def setBefore(value: js.Array[String]): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setBeforeGroupContainingVarargs(value: String*): Self = this.set("beforeGroupContaining", js.Array(value :_*))
    
    @scala.inline
    def setBeforeGroupContaining(value: js.Array[String]): Self = this.set("beforeGroupContaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeGroupContaining: Self = this.set("beforeGroupContaining", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setClick(
      value: (/* menuItem */ MenuItem, /* browserWindow */ js.UndefOr[BrowserWindow], /* event */ KeyboardEvent) => Unit
    ): Self = this.set("click", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setIcon(value: NativeImage_ | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setRegisterAccelerator(value: Boolean): Self = this.set("registerAccelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisterAccelerator: Self = this.set("registerAccelerator", js.undefined)
    
    @scala.inline
    def setRole(
      value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
    ): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSublabel(value: String): Self = this.set("sublabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSublabel: Self = this.set("sublabel", js.undefined)
    
    @scala.inline
    def setSubmenuVarargs(value: MenuItemConstructorOptions*): Self = this.set("submenu", js.Array(value :_*))
    
    @scala.inline
    def setSubmenu(value: js.Array[MenuItemConstructorOptions] | Menu): Self = this.set("submenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmenu: Self = this.set("submenu", js.undefined)
    
    @scala.inline
    def setToolTip(value: String): Self = this.set("toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolTip: Self = this.set("toolTip", js.undefined)
    
    @scala.inline
    def setType(value: normal | separator | submenu | checkbox | radio): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
