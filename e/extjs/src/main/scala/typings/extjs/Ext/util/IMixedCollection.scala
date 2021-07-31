package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.ISortable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined defaultSortDirection, sortRoot, sorters, isSortable, generateComparator, getFirstSorter, initSortable, sort */ trait IMixedCollection
  extends StObject
     with IAbstractMixedCollection {
  
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.undefined
  
  /** [Method] Calculates the insertion index of the new item based upon the comparison function passed or the current sort order
    * @param newItem Object The new object to find the insertion position of.
    * @param sorterFn Function The function to sort by. This is the same as the sorting function passed to sortBy. It accepts 2 items from this MixedCollection, and returns -1 0, or 1 depending on the relative sort positions of the 2 compared items. If omitted, a function generated from the currently defined set of sorters will be used.
    * @returns Number The insertion point to add the new item into this MixedCollection at using insert
    */
  var findInsertionIndex: js.UndefOr[
    js.Function2[/* newItem */ js.UndefOr[js.Any], /* sorterFn */ js.UndefOr[js.Any], Double]
  ] = js.undefined
  
  /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
  var generateComparator: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
    * @returns Ext.util.Sorter The sorter, null if none exist
    */
  var getFirstSorter: js.UndefOr[js.Function0[ISorter]] = js.undefined
  
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Boolean) */
  var isSortable: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Reorders each of the items based on a mapping from old index to new index
    * @param mapping Object Mapping from old item index to new item index
    */
  var reorder: js.UndefOr[js.Function1[/* mapping */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sorts the data in the Store by one or more of its properties
    * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
    * @param direction String The overall direction to sort the data by.
    * @returns Ext.util.Sorter[]
    */
  var sort: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[String], Array]] = js.undefined
  
  /** [Method] Sorts the collection by a single sorter function
    * @param sorterFn Function The function to sort by
    */
  var sortBy: js.UndefOr[js.Function1[/* sorterFn */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sorts this collection by keys
    * @param direction String 'ASC' or 'DESC'. Defaults to 'ASC'.
    * @param fn Function Comparison function that defines the sort order. Defaults to sorting by case insensitive string.
    */
  var sortByKey: js.UndefOr[
    js.Function2[/* direction */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Ext.util.Sorter[]/Object[]) */
  var sorters: js.UndefOr[js.Any] = js.undefined
}
object IMixedCollection {
  
  @scala.inline
  def apply(): IMixedCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMixedCollection]
  }
  
  @scala.inline
  implicit class IMixedCollectionMutableBuilder[Self <: IMixedCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultSortDirection(value: String): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
    
    @scala.inline
    def setFindInsertionIndex(value: (/* newItem */ js.UndefOr[js.Any], /* sorterFn */ js.UndefOr[js.Any]) => Double): Self = StObject.set(x, "findInsertionIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindInsertionIndexUndefined: Self = StObject.set(x, "findInsertionIndex", js.undefined)
    
    @scala.inline
    def setGenerateComparator(value: () => Unit): Self = StObject.set(x, "generateComparator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGenerateComparatorUndefined: Self = StObject.set(x, "generateComparator", js.undefined)
    
    @scala.inline
    def setGetFirstSorter(value: () => ISorter): Self = StObject.set(x, "getFirstSorter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFirstSorterUndefined: Self = StObject.set(x, "getFirstSorter", js.undefined)
    
    @scala.inline
    def setInitSortable(value: () => Unit): Self = StObject.set(x, "initSortable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitSortableUndefined: Self = StObject.set(x, "initSortable", js.undefined)
    
    @scala.inline
    def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    @scala.inline
    def setReorder(value: /* mapping */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "reorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReorderUndefined: Self = StObject.set(x, "reorder", js.undefined)
    
    @scala.inline
    def setSort(value: (js.UndefOr[js.Any], js.UndefOr[String]) => Array): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortBy(value: /* sorterFn */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "sortBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortByKey(value: (/* direction */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "sortByKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortByKeyUndefined: Self = StObject.set(x, "sortByKey", js.undefined)
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    @scala.inline
    def setSortRoot(value: String): Self = StObject.set(x, "sortRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortRootUndefined: Self = StObject.set(x, "sortRoot", js.undefined)
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setSorters(value: js.Any): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
  }
}
