package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingInvoicesResponse extends StObject {
  
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
  implicit class BillingInvoicesResponseMutableBuilder[Self <: BillingInvoicesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingInvoices(value: js.Array[BillingInvoice]): Self = StObject.set(x, "billingInvoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingInvoicesUndefined: Self = StObject.set(x, "billingInvoices", js.undefined)
    
    @scala.inline
    def setBillingInvoicesVarargs(value: BillingInvoice*): Self = StObject.set(x, "billingInvoices", js.Array(value :_*))
    
    @scala.inline
    def setNextUri(value: String): Self = StObject.set(x, "nextUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUriUndefined: Self = StObject.set(x, "nextUri", js.undefined)
    
    @scala.inline
    def setPreviousUri(value: String): Self = StObject.set(x, "previousUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousUriUndefined: Self = StObject.set(x, "previousUri", js.undefined)
  }
}
