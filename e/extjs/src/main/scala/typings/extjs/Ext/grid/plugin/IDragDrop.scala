package typings.extjs.Ext.grid.plugin

import typings.extjs.Ext.Array
import typings.extjs.Ext.IAbstractPlugin
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDrop extends IAbstractPlugin {
  /** [Config Option] (Object/Boolean) */
  var containerScroll: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dragGroup: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dragText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dropGroup: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var enableDrag: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableDrop: js.UndefOr[Boolean] = js.undefined
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
  		* @param view Object
  		*/
  @JSName("init")
  var init_IDragDrop: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IDragDrop {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clonePlugin: /* overrideCfg */ js.UndefOr[js.Any] => Unit = null,
    config: js.Any = null,
    containerScroll: js.Any = null,
    ddGroup: java.lang.String = null,
    destroy: () => Unit = null,
    disable: () => Unit = null,
    dragGroup: java.lang.String = null,
    dragText: java.lang.String = null,
    dropGroup: java.lang.String = null,
    enable: () => Unit = null,
    enableDrag: js.UndefOr[Boolean] = js.undefined,
    enableDrop: js.UndefOr[Boolean] = js.undefined,
    extend: java.lang.String = null,
    getCmp: () => IComponent = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    init: /* view */ js.UndefOr[js.Any] => Unit = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IDragDrop = null,
    isPlugin: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    pluginId: java.lang.String = null,
    requires: Array = null,
    self: IClass = null,
    setCmp: /* cmp */ js.UndefOr[IComponent] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IDragDrop = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clonePlugin != null) __obj.updateDynamic("clonePlugin")(js.Any.fromFunction1(clonePlugin))
    if (config != null) __obj.updateDynamic("config")(config)
    if (containerScroll != null) __obj.updateDynamic("containerScroll")(containerScroll)
    if (ddGroup != null) __obj.updateDynamic("ddGroup")(ddGroup)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (dragGroup != null) __obj.updateDynamic("dragGroup")(dragGroup)
    if (dragText != null) __obj.updateDynamic("dragText")(dragText)
    if (dropGroup != null) __obj.updateDynamic("dropGroup")(dropGroup)
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (!js.isUndefined(enableDrag)) __obj.updateDynamic("enableDrag")(enableDrag)
    if (!js.isUndefined(enableDrop)) __obj.updateDynamic("enableDrop")(enableDrop)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getCmp != null) __obj.updateDynamic("getCmp")(js.Any.fromFunction0(getCmp))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isPlugin)) __obj.updateDynamic("isPlugin")(isPlugin)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (pluginId != null) __obj.updateDynamic("pluginId")(pluginId)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCmp != null) __obj.updateDynamic("setCmp")(js.Any.fromFunction1(setCmp))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IDragDrop]
  }
}

