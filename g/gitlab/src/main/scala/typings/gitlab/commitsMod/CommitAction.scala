package typings.gitlab.commitsMod

import typings.gitlab.gitlabStrings.create
import typings.gitlab.gitlabStrings.delete
import typings.gitlab.gitlabStrings.move
import typings.gitlab.gitlabStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitAction extends js.Object {
  
  /** The action to perform */
  var action: create | delete | move | update = js.native
  
  /** File content, required for all except delete. Optional for move */
  var content: js.UndefOr[String] = js.native
  
  /** text or base64. text is default. */
  var encoding: js.UndefOr[String] = js.native
  
  /** Full path to the file. Ex. lib/class.rb */
  var filePath: String = js.native
  
  /** Last known file commit id. Will be only considered in update, move and delete actions. */
  var lastCommitId: js.UndefOr[String] = js.native
  
  /** Original full path to the file being moved.Ex.lib / class1.rb */
  var previousPath: js.UndefOr[String] = js.native
}
object CommitAction {
  
  @scala.inline
  def apply(action: create | delete | move | update, filePath: String): CommitAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitAction]
  }
  
  @scala.inline
  implicit class CommitActionOps[Self <: CommitAction] (val x: Self) extends AnyVal {
    
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
    def setAction(value: create | delete | move | update): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setLastCommitId(value: String): Self = this.set("lastCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastCommitId: Self = this.set("lastCommitId", js.undefined)
    
    @scala.inline
    def setPreviousPath(value: String): Self = this.set("previousPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousPath: Self = this.set("previousPath", js.undefined)
  }
}
