package typings.gapiClientSpeech.gapi.client.speech

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSpeech.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechResource extends js.Object {
  /**
    * Performs asynchronous speech recognition: receive results via the
    * google.longrunning.Operations interface. Returns either an
    * `Operation.error` or an `Operation.response` which contains
    * a `LongRunningRecognizeResponse` message.
    */
  def longrunningrecognize(request: Bearertoken): Request[Operation] = js.native
  /**
    * Performs synchronous speech recognition: receive results after all audio
    * has been sent and processed.
    */
  def recognize(request: Bearertoken): Request[RecognizeResponse] = js.native
}

object SpeechResource {
  @scala.inline
  def apply(
    longrunningrecognize: Bearertoken => Request[Operation],
    recognize: Bearertoken => Request[RecognizeResponse]
  ): SpeechResource = {
    val __obj = js.Dynamic.literal(longrunningrecognize = js.Any.fromFunction1(longrunningrecognize), recognize = js.Any.fromFunction1(recognize))
    __obj.asInstanceOf[SpeechResource]
  }
  @scala.inline
  implicit class SpeechResourceOps[Self <: SpeechResource] (val x: Self) extends AnyVal {
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
    def setLongrunningrecognize(value: Bearertoken => Request[Operation]): Self = this.set("longrunningrecognize", js.Any.fromFunction1(value))
    @scala.inline
    def setRecognize(value: Bearertoken => Request[RecognizeResponse]): Self = this.set("recognize", js.Any.fromFunction1(value))
  }
  
}

