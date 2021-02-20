package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ISortableMutableBuilder[Self <: ISortable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultSortDirection(value: String): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
    
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
    def setSort(value: (/* sorters */ js.UndefOr[js.Any], /* direction */ js.UndefOr[String]) => Array): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
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
