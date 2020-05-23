package typings.glue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var options: js.UndefOr[js.Any] = js.undefined
  var register: String
}

object Options {
  @scala.inline
  def apply(register: String, options: js.Any = null): Options = {
    val __obj = js.Dynamic.literal(register = register.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

