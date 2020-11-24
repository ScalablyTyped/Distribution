package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreportsListTransactionsResponse extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var transactions: js.UndefOr[js.Array[OrderReportTransaction]] = js.native
}
object OrderreportsListTransactionsResponse {
  
  @scala.inline
  def apply(): OrderreportsListTransactionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreportsListTransactionsResponse]
  }
  
  @scala.inline
  implicit class OrderreportsListTransactionsResponseOps[Self <: OrderreportsListTransactionsResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTransactionsVarargs(value: OrderReportTransaction*): Self = this.set("transactions", js.Array(value :_*))
    
    @scala.inline
    def setTransactions(value: js.Array[OrderReportTransaction]): Self = this.set("transactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactions: Self = this.set("transactions", js.undefined)
  }
}
