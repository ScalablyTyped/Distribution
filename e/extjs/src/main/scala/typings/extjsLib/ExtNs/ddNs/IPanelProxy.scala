package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelProxy
  extends extjsLib.ExtNs.IBase {
  /** [Method] Gets the proxy s element
  		* @returns Ext.Element The proxy's element
  		*/
  var getEl: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Method] Gets the proxy s ghost Panel
  		* @returns Ext.panel.Panel The proxy's ghost Panel
  		*/
  var getGhost: js.UndefOr[js.Function0[extjsLib.ExtNs.panelNs.IPanel]] = js.undefined
  /** [Method] Gets the proxy element
  		* @returns Ext.Element The proxy's element
  		*/
  var getProxy: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Method] Hides the proxy */
  var hide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var insertProxy: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var moveOnDrag: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Moves the proxy to a different position in the DOM
  		* @param parentNode HTMLElement The proxy's parent DOM node
  		* @param before HTMLElement The sibling node before which the proxy should be inserted. Defaults to the parent's last child if not specified.
  		*/
  var moveProxy: js.UndefOr[
    js.Function2[
      /* parentNode */ js.UndefOr[stdLib.HTMLElement], 
      /* before */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Ext.panel.Panel) */
  var panel: js.UndefOr[extjsLib.ExtNs.panelNs.IPanel] = js.undefined
  /** [Method] Shows the proxy */
  var show: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IPanelProxy {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getEl: js.Function0[extjsLib.ExtNs.IElement] = null,
    getGhost: js.Function0[extjsLib.ExtNs.panelNs.IPanel] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getProxy: js.Function0[extjsLib.ExtNs.IElement] = null,
    hide: js.Function0[scala.Unit] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IPanelProxy] = null,
    insertProxy: js.UndefOr[scala.Boolean] = js.undefined,
    mixins: js.Any = null,
    moveOnDrag: js.UndefOr[scala.Boolean] = js.undefined,
    moveProxy: js.Function2[
      /* parentNode */ js.UndefOr[stdLib.HTMLElement], 
      /* before */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ] = null,
    panel: extjsLib.ExtNs.panelNs.IPanel = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    show: js.Function0[scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IPanelProxy = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getEl != null) __obj.updateDynamic("getEl")(getEl)
    if (getGhost != null) __obj.updateDynamic("getGhost")(getGhost)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getProxy != null) __obj.updateDynamic("getProxy")(getProxy)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(insertProxy)) __obj.updateDynamic("insertProxy")(insertProxy)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (!js.isUndefined(moveOnDrag)) __obj.updateDynamic("moveOnDrag")(moveOnDrag)
    if (moveProxy != null) __obj.updateDynamic("moveProxy")(moveProxy)
    if (panel != null) __obj.updateDynamic("panel")(panel)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (show != null) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IPanelProxy]
  }
}

