package typings.extjs.Ext.grid.plugin

import typings.extjs.Ext.Array
import typings.extjs.Ext.IAbstractPlugin
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderResizer extends IAbstractPlugin {
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of dynamic
  		* @returns Boolean
  		*/
  var getDynamic: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] not using w and e resize bc we are only ever resizing one column wResizeCursor Ext isWebKit w resize  col resi
  		* @param headerCt Object
  		*/
  @JSName("init")
  var init_IHeaderResizer: js.UndefOr[js.Function1[/* headerCt */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of dynamic
  		* @param dynamic Boolean
  		*/
  var setDynamic: js.UndefOr[js.Function1[/* dynamic */ js.UndefOr[Boolean], Unit]] = js.undefined
}

object IHeaderResizer {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clonePlugin: /* overrideCfg */ js.UndefOr[js.Any] => Unit = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    disable: () => Unit = null,
    dynamic: js.UndefOr[Boolean] = js.undefined,
    enable: () => Unit = null,
    extend: java.lang.String = null,
    getCmp: () => IComponent = null,
    getDynamic: () => Boolean = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    init: /* headerCt */ js.UndefOr[js.Any] => Unit = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IHeaderResizer = null,
    isPlugin: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    pluginId: java.lang.String = null,
    requires: Array = null,
    self: IClass = null,
    setCmp: /* cmp */ js.UndefOr[IComponent] => Unit = null,
    setDynamic: /* dynamic */ js.UndefOr[Boolean] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IHeaderResizer = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clonePlugin != null) __obj.updateDynamic("clonePlugin")(js.Any.fromFunction1(clonePlugin))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic)
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getCmp != null) __obj.updateDynamic("getCmp")(js.Any.fromFunction0(getCmp))
    if (getDynamic != null) __obj.updateDynamic("getDynamic")(js.Any.fromFunction0(getDynamic))
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
    if (setDynamic != null) __obj.updateDynamic("setDynamic")(js.Any.fromFunction1(setDynamic))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IHeaderResizer]
  }
}

