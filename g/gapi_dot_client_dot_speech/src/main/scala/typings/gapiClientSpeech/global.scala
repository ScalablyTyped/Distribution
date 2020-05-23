package typings.gapiClientSpeech

import org.scalablytyped.runtime.TopLevel
import typings.gapiClientSpeech.gapi.client.speech.OperationsResource
import typings.gapiClientSpeech.gapi.client.speech.SpeechResource
import typings.gapiClientSpeech.gapiClientSpeechStrings.speech
import typings.gapiClientSpeech.gapiClientSpeechStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val operations: OperationsResource = js.native
      /** Load Google Cloud Speech API v1 */
      def load(name: speech, version: v1): js.Thenable[Unit] = js.native
      def load(name: speech, version: v1, callback: js.Function0[_]): Unit = js.native
      @js.native
      object speech extends TopLevel[SpeechResource]
      
    }
    
  }
  
}

