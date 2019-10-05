package typings.extjs.Ext.layout.boxoverflow

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenu extends IBase {
  /** [Property] (Array) */
  var menuItems: js.UndefOr[Array] = js.undefined
  /** [Property] (String) */
  var noItemsMenuText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var triggerButtonCls: js.UndefOr[java.lang.String] = js.undefined
}

object IMenu {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IMenu = null,
    menuItems: Array = null,
    mixins: js.Any = null,
    noItemsMenuText: java.lang.String = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    triggerButtonCls: java.lang.String = null,
    uses: Array = null
  ): IMenu = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (noItemsMenuText != null) __obj.updateDynamic("noItemsMenuText")(noItemsMenuText)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (triggerButtonCls != null) __obj.updateDynamic("triggerButtonCls")(triggerButtonCls)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IMenu]
  }
}

