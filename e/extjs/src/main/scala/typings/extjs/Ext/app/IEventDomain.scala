package typings.extjs.Ext.app

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventDomain extends IBase {
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Object) */
  var instances: js.UndefOr[js.Any] = js.undefined
  /** [Method] This method matches the firer of the event the target to the given selector
  		* @param target Object The firer of the event.
  		* @param selector String The selector to which to match the target.
  		* @returns Boolean true if the target matches the selector.
  		*/
  var `match`: js.UndefOr[
    js.Function2[
      /* target */ js.UndefOr[js.Any], 
      /* selector */ js.UndefOr[java.lang.String], 
      Boolean
    ]
  ] = js.undefined
  /** [Method] This method is called by the derived class to monitor fireEvent calls
  		* @param observable Ext.Class The Observable to monitor for events.
  		*/
  var monitor: js.UndefOr[js.Function1[/* observable */ js.UndefOr[IClass], Unit]] = js.undefined
}

object IEventDomain {
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
    idProperty: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IEventDomain = null,
    instances: js.Any = null,
    `match`: (/* target */ js.UndefOr[js.Any], /* selector */ js.UndefOr[java.lang.String]) => Boolean = null,
    mixins: js.Any = null,
    monitor: /* observable */ js.UndefOr[IClass] => Unit = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IEventDomain = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (instances != null) __obj.updateDynamic("instances")(instances)
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (monitor != null) __obj.updateDynamic("monitor")(js.Any.fromFunction1(monitor))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IEventDomain]
  }
}

