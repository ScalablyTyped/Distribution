package typings
package glueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: js.UndefOr[js.Any] = js.undefined
  var register: java.lang.String
}

object Anon_Options {
  @scala.inline
  def apply(register: java.lang.String, options: js.Any = null): Anon_Options = {
    val __obj = js.Dynamic.literal(register = register)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Options]
  }
}

