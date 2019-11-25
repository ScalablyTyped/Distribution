package typings.atGoogleDashCloudTextDashToDashSpeech.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleDashCloudTextDashToDashSpeech.Anon_Text
  - typings.atGoogleDashCloudTextDashToDashSpeech.Anon_Ssml
*/
trait SynthesisInput extends js.Object

object SynthesisInput {
  @scala.inline
  def Anon_Text(text: String): SynthesisInput = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SynthesisInput]
  }
  @scala.inline
  def Anon_Ssml(ssml: String): SynthesisInput = {
    val __obj = js.Dynamic.literal(ssml = ssml.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SynthesisInput]
  }
}

