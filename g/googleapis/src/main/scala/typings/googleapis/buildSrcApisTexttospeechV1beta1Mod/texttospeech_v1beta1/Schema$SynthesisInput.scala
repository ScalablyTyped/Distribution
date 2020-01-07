package typings.googleapis.buildSrcApisTexttospeechV1beta1Mod.texttospeech_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains text input to be synthesized. Either `text` or `ssml` must be
  * supplied. Supplying both or neither returns
  * google.rpc.Code.INVALID_ARGUMENT. The input size is limited to 5000
  * characters.
  */
@js.native
trait Schema$SynthesisInput extends js.Object {
  /**
    * The SSML document to be synthesized. The SSML document must be valid and
    * well-formed. Otherwise the RPC will fail and return
    * google.rpc.Code.INVALID_ARGUMENT. For more information, see
    * [SSML](/speech/text-to-speech/docs/ssml).
    */
  var ssml: js.UndefOr[String] = js.native
  /**
    * The raw text to be synthesized.
    */
  var text: js.UndefOr[String] = js.native
}

object Schema$SynthesisInput {
  @scala.inline
  def apply(ssml: String = null, text: String = null): Schema$SynthesisInput = {
    val __obj = js.Dynamic.literal()
    if (ssml != null) __obj.updateDynamic("ssml")(ssml.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SynthesisInput]
  }
}

