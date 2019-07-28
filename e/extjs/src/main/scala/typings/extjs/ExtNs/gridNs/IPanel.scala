package typings.extjs.ExtNs.gridNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.dataNs.IStore
import typings.extjs.ExtNs.panelNs.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel extends ITable {
  /** [Method] Reconfigures the grid with a new store columns
  		* @param store Ext.data.Store The new store.
  		* @param columns Object[] An array of column configs
  		*/
  var reconfigure: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array], Unit]
  ] = js.undefined
}

object IPanel {
  @scala.inline
  def apply(
    ITable: ITable = null,
    columns: js.Any = null,
    reconfigure: (/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array]) => Unit = null,
    rowLines: js.UndefOr[Boolean] = js.undefined,
    viewType: java.lang.String = null
  ): IPanel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ITable)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (reconfigure != null) __obj.updateDynamic("reconfigure")(js.Any.fromFunction2(reconfigure))
    if (!js.isUndefined(rowLines)) __obj.updateDynamic("rowLines")(rowLines)
    if (viewType != null) __obj.updateDynamic("viewType")(viewType)
    __obj.asInstanceOf[IPanel]
  }
}

