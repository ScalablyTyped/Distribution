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

object ISortable {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    defaultSortDirection: java.lang.String = null,
    extend: java.lang.String = null,
    generateComparator: js.Function0[scala.Unit] = null,
    getFirstSorter: js.Function0[ISorter] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ISortable] = null,
    initSortable: js.Function0[scala.Unit] = null,
    isSortable: js.UndefOr[scala.Boolean] = js.undefined,
    mixins: js.Any = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.Function2[
      /* sorters */ js.UndefOr[js.Any], 
      /* direction */ js.UndefOr[java.lang.String], 
      extjsLib.ExtNs.Array
    ] = null,
    sortRoot: java.lang.String = null,
    sorters: js.Any = null,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): ISortable = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (generateComparator != null) __obj.updateDynamic("generateComparator")(generateComparator)
    if (getFirstSorter != null) __obj.updateDynamic("getFirstSorter")(getFirstSorter)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (initSortable != null) __obj.updateDynamic("initSortable")(initSortable)
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISortable]
  }
}

