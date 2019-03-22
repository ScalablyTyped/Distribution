package typings
package atGoogleDashCloudTextDashToDashSpeechLib.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SynthesizeSpeechResponse extends js.Object {
  var audioContent: nodeLib.Buffer
}

object SynthesizeSpeechResponse {
  @scala.inline
  def apply(audioContent: nodeLib.Buffer): SynthesizeSpeechResponse = {
    val __obj = js.Dynamic.literal(audioContent = audioContent)
  
    __obj.asInstanceOf[SynthesizeSpeechResponse]
  }
}

