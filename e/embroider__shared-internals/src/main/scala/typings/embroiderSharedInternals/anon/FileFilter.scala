package typings.embroiderSharedInternals.anon

import typings.embroiderSharedInternals.embroiderSharedInternalsInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileFilter extends StObject {
  
  var fileFilter: String
  
  var filename: String
  
  var isParallelSafe: Boolean
  
  var majorVersion: `7`
}
object FileFilter {
  
  inline def apply(fileFilter: String, filename: String, isParallelSafe: Boolean): FileFilter = {
    val __obj = js.Dynamic.literal(fileFilter = fileFilter.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], isParallelSafe = isParallelSafe.asInstanceOf[js.Any], majorVersion = 7)
    __obj.asInstanceOf[FileFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileFilter] (val x: Self) extends AnyVal {
    
    inline def setFileFilter(value: String): Self = StObject.set(x, "fileFilter", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setIsParallelSafe(value: Boolean): Self = StObject.set(x, "isParallelSafe", value.asInstanceOf[js.Any])
    
    inline def setMajorVersion(value: `7`): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
  }
}
