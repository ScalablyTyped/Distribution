package typings.ejDotWebDotAll.ej.PivotTreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceFiltersFilterItems extends js.Object {
  /** Contains the collection of items to be excluded among the field members.
    * @Default {[]}
    */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object DataSourceFiltersFilterItems {
  @scala.inline
  def apply(values: js.Array[_] = null): DataSourceFiltersFilterItems = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DataSourceFiltersFilterItems]
  }
}

