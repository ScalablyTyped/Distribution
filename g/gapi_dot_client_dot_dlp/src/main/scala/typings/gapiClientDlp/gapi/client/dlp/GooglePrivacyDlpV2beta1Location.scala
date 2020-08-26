package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1Location extends js.Object {
  /** Zero-based byte offsets within a content item. */
  var byteRange: js.UndefOr[GooglePrivacyDlpV2beta1Range] = js.native
  /**
    * Character offsets within a content item, included when content type
    * is a text. Default charset assumed to be UTF-8.
    */
  var codepointRange: js.UndefOr[GooglePrivacyDlpV2beta1Range] = js.native
  /** Field id of the field containing the finding. */
  var fieldId: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.native
  /** Location within an image's pixels. */
  var imageBoxes: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ImageLocation]] = js.native
  /** Key of the finding. */
  var recordKey: js.UndefOr[GooglePrivacyDlpV2beta1RecordKey] = js.native
  /** Location within a `ContentItem.Table`. */
  var tableLocation: js.UndefOr[GooglePrivacyDlpV2beta1TableLocation] = js.native
}

object GooglePrivacyDlpV2beta1Location {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Location]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1LocationOps[Self <: GooglePrivacyDlpV2beta1Location] (val x: Self) extends AnyVal {
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
    def setByteRange(value: GooglePrivacyDlpV2beta1Range): Self = this.set("byteRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByteRange: Self = this.set("byteRange", js.undefined)
    @scala.inline
    def setCodepointRange(value: GooglePrivacyDlpV2beta1Range): Self = this.set("codepointRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodepointRange: Self = this.set("codepointRange", js.undefined)
    @scala.inline
    def setFieldId(value: GooglePrivacyDlpV2beta1FieldId): Self = this.set("fieldId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldId: Self = this.set("fieldId", js.undefined)
    @scala.inline
    def setImageBoxesVarargs(value: GooglePrivacyDlpV2beta1ImageLocation*): Self = this.set("imageBoxes", js.Array(value :_*))
    @scala.inline
    def setImageBoxes(value: js.Array[GooglePrivacyDlpV2beta1ImageLocation]): Self = this.set("imageBoxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageBoxes: Self = this.set("imageBoxes", js.undefined)
    @scala.inline
    def setRecordKey(value: GooglePrivacyDlpV2beta1RecordKey): Self = this.set("recordKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordKey: Self = this.set("recordKey", js.undefined)
    @scala.inline
    def setTableLocation(value: GooglePrivacyDlpV2beta1TableLocation): Self = this.set("tableLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableLocation: Self = this.set("tableLocation", js.undefined)
  }
  
}

