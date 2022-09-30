package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofv1TextToSpeechClient extends StObject {
  
  var TextToSpeechClient: TypeofTextToSpeechClient
}
object Typeofv1TextToSpeechClient {
  
  inline def apply(TextToSpeechClient: TypeofTextToSpeechClient): Typeofv1TextToSpeechClient = {
    val __obj = js.Dynamic.literal(TextToSpeechClient = TextToSpeechClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofv1TextToSpeechClient]
  }
  
  extension [Self <: Typeofv1TextToSpeechClient](x: Self) {
    
    inline def setTextToSpeechClient(value: TypeofTextToSpeechClient): Self = StObject.set(x, "TextToSpeechClient", value.asInstanceOf[js.Any])
  }
}
