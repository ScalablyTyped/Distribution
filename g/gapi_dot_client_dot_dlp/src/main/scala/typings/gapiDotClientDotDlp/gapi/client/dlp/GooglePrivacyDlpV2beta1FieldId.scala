package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1FieldId extends js.Object {
  /** Name describing the field. */
  var columnName: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1FieldId {
  @scala.inline
  def apply(columnName: String = null): GooglePrivacyDlpV2beta1FieldId = {
    val __obj = js.Dynamic.literal()
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1FieldId]
  }
}

