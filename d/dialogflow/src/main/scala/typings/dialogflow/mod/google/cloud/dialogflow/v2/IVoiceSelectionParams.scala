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
    name: js.UndefOr[Null | String] = js.undefined,
    ssmlGender: js.UndefOr[
      Null | SsmlVoiceGender | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.SsmlVoiceGender * / any */ String)
    ] = js.undefined
  ): IVoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(ssmlGender)) __obj.updateDynamic("ssmlGender")(ssmlGender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVoiceSelectionParams]
  }
}

