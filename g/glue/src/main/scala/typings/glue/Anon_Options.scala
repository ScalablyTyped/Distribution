package typings.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: js.UndefOr[js.Any] = js.undefined
  var register: String
}

object Anon_Options {
  @scala.inline
  def apply(register: String, options: js.Any = null): Anon_Options = {
    val __obj = js.Dynamic.literal(register = register.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Options]
  }
}

