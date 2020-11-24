package typings.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdsenseReportsGenerateResponse extends js.Object {
  
  var averages: js.UndefOr[js.Array[String]] = js.native
  
  var endDate: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Array[AdsenseReportsGenerateResponseHeaders]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var rows: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  var startDate: js.UndefOr[String] = js.native
  
  var totalMatchedRows: js.UndefOr[String] = js.native
  
  var totals: js.UndefOr[js.Array[String]] = js.native
  
  var warnings: js.UndefOr[js.Array[String]] = js.native
}
object AdsenseReportsGenerateResponse {
  
  @scala.inline
  def apply(): AdsenseReportsGenerateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdsenseReportsGenerateResponse]
  }
  
  @scala.inline
  implicit class AdsenseReportsGenerateResponseOps[Self <: AdsenseReportsGenerateResponse] (val x: Self) extends AnyVal {
    
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
    def setAveragesVarargs(value: String*): Self = this.set("averages", js.Array(value :_*))
    
    @scala.inline
    def setAverages(value: js.Array[String]): Self = this.set("averages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverages: Self = this.set("averages", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: AdsenseReportsGenerateResponseHeaders*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[AdsenseReportsGenerateResponseHeaders]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Array[String]*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[js.Array[String]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setTotalMatchedRows(value: String): Self = this.set("totalMatchedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalMatchedRows: Self = this.set("totalMatchedRows", js.undefined)
    
    @scala.inline
    def setTotalsVarargs(value: String*): Self = this.set("totals", js.Array(value :_*))
    
    @scala.inline
    def setTotals(value: js.Array[String]): Self = this.set("totals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotals: Self = this.set("totals", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
