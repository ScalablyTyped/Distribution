package typings.fileEntryCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyzedFilesInfo extends js.Object {
  
  val changedFiles: js.Array[String] = js.native
  
  val notChangedFiles: js.Array[String] = js.native
  
  val notFoundFiles: js.Array[String] = js.native
}
object AnalyzedFilesInfo {
  
  @scala.inline
  def apply(changedFiles: js.Array[String], notChangedFiles: js.Array[String], notFoundFiles: js.Array[String]): AnalyzedFilesInfo = {
    val __obj = js.Dynamic.literal(changedFiles = changedFiles.asInstanceOf[js.Any], notChangedFiles = notChangedFiles.asInstanceOf[js.Any], notFoundFiles = notFoundFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedFilesInfo]
  }
  
  @scala.inline
  implicit class AnalyzedFilesInfoOps[Self <: AnalyzedFilesInfo] (val x: Self) extends AnyVal {
    
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
    def setNotChangedFilesVarargs(value: String*): Self = this.set("notChangedFiles", js.Array(value :_*))
    
    @scala.inline
    def setNotChangedFiles(value: js.Array[String]): Self = this.set("notChangedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundFilesVarargs(value: String*): Self = this.set("notFoundFiles", js.Array(value :_*))
    
    @scala.inline
    def setNotFoundFiles(value: js.Array[String]): Self = this.set("notFoundFiles", value.asInstanceOf[js.Any])
  }
}
