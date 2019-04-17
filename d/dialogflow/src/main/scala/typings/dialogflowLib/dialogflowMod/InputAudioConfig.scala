package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputAudioConfig extends js.Object {
  // required by the documentation https://cloud.google.com/dialogflow-enterprise/docs/reference/rest/v2beta1/QueryInput
  // but resolved by autodetection
  var audioEncoding: js.UndefOr[js.Any] = js.undefined
  var languageCode: java.lang.String
  var model: js.UndefOr[java.lang.String] = js.undefined
  var phraseHints: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sampleRateHertz: js.UndefOr[scala.Double] = js.undefined
}

object InputAudioConfig {
  @scala.inline
  def apply(
    languageCode: java.lang.String,
    audioEncoding: js.Any = null,
    model: java.lang.String = null,
    phraseHints: js.Array[java.lang.String] = null,
    sampleRateHertz: scala.Int | scala.Double = null
  ): InputAudioConfig = {
    val __obj = js.Dynamic.literal(languageCode = languageCode)
    if (audioEncoding != null) __obj.updateDynamic("audioEncoding")(audioEncoding)
    if (model != null) __obj.updateDynamic("model")(model)
    if (phraseHints != null) __obj.updateDynamic("phraseHints")(phraseHints)
    if (sampleRateHertz != null) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputAudioConfig]
  }
}

