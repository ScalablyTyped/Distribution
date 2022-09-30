package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofcloudLocation extends StObject {
  
  /** Namespace location. */
  val location: TypeoflocationGetLocationRequest
}
object TypeofcloudLocation {
  
  inline def apply(location: TypeoflocationGetLocationRequest): TypeofcloudLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofcloudLocation]
  }
  
  extension [Self <: TypeofcloudLocation](x: Self) {
    
    inline def setLocation(value: TypeoflocationGetLocationRequest): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
