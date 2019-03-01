package typings
package extjsLib.ExtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnManager
  extends extjsLib.ExtNs.IBase {
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
  		* @param index Number The column index for which to retrieve the column.
  		* @returns Ext.grid.column.Column The header. null if it doesn't exist.
  		*/
  var getHeaderAtIndex: js.UndefOr[
    js.Function1[/* index */ js.UndefOr[scala.Double], extjsLib.ExtNs.gridNs.columnNs.IColumn]
  ] = js.undefined
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
  		* @param id String The id
  		* @returns Ext.grid.column.Column The header. null if it doesn't exist.
  		*/
  var getHeaderById: js.UndefOr[
    js.Function1[/* id */ js.UndefOr[java.lang.String], extjsLib.ExtNs.gridNs.columnNs.IColumn]
  ] = js.undefined
  /** [Method] Returns the index of a leaf level header regardless of what the nesting structure is
  		* @param header Ext.grid.column.Column The header to find the index of
  		* @returns Number The index of the specified column header
  		*/
  var getHeaderIndex: js.UndefOr[
    js.Function1[/* header */ js.UndefOr[extjsLib.ExtNs.gridNs.columnNs.IColumn], scala.Double]
  ] = js.undefined
  /** [Method] When passed a column index returns the closet visible column to that
  		* @param index Number Position at which to find the closest visible column.
  		*/
  var getVisibleHeaderClosestToIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

object IColumnManager {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getHeaderAtIndex: js.Function1[/* index */ js.UndefOr[scala.Double], extjsLib.ExtNs.gridNs.columnNs.IColumn] = null,
    getHeaderById: js.Function1[/* id */ js.UndefOr[java.lang.String], extjsLib.ExtNs.gridNs.columnNs.IColumn] = null,
    getHeaderIndex: js.Function1[/* header */ js.UndefOr[extjsLib.ExtNs.gridNs.columnNs.IColumn], scala.Double] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getVisibleHeaderClosestToIndex: js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IColumnManager] = null,
    mixins: js.Any = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IColumnManager = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getHeaderAtIndex != null) __obj.updateDynamic("getHeaderAtIndex")(getHeaderAtIndex)
    if (getHeaderById != null) __obj.updateDynamic("getHeaderById")(getHeaderById)
    if (getHeaderIndex != null) __obj.updateDynamic("getHeaderIndex")(getHeaderIndex)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getVisibleHeaderClosestToIndex != null) __obj.updateDynamic("getVisibleHeaderClosestToIndex")(getVisibleHeaderClosestToIndex)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IColumnManager]
  }
}

