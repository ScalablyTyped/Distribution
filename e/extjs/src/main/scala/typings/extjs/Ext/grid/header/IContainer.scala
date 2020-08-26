package typings.extjs.Ext.grid.header

import typings.extjs.Ext.Array
import typings.extjs.Ext.grid.column.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContainer
  extends typings.extjs.Ext.container.IContainer {
  /** [Config Option] (Number) */
  var defaultWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var enableColumnHide: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the number of grid columns descended from this HeaderContainer  */
  var getColumnCount: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns an array of menu CheckItems corresponding to all immediate children of the passed Container which have been c
    * @param headerContainer Object
    */
  var getColumnMenu: js.UndefOr[js.Function1[/* headerContainer */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Gets the full width of all columns that are visible  */
  var getFullWidth: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns an array of all columns which appear in the grid s View
    * @param inResult Object
    * @param hiddenAncestor Object
    * @returns Array
    */
  var getGridColumns: js.UndefOr[
    js.Function2[/* inResult */ js.UndefOr[js.Any], /* hiddenAncestor */ js.UndefOr[js.Any], Array]
  ] = js.native
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
    * @param index Number The column index for which to retrieve the column.
    */
  var getHeaderAtIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Returns the index of a leaf level header regardless of what the nesting structure is
    * @param header Ext.grid.column.Column The header to find the index of
    * @returns Number The index of the specified column header
    */
  var getHeaderIndex: js.UndefOr[js.Function1[/* header */ js.UndefOr[IColumn], Double]] = js.native
  /** [Method] Returns an array of menu items to be placed into the shared menu across all headers in this header container
    * @returns Array menuItems
    */
  var getMenuItems: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns an array of the visible columns in the grid
    * @returns Array
    */
  var getVisibleGridColumns: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] When passed a column index returns the closet visible column to that
    * @param index Number Position at which to find the closest visible column.
    */
  var getVisibleHeaderClosestToIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /** [Property] (Boolean) */
  var isGroupHeader: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var `sealed`: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var sortable: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var weight: js.UndefOr[Double] = js.native
}

object IContainer {
  @scala.inline
  def apply(): IContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContainer]
  }
  @scala.inline
  implicit class IContainerOps[Self <: IContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultWidth(value: Double): Self = this.set("defaultWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultWidth: Self = this.set("defaultWidth", js.undefined)
    @scala.inline
    def setEnableColumnHide(value: Boolean): Self = this.set("enableColumnHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableColumnHide: Self = this.set("enableColumnHide", js.undefined)
    @scala.inline
    def setGetColumnCount(value: () => Unit): Self = this.set("getColumnCount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetColumnCount: Self = this.set("getColumnCount", js.undefined)
    @scala.inline
    def setGetColumnMenu(value: /* headerContainer */ js.UndefOr[js.Any] => Unit): Self = this.set("getColumnMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetColumnMenu: Self = this.set("getColumnMenu", js.undefined)
    @scala.inline
    def setGetFullWidth(value: () => Unit): Self = this.set("getFullWidth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFullWidth: Self = this.set("getFullWidth", js.undefined)
    @scala.inline
    def setGetGridColumns(value: (/* inResult */ js.UndefOr[js.Any], /* hiddenAncestor */ js.UndefOr[js.Any]) => Array): Self = this.set("getGridColumns", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetGridColumns: Self = this.set("getGridColumns", js.undefined)
    @scala.inline
    def setGetHeaderAtIndex(value: /* index */ js.UndefOr[Double] => Unit): Self = this.set("getHeaderAtIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetHeaderAtIndex: Self = this.set("getHeaderAtIndex", js.undefined)
    @scala.inline
    def setGetHeaderIndex(value: /* header */ js.UndefOr[IColumn] => Double): Self = this.set("getHeaderIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetHeaderIndex: Self = this.set("getHeaderIndex", js.undefined)
    @scala.inline
    def setGetMenuItems(value: () => Array): Self = this.set("getMenuItems", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMenuItems: Self = this.set("getMenuItems", js.undefined)
    @scala.inline
    def setGetVisibleGridColumns(value: () => Array): Self = this.set("getVisibleGridColumns", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetVisibleGridColumns: Self = this.set("getVisibleGridColumns", js.undefined)
    @scala.inline
    def setGetVisibleHeaderClosestToIndex(value: /* index */ js.UndefOr[Double] => Unit): Self = this.set("getVisibleHeaderClosestToIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetVisibleHeaderClosestToIndex: Self = this.set("getVisibleHeaderClosestToIndex", js.undefined)
    @scala.inline
    def setIsGroupHeader(value: Boolean): Self = this.set("isGroupHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsGroupHeader: Self = this.set("isGroupHeader", js.undefined)
    @scala.inline
    def setSealed(value: Boolean): Self = this.set("sealed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSealed: Self = this.set("sealed", js.undefined)
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

