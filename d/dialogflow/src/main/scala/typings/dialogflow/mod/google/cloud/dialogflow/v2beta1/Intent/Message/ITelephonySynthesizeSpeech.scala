package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TelephonySynthesizeSpeech. */
trait ITelephonySynthesizeSpeech extends js.Object {
  /** TelephonySynthesizeSpeech ssml */
  var ssml: js.UndefOr[String | Null] = js.undefined
  /** TelephonySynthesizeSpeech text */
  var text: js.UndefOr[String | Null] = js.undefined
}

object ITelephonySynthesizeSpeech {
  @scala.inline
  def apply(ssml: js.UndefOr[Null | String] = js.undefined, text: js.UndefOr[Null | String] = js.undefined): ITelephonySynthesizeSpeech = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ssml)) __obj.updateDynamic("ssml")(ssml.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITelephonySynthesizeSpeech]
  }
}

