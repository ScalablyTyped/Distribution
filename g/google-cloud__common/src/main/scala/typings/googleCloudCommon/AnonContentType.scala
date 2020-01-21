package typings.googleCloudCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentType extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
}

object AnonContentType {
  @scala.inline
  def apply(contentType: String = null): AnonContentType = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentType]
  }
}

