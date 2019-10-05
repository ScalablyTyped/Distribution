package typings.ejDotWebDotAll.ej.PivotTreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceColumnsFilterItems extends js.Object {
  /** Contains the collection of items to be excluded among the field members.
    * @Default {[]}
    */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object DataSourceColumnsFilterItems {
  @scala.inline
  def apply(values: js.Array[_] = null): DataSourceColumnsFilterItems = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DataSourceColumnsFilterItems]
  }
}

