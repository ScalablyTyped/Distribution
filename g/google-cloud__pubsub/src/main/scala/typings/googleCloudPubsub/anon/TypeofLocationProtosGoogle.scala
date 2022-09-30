package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLocationProtosGoogle extends StObject {
  
  val google: TypeofgoogleProtobuf
}
object TypeofLocationProtosGoogle {
  
  inline def apply(google: TypeofgoogleProtobuf): TypeofLocationProtosGoogle = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofLocationProtosGoogle]
  }
  
  extension [Self <: TypeofLocationProtosGoogle](x: Self) {
    
    inline def setGoogle(value: TypeofgoogleProtobuf): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
  }
}
