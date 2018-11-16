package typings
package extjsLib.ExtNs.menuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICheckItem extends IItem {
  /** [Config Option] (Boolean) */
  var checkChangeDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Function) */
  var checkHandler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var checkedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Disables just the checkbox functionality of this menu Item  */
  var disableCheckChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Reenables the checkbox functionality of this menu item after having been disabled by disableCheckChange */
  var enableCheckChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var group: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var groupCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the checked state of the item
  		* @param checked Boolean True to check, false to uncheck
  		* @param suppressEvents Boolean True to prevent firing the checkchange events.
  		*/
  var setChecked: js.UndefOr[
    js.Function2[
      /* checked */ js.UndefOr[scala.Boolean], 
      /* suppressEvents */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var uncheckedCls: js.UndefOr[java.lang.String] = js.undefined
}

