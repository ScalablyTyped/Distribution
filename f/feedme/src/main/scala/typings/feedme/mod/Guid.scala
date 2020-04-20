package typings.feedme.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guid extends js.Object {
  var ispermalink: String
  var text: String
}

object Guid {
  @scala.inline
  def apply(ispermalink: String, text: String): Guid = {
    val __obj = js.Dynamic.literal(ispermalink = ispermalink.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guid]
  }
}

