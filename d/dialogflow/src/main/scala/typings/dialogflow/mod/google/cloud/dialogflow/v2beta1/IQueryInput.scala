package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a QueryInput. */
trait IQueryInput extends js.Object {
  /** QueryInput audioConfig */
  var audioConfig: js.UndefOr[IInputAudioConfig | Null] = js.undefined
  /** QueryInput event */
  var event: js.UndefOr[IEventInput | Null] = js.undefined
  /** QueryInput text */
  var text: js.UndefOr[ITextInput | Null] = js.undefined
}

object IQueryInput {
  @scala.inline
  def apply(
    audioConfig: js.UndefOr[Null | IInputAudioConfig] = js.undefined,
    event: js.UndefOr[Null | IEventInput] = js.undefined,
    text: js.UndefOr[Null | ITextInput] = js.undefined
  ): IQueryInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audioConfig)) __obj.updateDynamic("audioConfig")(audioConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(event)) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryInput]
  }
}

