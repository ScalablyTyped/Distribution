package typings.egg.anon

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ignore extends js.Object {
  var ignore: Set[String]
}

object Ignore {
  @scala.inline
  def apply(ignore: Set[String]): Ignore = {
    val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ignore]
  }
}

