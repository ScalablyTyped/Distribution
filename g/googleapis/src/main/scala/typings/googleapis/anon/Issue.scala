package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Issue extends js.Object {
  
  var issue: js.UndefOr[js.Array[IssueDisplayNumber]] = js.native
  
  var orderNumber: js.UndefOr[Double] = js.native
  
  var seriesBookType: js.UndefOr[String] = js.native
  
  var seriesId: js.UndefOr[String] = js.native
}
object Issue {
  
  @scala.inline
  def apply(): Issue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Issue]
  }
  
  @scala.inline
  implicit class IssueOps[Self <: Issue] (val x: Self) extends AnyVal {
    
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
    def setIssueVarargs(value: IssueDisplayNumber*): Self = this.set("issue", js.Array(value :_*))
    
    @scala.inline
    def setIssue(value: js.Array[IssueDisplayNumber]): Self = this.set("issue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssue: Self = this.set("issue", js.undefined)
    
    @scala.inline
    def setOrderNumber(value: Double): Self = this.set("orderNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderNumber: Self = this.set("orderNumber", js.undefined)
    
    @scala.inline
    def setSeriesBookType(value: String): Self = this.set("seriesBookType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesBookType: Self = this.set("seriesBookType", js.undefined)
    
    @scala.inline
    def setSeriesId(value: String): Self = this.set("seriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesId: Self = this.set("seriesId", js.undefined)
  }
}
