package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an OutputAudioConfig. */
trait IOutputAudioConfig extends js.Object {
  /** OutputAudioConfig audioEncoding */
  var audioEncoding: js.UndefOr[OutputAudioEncoding | Null] = js.undefined
  /** OutputAudioConfig sampleRateHertz */
  var sampleRateHertz: js.UndefOr[Double | Null] = js.undefined
  /** OutputAudioConfig synthesizeSpeechConfig */
  var synthesizeSpeechConfig: js.UndefOr[ISynthesizeSpeechConfig | Null] = js.undefined
}

object IOutputAudioConfig {
  @scala.inline
  def apply(
    audioEncoding: OutputAudioEncoding = null,
    sampleRateHertz: Int | Double = null,
    synthesizeSpeechConfig: ISynthesizeSpeechConfig = null
  ): IOutputAudioConfig = {
    val __obj = js.Dynamic.literal()
    if (audioEncoding != null) __obj.updateDynamic("audioEncoding")(audioEncoding)
    if (sampleRateHertz != null) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.asInstanceOf[js.Any])
    if (synthesizeSpeechConfig != null) __obj.updateDynamic("synthesizeSpeechConfig")(synthesizeSpeechConfig)
    __obj.asInstanceOf[IOutputAudioConfig]
  }
}

