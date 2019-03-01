package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsMappingValue extends js.Object {
  /** Specifies the value of the column or row.
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the name of the column or row.
    */
  var propertyName: js.UndefOr[java.lang.String] = js.undefined
}

object ItemsMappingValue {
  @scala.inline
  def apply(displayName: java.lang.String = null, propertyName: java.lang.String = null): ItemsMappingValue = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (propertyName != null) __obj.updateDynamic("propertyName")(propertyName)
    __obj.asInstanceOf[ItemsMappingValue]
  }
}

