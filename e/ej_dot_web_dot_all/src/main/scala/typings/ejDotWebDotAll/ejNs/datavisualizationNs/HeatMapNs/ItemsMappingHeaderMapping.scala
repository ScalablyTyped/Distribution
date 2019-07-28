package typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsMappingHeaderMapping extends js.Object {
  /** Specifies the property and display value of the header.
    * @Default {null}
    */
  var columnStyle: js.UndefOr[js.Any] = js.undefined
  /** Specifies the value of the column or row.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /** Specifies the name of the column or row.
    */
  var propertyName: js.UndefOr[String] = js.undefined
}

object ItemsMappingHeaderMapping {
  @scala.inline
  def apply(columnStyle: js.Any = null, displayName: String = null, propertyName: String = null): ItemsMappingHeaderMapping = {
    val __obj = js.Dynamic.literal()
    if (columnStyle != null) __obj.updateDynamic("columnStyle")(columnStyle)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (propertyName != null) __obj.updateDynamic("propertyName")(propertyName)
    __obj.asInstanceOf[ItemsMappingHeaderMapping]
  }
}

