package typings.googleCloudTextToSpeech.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SynthesizeSpeechResponse extends js.Object {
  var audioContent: Buffer = js.native
}

object SynthesizeSpeechResponse {
  @scala.inline
  def apply(audioContent: Buffer): SynthesizeSpeechResponse = {
    val __obj = js.Dynamic.literal(audioContent = audioContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizeSpeechResponse]
  }
  @scala.inline
  implicit class SynthesizeSpeechResponseOps[Self <: SynthesizeSpeechResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudioContent(value: Buffer): Self = this.set("audioContent", value.asInstanceOf[js.Any])
  }
  
}

