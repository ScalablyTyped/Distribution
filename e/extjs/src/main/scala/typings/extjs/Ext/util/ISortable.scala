package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISortable
  extends StObject
     with IBase {
  
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.undefined
  
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
  
  /** [Method] Sorts the data in the Store by one or more of its properties
    * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
    * @param direction String The overall direction to sort the data by.
    * @returns Ext.util.Sorter[]
    */
  var sort: js.UndefOr[
    js.Function2[/* sorters */ js.UndefOr[js.Any], /* direction */ js.UndefOr[String], Array]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Ext.util.Sorter[]/Object[]) */
  var sorters: js.UndefOr[js.Any] = js.undefined
}
object ISortable {
  
  inline def apply(): ISortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISortable]
  }
  
  extension [Self <: ISortable](x: Self) {
    
    inline def setDefaultSortDirection(value: String): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    inline def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
    
    inline def setGenerateComparator(value: () => Unit): Self = StObject.set(x, "generateComparator", js.Any.fromFunction0(value))
    
    inline def setGenerateComparatorUndefined: Self = StObject.set(x, "generateComparator", js.undefined)
    
    inline def setGetFirstSorter(value: () => ISorter): Self = StObject.set(x, "getFirstSorter", js.Any.fromFunction0(value))
    
    inline def setGetFirstSorterUndefined: Self = StObject.set(x, "getFirstSorter", js.undefined)
    
    inline def setInitSortable(value: () => Unit): Self = StObject.set(x, "initSortable", js.Any.fromFunction0(value))
    
    inline def setInitSortableUndefined: Self = StObject.set(x, "initSortable", js.undefined)
    
    inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    inline def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    inline def setSort(value: (/* sorters */ js.UndefOr[js.Any], /* direction */ js.UndefOr[String]) => Array): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    inline def setSortRoot(value: String): Self = StObject.set(x, "sortRoot", value.asInstanceOf[js.Any])
    
    inline def setSortRootUndefined: Self = StObject.set(x, "sortRoot", js.undefined)
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSorters(value: js.Any): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
    
    inline def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
  }
}
