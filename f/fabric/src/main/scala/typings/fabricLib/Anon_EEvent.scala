package typings
package fabricLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EEvent extends js.Object {
  var e: js.UndefOr[stdLib.Event] = js.undefined
}

object Anon_EEvent {
  @scala.inline
  def apply(e: stdLib.Event = null): Anon_EEvent = {
    val __obj = js.Dynamic.literal()
    if (e != null) __obj.updateDynamic("e")(e)
    __obj.asInstanceOf[Anon_EEvent]
  }
}

