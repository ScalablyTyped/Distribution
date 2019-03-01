package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSettings extends js.Object {
  /** Default Value
    * @Default {[]}
    */
  var fields: js.UndefOr[js.Array[_]] = js.undefined
  /** Default Value
    * @Default {true}
    */
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  /** Default Value
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the operator for the search key words in toolbar searching.
    * @Default {contains}
    */
  var operator: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the search mode of records in searching.
    * @Default {ej.TreeGrid.SearchHierarchyMode.Parent}
    */
  var searchHierarchyMode: js.UndefOr[SearchHierarchyMode | java.lang.String] = js.undefined
}

object SearchSettings {
  @scala.inline
  def apply(
    fields: js.Array[_] = null,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    operator: java.lang.String = null,
    searchHierarchyMode: SearchHierarchyMode | java.lang.String = null
  ): SearchSettings = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (key != null) __obj.updateDynamic("key")(key)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    if (searchHierarchyMode != null) __obj.updateDynamic("searchHierarchyMode")(searchHierarchyMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSettings]
  }
}

