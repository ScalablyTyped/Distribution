package typings.extjs.Ext

import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.panel.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListView extends ITable {
  /** [Method] Reconfigures the grid with a new store columns
  		* @param store Ext.data.Store The new store.
  		* @param columns Object[] An array of column configs
  		*/
  var reconfigure: js.UndefOr[
    js.Function2[/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array], Unit]
  ] = js.undefined
}

object IListView {
  @scala.inline
  def apply(
    ITable: ITable = null,
    reconfigure: (/* store */ js.UndefOr[IStore], /* columns */ js.UndefOr[Array]) => Unit = null
  ): IListView = {
    val __obj = js.Dynamic.literal()
    if (ITable != null) js.Dynamic.global.Object.assign(__obj, ITable)
    if (reconfigure != null) __obj.updateDynamic("reconfigure")(js.Any.fromFunction2(reconfigure))
    __obj.asInstanceOf[IListView]
  }
}

