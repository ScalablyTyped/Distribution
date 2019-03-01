package typings
package extjsLib.ExtNs.gridNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragDrop
  extends extjsLib.ExtNs.IAbstractPlugin {
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
  var enableDrag: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
  		* @param view Object
  		*/
  @JSName("init")
  var init_IDragDrop: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IDragDrop {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clonePlugin: js.Function1[/* overrideCfg */ js.UndefOr[js.Any], scala.Unit] = null,
    config: js.Any = null,
    containerScroll: js.Any = null,
    ddGroup: java.lang.String = null,
    destroy: js.Function0[scala.Unit] = null,
    disable: js.Function0[scala.Unit] = null,
    dragGroup: java.lang.String = null,
    dragText: java.lang.String = null,
    dropGroup: java.lang.String = null,
    enable: js.Function0[scala.Unit] = null,
    enableDrag: js.UndefOr[scala.Boolean] = js.undefined,
    enableDrop: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    getCmp: js.Function0[extjsLib.ExtNs.IComponent] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    init: js.Function1[/* view */ js.UndefOr[js.Any], scala.Unit] = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IDragDrop] = null,
    isPlugin: js.UndefOr[scala.Boolean] = js.undefined,
    mixins: js.Any = null,
    pluginId: java.lang.String = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    setCmp: js.Function1[/* cmp */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IDragDrop = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clonePlugin != null) __obj.updateDynamic("clonePlugin")(clonePlugin)
    if (config != null) __obj.updateDynamic("config")(config)
    if (containerScroll != null) __obj.updateDynamic("containerScroll")(containerScroll)
    if (ddGroup != null) __obj.updateDynamic("ddGroup")(ddGroup)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (disable != null) __obj.updateDynamic("disable")(disable)
    if (dragGroup != null) __obj.updateDynamic("dragGroup")(dragGroup)
    if (dragText != null) __obj.updateDynamic("dragText")(dragText)
    if (dropGroup != null) __obj.updateDynamic("dropGroup")(dropGroup)
    if (enable != null) __obj.updateDynamic("enable")(enable)
    if (!js.isUndefined(enableDrag)) __obj.updateDynamic("enableDrag")(enableDrag)
    if (!js.isUndefined(enableDrop)) __obj.updateDynamic("enableDrop")(enableDrop)
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
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCmp != null) __obj.updateDynamic("setCmp")(setCmp)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IDragDrop]
  }
}

