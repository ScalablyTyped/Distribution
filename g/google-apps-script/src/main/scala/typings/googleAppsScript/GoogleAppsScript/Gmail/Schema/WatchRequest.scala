package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchRequest extends js.Object {
  
  var labelFilterAction: js.UndefOr[String] = js.native
  
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  
  var topicName: js.UndefOr[String] = js.native
}
object WatchRequest {
  
  @scala.inline
  def apply(): WatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchRequest]
  }
  
  @scala.inline
  implicit class WatchRequestOps[Self <: WatchRequest] (val x: Self) extends AnyVal {
    
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
    def setLabelFilterAction(value: String): Self = this.set("labelFilterAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFilterAction: Self = this.set("labelFilterAction", js.undefined)
    
    @scala.inline
    def setLabelIdsVarargs(value: String*): Self = this.set("labelIds", js.Array(value :_*))
    
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = this.set("labelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelIds: Self = this.set("labelIds", js.undefined)
    
    @scala.inline
    def setTopicName(value: String): Self = this.set("topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicName: Self = this.set("topicName", js.undefined)
  }
}
