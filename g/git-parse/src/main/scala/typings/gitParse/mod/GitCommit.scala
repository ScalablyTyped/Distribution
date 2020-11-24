package typings.gitParse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCommit extends js.Object {
  
  var authorEmail: String = js.native
  
  var authorName: String = js.native
  
  var date: String = js.native
  
  var filesAdded: js.Array[FileModification] = js.native
  
  var filesDeleted: js.Array[FileModification] = js.native
  
  var filesModified: js.Array[FileModification] = js.native
  
  var filesRenamed: js.Array[FileRename] = js.native
  
  var hash: String = js.native
  
  var message: String = js.native
}
object GitCommit {
  
  @scala.inline
  def apply(
    authorEmail: String,
    authorName: String,
    date: String,
    filesAdded: js.Array[FileModification],
    filesDeleted: js.Array[FileModification],
    filesModified: js.Array[FileModification],
    filesRenamed: js.Array[FileRename],
    hash: String,
    message: String
  ): GitCommit = {
    val __obj = js.Dynamic.literal(authorEmail = authorEmail.asInstanceOf[js.Any], authorName = authorName.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], filesAdded = filesAdded.asInstanceOf[js.Any], filesDeleted = filesDeleted.asInstanceOf[js.Any], filesModified = filesModified.asInstanceOf[js.Any], filesRenamed = filesRenamed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCommit]
  }
  
  @scala.inline
  implicit class GitCommitOps[Self <: GitCommit] (val x: Self) extends AnyVal {
    
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
    def setAuthorEmail(value: String): Self = this.set("authorEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorName(value: String): Self = this.set("authorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesAddedVarargs(value: FileModification*): Self = this.set("filesAdded", js.Array(value :_*))
    
    @scala.inline
    def setFilesAdded(value: js.Array[FileModification]): Self = this.set("filesAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesDeletedVarargs(value: FileModification*): Self = this.set("filesDeleted", js.Array(value :_*))
    
    @scala.inline
    def setFilesDeleted(value: js.Array[FileModification]): Self = this.set("filesDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesModifiedVarargs(value: FileModification*): Self = this.set("filesModified", js.Array(value :_*))
    
    @scala.inline
    def setFilesModified(value: js.Array[FileModification]): Self = this.set("filesModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesRenamedVarargs(value: FileRename*): Self = this.set("filesRenamed", js.Array(value :_*))
    
    @scala.inline
    def setFilesRenamed(value: js.Array[FileRename]): Self = this.set("filesRenamed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
