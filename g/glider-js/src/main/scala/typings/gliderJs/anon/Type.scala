package typings.gliderJs.anon

import typings.gliderJs.gliderJsStrings.arrow
import typings.gliderJs.gliderJsStrings.dot
import typings.gliderJs.gliderJsStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: arrow | dot | slide
  var value: String | Double
}

object Type {
  @scala.inline
  def apply(`type`: arrow | dot | slide, value: String | Double): Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

