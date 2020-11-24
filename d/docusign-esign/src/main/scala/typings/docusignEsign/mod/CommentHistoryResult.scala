package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentHistoryResult extends js.Object {
  
  /**
    * An array of comment tabs that contain information about users' comments on documents.
    */
  var comments: js.UndefOr[js.Array[Comment]] = js.native
  
  /**
    * The maximum number of results to return.
    */
  var count: js.UndefOr[Double] = js.native
  
   // int32
  var endTimetoken: js.UndefOr[String] = js.native
  
  var startTimetoken: js.UndefOr[String] = js.native
}
object CommentHistoryResult {
  
  @scala.inline
  def apply(): CommentHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentHistoryResult]
  }
  
  @scala.inline
  implicit class CommentHistoryResultOps[Self <: CommentHistoryResult] (val x: Self) extends AnyVal {
    
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
    def setCommentsVarargs(value: Comment*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[Comment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setEndTimetoken(value: String): Self = this.set("endTimetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimetoken: Self = this.set("endTimetoken", js.undefined)
    
    @scala.inline
    def setStartTimetoken(value: String): Self = this.set("startTimetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimetoken: Self = this.set("startTimetoken", js.undefined)
  }
}
