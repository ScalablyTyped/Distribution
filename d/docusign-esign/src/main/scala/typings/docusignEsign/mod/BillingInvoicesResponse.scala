package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingInvoicesResponse extends js.Object {
  
  /**
    * Reserved: TBD
    */
  var billingInvoices: js.UndefOr[js.Array[BillingInvoice]] = js.native
  
  /**
    * The URI for the next chunk of records based on the search request. It is `null` if this is the last set of results for the search.
    */
  var nextUri: js.UndefOr[String] = js.native
  
  /**
    * The URI for the prior chunk of records based on the search request. It is `null` if this is the first set of results for the search.
    */
  var previousUri: js.UndefOr[String] = js.native
}
object BillingInvoicesResponse {
  
  @scala.inline
  def apply(): BillingInvoicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingInvoicesResponse]
  }
  
  @scala.inline
  implicit class BillingInvoicesResponseOps[Self <: BillingInvoicesResponse] (val x: Self) extends AnyVal {
    
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
    def setBillingInvoicesVarargs(value: BillingInvoice*): Self = this.set("billingInvoices", js.Array(value :_*))
    
    @scala.inline
    def setBillingInvoices(value: js.Array[BillingInvoice]): Self = this.set("billingInvoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingInvoices: Self = this.set("billingInvoices", js.undefined)
    
    @scala.inline
    def setNextUri(value: String): Self = this.set("nextUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextUri: Self = this.set("nextUri", js.undefined)
    
    @scala.inline
    def setPreviousUri(value: String): Self = this.set("previousUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousUri: Self = this.set("previousUri", js.undefined)
  }
}
