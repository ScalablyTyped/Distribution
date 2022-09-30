package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLocationProtos extends StObject {
  
  val google: TypeofgoogleCloud
}
object TypeofLocationProtos {
  
  inline def apply(google: TypeofgoogleCloud): TypeofLocationProtos = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofLocationProtos]
  }
  
  extension [Self <: TypeofLocationProtos](x: Self) {
    
    inline def setGoogle(value: TypeofgoogleCloud): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
  }
}
