package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instructs the speech recognizer how to process the audio content.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2InputAudioConfig extends js.Object {
  /**
    * Required. Audio encoding of the audio content to process.
    */
  var audioEncoding: js.UndefOr[String] = js.native
  /**
    * Required. The language of the supplied audio. Dialogflow does not do
    * translations. See [Language
    * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * for a list of the currently supported language codes. Note that queries
    * in the same session do not necessarily need to specify the same language.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of phrase hints which are used to boost accuracy
    * of speech recognition. Refer to [Cloud Speech API
    * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
    * for more details.
    */
  var phraseHints: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. Sample rate (in Hertz) of the audio content sent in the query.
    * Refer to [Cloud Speech API
    * documentation](https://cloud.google.com/speech-to-text/docs/basics) for
    * more details.
    */
  var sampleRateHertz: js.UndefOr[Double] = js.native
}

object Schema$GoogleCloudDialogflowV2InputAudioConfig {
  @scala.inline
  def apply(
    audioEncoding: String = null,
    languageCode: String = null,
    phraseHints: js.Array[String] = null,
    sampleRateHertz: Int | Double = null
  ): Schema$GoogleCloudDialogflowV2InputAudioConfig = {
    val __obj = js.Dynamic.literal()
    if (audioEncoding != null) __obj.updateDynamic("audioEncoding")(audioEncoding.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (phraseHints != null) __obj.updateDynamic("phraseHints")(phraseHints.asInstanceOf[js.Any])
    if (sampleRateHertz != null) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2InputAudioConfig]
  }
}

