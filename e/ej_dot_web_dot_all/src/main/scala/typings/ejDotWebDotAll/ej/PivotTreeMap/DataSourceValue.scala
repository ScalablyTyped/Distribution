package typings.ejDotWebDotAll.ej.PivotTreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceValue extends js.Object {
  /** Allows to set the axis name to place the measures items.
    * @Default {rows}
    */
  var axis: js.UndefOr[String] = js.undefined
  /** This holds the list of unique names of measures to bind them from the OLAP cube.
    * @Default {[]}
    */
  var measures: js.UndefOr[js.Array[DataSourceValuesMeasure]] = js.undefined
}

object DataSourceValue {
  @scala.inline
  def apply(axis: String = null, measures: js.Array[DataSourceValuesMeasure] = null): DataSourceValue = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (measures != null) __obj.updateDynamic("measures")(measures)
    __obj.asInstanceOf[DataSourceValue]
  }
}

