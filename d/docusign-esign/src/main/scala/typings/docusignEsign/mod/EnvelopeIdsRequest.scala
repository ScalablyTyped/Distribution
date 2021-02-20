package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeIdsRequest extends StObject {
  
  /**
    * A comma-separated list of envelope IDs to include in the results.
    */
  var envelopeIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A comma-separated list of transaction IDs to include in the results. Note that transaction IDs are valid for seven days.
    */
  var transactionIds: js.UndefOr[js.Array[String]] = js.native
}
object EnvelopeIdsRequest {
  
  @scala.inline
  def apply(): EnvelopeIdsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeIdsRequest]
  }
  
  @scala.inline
  implicit class EnvelopeIdsRequestMutableBuilder[Self <: EnvelopeIdsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvelopeIds(value: js.Array[String]): Self = StObject.set(x, "envelopeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdsUndefined: Self = StObject.set(x, "envelopeIds", js.undefined)
    
    @scala.inline
    def setEnvelopeIdsVarargs(value: String*): Self = StObject.set(x, "envelopeIds", js.Array(value :_*))
    
    @scala.inline
    def setTransactionIds(value: js.Array[String]): Self = StObject.set(x, "transactionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdsUndefined: Self = StObject.set(x, "transactionIds", js.undefined)
    
    @scala.inline
    def setTransactionIdsVarargs(value: String*): Self = StObject.set(x, "transactionIds", js.Array(value :_*))
  }
}
