package typings.extjs.Ext.grid

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnModel extends IBase {
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
    * @param index Number The column index for which to retrieve the column.
    * @returns Ext.grid.column.Column The header. null if it doesn't exist.
    */
  var getHeaderAtIndex: js.UndefOr[
    js.Function1[/* index */ js.UndefOr[Double], typings.extjs.Ext.grid.column.IColumn]
  ] = js.undefined
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
    * @param id String The id
    * @returns Ext.grid.column.Column The header. null if it doesn't exist.
    */
  var getHeaderById: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], typings.extjs.Ext.grid.column.IColumn]] = js.undefined
  /** [Method] Returns the index of a leaf level header regardless of what the nesting structure is
    * @param header Ext.grid.column.Column The header to find the index of
    * @returns Number The index of the specified column header
    */
  var getHeaderIndex: js.UndefOr[
    js.Function1[/* header */ js.UndefOr[typings.extjs.Ext.grid.column.IColumn], Double]
  ] = js.undefined
  /** [Method] When passed a column index returns the closet visible column to that
    * @param index Number Position at which to find the closest visible column.
    */
  var getVisibleHeaderClosestToIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
}

object IColumnModel {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    extend: String = null,
    getHeaderAtIndex: /* index */ js.UndefOr[Double] => typings.extjs.Ext.grid.column.IColumn = null,
    getHeaderById: /* id */ js.UndefOr[String] => typings.extjs.Ext.grid.column.IColumn = null,
    getHeaderIndex: /* header */ js.UndefOr[typings.extjs.Ext.grid.column.IColumn] => Double = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getVisibleHeaderClosestToIndex: /* index */ js.UndefOr[Double] => Unit = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IColumnModel = null,
    mixins: js.Any = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IColumnModel = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getHeaderAtIndex != null) __obj.updateDynamic("getHeaderAtIndex")(js.Any.fromFunction1(getHeaderAtIndex))
    if (getHeaderById != null) __obj.updateDynamic("getHeaderById")(js.Any.fromFunction1(getHeaderById))
    if (getHeaderIndex != null) __obj.updateDynamic("getHeaderIndex")(js.Any.fromFunction1(getHeaderIndex))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getVisibleHeaderClosestToIndex != null) __obj.updateDynamic("getVisibleHeaderClosestToIndex")(js.Any.fromFunction1(getVisibleHeaderClosestToIndex))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnModel]
  }
}

