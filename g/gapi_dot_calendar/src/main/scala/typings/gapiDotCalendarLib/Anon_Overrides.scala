package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Overrides extends js.Object {
  var overrides: js.Array[Anon_MethodMinutes]
  var useDefault: scala.Boolean
}

object Anon_Overrides {
  @scala.inline
  def apply(overrides: js.Array[Anon_MethodMinutes], useDefault: scala.Boolean): Anon_Overrides = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("overrides")(overrides)
    __obj.updateDynamic("useDefault")(useDefault)
    __obj.asInstanceOf[Anon_Overrides]
  }
}

