package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryInput extends js.Object {
  var audioConfig: js.UndefOr[InputAudioConfig] = js.undefined
  var event: js.UndefOr[EventInput] = js.undefined
  var text: js.UndefOr[TextInput] = js.undefined
}

object QueryInput {
  @scala.inline
  def apply(audioConfig: InputAudioConfig = null, event: EventInput = null, text: TextInput = null): QueryInput = {
    val __obj = js.Dynamic.literal()
    if (audioConfig != null) __obj.updateDynamic("audioConfig")(audioConfig)
    if (event != null) __obj.updateDynamic("event")(event)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[QueryInput]
  }
}

