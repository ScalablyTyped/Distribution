package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllFields extends js.Object {
  var allFields: js.UndefOr[String] = js.native
  var columnFields: js.UndefOr[String] = js.native
  var dataFields: js.UndefOr[String] = js.native
  var filterFields: js.UndefOr[String] = js.native
  var rowFields: js.UndefOr[String] = js.native
}

object AllFields {
  @scala.inline
  def apply(): AllFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllFields]
  }
  @scala.inline
  implicit class AllFieldsOps[Self <: AllFields] (val x: Self) extends AnyVal {
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
    def setAllFields(value: String): Self = this.set("allFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllFields: Self = this.set("allFields", js.undefined)
    @scala.inline
    def setColumnFields(value: String): Self = this.set("columnFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnFields: Self = this.set("columnFields", js.undefined)
    @scala.inline
    def setDataFields(value: String): Self = this.set("dataFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFields: Self = this.set("dataFields", js.undefined)
    @scala.inline
    def setFilterFields(value: String): Self = this.set("filterFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterFields: Self = this.set("filterFields", js.undefined)
    @scala.inline
    def setRowFields(value: String): Self = this.set("rowFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowFields: Self = this.set("rowFields", js.undefined)
  }
  
}

