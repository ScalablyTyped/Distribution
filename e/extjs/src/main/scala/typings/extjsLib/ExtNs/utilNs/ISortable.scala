package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISortable
  extends extjsLib.ExtNs.IBase {
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
  var generateComparator: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
  		* @returns Ext.util.Sorter The sorter, null if none exist
  		*/
  var getFirstSorter: js.UndefOr[js.Function0[ISorter]] = js.undefined
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isSortable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sorts the data in the Store by one or more of its properties
  		* @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
  		* @param direction String The overall direction to sort the data by.
  		* @returns Ext.util.Sorter[]
  		*/
  var sort: js.UndefOr[
    js.Function2[
      /* sorters */ js.UndefOr[js.Any], 
      /* direction */ js.UndefOr[java.lang.String], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.util.Sorter[]/Object[]) */
  var sorters: js.UndefOr[js.Any] = js.undefined
}

