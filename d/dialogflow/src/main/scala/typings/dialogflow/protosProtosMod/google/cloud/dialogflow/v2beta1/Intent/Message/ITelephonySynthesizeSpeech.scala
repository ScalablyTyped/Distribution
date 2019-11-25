package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

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
  def apply(ssml: String = null, text: String = null): ITelephonySynthesizeSpeech = {
    val __obj = js.Dynamic.literal()
    if (ssml != null) __obj.updateDynamic("ssml")(ssml.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITelephonySynthesizeSpeech]
  }
}

