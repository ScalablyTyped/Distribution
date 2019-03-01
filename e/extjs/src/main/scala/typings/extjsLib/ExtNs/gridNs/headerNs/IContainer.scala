package typings
package extjsLib.ExtNs.gridNs.headerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContainer
  extends extjsLib.ExtNs.containerNs.IContainer {
  /** [Config Option] (Number) */
  var defaultWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var enableColumnHide: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the number of grid columns descended from this HeaderContainer  */
  var getColumnCount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns an array of menu CheckItems corresponding to all immediate children of the passed Container which have been c
  		* @param headerContainer Object
  		*/
  var getColumnMenu: js.UndefOr[js.Function1[/* headerContainer */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Gets the full width of all columns that are visible  */
  var getFullWidth: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns an array of all columns which appear in the grid s View
  		* @param inResult Object
  		* @param hiddenAncestor Object
  		* @returns Array
  		*/
  var getGridColumns: js.UndefOr[
    js.Function2[
      /* inResult */ js.UndefOr[js.Any], 
      /* hiddenAncestor */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
  		* @param index Number The column index for which to retrieve the column.
  		*/
  var getHeaderAtIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Returns the index of a leaf level header regardless of what the nesting structure is
  		* @param header Ext.grid.column.Column The header to find the index of
  		* @returns Number The index of the specified column header
  		*/
  var getHeaderIndex: js.UndefOr[
    js.Function1[/* header */ js.UndefOr[extjsLib.ExtNs.gridNs.columnNs.IColumn], scala.Double]
  ] = js.undefined
  /** [Method] Returns an array of menu items to be placed into the shared menu across all headers in this header container
  		* @returns Array menuItems
  		*/
  var getMenuItems: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns an array of the visible columns in the grid
  		* @returns Array
  		*/
  var getVisibleGridColumns: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] When passed a column index returns the closet visible column to that
  		* @param index Number Position at which to find the closest visible column.
  		*/
  var getVisibleHeaderClosestToIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isGroupHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Invalidate column cache on add We cannot refresh the View on every add because this method is called when the HeaderD
  		* @param c Object
  		*/
  @JSName("onAdd")
  var onAdd_IContainer: js.UndefOr[js.Function1[/* c */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Invalidate column cache on remove We cannot refresh the View on every remove because this method is called when the H
  		* @param c Object
  		*/
  @JSName("onRemove")
  var onRemove_IContainer: js.UndefOr[js.Function1[/* c */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Allows addition of behavior to the show operation  */
  @JSName("onShow")
  var onShow_IContainer: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var `sealed`: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object IContainer {
  @scala.inline
  def apply(
    IContainer: extjsLib.ExtNs.containerNs.IContainer = null,
    baseCls: java.lang.String = null,
    border: js.Any = null,
    defaultType: java.lang.String = null,
    defaultWidth: scala.Int | scala.Double = null,
    detachOnRemove: js.UndefOr[scala.Boolean] = js.undefined,
    enableColumnHide: js.UndefOr[scala.Boolean] = js.undefined,
    getColumnCount: js.Function0[scala.Unit] = null,
    getColumnMenu: js.Function1[/* headerContainer */ js.UndefOr[js.Any], scala.Unit] = null,
    getFullWidth: js.Function0[scala.Unit] = null,
    getGridColumns: js.Function2[
      /* inResult */ js.UndefOr[js.Any], 
      /* hiddenAncestor */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ] = null,
    getHeaderAtIndex: js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit] = null,
    getHeaderIndex: js.Function1[/* header */ js.UndefOr[extjsLib.ExtNs.gridNs.columnNs.IColumn], scala.Double] = null,
    getMenuItems: js.Function0[extjsLib.ExtNs.Array] = null,
    getVisibleGridColumns: js.Function0[extjsLib.ExtNs.Array] = null,
    getVisibleHeaderClosestToIndex: js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit] = null,
    isGroupHeader: js.UndefOr[scala.Boolean] = js.undefined,
    isLayoutRoot: js.Function0[scala.Unit] = null,
    onAdd: js.Function1[/* c */ js.UndefOr[js.Any], scala.Unit] = null,
    onDestroy: js.Function0[scala.Unit] = null,
    onRemove: js.Function1[/* c */ js.UndefOr[js.Any], scala.Unit] = null,
    onShow: js.Function0[scala.Unit] = null,
    `sealed`: js.UndefOr[scala.Boolean] = js.undefined,
    sortable: js.UndefOr[scala.Boolean] = js.undefined,
    weight: scala.Int | scala.Double = null
  ): IContainer = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (border != null) __obj.updateDynamic("border")(border)
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType)
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(detachOnRemove)) __obj.updateDynamic("detachOnRemove")(detachOnRemove)
    if (!js.isUndefined(enableColumnHide)) __obj.updateDynamic("enableColumnHide")(enableColumnHide)
    if (getColumnCount != null) __obj.updateDynamic("getColumnCount")(getColumnCount)
    if (getColumnMenu != null) __obj.updateDynamic("getColumnMenu")(getColumnMenu)
    if (getFullWidth != null) __obj.updateDynamic("getFullWidth")(getFullWidth)
    if (getGridColumns != null) __obj.updateDynamic("getGridColumns")(getGridColumns)
    if (getHeaderAtIndex != null) __obj.updateDynamic("getHeaderAtIndex")(getHeaderAtIndex)
    if (getHeaderIndex != null) __obj.updateDynamic("getHeaderIndex")(getHeaderIndex)
    if (getMenuItems != null) __obj.updateDynamic("getMenuItems")(getMenuItems)
    if (getVisibleGridColumns != null) __obj.updateDynamic("getVisibleGridColumns")(getVisibleGridColumns)
    if (getVisibleHeaderClosestToIndex != null) __obj.updateDynamic("getVisibleHeaderClosestToIndex")(getVisibleHeaderClosestToIndex)
    if (!js.isUndefined(isGroupHeader)) __obj.updateDynamic("isGroupHeader")(isGroupHeader)
    if (isLayoutRoot != null) __obj.updateDynamic("isLayoutRoot")(isLayoutRoot)
    if (onAdd != null) __obj.updateDynamic("onAdd")(onAdd)
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(onDestroy)
    if (onRemove != null) __obj.updateDynamic("onRemove")(onRemove)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (!js.isUndefined(`sealed`)) __obj.updateDynamic("sealed")(`sealed`)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContainer]
  }
}

