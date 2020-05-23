package typings.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameOptions extends js.Object {
  var name: String
  var options: js.Object
}

object NameOptions {
  @scala.inline
  def apply(name: String, options: js.Object): NameOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameOptions]
  }
}

