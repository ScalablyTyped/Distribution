package typings.domSpeechRecognition

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://wicg.github.io/speech-api/#speechgrammarlist
@js.native
trait SpeechGrammarList
  extends StObject
     with /* index */ NumberDictionary[SpeechGrammar] {
  
  def addFromString(string: String): Unit = js.native
  def addFromString(string: String, weight: Double): Unit = js.native
  
  def addFromURI(src: String): Unit = js.native
  def addFromURI(src: String, weight: Double): Unit = js.native
  
  def item(index: Double): SpeechGrammar = js.native
  
  val length: Double = js.native
}
