package typings.forkTsCheckerWebpackPlugin.filesChangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesChange extends js.Object {
  
  var changedFiles: js.UndefOr[js.Array[String]] = js.native
  
  var deletedFiles: js.UndefOr[js.Array[String]] = js.native
}
object FilesChange {
  
  @scala.inline
  def apply(): FilesChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilesChange]
  }
  
  @scala.inline
  implicit class FilesChangeOps[Self <: FilesChange] (val x: Self) extends AnyVal {
    
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
    def setChangedFilesVarargs(value: String*): Self = this.set("changedFiles", js.Array(value :_*))
    
    @scala.inline
    def setChangedFiles(value: js.Array[String]): Self = this.set("changedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangedFiles: Self = this.set("changedFiles", js.undefined)
    
    @scala.inline
    def setDeletedFilesVarargs(value: String*): Self = this.set("deletedFiles", js.Array(value :_*))
    
    @scala.inline
    def setDeletedFiles(value: js.Array[String]): Self = this.set("deletedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedFiles: Self = this.set("deletedFiles", js.undefined)
  }
}
