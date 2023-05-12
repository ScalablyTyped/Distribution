package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofv1beta1 extends StObject {
  
  var TextToSpeechClient: TypeofTextToSpeechClient
  
  var TextToSpeechLongAudioSynthesizeClient: TypeofTextToSpeechLongAud
}
object Typeofv1beta1 {
  
  inline def apply(
    TextToSpeechClient: TypeofTextToSpeechClient,
    TextToSpeechLongAudioSynthesizeClient: TypeofTextToSpeechLongAud
  ): Typeofv1beta1 = {
    val __obj = js.Dynamic.literal(TextToSpeechClient = TextToSpeechClient.asInstanceOf[js.Any], TextToSpeechLongAudioSynthesizeClient = TextToSpeechLongAudioSynthesizeClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofv1beta1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofv1beta1] (val x: Self) extends AnyVal {
    
    inline def setTextToSpeechClient(value: TypeofTextToSpeechClient): Self = StObject.set(x, "TextToSpeechClient", value.asInstanceOf[js.Any])
    
    inline def setTextToSpeechLongAudioSynthesizeClient(value: TypeofTextToSpeechLongAud): Self = StObject.set(x, "TextToSpeechLongAudioSynthesizeClient", value.asInstanceOf[js.Any])
  }
}
