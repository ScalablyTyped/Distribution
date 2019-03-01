package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListView
  extends extjsLib.ExtNs.panelNs.ITable {
  /** [Method] Reconfigures the grid with a new store columns
  		* @param store Ext.data.Store The new store.
  		* @param columns Object[] An array of column configs
  		*/
  var reconfigure: js.UndefOr[
    js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], 
      /* columns */ js.UndefOr[Array], 
      scala.Unit
    ]
  ] = js.undefined
}

object IListView {
  @scala.inline
  def apply(
    ITable: extjsLib.ExtNs.panelNs.ITable = null,
    columns: js.Any = null,
    reconfigure: js.Function2[
      /* store */ js.UndefOr[extjsLib.ExtNs.dataNs.IStore], 
      /* columns */ js.UndefOr[Array], 
      scala.Unit
    ] = null,
    rowLines: js.UndefOr[scala.Boolean] = js.undefined,
    viewType: java.lang.String = null
  ): IListView = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ITable)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (reconfigure != null) __obj.updateDynamic("reconfigure")(reconfigure)
    if (!js.isUndefined(rowLines)) __obj.updateDynamic("rowLines")(rowLines)
    if (viewType != null) __obj.updateDynamic("viewType")(viewType)
    __obj.asInstanceOf[IListView]
  }
}

