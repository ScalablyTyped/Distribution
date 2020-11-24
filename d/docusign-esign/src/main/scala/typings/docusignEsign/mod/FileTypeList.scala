package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileTypeList extends js.Object {
  
  /**
    * A collection of file types.
    */
  var fileTypes: js.UndefOr[js.Array[FileType]] = js.native
}
object FileTypeList {
  
  @scala.inline
  def apply(): FileTypeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileTypeList]
  }
  
  @scala.inline
  implicit class FileTypeListOps[Self <: FileTypeList] (val x: Self) extends AnyVal {
    
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
    def setFileTypesVarargs(value: FileType*): Self = this.set("fileTypes", js.Array(value :_*))
    
    @scala.inline
    def setFileTypes(value: js.Array[FileType]): Self = this.set("fileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileTypes: Self = this.set("fileTypes", js.undefined)
  }
}
