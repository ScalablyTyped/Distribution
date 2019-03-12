package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToolbar
  extends extjsLib.ExtNs.containerNs.IContainer {
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var enableOverflow: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isToolbar: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var menuTriggerCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object IToolbar {
  @scala.inline
  def apply(
    IContainer: extjsLib.ExtNs.containerNs.IContainer = null,
    add: /* args */ js.UndefOr[js.Any] => _ = null,
    baseCls: java.lang.String = null,
    defaultButtonUI: java.lang.String = null,
    defaultType: java.lang.String = null,
    enableOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    getRefItems: /* deep */ js.UndefOr[js.Any] => scala.Unit = null,
    insert: (/* index */ js.UndefOr[scala.Double], /* component */ js.UndefOr[js.Any]) => IComponent = null,
    isToolbar: js.UndefOr[scala.Boolean] = js.undefined,
    layout: js.Any = null,
    menuTriggerCls: java.lang.String = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): IToolbar = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (defaultButtonUI != null) __obj.updateDynamic("defaultButtonUI")(defaultButtonUI)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (!js.isUndefined(enableOverflow)) __obj.updateDynamic("enableOverflow")(enableOverflow)
    if (getRefItems != null) __obj.updateDynamic("getRefItems")(js.Any.fromFunction1(getRefItems))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction2(insert))
    if (!js.isUndefined(isToolbar)) __obj.updateDynamic("isToolbar")(isToolbar)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (menuTriggerCls != null) __obj.updateDynamic("menuTriggerCls")(menuTriggerCls)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[IToolbar]
  }
}

