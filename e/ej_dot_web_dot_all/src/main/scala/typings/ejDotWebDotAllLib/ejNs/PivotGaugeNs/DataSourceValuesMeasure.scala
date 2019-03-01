package typings
package ejDotWebDotAllLib.ejNs.PivotGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceValuesMeasure extends js.Object {
  /** Allows the user to bind the measure from OLAP datasource by using its unique name as field name.
    */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
}

object DataSourceValuesMeasure {
  @scala.inline
  def apply(fieldName: java.lang.String = null): DataSourceValuesMeasure = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    __obj.asInstanceOf[DataSourceValuesMeasure]
  }
}

