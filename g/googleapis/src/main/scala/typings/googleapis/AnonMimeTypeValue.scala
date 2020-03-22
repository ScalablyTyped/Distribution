package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMimeTypeValue extends js.Object {
  var mimeType: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object AnonMimeTypeValue {
  @scala.inline
  def apply(mimeType: String = null, value: String = null): AnonMimeTypeValue = {
    val __obj = js.Dynamic.literal()
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMimeTypeValue]
  }
}

