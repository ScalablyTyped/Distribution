package typings.ejDotWebDotAll.ej.TreeView

import typings.ejDotWebDotAll.ej.sortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortSettings extends js.Object {
  /** Enables or disables the sorting option in TreeView control
    * @Default {false}
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** Sets the sorting order type. There are two sorting types available, such as &quot;ascending&quot;, &quot;descending&quot;.
    * @Default {ej.sortOrder.Ascending}
    */
  var sortOrder: js.UndefOr[typings.ejDotWebDotAll.ej.sortOrder | String] = js.undefined
}

object SortSettings {
  @scala.inline
  def apply(allowSorting: js.UndefOr[Boolean] = js.undefined, sortOrder: sortOrder | String = null): SortSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortSettings]
  }
}

