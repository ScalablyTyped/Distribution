package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MimeType extends js.Object {
  /** The MIME type of the quoted content. */
  var mimeType: js.UndefOr[String] = js.undefined
  /** The quoted content itself. This is interpreted as plain text if set through the API. */
  var value: js.UndefOr[String] = js.undefined
}

object MimeType {
  @scala.inline
  def apply(mimeType: String = null, value: String = null): MimeType = {
    val __obj = js.Dynamic.literal()
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeType]
  }
}

