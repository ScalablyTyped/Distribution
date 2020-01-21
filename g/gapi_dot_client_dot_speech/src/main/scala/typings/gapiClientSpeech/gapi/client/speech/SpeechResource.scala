package typings.gapiClientSpeech.gapi.client.speech

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSpeech.AnonAccesstokenAltBearertoken
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
  def longrunningrecognize(request: AnonAccesstokenAltBearertoken): Request_[Operation]
  /**
    * Performs synchronous speech recognition: receive results after all audio
    * has been sent and processed.
    */
  def recognize(request: AnonAccesstokenAltBearertoken): Request_[RecognizeResponse]
}

object SpeechResource {
  @scala.inline
  def apply(
    longrunningrecognize: AnonAccesstokenAltBearertoken => Request_[Operation],
    recognize: AnonAccesstokenAltBearertoken => Request_[RecognizeResponse]
  ): SpeechResource = {
    val __obj = js.Dynamic.literal(longrunningrecognize = js.Any.fromFunction1(longrunningrecognize), recognize = js.Any.fromFunction1(recognize))
  
    __obj.asInstanceOf[SpeechResource]
  }
}

