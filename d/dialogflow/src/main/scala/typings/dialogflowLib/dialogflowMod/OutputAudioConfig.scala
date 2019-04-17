package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputAudioConfig extends js.Object {
  var audioEncoding: js.Any
  var sampleRateHertz: js.UndefOr[scala.Double] = js.undefined
  var synthesizeSpeechConfig: js.UndefOr[SynthesizeSpeechConfig] = js.undefined
}

object OutputAudioConfig {
  @scala.inline
  def apply(
    audioEncoding: js.Any,
    sampleRateHertz: scala.Int | scala.Double = null,
    synthesizeSpeechConfig: SynthesizeSpeechConfig = null
  ): OutputAudioConfig = {
    val __obj = js.Dynamic.literal(audioEncoding = audioEncoding)
    if (sampleRateHertz != null) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.asInstanceOf[js.Any])
    if (synthesizeSpeechConfig != null) __obj.updateDynamic("synthesizeSpeechConfig")(synthesizeSpeechConfig)
    __obj.asInstanceOf[OutputAudioConfig]
  }
}

