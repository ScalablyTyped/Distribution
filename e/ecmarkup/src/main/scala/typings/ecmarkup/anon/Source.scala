package typings.ecmarkup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var element: typings.std.Element
  var source: String
}

object Source {
  @scala.inline
  def apply(element: typings.std.Element, source: String): Source = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

