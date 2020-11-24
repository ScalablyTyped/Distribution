package typings.googleDriveRealtimeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileIds extends js.Object {
  
  // string containing one or more file ids separated by spaces.
  var fileIds: String = js.native
}
object FileIds {
  
  @scala.inline
  def apply(fileIds: String): FileIds = {
    val __obj = js.Dynamic.literal(fileIds = fileIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileIds]
  }
  
  @scala.inline
  implicit class FileIdsOps[Self <: FileIds] (val x: Self) extends AnyVal {
    
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
    def setFileIds(value: String): Self = this.set("fileIds", value.asInstanceOf[js.Any])
  }
}
