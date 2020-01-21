package typings.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataTypeUrl extends js.Object {
  var data: js.Any
  var `type`: String
  var url: String
}

object AnonDataTypeUrl {
  @scala.inline
  def apply(data: js.Any, `type`: String, url: String): AnonDataTypeUrl = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataTypeUrl]
  }
}

