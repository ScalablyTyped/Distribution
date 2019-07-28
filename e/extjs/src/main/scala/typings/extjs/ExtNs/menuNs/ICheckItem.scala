package typings.extjs.ExtNs.menuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckItem extends IItem {
  /** [Config Option] (Boolean) */
  var checkChangeDisabled: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Function) */
  var checkHandler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var checkedCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Disables just the checkbox functionality of this menu Item  */
  var disableCheckChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Reenables the checkbox functionality of this menu item after having been disabled by disableCheckChange */
  var enableCheckChange: js.UndefOr[js.Function0[Unit]] = js.undefined
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
    js.Function2[/* checked */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var uncheckedCls: js.UndefOr[java.lang.String] = js.undefined
}

object ICheckItem {
  @scala.inline
  def apply(
    IItem: IItem = null,
    afterRender: () => Unit = null,
    checkChangeDisabled: js.UndefOr[Boolean] = js.undefined,
    checkHandler: js.Any = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    checkedCls: java.lang.String = null,
    disableCheckChange: () => Unit = null,
    enableCheckChange: () => Unit = null,
    group: java.lang.String = null,
    groupCls: java.lang.String = null,
    hideOnClick: js.UndefOr[Boolean] = js.undefined,
    initComponent: () => Unit = null,
    onDestroy: () => Unit = null,
    renderTpl: js.Any = null,
    scope: js.Any = null,
    setChecked: (/* checked */ js.UndefOr[Boolean], /* suppressEvents */ js.UndefOr[Boolean]) => Unit = null,
    uncheckedCls: java.lang.String = null
  ): ICheckItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IItem)
    if (afterRender != null) __obj.updateDynamic("afterRender")(js.Any.fromFunction0(afterRender))
    if (!js.isUndefined(checkChangeDisabled)) __obj.updateDynamic("checkChangeDisabled")(checkChangeDisabled)
    if (checkHandler != null) __obj.updateDynamic("checkHandler")(checkHandler)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (checkedCls != null) __obj.updateDynamic("checkedCls")(checkedCls)
    if (disableCheckChange != null) __obj.updateDynamic("disableCheckChange")(js.Any.fromFunction0(disableCheckChange))
    if (enableCheckChange != null) __obj.updateDynamic("enableCheckChange")(js.Any.fromFunction0(enableCheckChange))
    if (group != null) __obj.updateDynamic("group")(group)
    if (groupCls != null) __obj.updateDynamic("groupCls")(groupCls)
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick)
    if (initComponent != null) __obj.updateDynamic("initComponent")(js.Any.fromFunction0(initComponent))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction0(onDestroy))
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (setChecked != null) __obj.updateDynamic("setChecked")(js.Any.fromFunction2(setChecked))
    if (uncheckedCls != null) __obj.updateDynamic("uncheckedCls")(uncheckedCls)
    __obj.asInstanceOf[ICheckItem]
  }
}

