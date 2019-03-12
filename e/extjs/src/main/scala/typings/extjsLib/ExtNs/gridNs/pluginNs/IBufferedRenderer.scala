package typings
package extjsLib.ExtNs.gridNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBufferedRenderer
  extends extjsLib.ExtNs.IAbstractPlugin {
  /** [Method] Initialize this as a plugin
  		* @param grid Object
  		*/
  @JSName("init")
  var init_IBufferedRenderer: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var numFromEdge: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var percentageFromEdge: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var position: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Scrolls to and optionlly selects the specified row index in the total dataset
  		* @param recordIdx Number The zero-based position in the dataset to scroll to.
  		* @param doSelect Boolean Pass as true to select the specified row.
  		* @param callback Function A function to call when the row has been scrolled to.
  		* @param scope Object The scope (this reference) in which to execute the callback. Defaults to this BufferedRenderer.
  		*/
  var scrollTo: js.UndefOr[
    js.Function4[
      /* recordIdx */ js.UndefOr[scala.Double], 
      /* doSelect */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var scrollToLoadBuffer: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var synchronousRender: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var variableRowHeight: js.UndefOr[scala.Boolean] = js.undefined
}

object IBufferedRenderer {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clonePlugin: /* overrideCfg */ js.UndefOr[js.Any] => scala.Unit = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    disable: () => scala.Unit = null,
    enable: () => scala.Unit = null,
    extend: java.lang.String = null,
    getCmp: () => extjsLib.ExtNs.IComponent = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    init: /* grid */ js.UndefOr[js.Any] => scala.Unit = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IBufferedRenderer = null,
    isPlugin: js.UndefOr[scala.Boolean] = js.undefined,
    leadingBufferZone: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    numFromEdge: scala.Int | scala.Double = null,
    percentageFromEdge: scala.Int | scala.Double = null,
    pluginId: java.lang.String = null,
    position: scala.Int | scala.Double = null,
    requires: extjsLib.ExtNs.Array = null,
    scrollTo: (/* recordIdx */ js.UndefOr[scala.Double], /* doSelect */ js.UndefOr[scala.Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    scrollToLoadBuffer: scala.Int | scala.Double = null,
    self: extjsLib.ExtNs.IClass = null,
    setCmp: /* cmp */ js.UndefOr[extjsLib.ExtNs.IComponent] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    synchronousRender: js.UndefOr[scala.Boolean] = js.undefined,
    trailingBufferZone: scala.Int | scala.Double = null,
    uses: extjsLib.ExtNs.Array = null,
    variableRowHeight: js.UndefOr[scala.Boolean] = js.undefined
  ): IBufferedRenderer = {
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
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getCmp != null) __obj.updateDynamic("getCmp")(js.Any.fromFunction0(getCmp))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isPlugin)) __obj.updateDynamic("isPlugin")(isPlugin)
    if (leadingBufferZone != null) __obj.updateDynamic("leadingBufferZone")(leadingBufferZone.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (numFromEdge != null) __obj.updateDynamic("numFromEdge")(numFromEdge.asInstanceOf[js.Any])
    if (percentageFromEdge != null) __obj.updateDynamic("percentageFromEdge")(percentageFromEdge.asInstanceOf[js.Any])
    if (pluginId != null) __obj.updateDynamic("pluginId")(pluginId)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction4(scrollTo))
    if (scrollToLoadBuffer != null) __obj.updateDynamic("scrollToLoadBuffer")(scrollToLoadBuffer.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCmp != null) __obj.updateDynamic("setCmp")(js.Any.fromFunction1(setCmp))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(synchronousRender)) __obj.updateDynamic("synchronousRender")(synchronousRender)
    if (trailingBufferZone != null) __obj.updateDynamic("trailingBufferZone")(trailingBufferZone.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (!js.isUndefined(variableRowHeight)) __obj.updateDynamic("variableRowHeight")(variableRowHeight)
    __obj.asInstanceOf[IBufferedRenderer]
  }
}

