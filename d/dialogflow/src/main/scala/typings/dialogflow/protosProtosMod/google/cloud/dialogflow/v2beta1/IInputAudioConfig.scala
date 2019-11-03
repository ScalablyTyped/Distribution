package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an InputAudioConfig. */
trait IInputAudioConfig extends js.Object {
  /** InputAudioConfig audioEncoding */
  var audioEncoding: js.UndefOr[AudioEncoding | Null] = js.undefined
  /** InputAudioConfig enableWordInfo */
  var enableWordInfo: js.UndefOr[Boolean | Null] = js.undefined
  /** InputAudioConfig languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** InputAudioConfig model */
  var model: js.UndefOr[String | Null] = js.undefined
  /** InputAudioConfig modelVariant */
  var modelVariant: js.UndefOr[SpeechModelVariant | Null] = js.undefined
  /** InputAudioConfig phraseHints */
  var phraseHints: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** InputAudioConfig sampleRateHertz */
  var sampleRateHertz: js.UndefOr[Double | Null] = js.undefined
  /** InputAudioConfig singleUtterance */
  var singleUtterance: js.UndefOr[Boolean | Null] = js.undefined
  /** InputAudioConfig speechContexts */
  var speechContexts: js.UndefOr[js.Array[ISpeechContext] | Null] = js.undefined
}

object IInputAudioConfig {
  @scala.inline
  def apply(
    audioEncoding: AudioEncoding = null,
    enableWordInfo: js.UndefOr[Boolean] = js.undefined,
    languageCode: String = null,
    model: String = null,
    modelVariant: SpeechModelVariant = null,
    phraseHints: js.Array[String] = null,
    sampleRateHertz: Int | Double = null,
    singleUtterance: js.UndefOr[Boolean] = js.undefined,
    speechContexts: js.Array[ISpeechContext] = null
  ): IInputAudioConfig = {
    val __obj = js.Dynamic.literal()
    if (audioEncoding != null) __obj.updateDynamic("audioEncoding")(audioEncoding)
    if (!js.isUndefined(enableWordInfo)) __obj.updateDynamic("enableWordInfo")(enableWordInfo)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (model != null) __obj.updateDynamic("model")(model)
    if (modelVariant != null) __obj.updateDynamic("modelVariant")(modelVariant)
    if (phraseHints != null) __obj.updateDynamic("phraseHints")(phraseHints)
    if (sampleRateHertz != null) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.asInstanceOf[js.Any])
    if (!js.isUndefined(singleUtterance)) __obj.updateDynamic("singleUtterance")(singleUtterance)
    if (speechContexts != null) __obj.updateDynamic("speechContexts")(speechContexts)
    __obj.asInstanceOf[IInputAudioConfig]
  }
}

