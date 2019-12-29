package typings.extjs.Ext.panel

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProxy extends IBase {
  /** [Method] Gets the proxy s element
  		* @returns Ext.Element The proxy's element
  		*/
  var getEl: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Gets the proxy s ghost Panel
  		* @returns Ext.panel.Panel The proxy's ghost Panel
  		*/
  var getGhost: js.UndefOr[js.Function0[IPanel]] = js.undefined
  /** [Method] Gets the proxy element
  		* @returns Ext.Element The proxy's element
  		*/
  var getProxy: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Hides the proxy */
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var insertProxy: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var moveOnDrag: js.UndefOr[Boolean] = js.undefined
  /** [Method] Moves the proxy to a different position in the DOM
  		* @param parentNode HTMLElement The proxy's parent DOM node
  		* @param before HTMLElement The sibling node before which the proxy should be inserted. Defaults to the parent's last child if not specified.
  		*/
  var moveProxy: js.UndefOr[
    js.Function2[/* parentNode */ js.UndefOr[HTMLElement], /* before */ js.UndefOr[HTMLElement], Unit]
  ] = js.undefined
  /** [Property] (Ext.panel.Panel) */
  var panel: js.UndefOr[IPanel] = js.undefined
  /** [Method] Shows the proxy */
  var show: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IProxy {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    extend: String = null,
    getEl: () => IElement = null,
    getGhost: () => IPanel = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getProxy: () => IElement = null,
    hide: () => Unit = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IProxy = null,
    insertProxy: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    moveOnDrag: js.UndefOr[Boolean] = js.undefined,
    moveProxy: (/* parentNode */ js.UndefOr[HTMLElement], /* before */ js.UndefOr[HTMLElement]) => Unit = null,
    panel: IPanel = null,
    requires: Array = null,
    self: IClass = null,
    show: () => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IProxy = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getEl != null) __obj.updateDynamic("getEl")(js.Any.fromFunction0(getEl))
    if (getGhost != null) __obj.updateDynamic("getGhost")(js.Any.fromFunction0(getGhost))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getProxy != null) __obj.updateDynamic("getProxy")(js.Any.fromFunction0(getProxy))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(insertProxy)) __obj.updateDynamic("insertProxy")(insertProxy.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOnDrag)) __obj.updateDynamic("moveOnDrag")(moveOnDrag.asInstanceOf[js.Any])
    if (moveProxy != null) __obj.updateDynamic("moveProxy")(js.Any.fromFunction2(moveProxy))
    if (panel != null) __obj.updateDynamic("panel")(panel.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProxy]
  }
}

