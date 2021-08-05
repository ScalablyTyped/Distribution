package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoutersPreviewResponse extends StObject {
  
  /**
    * Preview of given router.
    */
  var resource: js.UndefOr[SchemaRouter] = js.undefined
}
object SchemaRoutersPreviewResponse {
  
  inline def apply(): SchemaRoutersPreviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoutersPreviewResponse]
  }
  
  extension [Self <: SchemaRoutersPreviewResponse](x: Self) {
    
    inline def setResource(value: SchemaRouter): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
