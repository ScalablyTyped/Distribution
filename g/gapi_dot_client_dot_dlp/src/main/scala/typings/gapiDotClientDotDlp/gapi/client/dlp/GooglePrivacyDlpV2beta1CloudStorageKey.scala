package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CloudStorageKey extends js.Object {
  /** Path to the file. */
  var filePath: js.UndefOr[String] = js.undefined
  /** Byte offset of the referenced data in the file. */
  var startOffset: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1CloudStorageKey {
  @scala.inline
  def apply(filePath: String = null, startOffset: String = null): GooglePrivacyDlpV2beta1CloudStorageKey = {
    val __obj = js.Dynamic.literal()
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (startOffset != null) __obj.updateDynamic("startOffset")(startOffset)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CloudStorageKey]
  }
}

