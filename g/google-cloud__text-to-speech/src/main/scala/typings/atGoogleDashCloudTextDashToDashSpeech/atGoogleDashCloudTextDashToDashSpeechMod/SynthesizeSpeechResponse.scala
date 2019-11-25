package typings.atGoogleDashCloudTextDashToDashSpeech.atGoogleDashCloudTextDashToDashSpeechMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SynthesizeSpeechResponse extends js.Object {
  var audioContent: Buffer
}

object SynthesizeSpeechResponse {
  @scala.inline
  def apply(audioContent: Buffer): SynthesizeSpeechResponse = {
    val __obj = js.Dynamic.literal(audioContent = audioContent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SynthesizeSpeechResponse]
  }
}

