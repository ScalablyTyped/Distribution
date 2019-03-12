package typings
package flexmonsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handler extends js.Object {
  var handler: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var label: java.lang.String
}

object Anon_Handler {
  @scala.inline
  def apply(label: java.lang.String, handler: () => scala.Unit = null): Anon_Handler = {
    val __obj = js.Dynamic.literal(label = label)
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction0(handler))
    __obj.asInstanceOf[Anon_Handler]
  }
}

