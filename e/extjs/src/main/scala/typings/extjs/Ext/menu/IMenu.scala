package typings.extjs.Ext.menu

import typings.extjs.Ext.IComponent
import typings.extjs.Ext.panel.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenu extends IPanel {
  /** [Method] Invoked after the Component is shown after onShow is called */
  @JSName("afterShow")
  var afterShow_IMenu: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var allowOtherMenus: js.UndefOr[Boolean] = js.native
  /** [Method] Returns whether a menu item can be activated or not
    * @param item Object
    * @returns Boolean
    */
  var canActivateItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Deactivates the current active item on the menu if one exists
    * @param andBlurFocusedItem Object
    */
  var deactivateActiveItem: js.UndefOr[js.Function1[/* andBlurFocusedItem */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[Boolean] = js.native
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
    * @returns Ext.Component this
    */
  @JSName("hide")
  var hide_IMenu: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Config Option] (Boolean) */
  var ignoreParentClicks: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isMenu: js.UndefOr[Boolean] = js.native
  /** [Method] Menus are never contained and must not ascertain their visibility from the ancestor hierarchy
    * @returns Boolean true if this component is visible, false otherwise.
    */
  @JSName("isVisible")
  var isVisible_IMenu: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Property] (Ext.menu.Menu) */
  var parentMenu: js.UndefOr[IMenu] = js.native
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.native
  /** [Method] Shows this component by the specified Component or Element
    * @param cmp Object
    * @param pos Object
    * @param off Object
    * @returns Ext.Component this
    */
  @JSName("showBy")
  var showBy_IMenu: js.UndefOr[
    js.Function3[
      /* cmp */ js.UndefOr[js.Any], 
      /* pos */ js.UndefOr[js.Any], 
      /* off */ js.UndefOr[js.Any], 
      IComponent
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var showSeparator: js.UndefOr[Boolean] = js.native
}

object IMenu {
  @scala.inline
  def apply(): IMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenu]
  }
  @scala.inline
  implicit class IMenuOps[Self <: IMenu] (val x: Self) extends AnyVal {
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
    def setAfterShow(value: () => Unit): Self = this.set("afterShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterShow: Self = this.set("afterShow", js.undefined)
    @scala.inline
    def setAllowOtherMenus(value: Boolean): Self = this.set("allowOtherMenus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowOtherMenus: Self = this.set("allowOtherMenus", js.undefined)
    @scala.inline
    def setCanActivateItem(value: /* item */ js.UndefOr[js.Any] => Boolean): Self = this.set("canActivateItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCanActivateItem: Self = this.set("canActivateItem", js.undefined)
    @scala.inline
    def setDeactivateActiveItem(value: /* andBlurFocusedItem */ js.UndefOr[js.Any] => Unit): Self = this.set("deactivateActiveItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeactivateActiveItem: Self = this.set("deactivateActiveItem", js.undefined)
    @scala.inline
    def setEnableKeyNav(value: Boolean): Self = this.set("enableKeyNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableKeyNav: Self = this.set("enableKeyNav", js.undefined)
    @scala.inline
    def setHide(value: () => IComponent): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setIgnoreParentClicks(value: Boolean): Self = this.set("ignoreParentClicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreParentClicks: Self = this.set("ignoreParentClicks", js.undefined)
    @scala.inline
    def setIsMenu(value: Boolean): Self = this.set("isMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMenu: Self = this.set("isMenu", js.undefined)
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    @scala.inline
    def setParentMenu(value: IMenu): Self = this.set("parentMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentMenu: Self = this.set("parentMenu", js.undefined)
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    @scala.inline
    def setShowBy(
      value: (/* cmp */ js.UndefOr[js.Any], /* pos */ js.UndefOr[js.Any], /* off */ js.UndefOr[js.Any]) => IComponent
    ): Self = this.set("showBy", js.Any.fromFunction3(value))
    @scala.inline
    def deleteShowBy: Self = this.set("showBy", js.undefined)
    @scala.inline
    def setShowSeparator(value: Boolean): Self = this.set("showSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSeparator: Self = this.set("showSeparator", js.undefined)
  }
  
}

