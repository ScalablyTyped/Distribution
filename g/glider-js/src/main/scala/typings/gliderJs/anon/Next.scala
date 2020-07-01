package typings.gliderJs.anon

import typings.gliderJs.mod.Selector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Next extends js.Object {
  var next: Selector
  var prev: Selector
}

object Next {
  @scala.inline
  def apply(next: Selector, prev: Selector): Next = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
}

