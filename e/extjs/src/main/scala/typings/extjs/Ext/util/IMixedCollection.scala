package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.ISortable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined defaultSortDirection, sortRoot, sorters, isSortable, generateComparator, getFirstSorter, initSortable, sort */ @js.native
trait IMixedCollection extends IAbstractMixedCollection {
  
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.native
  
  /** [Method] Calculates the insertion index of the new item based upon the comparison function passed or the current sort order
    * @param newItem Object The new object to find the insertion position of.
    * @param sorterFn Function The function to sort by. This is the same as the sorting function passed to sortBy. It accepts 2 items from this MixedCollection, and returns -1 0, or 1 depending on the relative sort positions of the 2 compared items. If omitted, a function generated from the currently defined set of sorters will be used.
    * @returns Number The insertion point to add the new item into this MixedCollection at using insert
    */
  var findInsertionIndex: js.UndefOr[
    js.Function2[/* newItem */ js.UndefOr[js.Any], /* sorterFn */ js.UndefOr[js.Any], Double]
  ] = js.native
  
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
  
  /** [Method] Reorders each of the items based on a mapping from old index to new index
    * @param mapping Object Mapping from old item index to new item index
    */
  var reorder: js.UndefOr[js.Function1[/* mapping */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sorts the data in the Store by one or more of its properties
    * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
    * @param direction String The overall direction to sort the data by.
    * @returns Ext.util.Sorter[]
    */
  var sort: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[String], Array]] = js.native
  
  /** [Method] Sorts the collection by a single sorter function
    * @param sorterFn Function The function to sort by
    */
  var sortBy: js.UndefOr[js.Function1[/* sorterFn */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sorts this collection by keys
    * @param direction String 'ASC' or 'DESC'. Defaults to 'ASC'.
    * @param fn Function Comparison function that defines the sort order. Defaults to sorting by case insensitive string.
    */
  var sortByKey: js.UndefOr[
    js.Function2[/* direction */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[String] = js.native
  
  /** [Config Option] (Ext.util.Sorter[]/Object[]) */
  var sorters: js.UndefOr[js.Any] = js.native
}
object IMixedCollection {
  
  @scala.inline
  def apply(): IMixedCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMixedCollection]
  }
  
  @scala.inline
  implicit class IMixedCollectionOps[Self <: IMixedCollection] (val x: Self) extends AnyVal {
    
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
    def setFindInsertionIndex(value: (/* newItem */ js.UndefOr[js.Any], /* sorterFn */ js.UndefOr[js.Any]) => Double): Self = this.set("findInsertionIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFindInsertionIndex: Self = this.set("findInsertionIndex", js.undefined)
    
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
    def setReorder(value: /* mapping */ js.UndefOr[js.Any] => Unit): Self = this.set("reorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReorder: Self = this.set("reorder", js.undefined)
    
    @scala.inline
    def setSort(value: (js.UndefOr[js.Any], js.UndefOr[String]) => Array): Self = this.set("sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSortBy(value: /* sorterFn */ js.UndefOr[js.Any] => Unit): Self = this.set("sortBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    
    @scala.inline
    def setSortByKey(value: (/* direction */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any]) => Unit): Self = this.set("sortByKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSortByKey: Self = this.set("sortByKey", js.undefined)
    
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
