package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an InputAudioConfig. */
trait IInputAudioConfig extends js.Object {
  /** InputAudioConfig audioEncoding */
  var audioEncoding: js.UndefOr[AudioEncoding | Null] = js.undefined
  /** InputAudioConfig languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** InputAudioConfig modelVariant */
  var modelVariant: js.UndefOr[SpeechModelVariant | Null] = js.undefined
  /** InputAudioConfig phraseHints */
  var phraseHints: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** InputAudioConfig sampleRateHertz */
  var sampleRateHertz: js.UndefOr[Double | Null] = js.undefined
  /** InputAudioConfig singleUtterance */
  var singleUtterance: js.UndefOr[Boolean | Null] = js.undefined
}

object IInputAudioConfig {
  @scala.inline
  def apply(
    audioEncoding: AudioEncoding = null,
    languageCode: String = null,
    modelVariant: SpeechModelVariant = null,
    phraseHints: js.Array[String] = null,
    sampleRateHertz: Int | Double = null,
    singleUtterance: js.UndefOr[Boolean] = js.undefined
  ): IInputAudioConfig = {
    val __obj = js.Dynamic.literal()
    if (audioEncoding != null) __obj.updateDynamic("audioEncoding")(audioEncoding.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (modelVariant != null) __obj.updateDynamic("modelVariant")(modelVariant.asInstanceOf[js.Any])
    if (phraseHints != null) __obj.updateDynamic("phraseHints")(phraseHints.asInstanceOf[js.Any])
    if (sampleRateHertz != null) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.asInstanceOf[js.Any])
    if (!js.isUndefined(singleUtterance)) __obj.updateDynamic("singleUtterance")(singleUtterance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputAudioConfig]
  }
}

