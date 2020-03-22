package typings.gapiClientSpeech.gapi.client.speech

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSpeech.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechResource extends js.Object {
  /**
    * Performs asynchronous speech recognition: receive results via the
    * google.longrunning.Operations interface. Returns either an
    * `Operation.error` or an `Operation.response` which contains
    * a `LongRunningRecognizeResponse` message.
    */
  def longrunningrecognize(request: AnonBearertoken): Request_[Operation]
  /**
    * Performs synchronous speech recognition: receive results after all audio
    * has been sent and processed.
    */
  def recognize(request: AnonBearertoken): Request_[RecognizeResponse]
}

object SpeechResource {
  @scala.inline
  def apply(
    longrunningrecognize: AnonBearertoken => Request_[Operation],
    recognize: AnonBearertoken => Request_[RecognizeResponse]
  ): SpeechResource = {
    val __obj = js.Dynamic.literal(longrunningrecognize = js.Any.fromFunction1(longrunningrecognize), recognize = js.Any.fromFunction1(recognize))
  
    __obj.asInstanceOf[SpeechResource]
  }
}

