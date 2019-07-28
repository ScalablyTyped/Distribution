package typings.extjs.ExtNs.gridNs.columnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckColumn
  extends typings.extjs.ExtNs.gridNs.columnNs.IColumn {
  /** [Method] Disables this CheckColumn
  		* @param silent Boolean
  		*/
  @JSName("onDisable")
  var onDisable_ICheckColumn: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Enables this CheckColumn
  		* @param silent Boolean
  		*/
  @JSName("onEnable")
  var onEnable_ICheckColumn: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var stopSelection: js.UndefOr[Boolean] = js.undefined
}

object ICheckColumn {
  @scala.inline
  def apply(
    IColumn: typings.extjs.ExtNs.gridNs.columnNs.IColumn = null,
    onDisable: /* silent */ js.UndefOr[Boolean] => Unit = null,
    onEnable: /* silent */ js.UndefOr[Boolean] => Unit = null,
    stopSelection: js.UndefOr[Boolean] = js.undefined,
    tdCls: java.lang.String = null
  ): ICheckColumn = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IColumn)
    if (onDisable != null) __obj.updateDynamic("onDisable")(js.Any.fromFunction1(onDisable))
    if (onEnable != null) __obj.updateDynamic("onEnable")(js.Any.fromFunction1(onEnable))
    if (!js.isUndefined(stopSelection)) __obj.updateDynamic("stopSelection")(stopSelection)
    if (tdCls != null) __obj.updateDynamic("tdCls")(tdCls)
    __obj.asInstanceOf[ICheckColumn]
  }
}

