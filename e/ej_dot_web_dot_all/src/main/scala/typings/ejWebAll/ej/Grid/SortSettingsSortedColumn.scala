package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortSettingsSortedColumn extends js.Object {
  /** Gets or sets a value that indicates whether to define the direction to sort the column.
    */
  var direction: js.UndefOr[String] = js.native
  /** Gets or sets a value that indicates whether to define the field name of the column to be sort
    */
  var field: js.UndefOr[String] = js.native
}

object SortSettingsSortedColumn {
  @scala.inline
  def apply(): SortSettingsSortedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortSettingsSortedColumn]
  }
  @scala.inline
  implicit class SortSettingsSortedColumnOps[Self <: SortSettingsSortedColumn] (val x: Self) extends AnyVal {
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
  }
  
}

