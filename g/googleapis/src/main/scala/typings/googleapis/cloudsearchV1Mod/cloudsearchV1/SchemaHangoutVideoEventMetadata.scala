package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHangoutVideoEventMetadata extends StObject {
  
  var hangoutVideoType: js.UndefOr[String | Null] = js.undefined
}
object SchemaHangoutVideoEventMetadata {
  
  inline def apply(): SchemaHangoutVideoEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHangoutVideoEventMetadata]
  }
  
  extension [Self <: SchemaHangoutVideoEventMetadata](x: Self) {
    
    inline def setHangoutVideoType(value: String): Self = StObject.set(x, "hangoutVideoType", value.asInstanceOf[js.Any])
    
    inline def setHangoutVideoTypeNull: Self = StObject.set(x, "hangoutVideoType", null)
    
    inline def setHangoutVideoTypeUndefined: Self = StObject.set(x, "hangoutVideoType", js.undefined)
  }
}
