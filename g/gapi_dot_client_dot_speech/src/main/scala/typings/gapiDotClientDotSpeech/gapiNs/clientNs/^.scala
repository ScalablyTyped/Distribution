package typings.gapiDotClientDotSpeech.gapiNs.clientNs

import typings.gapiDotClientDotSpeech.gapiDotClientDotSpeechStrings.v1
import typings.gapiDotClientDotSpeech.gapiNs.clientNs.speechNs.OperationsResource
import typings.gapiDotClientDotSpeech.gapiNs.clientNs.speechNs.SpeechResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val operations: OperationsResource = js.native
  val speech: SpeechResource = js.native
  /** Load Google Cloud Speech API v1 */
  def load(name: typings.gapiDotClientDotSpeech.gapiDotClientDotSpeechStrings.speech, version: v1): js.Thenable[Unit] = js.native
  def load(
    name: typings.gapiDotClientDotSpeech.gapiDotClientDotSpeechStrings.speech,
    version: v1,
    callback: js.Function0[_]
  ): Unit = js.native
}

