package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentsPublish extends StObject {
  
  var commentsToPublish: js.UndefOr[js.Array[CommentPublish]] = js.undefined
}
object CommentsPublish {
  
  inline def apply(): CommentsPublish = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsPublish]
  }
  
  extension [Self <: CommentsPublish](x: Self) {
    
    inline def setCommentsToPublish(value: js.Array[CommentPublish]): Self = StObject.set(x, "commentsToPublish", value.asInstanceOf[js.Any])
    
    inline def setCommentsToPublishUndefined: Self = StObject.set(x, "commentsToPublish", js.undefined)
    
    inline def setCommentsToPublishVarargs(value: CommentPublish*): Self = StObject.set(x, "commentsToPublish", js.Array(value*))
  }
}
