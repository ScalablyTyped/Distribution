package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a VoiceSelectionParams. */
trait IVoiceSelectionParams extends js.Object {
  /** VoiceSelectionParams name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** VoiceSelectionParams ssmlGender */
  var ssmlGender: js.UndefOr[SsmlVoiceGender | Null] = js.undefined
}

object IVoiceSelectionParams {
  @scala.inline
  def apply(name: String = null, ssmlGender: SsmlVoiceGender = null): IVoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (ssmlGender != null) __obj.updateDynamic("ssmlGender")(ssmlGender)
    __obj.asInstanceOf[IVoiceSelectionParams]
  }
}

