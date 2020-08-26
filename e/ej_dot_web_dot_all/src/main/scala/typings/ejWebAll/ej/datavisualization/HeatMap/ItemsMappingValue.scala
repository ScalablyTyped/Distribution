package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsMappingValue extends js.Object {
  /** Specifies the value of the column or row.
    */
  var displayName: js.UndefOr[String] = js.native
  /** Specifies the name of the column or row.
    */
  var propertyName: js.UndefOr[String] = js.native
}

object ItemsMappingValue {
  @scala.inline
  def apply(): ItemsMappingValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemsMappingValue]
  }
  @scala.inline
  implicit class ItemsMappingValueOps[Self <: ItemsMappingValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyName: Self = this.set("propertyName", js.undefined)
  }
  
}

