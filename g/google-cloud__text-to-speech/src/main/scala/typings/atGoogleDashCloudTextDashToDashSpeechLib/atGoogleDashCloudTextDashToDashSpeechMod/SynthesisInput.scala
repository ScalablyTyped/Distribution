package typings
package atGoogleDashCloudTextDashToDashSpeechLib.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SynthesisInput extends js.Object {
  var ssml: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object SynthesisInput {
  @scala.inline
  def apply(ssml: java.lang.String = null, text: java.lang.String = null): SynthesisInput = {
    val __obj = js.Dynamic.literal()
    if (ssml != null) __obj.updateDynamic("ssml")(ssml)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SynthesisInput]
  }
}

