package typings.egg

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIgnore extends js.Object {
  var ignore: Set[String]
}

object AnonIgnore {
  @scala.inline
  def apply(ignore: Set[String]): AnonIgnore = {
    val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIgnore]
  }
}

