package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TelephonyPlayAudio. */
trait ITelephonyPlayAudio extends js.Object {
  /** TelephonyPlayAudio audioUri */
  var audioUri: js.UndefOr[String | Null] = js.undefined
}

object ITelephonyPlayAudio {
  @scala.inline
  def apply(audioUri: String = null): ITelephonyPlayAudio = {
    val __obj = js.Dynamic.literal()
    if (audioUri != null) __obj.updateDynamic("audioUri")(audioUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITelephonyPlayAudio]
  }
}

