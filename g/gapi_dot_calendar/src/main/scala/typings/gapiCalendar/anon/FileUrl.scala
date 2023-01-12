package typings.gapiCalendar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileUrl extends StObject {
  
  var fileUrl: String
}
object FileUrl {
  
  inline def apply(fileUrl: String): FileUrl = {
    val __obj = js.Dynamic.literal(fileUrl = fileUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileUrl] (val x: Self) extends AnyVal {
    
    inline def setFileUrl(value: String): Self = StObject.set(x, "fileUrl", value.asInstanceOf[js.Any])
  }
}
