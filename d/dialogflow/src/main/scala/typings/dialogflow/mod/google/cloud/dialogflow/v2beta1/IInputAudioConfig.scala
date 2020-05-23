package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an InputAudioConfig. */
trait IInputAudioConfig extends js.Object {
  /** InputAudioConfig audioEncoding */
  var audioEncoding: js.UndefOr[
    AudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.AudioEncoding * / any */ String) | Null
  ] = js.undefined
  /** InputAudioConfig enableWordInfo */
  var enableWordInfo: js.UndefOr[Boolean | Null] = js.undefined
  /** InputAudioConfig languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** InputAudioConfig model */
  var model: js.UndefOr[String | Null] = js.undefined
  /** InputAudioConfig modelVariant */
  var modelVariant: js.UndefOr[
    SpeechModelVariant | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.SpeechModelVariant * / any */ String) | Null
  ] = js.undefined
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
    audioEncoding: js.UndefOr[
      Null | AudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.AudioEncoding * / any */ String)
    ] = js.undefined,
    enableWordInfo: js.UndefOr[Null | Boolean] = js.undefined,
    languageCode: js.UndefOr[Null | String] = js.undefined,
    model: js.UndefOr[Null | String] = js.undefined,
    modelVariant: js.UndefOr[
      Null | SpeechModelVariant | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.SpeechModelVariant * / any */ String)
    ] = js.undefined,
    phraseHints: js.UndefOr[Null | js.Array[String]] = js.undefined,
    sampleRateHertz: js.UndefOr[Null | Double] = js.undefined,
    singleUtterance: js.UndefOr[Null | Boolean] = js.undefined,
    speechContexts: js.UndefOr[Null | js.Array[ISpeechContext]] = js.undefined
  ): IInputAudioConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audioEncoding)) __obj.updateDynamic("audioEncoding")(audioEncoding.asInstanceOf[js.Any])
    if (!js.isUndefined(enableWordInfo)) __obj.updateDynamic("enableWordInfo")(enableWordInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(model)) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(modelVariant)) __obj.updateDynamic("modelVariant")(modelVariant.asInstanceOf[js.Any])
    if (!js.isUndefined(phraseHints)) __obj.updateDynamic("phraseHints")(phraseHints.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRateHertz)) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.asInstanceOf[js.Any])
    if (!js.isUndefined(singleUtterance)) __obj.updateDynamic("singleUtterance")(singleUtterance.asInstanceOf[js.Any])
    if (!js.isUndefined(speechContexts)) __obj.updateDynamic("speechContexts")(speechContexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputAudioConfig]
  }
}

