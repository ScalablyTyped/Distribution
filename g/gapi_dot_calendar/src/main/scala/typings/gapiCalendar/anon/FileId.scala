package typings.gapiCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileId extends StObject {
  
  var fileId: String
  
  var fileUrl: String
  
  var iconLink: String
  
  var mimeType: String
  
  var title: String
}
object FileId {
  
  inline def apply(fileId: String, fileUrl: String, iconLink: String, mimeType: String, title: String): FileId = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], fileUrl = fileUrl.asInstanceOf[js.Any], iconLink = iconLink.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileId]
  }
  
  extension [Self <: FileId](x: Self) {
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileUrl(value: String): Self = StObject.set(x, "fileUrl", value.asInstanceOf[js.Any])
    
    inline def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
