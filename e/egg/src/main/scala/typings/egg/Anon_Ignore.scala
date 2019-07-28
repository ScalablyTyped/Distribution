package typings.egg

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ignore extends js.Object {
  var ignore: Set[String]
}

object Anon_Ignore {
  @scala.inline
  def apply(ignore: Set[String]): Anon_Ignore = {
    val __obj = js.Dynamic.literal(ignore = ignore)
  
    __obj.asInstanceOf[Anon_Ignore]
  }
}

