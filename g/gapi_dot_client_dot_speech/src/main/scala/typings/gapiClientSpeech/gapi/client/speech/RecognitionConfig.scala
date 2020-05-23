package typings.gapiClientSpeech.gapi.client.speech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecognitionConfig extends js.Object {
  /**
    * &#42;Optional&#42; If `true`, the top result includes a list of words and
    * the start and end time offsets (timestamps) for those words. If
    * `false`, no word-level time offset information is returned. The default is
    * `false`.
    */
  var enableWordTimeOffsets: js.UndefOr[Boolean] = js.undefined
  /** &#42;Required&#42; Encoding of audio data sent in all `RecognitionAudio` messages. */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * &#42;Required&#42; The language of the supplied audio as a
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag.
    * Example: "en-US".
    * See [Language Support](https://cloud.google.com/speech/docs/languages)
    * for a list of the currently supported language codes.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  /**
    * &#42;Optional&#42; Maximum number of recognition hypotheses to be returned.
    * Specifically, the maximum number of `SpeechRecognitionAlternative` messages
    * within each `SpeechRecognitionResult`.
    * The server may return fewer than `max_alternatives`.
    * Valid values are `0`-`30`. A value of `0` or `1` will return a maximum of
    * one. If omitted, will return a maximum of one.
    */
  var maxAlternatives: js.UndefOr[Double] = js.undefined
  /**
    * &#42;Optional&#42; If set to `true`, the server will attempt to filter out
    * profanities, replacing all but the initial character in each filtered word
    * with asterisks, e.g. "f&#42;&#42;&#42;". If set to `false` or omitted, profanities
    * won't be filtered out.
    */
  var profanityFilter: js.UndefOr[Boolean] = js.undefined
  /**
    * &#42;Required&#42; Sample rate in Hertz of the audio data sent in all
    * `RecognitionAudio` messages. Valid values are: 8000-48000.
    * 16000 is optimal. For best results, set the sampling rate of the audio
    * source to 16000 Hz. If that's not possible, use the native sample rate of
    * the audio source (instead of re-sampling).
    */
  var sampleRateHertz: js.UndefOr[Double] = js.undefined
  /** &#42;Optional&#42; A means to provide context to assist the speech recognition. */
  var speechContexts: js.UndefOr[js.Array[SpeechContext]] = js.undefined
}

object RecognitionConfig {
  @scala.inline
  def apply(
    enableWordTimeOffsets: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    languageCode: String = null,
    maxAlternatives: js.UndefOr[Double] = js.undefined,
    profanityFilter: js.UndefOr[Boolean] = js.undefined,
    sampleRateHertz: js.UndefOr[Double] = js.undefined,
    speechContexts: js.Array[SpeechContext] = null
  ): RecognitionConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableWordTimeOffsets)) __obj.updateDynamic("enableWordTimeOffsets")(enableWordTimeOffsets.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAlternatives)) __obj.updateDynamic("maxAlternatives")(maxAlternatives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(profanityFilter)) __obj.updateDynamic("profanityFilter")(profanityFilter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRateHertz)) __obj.updateDynamic("sampleRateHertz")(sampleRateHertz.get.asInstanceOf[js.Any])
    if (speechContexts != null) __obj.updateDynamic("speechContexts")(speechContexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognitionConfig]
  }
}

