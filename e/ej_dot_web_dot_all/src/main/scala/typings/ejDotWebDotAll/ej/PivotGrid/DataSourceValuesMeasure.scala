package typings.ejDotWebDotAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceValuesMeasure extends js.Object {
  /** Allows you to bind the measure from the OLAP datasource by using its unique name as field name.
    */
  var fieldName: js.UndefOr[String] = js.undefined
}

object DataSourceValuesMeasure {
  @scala.inline
  def apply(fieldName: String = null): DataSourceValuesMeasure = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceValuesMeasure]
  }
}

