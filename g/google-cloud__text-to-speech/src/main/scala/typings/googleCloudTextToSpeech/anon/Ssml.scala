package typings.googleCloudTextToSpeech.anon

import typings.googleCloudTextToSpeech.mod.SynthesisInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ssml extends SynthesisInput {
  var ssml: String
}

object Ssml {
  @scala.inline
  def apply(ssml: String): Ssml = {
    val __obj = js.Dynamic.literal(ssml = ssml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ssml]
  }
}

