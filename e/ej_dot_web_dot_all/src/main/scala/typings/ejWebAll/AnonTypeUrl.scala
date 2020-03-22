package typings.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeUrl extends js.Object {
  var `type`: String
  var url: String
}

object AnonTypeUrl {
  @scala.inline
  def apply(`type`: String, url: String): AnonTypeUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeUrl]
  }
}

