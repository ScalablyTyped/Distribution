package typings.domSpeechRecognition

import typings.std.Event
import typings.std.SpeechRecognitionResultList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://wicg.github.io/speech-api/#dictdef-speechrecognitioneventinit
@js.native
trait SpeechRecognitionEvent
  extends StObject
     with Event {
  
  val resultIndex: Double = js.native
  
  val results: SpeechRecognitionResultList = js.native
}
