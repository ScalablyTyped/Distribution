package typings.atGoogleDashCloudTextDashToDashSpeech.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SynthesisInput extends js.Object {
  var ssml: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object SynthesisInput {
  @scala.inline
  def apply(ssml: String = null, text: String = null): SynthesisInput = {
    val __obj = js.Dynamic.literal()
    if (ssml != null) __obj.updateDynamic("ssml")(ssml)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SynthesisInput]
  }
}

