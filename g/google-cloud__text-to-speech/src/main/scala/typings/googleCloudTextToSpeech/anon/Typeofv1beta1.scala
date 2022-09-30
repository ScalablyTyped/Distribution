package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofv1beta1 extends StObject {
  
  var TextToSpeechClient: TypeofTextToSpeechClientInstantiable
}
object Typeofv1beta1 {
  
  inline def apply(TextToSpeechClient: TypeofTextToSpeechClientInstantiable): Typeofv1beta1 = {
    val __obj = js.Dynamic.literal(TextToSpeechClient = TextToSpeechClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofv1beta1]
  }
  
  extension [Self <: Typeofv1beta1](x: Self) {
    
    inline def setTextToSpeechClient(value: TypeofTextToSpeechClientInstantiable): Self = StObject.set(x, "TextToSpeechClient", value.asInstanceOf[js.Any])
  }
}
