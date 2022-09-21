package typings.domSpeechRecognition

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://wicg.github.io/speech-api/#speechrecognitionerrorevent
@js.native
trait SpeechRecognitionErrorEvent
  extends StObject
     with Event {
  
  val error: SpeechRecognitionErrorCode = js.native
  
  val message: String = js.native
}
