package typings.googleapis.buildSrcApisTexttospeechV1Mod.texttospeech_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of which voice to use for a synthesis request.
  */
@js.native
trait Schema$VoiceSelectionParams extends js.Object {
  /**
    * The language (and optionally also the region) of the voice expressed as a
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g.
    * &quot;en-US&quot;. Required. This should not include a script tag (e.g.
    * use &quot;cmn-cn&quot; rather than &quot;cmn-Hant-cn&quot;), because the
    * script will be inferred from the input provided in the SynthesisInput.
    * The TTS service will use this parameter to help choose an appropriate
    * voice.  Note that the TTS service may choose a voice with a slightly
    * different language code than the one selected; it may substitute a
    * different region (e.g. using en-US rather than en-CA if there isn&#39;t a
    * Canadian voice available), or even a different language, e.g. using
    * &quot;nb&quot; (Norwegian Bokmal) instead of &quot;no&quot;
    * (Norwegian)&quot;.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * The name of the voice. Optional; if not set, the service will choose a
    * voice based on the other parameters such as language_code and gender.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The preferred gender of the voice. Optional; if not set, the service will
    * choose a voice based on the other parameters such as language_code and
    * name. Note that this is only a preference, not requirement; if a voice of
    * the appropriate gender is not available, the synthesizer should
    * substitute a voice with a different gender rather than failing the
    * request.
    */
  var ssmlGender: js.UndefOr[String] = js.native
}

object Schema$VoiceSelectionParams {
  @scala.inline
  def apply(languageCode: String = null, name: String = null, ssmlGender: String = null): Schema$VoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ssmlGender != null) __obj.updateDynamic("ssmlGender")(ssmlGender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VoiceSelectionParams]
  }
}

