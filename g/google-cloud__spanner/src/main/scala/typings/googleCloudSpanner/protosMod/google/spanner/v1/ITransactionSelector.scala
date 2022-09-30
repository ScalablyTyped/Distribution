package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TransactionSelector. */
trait ITransactionSelector extends StObject {
  
  /** TransactionSelector begin */
  var begin: js.UndefOr[ITransactionOptions | Null] = js.undefined
  
  /** TransactionSelector id */
  var id: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
  
  /** TransactionSelector singleUse */
  var singleUse: js.UndefOr[ITransactionOptions | Null] = js.undefined
}
object ITransactionSelector {
  
  inline def apply(): ITransactionSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionSelector]
  }
  
  extension [Self <: ITransactionSelector](x: Self) {
    
    inline def setBegin(value: ITransactionOptions): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setBeginNull: Self = StObject.set(x, "begin", null)
    
    inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    inline def setId(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSingleUse(value: ITransactionOptions): Self = StObject.set(x, "singleUse", value.asInstanceOf[js.Any])
    
    inline def setSingleUseNull: Self = StObject.set(x, "singleUse", null)
    
    inline def setSingleUseUndefined: Self = StObject.set(x, "singleUse", js.undefined)
  }
}
