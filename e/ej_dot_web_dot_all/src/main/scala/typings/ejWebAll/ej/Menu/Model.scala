package typings.ejWebAll.ej.Menu

import typings.ejWebAll.ej.AnimationType
import typings.ejWebAll.ej.Direction
import typings.ejWebAll.ej.MenuType
import typings.ejWebAll.ej.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** To enable or disable the Animation while hover or click an menu items.See AnimationType
    * @Default {ej.AnimationType.Default}
    */
  var animationType: js.UndefOr[AnimationType | String] = js.native
  
  /** Fires before context menu gets open.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
  
  /** Fires when mouse click on menu items.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  
  /** Fire when context menu on close.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  
  /** Specifies the container element selectors for submenuâ€™s collision. The submenu gets displayed based on spacing available with respect to container element.
    * @Default {null}
    */
  var container: js.UndefOr[String] = js.native
  
  /** Specifies the target id of context menu. On right clicking the specified contextTarget element, context menu gets shown.
    * @Default {null}
    */
  var contextMenuTarget: js.UndefOr[String] = js.native
  
  /** Fires to create menu items.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Specify the CSS class to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Fires to destroy menu items.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** To enable or disable the Animation effect while hover or click an menu items.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  
  /** Specifies the root menu items to be aligned center in horizontal menu.
    * @Default {false}
    */
  var enableCenterAlign: js.UndefOr[Boolean] = js.native
  
  /** Specifies the menu items to be displayed in right to left direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** When this property sets to false, the menu items is displayed without any separators.
    * @Default {true}
    */
  var enableSeparator: js.UndefOr[Boolean] = js.native
  
  /** Enable / Disable the Menu control.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Specifies the target which needs to be excluded. i.e., The context menu will not be displayed in those specified targets.
    * @Default {null}
    */
  var excludeTarget: js.UndefOr[String] = js.native
  
  /** Fields used to bind the data source and it includes following field members to make data bind easier.
    * @Default {null}
    */
  var fields: js.UndefOr[Fields] = js.native
  
  /** Specifies the height of the root menu.
    * @Default {auto}
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /** Specifies the list of HTML attributes to be added to menu control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  
  /** Enables/disables responsive support for the Menu control during the window resizing time.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Fires when key down on menu items.
    */
  var keydown: js.UndefOr[js.Function1[/* e */ KeydownEventArgs, Unit]] = js.native
  
  /** Specifies the type of the menu. Essential JavaScript Menu consists of two type of menu, they are Normal Menu and Context Menu mode.See MenuType
    * @Default {ej.MenuType.NormalMenu}
    */
  var menuType: js.UndefOr[String | MenuType] = js.native
  
  /** Fires when mouse out from menu items.
    */
  var mouseout: js.UndefOr[js.Function1[/* e */ MouseoutEventArgs, Unit]] = js.native
  
  /** Fires when mouse over the Menu items.
    */
  var mouseover: js.UndefOr[js.Function1[/* e */ MouseoverEventArgs, Unit]] = js.native
  
  /** Fires when context menu on open.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  
  /** Specifies the sub menu items to be show or open only on click.
    * @Default {false}
    */
  var openOnClick: js.UndefOr[Boolean] = js.native
  
  /** Specifies the orientation of normal menu. Normal menu can rendered in horizontal or vertical direction by using this API. See Orientation
    * @Default {ej.Orientation.Horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.native
  
  /** Fires when overflow popup menu closes.
    */
  var overflowClose: js.UndefOr[js.Function1[/* e */ OverflowCloseEventArgs, Unit]] = js.native
  
  /** Specifies the popup menu height.
    * @Default {auto}
    */
  var overflowHeight: js.UndefOr[String | Double] = js.native
  
  /** Fires when overflow popup menu opens.
    */
  var overflowOpen: js.UndefOr[js.Function1[/* e */ OverflowOpenEventArgs, Unit]] = js.native
  
  /** Specifies the popup menu width.
    * @Default {auto}
    */
  var overflowWidth: js.UndefOr[String | Double] = js.native
  
  /** Specifies the main menu items arrows only to be shown if it contains child items.
    * @Default {true}
    */
  var showRootLevelArrows: js.UndefOr[Boolean] = js.native
  
  /** Specifies the sub menu items arrows only to be shown if it contains child items.
    * @Default {true}
    */
  var showSubLevelArrows: js.UndefOr[Boolean] = js.native
  
  /** Specifies position of pull down submenu that will appear on mouse over.See Direction
    * @Default {ej.Direction.Right}
    */
  var subMenuDirection: js.UndefOr[String | Direction] = js.native
  
  /** Specifies the title to responsive menu.
    * @Default {Menu}
    */
  var titleText: js.UndefOr[String] = js.native
  
  /** Specifies the width of the main menu.
    * @Default {auto}
    */
  var width: js.UndefOr[String | Double] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setAnimationType(value: AnimationType | String): Self = this.set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationType: Self = this.set("animationType", js.undefined)
    
    @scala.inline
    def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = this.set("beforeOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    
    @scala.inline
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ CloseEventArgs => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContextMenuTarget(value: String): Self = this.set("contextMenuTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenuTarget: Self = this.set("contextMenuTarget", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    
    @scala.inline
    def setEnableCenterAlign(value: Boolean): Self = this.set("enableCenterAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCenterAlign: Self = this.set("enableCenterAlign", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnableSeparator(value: Boolean): Self = this.set("enableSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSeparator: Self = this.set("enableSeparator", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setExcludeTarget(value: String): Self = this.set("excludeTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeTarget: Self = this.set("excludeTarget", js.undefined)
    
    @scala.inline
    def setFields(value: Fields): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setKeydown(value: /* e */ KeydownEventArgs => Unit): Self = this.set("keydown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteKeydown: Self = this.set("keydown", js.undefined)
    
    @scala.inline
    def setMenuType(value: String | MenuType): Self = this.set("menuType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuType: Self = this.set("menuType", js.undefined)
    
    @scala.inline
    def setMouseout(value: /* e */ MouseoutEventArgs => Unit): Self = this.set("mouseout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseout: Self = this.set("mouseout", js.undefined)
    
    @scala.inline
    def setMouseover(value: /* e */ MouseoverEventArgs => Unit): Self = this.set("mouseover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseover: Self = this.set("mouseover", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOpenOnClick(value: Boolean): Self = this.set("openOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenOnClick: Self = this.set("openOnClick", js.undefined)
    
    @scala.inline
    def setOrientation(value: Orientation | String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setOverflowClose(value: /* e */ OverflowCloseEventArgs => Unit): Self = this.set("overflowClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOverflowClose: Self = this.set("overflowClose", js.undefined)
    
    @scala.inline
    def setOverflowHeight(value: String | Double): Self = this.set("overflowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowHeight: Self = this.set("overflowHeight", js.undefined)
    
    @scala.inline
    def setOverflowOpen(value: /* e */ OverflowOpenEventArgs => Unit): Self = this.set("overflowOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOverflowOpen: Self = this.set("overflowOpen", js.undefined)
    
    @scala.inline
    def setOverflowWidth(value: String | Double): Self = this.set("overflowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowWidth: Self = this.set("overflowWidth", js.undefined)
    
    @scala.inline
    def setShowRootLevelArrows(value: Boolean): Self = this.set("showRootLevelArrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRootLevelArrows: Self = this.set("showRootLevelArrows", js.undefined)
    
    @scala.inline
    def setShowSubLevelArrows(value: Boolean): Self = this.set("showSubLevelArrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSubLevelArrows: Self = this.set("showSubLevelArrows", js.undefined)
    
    @scala.inline
    def setSubMenuDirection(value: String | Direction): Self = this.set("subMenuDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubMenuDirection: Self = this.set("subMenuDirection", js.undefined)
    
    @scala.inline
    def setTitleText(value: String): Self = this.set("titleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleText: Self = this.set("titleText", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
