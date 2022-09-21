package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeIdsRequest extends StObject {
  
  /**
    * A comma-separated list of envelope IDs to include in the results.
    */
  var envelopeIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A comma-separated list of transaction IDs to include in the results. Note that transaction IDs are valid for seven days.
    */
  var transactionIds: js.UndefOr[js.Array[String]] = js.undefined
}
object EnvelopeIdsRequest {
  
  inline def apply(): EnvelopeIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeIdsRequest]
  }
  
  extension [Self <: EnvelopeIdsRequest](x: Self) {
    
    inline def setEnvelopeIds(value: js.Array[String]): Self = StObject.set(x, "envelopeIds", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIdsUndefined: Self = StObject.set(x, "envelopeIds", js.undefined)
    
    inline def setEnvelopeIdsVarargs(value: String*): Self = StObject.set(x, "envelopeIds", js.Array(value*))
    
    inline def setTransactionIds(value: js.Array[String]): Self = StObject.set(x, "transactionIds", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdsUndefined: Self = StObject.set(x, "transactionIds", js.undefined)
    
    inline def setTransactionIdsVarargs(value: String*): Self = StObject.set(x, "transactionIds", js.Array(value*))
  }
}
