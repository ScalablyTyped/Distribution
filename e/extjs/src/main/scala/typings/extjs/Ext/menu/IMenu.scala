package typings.extjs.Ext.menu

import typings.extjs.Ext.IComponent
import typings.extjs.Ext.panel.IPanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenu extends IPanel {
  /** [Method] Invoked after the Component is shown after onShow is called */
  @JSName("afterShow")
  var afterShow_IMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var allowOtherMenus: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns whether a menu item can be activated or not
    * @param item Object
    * @returns Boolean
    */
  var canActivateItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Deactivates the current active item on the menu if one exists
    * @param andBlurFocusedItem Object
    */
  var deactivateActiveItem: js.UndefOr[js.Function1[/* andBlurFocusedItem */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[Boolean] = js.undefined
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
    * @returns Ext.Component this
    */
  @JSName("hide")
  var hide_IMenu: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Config Option] (Boolean) */
  var ignoreParentClicks: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isMenu: js.UndefOr[Boolean] = js.undefined
  /** [Method] Menus are never contained and must not ascertain their visibility from the ancestor hierarchy
    * @returns Boolean true if this component is visible, false otherwise.
    */
  @JSName("isVisible")
  var isVisible_IMenu: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Property] (Ext.menu.Menu) */
  var parentMenu: js.UndefOr[IMenu] = js.undefined
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.undefined
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
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var showSeparator: js.UndefOr[Boolean] = js.undefined
}

object IMenu {
  @scala.inline
  def apply(
    IPanel: IPanel = null,
    afterShow: () => Unit = null,
    allowOtherMenus: js.UndefOr[Boolean] = js.undefined,
    canActivateItem: /* item */ js.UndefOr[js.Any] => Boolean = null,
    deactivateActiveItem: /* andBlurFocusedItem */ js.UndefOr[js.Any] => Unit = null,
    enableKeyNav: js.UndefOr[Boolean] = js.undefined,
    hide: () => IComponent = null,
    ignoreParentClicks: js.UndefOr[Boolean] = js.undefined,
    isMenu: js.UndefOr[Boolean] = js.undefined,
    isVisible: () => Boolean = null,
    parentMenu: IMenu = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    showBy: (/* cmp */ js.UndefOr[js.Any], /* pos */ js.UndefOr[js.Any], /* off */ js.UndefOr[js.Any]) => IComponent = null,
    showSeparator: js.UndefOr[Boolean] = js.undefined
  ): IMenu = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    if (afterShow != null) __obj.updateDynamic("afterShow")(js.Any.fromFunction0(afterShow))
    if (!js.isUndefined(allowOtherMenus)) __obj.updateDynamic("allowOtherMenus")(allowOtherMenus.get.asInstanceOf[js.Any])
    if (canActivateItem != null) __obj.updateDynamic("canActivateItem")(js.Any.fromFunction1(canActivateItem))
    if (deactivateActiveItem != null) __obj.updateDynamic("deactivateActiveItem")(js.Any.fromFunction1(deactivateActiveItem))
    if (!js.isUndefined(enableKeyNav)) __obj.updateDynamic("enableKeyNav")(enableKeyNav.get.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (!js.isUndefined(ignoreParentClicks)) __obj.updateDynamic("ignoreParentClicks")(ignoreParentClicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isMenu)) __obj.updateDynamic("isMenu")(isMenu.get.asInstanceOf[js.Any])
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction0(isVisible))
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.get.asInstanceOf[js.Any])
    if (showBy != null) __obj.updateDynamic("showBy")(js.Any.fromFunction3(showBy))
    if (!js.isUndefined(showSeparator)) __obj.updateDynamic("showSeparator")(showSeparator.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenu]
  }
}

