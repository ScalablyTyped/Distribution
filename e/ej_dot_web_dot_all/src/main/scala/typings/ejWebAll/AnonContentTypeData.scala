package typings.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentTypeData extends js.Object {
  var contentType: String
  var data: js.Any
  var `type`: String
  var url: String
}

object AnonContentTypeData {
  @scala.inline
  def apply(contentType: String, data: js.Any, `type`: String, url: String): AnonContentTypeData = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentTypeData]
  }
}

