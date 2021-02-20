package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsPublish extends StObject {
  
  var commentsToPublish: js.UndefOr[js.Array[CommentPublish]] = js.native
}
object CommentsPublish {
  
  @scala.inline
  def apply(): CommentsPublish = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsPublish]
  }
  
  @scala.inline
  implicit class CommentsPublishMutableBuilder[Self <: CommentsPublish] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommentsToPublish(value: js.Array[CommentPublish]): Self = StObject.set(x, "commentsToPublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsToPublishUndefined: Self = StObject.set(x, "commentsToPublish", js.undefined)
    
    @scala.inline
    def setCommentsToPublishVarargs(value: CommentPublish*): Self = StObject.set(x, "commentsToPublish", js.Array(value :_*))
  }
}
