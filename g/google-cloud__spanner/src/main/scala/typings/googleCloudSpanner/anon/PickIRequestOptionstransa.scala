package typings.googleCloudSpanner.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@google-cloud/spanner.@google-cloud/spanner/build/protos/protos.google.spanner.v1.IRequestOptions, 'transactionTag'> */
trait PickIRequestOptionstransa extends StObject {
  
  var transactionTag: js.UndefOr[String | Null] = js.undefined
}
object PickIRequestOptionstransa {
  
  inline def apply(): PickIRequestOptionstransa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIRequestOptionstransa]
  }
  
  extension [Self <: PickIRequestOptionstransa](x: Self) {
    
    inline def setTransactionTag(value: String): Self = StObject.set(x, "transactionTag", value.asInstanceOf[js.Any])
    
    inline def setTransactionTagNull: Self = StObject.set(x, "transactionTag", null)
    
    inline def setTransactionTagUndefined: Self = StObject.set(x, "transactionTag", js.undefined)
  }
}
