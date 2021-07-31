package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentHistoryResult extends StObject {
  
  /**
    * An array of comment tabs that contain information about users' comments on documents.
    */
  var comments: js.UndefOr[js.Array[Comment]] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var count: js.UndefOr[Double] = js.undefined
  
  // int32
  var endTimetoken: js.UndefOr[String] = js.undefined
  
  var startTimetoken: js.UndefOr[String] = js.undefined
}
object CommentHistoryResult {
  
  @scala.inline
  def apply(): CommentHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentHistoryResult]
  }
  
  @scala.inline
  implicit class CommentHistoryResultMutableBuilder[Self <: CommentHistoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[Comment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setEndTimetoken(value: String): Self = StObject.set(x, "endTimetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimetokenUndefined: Self = StObject.set(x, "endTimetoken", js.undefined)
    
    @scala.inline
    def setStartTimetoken(value: String): Self = StObject.set(x, "startTimetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimetokenUndefined: Self = StObject.set(x, "startTimetoken", js.undefined)
  }
}
