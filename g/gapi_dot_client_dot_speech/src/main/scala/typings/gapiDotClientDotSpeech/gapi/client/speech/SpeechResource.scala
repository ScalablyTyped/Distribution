package typings.gapiDotClientDotSpeech.gapi.client.speech

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotSpeech.Anon_AccesstokenAltBearertoken
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
  def longrunningrecognize(request: Anon_AccesstokenAltBearertoken): Request[Operation]
  /**
    * Performs synchronous speech recognition: receive results after all audio
    * has been sent and processed.
    */
  def recognize(request: Anon_AccesstokenAltBearertoken): Request[RecognizeResponse]
}

object SpeechResource {
  @scala.inline
  def apply(
    longrunningrecognize: Anon_AccesstokenAltBearertoken => Request[Operation],
    recognize: Anon_AccesstokenAltBearertoken => Request[RecognizeResponse]
  ): SpeechResource = {
    val __obj = js.Dynamic.literal(longrunningrecognize = js.Any.fromFunction1(longrunningrecognize), recognize = js.Any.fromFunction1(recognize))
  
    __obj.asInstanceOf[SpeechResource]
  }
}

