package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISortable extends IBase {
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.native
  /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
  var generateComparator: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
    * @returns Ext.util.Sorter The sorter, null if none exist
    */
  var getFirstSorter: js.UndefOr[js.Function0[ISorter]] = js.native
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var isSortable: js.UndefOr[Boolean] = js.native
  /** [Method] Sorts the data in the Store by one or more of its properties
    * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
    * @param direction String The overall direction to sort the data by.
    * @returns Ext.util.Sorter[]
    */
  var sort: js.UndefOr[
    js.Function2[/* sorters */ js.UndefOr[js.Any], /* direction */ js.UndefOr[String], Array]
  ] = js.native
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[String] = js.native
  /** [Config Option] (Ext.util.Sorter[]/Object[]) */
  var sorters: js.UndefOr[js.Any] = js.native
}

object ISortable {
  @scala.inline
  def apply(): ISortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISortable]
  }
  @scala.inline
  implicit class ISortableOps[Self <: ISortable] (val x: Self) extends AnyVal {
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
    def setDefaultSortDirection(value: String): Self = this.set("defaultSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSortDirection: Self = this.set("defaultSortDirection", js.undefined)
    @scala.inline
    def setGenerateComparator(value: () => Unit): Self = this.set("generateComparator", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGenerateComparator: Self = this.set("generateComparator", js.undefined)
    @scala.inline
    def setGetFirstSorter(value: () => ISorter): Self = this.set("getFirstSorter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFirstSorter: Self = this.set("getFirstSorter", js.undefined)
    @scala.inline
    def setInitSortable(value: () => Unit): Self = this.set("initSortable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitSortable: Self = this.set("initSortable", js.undefined)
    @scala.inline
    def setIsSortable(value: Boolean): Self = this.set("isSortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSortable: Self = this.set("isSortable", js.undefined)
    @scala.inline
    def setSort(value: (/* sorters */ js.UndefOr[js.Any], /* direction */ js.UndefOr[String]) => Array): Self = this.set("sort", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setSortRoot(value: String): Self = this.set("sortRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortRoot: Self = this.set("sortRoot", js.undefined)
    @scala.inline
    def setSorters(value: js.Any): Self = this.set("sorters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorters: Self = this.set("sorters", js.undefined)
  }
  
}

