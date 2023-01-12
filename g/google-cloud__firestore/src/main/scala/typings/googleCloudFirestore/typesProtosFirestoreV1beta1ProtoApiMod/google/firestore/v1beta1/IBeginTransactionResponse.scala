package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BeginTransactionResponse. */
trait IBeginTransactionResponse extends StObject {
  
  /** BeginTransactionResponse transaction */
  var transaction: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IBeginTransactionResponse {
  
  inline def apply(): IBeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBeginTransactionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBeginTransactionResponse] (val x: Self) extends AnyVal {
    
    inline def setTransaction(value: js.typedarray.Uint8Array): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
