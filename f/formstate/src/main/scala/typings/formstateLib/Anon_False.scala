package typings
package formstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False[TValue] extends js.Object {
  var hasError: formstateLib.formstateLibNumbers.`false`
  var value: TValue
}

object Anon_False {
  @scala.inline
  def apply[TValue](hasError: formstateLib.formstateLibNumbers.`false`, value: TValue): Anon_False[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasError")(hasError)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False[TValue]]
  }
}

