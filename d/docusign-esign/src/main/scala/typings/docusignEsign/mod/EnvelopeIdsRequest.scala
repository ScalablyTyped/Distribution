package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeIdsRequest extends js.Object {
  
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
  implicit class EnvelopeIdsRequestOps[Self <: EnvelopeIdsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnvelopeIdsVarargs(value: String*): Self = this.set("envelopeIds", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeIds(value: js.Array[String]): Self = this.set("envelopeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeIds: Self = this.set("envelopeIds", js.undefined)
    
    @scala.inline
    def setTransactionIdsVarargs(value: String*): Self = this.set("transactionIds", js.Array(value :_*))
    
    @scala.inline
    def setTransactionIds(value: js.Array[String]): Self = this.set("transactionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionIds: Self = this.set("transactionIds", js.undefined)
  }
}
