package typings
package extjsLib.ExtNs.menuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenu
  extends extjsLib.ExtNs.panelNs.IPanel {
  /** [Method] Invoked after the Component is shown after onShow is called */
  @JSName("afterShow")
  var afterShow_IMenu: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var allowOtherMenus: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns whether a menu item can be activated or not
  		* @param item Object
  		* @returns Boolean
  		*/
  var canActivateItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Deactivates the current active item on the menu if one exists
  		* @param andBlurFocusedItem Object
  		*/
  var deactivateActiveItem: js.UndefOr[js.Function1[/* andBlurFocusedItem */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
  		* @returns Ext.Component this
  		*/
  @JSName("hide")
  var hide_IMenu: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Config Option] (Boolean) */
  var ignoreParentClicks: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isMenu: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Menus are never contained and must not ascertain their visibility from the ancestor hierarchy
  		* @returns Boolean true if this component is visible, false otherwise.
  		*/
  @JSName("isVisible")
  var isVisible_IMenu: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Property] (Ext.menu.Menu) */
  var parentMenu: js.UndefOr[IMenu] = js.undefined
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[scala.Boolean] = js.undefined
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
      extjsLib.ExtNs.IComponent
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var showSeparator: js.UndefOr[scala.Boolean] = js.undefined
}

