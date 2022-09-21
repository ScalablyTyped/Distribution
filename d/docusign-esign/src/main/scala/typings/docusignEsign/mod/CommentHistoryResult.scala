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
  
  inline def apply(): CommentHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentHistoryResult]
  }
  
  extension [Self <: CommentHistoryResult](x: Self) {
    
    inline def setComments(value: js.Array[Comment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setEndTimetoken(value: String): Self = StObject.set(x, "endTimetoken", value.asInstanceOf[js.Any])
    
    inline def setEndTimetokenUndefined: Self = StObject.set(x, "endTimetoken", js.undefined)
    
    inline def setStartTimetoken(value: String): Self = StObject.set(x, "startTimetoken", value.asInstanceOf[js.Any])
    
    inline def setStartTimetokenUndefined: Self = StObject.set(x, "startTimetoken", js.undefined)
  }
}
