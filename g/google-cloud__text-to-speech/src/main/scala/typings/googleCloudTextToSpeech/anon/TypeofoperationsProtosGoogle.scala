package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofoperationsProtosGoogle extends StObject {
  
  val google: TypeofgoogleRpc
}
object TypeofoperationsProtosGoogle {
  
  inline def apply(google: TypeofgoogleRpc): TypeofoperationsProtosGoogle = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofoperationsProtosGoogle]
  }
  
  extension [Self <: TypeofoperationsProtosGoogle](x: Self) {
    
    inline def setGoogle(value: TypeofgoogleRpc): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
  }
}
