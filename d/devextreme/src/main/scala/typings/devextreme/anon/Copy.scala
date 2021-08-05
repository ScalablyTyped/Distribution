package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Copy extends StObject {
  
  var copy: js.UndefOr[Boolean] = js.undefined
  
  var create: js.UndefOr[Boolean] = js.undefined
  
  var delete: js.UndefOr[Boolean] = js.undefined
  
  var download: js.UndefOr[Boolean] = js.undefined
  
  var move: js.UndefOr[Boolean] = js.undefined
  
  var rename: js.UndefOr[Boolean] = js.undefined
  
  var upload: js.UndefOr[Boolean] = js.undefined
}
object Copy {
  
  inline def apply(): Copy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Copy]
  }
  
  extension [Self <: Copy](x: Self) {
    
    inline def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setRename(value: Boolean): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    inline def setUpload(value: Boolean): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
