package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Copy extends StObject {
  
  var copy: js.UndefOr[Boolean] = js.native
  
  var create: js.UndefOr[Boolean] = js.native
  
  var delete: js.UndefOr[Boolean] = js.native
  
  var download: js.UndefOr[Boolean] = js.native
  
  var move: js.UndefOr[Boolean] = js.native
  
  var rename: js.UndefOr[Boolean] = js.native
  
  var upload: js.UndefOr[Boolean] = js.native
}
object Copy {
  
  @scala.inline
  def apply(): Copy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Copy]
  }
  
  @scala.inline
  implicit class CopyMutableBuilder[Self <: Copy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    @scala.inline
    def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    @scala.inline
    def setRename(value: Boolean): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    @scala.inline
    def setUpload(value: Boolean): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
