package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofoperationsProtos extends StObject {
  
  val google: TypeofgoogleLongrunning
}
object TypeofoperationsProtos {
  
  inline def apply(google: TypeofgoogleLongrunning): TypeofoperationsProtos = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofoperationsProtos]
  }
  
  extension [Self <: TypeofoperationsProtos](x: Self) {
    
    inline def setGoogle(value: TypeofgoogleLongrunning): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
  }
}
