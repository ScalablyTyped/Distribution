package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedStatus extends js.Object {
  var country: js.UndefOr[String] = js.native
  var datafeedId: js.UndefOr[String] = js.native
  var errors: js.UndefOr[js.Array[DatafeedStatusError]] = js.native
  var itemsTotal: js.UndefOr[String] = js.native
  var itemsValid: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var lastUploadDate: js.UndefOr[String] = js.native
  var processingStatus: js.UndefOr[String] = js.native
  var warnings: js.UndefOr[js.Array[DatafeedStatusError]] = js.native
}

object DatafeedStatus {
  @scala.inline
  def apply(): DatafeedStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedStatus]
  }
  @scala.inline
  implicit class DatafeedStatusOps[Self <: DatafeedStatus] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setDatafeedId(value: String): Self = this.set("datafeedId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatafeedId: Self = this.set("datafeedId", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: DatafeedStatusError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[DatafeedStatusError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setItemsTotal(value: String): Self = this.set("itemsTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsTotal: Self = this.set("itemsTotal", js.undefined)
    @scala.inline
    def setItemsValid(value: String): Self = this.set("itemsValid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsValid: Self = this.set("itemsValid", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLastUploadDate(value: String): Self = this.set("lastUploadDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUploadDate: Self = this.set("lastUploadDate", js.undefined)
    @scala.inline
    def setProcessingStatus(value: String): Self = this.set("processingStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingStatus: Self = this.set("processingStatus", js.undefined)
    @scala.inline
    def setWarningsVarargs(value: DatafeedStatusError*): Self = this.set("warnings", js.Array(value :_*))
    @scala.inline
    def setWarnings(value: js.Array[DatafeedStatusError]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
  
}

