package typings
package extjsLib.ExtNs.gridNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowExpander
  extends extjsLib.ExtNs.IAbstractPlugin {
  /** [Config Option] (Boolean) */
  var expandOnDblClick: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var expandOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
  		* @param grid Object
  		*/
  @JSName("init")
  var init_IRowExpander: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var selectRowOnExpand: js.UndefOr[scala.Boolean] = js.undefined
}

object IRowExpander {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clonePlugin: js.Function1[/* overrideCfg */ js.UndefOr[js.Any], scala.Unit] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    disable: js.Function0[scala.Unit] = null,
    enable: js.Function0[scala.Unit] = null,
    expandOnDblClick: js.UndefOr[scala.Boolean] = js.undefined,
    expandOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    getCmp: js.Function0[extjsLib.ExtNs.IComponent] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    init: js.Function1[/* grid */ js.UndefOr[js.Any], scala.Unit] = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IRowExpander] = null,
    isPlugin: js.UndefOr[scala.Boolean] = js.undefined,
    mixins: js.Any = null,
    pluginId: java.lang.String = null,
    requires: extjsLib.ExtNs.Array = null,
    selectRowOnExpand: js.UndefOr[scala.Boolean] = js.undefined,
    self: extjsLib.ExtNs.IClass = null,
    setCmp: js.Function1[/* cmp */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IRowExpander = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clonePlugin != null) __obj.updateDynamic("clonePlugin")(clonePlugin)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (disable != null) __obj.updateDynamic("disable")(disable)
    if (enable != null) __obj.updateDynamic("enable")(enable)
    if (!js.isUndefined(expandOnDblClick)) __obj.updateDynamic("expandOnDblClick")(expandOnDblClick)
    if (!js.isUndefined(expandOnEnter)) __obj.updateDynamic("expandOnEnter")(expandOnEnter)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getCmp != null) __obj.updateDynamic("getCmp")(getCmp)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (init != null) __obj.updateDynamic("init")(init)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(isPlugin)) __obj.updateDynamic("isPlugin")(isPlugin)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (pluginId != null) __obj.updateDynamic("pluginId")(pluginId)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (!js.isUndefined(selectRowOnExpand)) __obj.updateDynamic("selectRowOnExpand")(selectRowOnExpand)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCmp != null) __obj.updateDynamic("setCmp")(setCmp)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IRowExpander]
  }
}

