package typings.googleCloudSpanner.protosMod.google.rpc

import typings.googleCloudSpanner.protosMod.google.protobuf.IAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Status. */
trait IStatus extends StObject {
  
  /** Status code */
  var code: js.UndefOr[Double | Null] = js.undefined
  
  /** Status details */
  var details: js.UndefOr[js.Array[IAny] | Null] = js.undefined
  
  /** Status message */
  var message: js.UndefOr[String | Null] = js.undefined
}
object IStatus {
  
  inline def apply(): IStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStatus]
  }
  
  extension [Self <: IStatus](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDetails(value: js.Array[IAny]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: IAny*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
