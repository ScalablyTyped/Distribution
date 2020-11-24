package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingTemplatesListResponse extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var targetingTemplates: js.UndefOr[js.Array[TargetingTemplate]] = js.native
}
object TargetingTemplatesListResponse {
  
  @scala.inline
  def apply(): TargetingTemplatesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingTemplatesListResponse]
  }
  
  @scala.inline
  implicit class TargetingTemplatesListResponseOps[Self <: TargetingTemplatesListResponse] (val x: Self) extends AnyVal {
    
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
    def setTargetingTemplatesVarargs(value: TargetingTemplate*): Self = this.set("targetingTemplates", js.Array(value :_*))
    
    @scala.inline
    def setTargetingTemplates(value: js.Array[TargetingTemplate]): Self = this.set("targetingTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingTemplates: Self = this.set("targetingTemplates", js.undefined)
  }
}
