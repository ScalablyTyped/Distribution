package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var card: js.UndefOr[Card] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[Text] = js.undefined
}

object Message {
  @scala.inline
  def apply(card: Card = null, payload: js.Any = null, platform: java.lang.String = null, text: Text = null): Message = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Message]
  }
}

