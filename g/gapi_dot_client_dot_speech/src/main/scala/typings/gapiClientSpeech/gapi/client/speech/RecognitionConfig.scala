package typings.gapiClientSpeech.gapi.client.speech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecognitionConfig extends js.Object {
  /**
    * &#42;Optional&#42; If `true`, the top result includes a list of words and
    * the start and end time offsets (timestamps) for those words. If
    * `false`, no word-level time offset information is returned. The default is
    * `false`.
    */
  var enableWordTimeOffsets: js.UndefOr[Boolean] = js.native
  /** &#42;Required&#42; Encoding of audio data sent in all `RecognitionAudio` messages. */
  var encoding: js.UndefOr[String] = js.native
  /**
    * &#42;Required&#42; The language of the supplied audio as a
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
    * Example: "en-US".
    * See [Language Support](https://cloud.google.com/speech/docs/languages)
    * for a list of the currently supported language codes.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * &#42;Optional&#42; Maximum number of recognition hypotheses to be returned.
    * Specifically, the maximum number of `SpeechRecognitionAlternative` messages
    * within each `SpeechRecognitionResult`.
    * The server may return fewer than `max_alternatives`.
    * Valid values are `0`-`30`. A value of `0` or `1` will return a maximum of
    * one. If omitted, will return a maximum of one.
    */
  var maxAlternatives: js.UndefOr[Double] = js.native
  /**
    * &#42;Optional&#42; If set to `true`, the server will attempt to filter out
    * profanities, replacing all but the initial character in each filtered word
    * with asterisks, e.g. "f&#42;&#42;&#42;". If set to `false` or omitted, profanities
    * won't be filtered out.
    */
  var profanityFilter: js.UndefOr[Boolean] = js.native
  /**
    * &#42;Required&#42; Sample rate in Hertz of the audio data sent in all
    * `RecognitionAudio` messages. Valid values are: 8000-48000.
    * 16000 is optimal. For best results, set the sampling rate of the audio
    * source to 16000 Hz. If that's not possible, use the native sample rate of
    * the audio source (instead of re-sampling).
    */
  var sampleRateHertz: js.UndefOr[Double] = js.native
  /** &#42;Optional&#42; A means to provide context to assist the speech recognition. */
  var speechContexts: js.UndefOr[js.Array[SpeechContext]] = js.native
}

object RecognitionConfig {
  @scala.inline
  def apply(): RecognitionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecognitionConfig]
  }
  @scala.inline
  implicit class RecognitionConfigOps[Self <: RecognitionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnableWordTimeOffsets(value: Boolean): Self = this.set("enableWordTimeOffsets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableWordTimeOffsets: Self = this.set("enableWordTimeOffsets", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setMaxAlternatives(value: Double): Self = this.set("maxAlternatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAlternatives: Self = this.set("maxAlternatives", js.undefined)
    @scala.inline
    def setProfanityFilter(value: Boolean): Self = this.set("profanityFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfanityFilter: Self = this.set("profanityFilter", js.undefined)
    @scala.inline
    def setSampleRateHertz(value: Double): Self = this.set("sampleRateHertz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRateHertz: Self = this.set("sampleRateHertz", js.undefined)
    @scala.inline
    def setSpeechContextsVarargs(value: SpeechContext*): Self = this.set("speechContexts", js.Array(value :_*))
    @scala.inline
    def setSpeechContexts(value: js.Array[SpeechContext]): Self = this.set("speechContexts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeechContexts: Self = this.set("speechContexts", js.undefined)
  }
  
}

