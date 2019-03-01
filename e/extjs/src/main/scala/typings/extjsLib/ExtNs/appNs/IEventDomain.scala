package typings
package extjsLib.ExtNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventDomain
  extends extjsLib.ExtNs.IBase {
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
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] This method is called by the derived class to monitor fireEvent calls
  		* @param observable Ext.Class The Observable to monitor for events.
  		*/
  var monitor: js.UndefOr[js.Function1[/* observable */ js.UndefOr[extjsLib.ExtNs.IClass], scala.Unit]] = js.undefined
}

object IEventDomain {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    idProperty: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IEventDomain] = null,
    instances: js.Any = null,
    `match`: js.Function2[
      /* target */ js.UndefOr[js.Any], 
      /* selector */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ] = null,
    mixins: js.Any = null,
    monitor: js.Function1[/* observable */ js.UndefOr[extjsLib.ExtNs.IClass], scala.Unit] = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IEventDomain = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (idProperty != null) __obj.updateDynamic("idProperty")(idProperty)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (instances != null) __obj.updateDynamic("instances")(instances)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (monitor != null) __obj.updateDynamic("monitor")(monitor)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IEventDomain]
  }
}

