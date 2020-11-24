package typings.docusignEsign.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentPublish extends js.Object {
  
  /**
    * A unique ID for the Salesforce object.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * An array of userIds that are mentioned directly in the body of a comment.
    */
  var mentions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies the text that is shown in the dropdown list.
    */
  var text: js.UndefOr[String] = js.native
  
  var threadAnchorKeys: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The unique identifier for the comment thread.
    */
  var threadId: js.UndefOr[String] = js.native
  
  var visibleTo: js.UndefOr[js.Array[String]] = js.native
}
object CommentPublish {
  
  @scala.inline
  def apply(): CommentPublish = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentPublish]
  }
  
  @scala.inline
  implicit class CommentPublishOps[Self <: CommentPublish] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMentionsVarargs(value: String*): Self = this.set("mentions", js.Array(value :_*))
    
    @scala.inline
    def setMentions(value: js.Array[String]): Self = this.set("mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMentions: Self = this.set("mentions", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setThreadAnchorKeys(value: StringDictionary[String]): Self = this.set("threadAnchorKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadAnchorKeys: Self = this.set("threadAnchorKeys", js.undefined)
    
    @scala.inline
    def setThreadId(value: String): Self = this.set("threadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadId: Self = this.set("threadId", js.undefined)
    
    @scala.inline
    def setVisibleToVarargs(value: String*): Self = this.set("visibleTo", js.Array(value :_*))
    
    @scala.inline
    def setVisibleTo(value: js.Array[String]): Self = this.set("visibleTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleTo: Self = this.set("visibleTo", js.undefined)
  }
}
