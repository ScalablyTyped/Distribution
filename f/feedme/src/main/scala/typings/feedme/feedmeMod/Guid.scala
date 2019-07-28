package typings.feedme.feedmeMod

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
    val __obj = js.Dynamic.literal(ispermalink = ispermalink, text = text)
  
    __obj.asInstanceOf[Guid]
  }
}

