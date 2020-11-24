package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsPublish extends js.Object {
  
  var commentsToPublish: js.UndefOr[js.Array[CommentPublish]] = js.native
}
object CommentsPublish {
  
  @scala.inline
  def apply(): CommentsPublish = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsPublish]
  }
  
  @scala.inline
  implicit class CommentsPublishOps[Self <: CommentsPublish] (val x: Self) extends AnyVal {
    
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
    def setCommentsToPublishVarargs(value: CommentPublish*): Self = this.set("commentsToPublish", js.Array(value :_*))
    
    @scala.inline
    def setCommentsToPublish(value: js.Array[CommentPublish]): Self = this.set("commentsToPublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentsToPublish: Self = this.set("commentsToPublish", js.undefined)
  }
}
