package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofIamProtosGoogle extends StObject {
  
  val google: TypeofgoogleApi
}
object TypeofIamProtosGoogle {
  
  inline def apply(google: TypeofgoogleApi): TypeofIamProtosGoogle = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofIamProtosGoogle]
  }
  
  extension [Self <: TypeofIamProtosGoogle](x: Self) {
    
    inline def setGoogle(value: TypeofgoogleApi): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
  }
}
