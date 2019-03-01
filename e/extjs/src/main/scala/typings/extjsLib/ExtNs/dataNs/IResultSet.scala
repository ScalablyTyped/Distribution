package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResultSet
  extends extjsLib.ExtNs.IBase {
  /** [Config Option] (Number) */
  var count: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.data.Model[]) */
  var records: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Boolean) */
  var success: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var total: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var totalRecords: js.UndefOr[scala.Double] = js.undefined
}

object IResultSet {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    count: scala.Int | scala.Double = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IResultSet] = null,
    loaded: js.UndefOr[scala.Boolean] = js.undefined,
    mixins: js.Any = null,
    records: extjsLib.ExtNs.Array = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    success: js.UndefOr[scala.Boolean] = js.undefined,
    total: scala.Int | scala.Double = null,
    totalRecords: scala.Int | scala.Double = null,
    uses: extjsLib.ExtNs.Array = null
  ): IResultSet = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (records != null) __obj.updateDynamic("records")(records)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IResultSet]
  }
}

