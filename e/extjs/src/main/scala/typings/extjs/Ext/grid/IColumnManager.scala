package typings.extjs.Ext.grid

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnManager extends IBase {
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
    * @param index Number The column index for which to retrieve the column.
    * @returns Ext.grid.column.Column The header. null if it doesn't exist.
    */
  var getHeaderAtIndex: js.UndefOr[
    js.Function1[/* index */ js.UndefOr[Double], typings.extjs.Ext.grid.column.IColumn]
  ] = js.native
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
    * @param id String The id
    * @returns Ext.grid.column.Column The header. null if it doesn't exist.
    */
  var getHeaderById: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], typings.extjs.Ext.grid.column.IColumn]] = js.native
  /** [Method] Returns the index of a leaf level header regardless of what the nesting structure is
    * @param header Ext.grid.column.Column The header to find the index of
    * @returns Number The index of the specified column header
    */
  var getHeaderIndex: js.UndefOr[
    js.Function1[/* header */ js.UndefOr[typings.extjs.Ext.grid.column.IColumn], Double]
  ] = js.native
  /** [Method] When passed a column index returns the closet visible column to that
    * @param index Number Position at which to find the closest visible column.
    */
  var getVisibleHeaderClosestToIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
}

object IColumnManager {
  @scala.inline
  def apply(): IColumnManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnManager]
  }
  @scala.inline
  implicit class IColumnManagerOps[Self <: IColumnManager] (val x: Self) extends AnyVal {
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
    def setGetHeaderAtIndex(value: /* index */ js.UndefOr[Double] => typings.extjs.Ext.grid.column.IColumn): Self = this.set("getHeaderAtIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetHeaderAtIndex: Self = this.set("getHeaderAtIndex", js.undefined)
    @scala.inline
    def setGetHeaderById(value: /* id */ js.UndefOr[String] => typings.extjs.Ext.grid.column.IColumn): Self = this.set("getHeaderById", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetHeaderById: Self = this.set("getHeaderById", js.undefined)
    @scala.inline
    def setGetHeaderIndex(value: /* header */ js.UndefOr[typings.extjs.Ext.grid.column.IColumn] => Double): Self = this.set("getHeaderIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetHeaderIndex: Self = this.set("getHeaderIndex", js.undefined)
    @scala.inline
    def setGetVisibleHeaderClosestToIndex(value: /* index */ js.UndefOr[Double] => Unit): Self = this.set("getVisibleHeaderClosestToIndex", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetVisibleHeaderClosestToIndex: Self = this.set("getVisibleHeaderClosestToIndex", js.undefined)
  }
  
}

