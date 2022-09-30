package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Transaction. */
trait ITransaction extends StObject {
  
  /** Transaction id */
  var id: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
  
  /** Transaction readTimestamp */
  var readTimestamp: js.UndefOr[ITimestamp | Null] = js.undefined
}
object ITransaction {
  
  inline def apply(): ITransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransaction]
  }
  
  extension [Self <: ITransaction](x: Self) {
    
    inline def setId(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setReadTimestamp(value: ITimestamp): Self = StObject.set(x, "readTimestamp", value.asInstanceOf[js.Any])
    
    inline def setReadTimestampNull: Self = StObject.set(x, "readTimestamp", null)
    
    inline def setReadTimestampUndefined: Self = StObject.set(x, "readTimestamp", js.undefined)
  }
}
