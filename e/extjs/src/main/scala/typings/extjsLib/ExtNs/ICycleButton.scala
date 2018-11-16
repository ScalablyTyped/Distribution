package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICycleButton
  extends extjsLib.ExtNs.buttonNs.ISplit {
  /** [Config Option] (Function) */
  var changeHandler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var forceGlyph: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var forceIcon: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Gets the currently active menu item
  		* @returns Ext.menu.CheckItem The active item
  		*/
  var getActiveItem: js.UndefOr[js.Function0[extjsLib.ExtNs.menuNs.ICheckItem]] = js.undefined
  /** [Config Option] (Object[]) */
  var items: js.UndefOr[Array] = js.undefined
  /** [Property] (Ext.menu.Menu) */
  @JSName("menu")
  var menu_ICycleButton: js.UndefOr[extjsLib.ExtNs.menuNs.IMenu] = js.undefined
  /** [Config Option] (String) */
  var prependText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the button s active menu item
  		* @param item Ext.menu.CheckItem The item to activate
  		* @param suppressEvent Boolean True to prevent the button's change event from firing.
  		*/
  var setActiveItem: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[extjsLib.ExtNs.menuNs.ICheckItem], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var showText: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] This is normally called internally on button click but can be called externally to advance the button s active item */
  var toggleSelected: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

