package typings
package gapiDotClientDotSpeechLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val operations: gapiDotClientDotSpeechLib.gapiNs.clientNs.speechNs.OperationsResource = js.native
  val speech: gapiDotClientDotSpeechLib.gapiNs.clientNs.speechNs.SpeechResource = js.native
  /** Load Google Cloud Speech API v1 */
  def load(
    name: gapiDotClientDotSpeechLib.gapiDotClientDotSpeechLibStrings.speech,
    version: gapiDotClientDotSpeechLib.gapiDotClientDotSpeechLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotSpeechLib.gapiDotClientDotSpeechLibStrings.speech,
    version: gapiDotClientDotSpeechLib.gapiDotClientDotSpeechLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

