package typings.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataType extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var `type`: String
  var url: String
}

object AnonDataType {
  @scala.inline
  def apply(`type`: String, url: String, data: js.Any = null): AnonDataType = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataType]
  }
}

