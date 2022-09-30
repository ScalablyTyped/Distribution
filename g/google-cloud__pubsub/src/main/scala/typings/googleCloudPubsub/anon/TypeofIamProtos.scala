package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofIamProtos extends StObject {
  
  val google: Typeofgoogle
}
object TypeofIamProtos {
  
  inline def apply(google: Typeofgoogle): TypeofIamProtos = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofIamProtos]
  }
  
  extension [Self <: TypeofIamProtos](x: Self) {
    
    inline def setGoogle(value: Typeofgoogle): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
  }
}
