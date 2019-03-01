package typings
package gapiDotClientDotSpeechLib.gapiNs.clientNs.speechNs

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
  def longrunningrecognize(request: gapiDotClientDotSpeechLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Performs synchronous speech recognition: receive results after all audio
    * has been sent and processed.
    */
  def recognize(request: gapiDotClientDotSpeechLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[RecognizeResponse]
}

object SpeechResource {
  @scala.inline
  def apply(
    longrunningrecognize: js.Function1[
      gapiDotClientDotSpeechLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    recognize: js.Function1[
      gapiDotClientDotSpeechLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[RecognizeResponse]
    ]
  ): SpeechResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("longrunningrecognize")(longrunningrecognize)
    __obj.updateDynamic("recognize")(recognize)
    __obj.asInstanceOf[SpeechResource]
  }
}

