package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends js.Object {
  
  var createNamedRange: js.UndefOr[CreateNamedRangeResponse] = js.native
  
  var insertInlineImage: js.UndefOr[InsertInlineImageResponse] = js.native
  
  var insertInlineSheetsChart: js.UndefOr[InsertInlineSheetsChartResponse] = js.native
  
  var replaceAllText: js.UndefOr[ReplaceAllTextResponse] = js.native
}
object Response {
  
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    
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
    def setCreateNamedRange(value: CreateNamedRangeResponse): Self = this.set("createNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateNamedRange: Self = this.set("createNamedRange", js.undefined)
    
    @scala.inline
    def setInsertInlineImage(value: InsertInlineImageResponse): Self = this.set("insertInlineImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertInlineImage: Self = this.set("insertInlineImage", js.undefined)
    
    @scala.inline
    def setInsertInlineSheetsChart(value: InsertInlineSheetsChartResponse): Self = this.set("insertInlineSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertInlineSheetsChart: Self = this.set("insertInlineSheetsChart", js.undefined)
    
    @scala.inline
    def setReplaceAllText(value: ReplaceAllTextResponse): Self = this.set("replaceAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceAllText: Self = this.set("replaceAllText", js.undefined)
  }
}
