package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a VoiceSelectionParams. */
trait IVoiceSelectionParams extends js.Object {
  /** VoiceSelectionParams name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** VoiceSelectionParams ssmlGender */
  var ssmlGender: js.UndefOr[
    SsmlVoiceGender | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.SsmlVoiceGender * / any */ String) | Null
  ] = js.undefined
}

object IVoiceSelectionParams {
  @scala.inline
  def apply(
    name: String = null,
    ssmlGender: SsmlVoiceGender | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.SsmlVoiceGender * / any */ String) = null
  ): IVoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ssmlGender != null) __obj.updateDynamic("ssmlGender")(ssmlGender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVoiceSelectionParams]
  }
}

