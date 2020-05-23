package typings.extjs.Ext.grid.header

import typings.extjs.Ext.Array
import typings.extjs.Ext.grid.column.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContainer
  extends typings.extjs.Ext.container.IContainer {
  /** [Config Option] (Number) */
  var defaultWidth: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var enableColumnHide: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the number of grid columns descended from this HeaderContainer  */
  var getColumnCount: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns an array of menu CheckItems corresponding to all immediate children of the passed Container which have been c
    * @param headerContainer Object
    */
  var getColumnMenu: js.UndefOr[js.Function1[/* headerContainer */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Gets the full width of all columns that are visible  */
  var getFullWidth: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns an array of all columns which appear in the grid s View
    * @param inResult Object
    * @param hiddenAncestor Object
    * @returns Array
    */
  var getGridColumns: js.UndefOr[
    js.Function2[/* inResult */ js.UndefOr[js.Any], /* hiddenAncestor */ js.UndefOr[js.Any], Array]
  ] = js.undefined
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
    * @param index Number The column index for which to retrieve the column.
    */
  var getHeaderAtIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Returns the index of a leaf level header regardless of what the nesting structure is
    * @param header Ext.grid.column.Column The header to find the index of
    * @returns Number The index of the specified column header
    */
  var getHeaderIndex: js.UndefOr[js.Function1[/* header */ js.UndefOr[IColumn], Double]] = js.undefined
  /** [Method] Returns an array of menu items to be placed into the shared menu across all headers in this header container
    * @returns Array menuItems
    */
  var getMenuItems: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns an array of the visible columns in the grid
    * @returns Array
    */
  var getVisibleGridColumns: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] When passed a column index returns the closet visible column to that
    * @param index Number Position at which to find the closest visible column.
    */
  var getVisibleHeaderClosestToIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isGroupHeader: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var `sealed`: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var sortable: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var weight: js.UndefOr[Double] = js.undefined
}

object IContainer {
  @scala.inline
  def apply(
    IContainer: typings.extjs.Ext.container.IContainer = null,
    defaultWidth: js.UndefOr[Double] = js.undefined,
    enableColumnHide: js.UndefOr[Boolean] = js.undefined,
    getColumnCount: () => Unit = null,
    getColumnMenu: /* headerContainer */ js.UndefOr[js.Any] => Unit = null,
    getFullWidth: () => Unit = null,
    getGridColumns: (/* inResult */ js.UndefOr[js.Any], /* hiddenAncestor */ js.UndefOr[js.Any]) => Array = null,
    getHeaderAtIndex: /* index */ js.UndefOr[Double] => Unit = null,
    getHeaderIndex: /* header */ js.UndefOr[IColumn] => Double = null,
    getMenuItems: () => Array = null,
    getVisibleGridColumns: () => Array = null,
    getVisibleHeaderClosestToIndex: /* index */ js.UndefOr[Double] => Unit = null,
    isGroupHeader: js.UndefOr[Boolean] = js.undefined,
    `sealed`: js.UndefOr[Boolean] = js.undefined,
    sortable: js.UndefOr[Boolean] = js.undefined,
    weight: js.UndefOr[Double] = js.undefined
  ): IContainer = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(defaultWidth)) __obj.updateDynamic("defaultWidth")(defaultWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnHide)) __obj.updateDynamic("enableColumnHide")(enableColumnHide.get.asInstanceOf[js.Any])
    if (getColumnCount != null) __obj.updateDynamic("getColumnCount")(js.Any.fromFunction0(getColumnCount))
    if (getColumnMenu != null) __obj.updateDynamic("getColumnMenu")(js.Any.fromFunction1(getColumnMenu))
    if (getFullWidth != null) __obj.updateDynamic("getFullWidth")(js.Any.fromFunction0(getFullWidth))
    if (getGridColumns != null) __obj.updateDynamic("getGridColumns")(js.Any.fromFunction2(getGridColumns))
    if (getHeaderAtIndex != null) __obj.updateDynamic("getHeaderAtIndex")(js.Any.fromFunction1(getHeaderAtIndex))
    if (getHeaderIndex != null) __obj.updateDynamic("getHeaderIndex")(js.Any.fromFunction1(getHeaderIndex))
    if (getMenuItems != null) __obj.updateDynamic("getMenuItems")(js.Any.fromFunction0(getMenuItems))
    if (getVisibleGridColumns != null) __obj.updateDynamic("getVisibleGridColumns")(js.Any.fromFunction0(getVisibleGridColumns))
    if (getVisibleHeaderClosestToIndex != null) __obj.updateDynamic("getVisibleHeaderClosestToIndex")(js.Any.fromFunction1(getVisibleHeaderClosestToIndex))
    if (!js.isUndefined(isGroupHeader)) __obj.updateDynamic("isGroupHeader")(isGroupHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`sealed`)) __obj.updateDynamic("sealed")(`sealed`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContainer]
  }
}

