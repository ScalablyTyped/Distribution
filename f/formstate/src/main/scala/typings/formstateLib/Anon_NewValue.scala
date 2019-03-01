package typings
package formstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewValue[TValue] extends js.Object {
  var newValue: TValue
  var oldValue: TValue
}

object Anon_NewValue {
  @scala.inline
  def apply[TValue](newValue: TValue, oldValue: TValue): Anon_NewValue[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NewValue[TValue]]
  }
}

