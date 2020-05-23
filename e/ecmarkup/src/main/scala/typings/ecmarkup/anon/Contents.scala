package typings.ecmarkup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contents extends js.Object {
  var contents: String
  var element: typings.std.Element
}

object Contents {
  @scala.inline
  def apply(contents: String, element: typings.std.Element): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
}

