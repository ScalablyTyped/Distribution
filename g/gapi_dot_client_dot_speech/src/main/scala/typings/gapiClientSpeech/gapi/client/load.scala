package typings.gapiClientSpeech.gapi.client

import typings.gapiClientSpeech.gapiClientSpeechStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  /** Load Google Cloud Speech API v1 */
  def apply(name: typings.gapiClientSpeech.gapiClientSpeechStrings.speech, version: v1): js.Thenable[Unit] = js.native
  def apply(
    name: typings.gapiClientSpeech.gapiClientSpeechStrings.speech,
    version: v1,
    callback: js.Function0[_]
  ): Unit = js.native
}

