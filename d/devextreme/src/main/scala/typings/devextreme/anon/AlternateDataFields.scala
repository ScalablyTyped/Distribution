package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlternateDataFields extends js.Object {
  var alternateDataFields: js.UndefOr[Boolean] = js.native
  var customizeChart: js.UndefOr[js.Function] = js.native
  var customizeSeries: js.UndefOr[js.Function] = js.native
  var dataFieldsDisplayMode: js.UndefOr[String] = js.native
  var inverted: js.UndefOr[Boolean] = js.native
  var processCell: js.UndefOr[js.Function] = js.native
  var putDataFieldsInto: js.UndefOr[String] = js.native
}

object AlternateDataFields {
  @scala.inline
  def apply(): AlternateDataFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlternateDataFields]
  }
  @scala.inline
  implicit class AlternateDataFieldsOps[Self <: AlternateDataFields] (val x: Self) extends AnyVal {
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
    def setAlternateDataFields(value: Boolean): Self = this.set("alternateDataFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateDataFields: Self = this.set("alternateDataFields", js.undefined)
    @scala.inline
    def setCustomizeChart(value: js.Function): Self = this.set("customizeChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomizeChart: Self = this.set("customizeChart", js.undefined)
    @scala.inline
    def setCustomizeSeries(value: js.Function): Self = this.set("customizeSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomizeSeries: Self = this.set("customizeSeries", js.undefined)
    @scala.inline
    def setDataFieldsDisplayMode(value: String): Self = this.set("dataFieldsDisplayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFieldsDisplayMode: Self = this.set("dataFieldsDisplayMode", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setProcessCell(value: js.Function): Self = this.set("processCell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessCell: Self = this.set("processCell", js.undefined)
    @scala.inline
    def setPutDataFieldsInto(value: String): Self = this.set("putDataFieldsInto", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePutDataFieldsInto: Self = this.set("putDataFieldsInto", js.undefined)
  }
  
}

