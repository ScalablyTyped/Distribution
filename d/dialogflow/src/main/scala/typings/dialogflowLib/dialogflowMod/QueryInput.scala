package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryInput extends js.Object {
  var event: js.UndefOr[EventInput] = js.undefined
  var text: js.UndefOr[TextInput] = js.undefined
}

object QueryInput {
  @scala.inline
  def apply(event: EventInput = null, text: TextInput = null): QueryInput = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[QueryInput]
  }
}

