package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResultSet extends IBase {
  /** [Config Option] (Number) */
  var count: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.data.Model[]) */
  var records: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Boolean) */
  var success: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var total: js.UndefOr[Double] = js.undefined
  /** [Property] (Number) */
  var totalRecords: js.UndefOr[Double] = js.undefined
}

object IResultSet {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    count: Int | Double = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IResultSet = null,
    loaded: js.UndefOr[Boolean] = js.undefined,
    mixins: js.Any = null,
    records: Array = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    success: js.UndefOr[Boolean] = js.undefined,
    total: Int | Double = null,
    totalRecords: Int | Double = null,
    uses: Array = null
  ): IResultSet = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
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

