package typings.googleCloudTextToSpeech

import typings.googleCloudTextToSpeech.mod.SynthesisInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSsml extends SynthesisInput {
  var ssml: String
}

object AnonSsml {
  @scala.inline
  def apply(ssml: String): AnonSsml = {
    val __obj = js.Dynamic.literal(ssml = ssml.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSsml]
  }
}

