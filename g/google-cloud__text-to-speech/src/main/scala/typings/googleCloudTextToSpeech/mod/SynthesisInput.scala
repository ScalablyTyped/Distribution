package typings.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleCloudTextToSpeech.anon.Text
  - typings.googleCloudTextToSpeech.anon.Ssml
*/
trait SynthesisInput extends js.Object

object SynthesisInput {
  @scala.inline
  def Text(text: String): SynthesisInput = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesisInput]
  }
  @scala.inline
  def Ssml(ssml: String): SynthesisInput = {
    val __obj = js.Dynamic.literal(ssml = ssml.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesisInput]
  }
}

