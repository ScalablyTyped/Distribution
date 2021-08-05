package typings.flowdoc.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileAsset extends StObject {
  
  var dirPath: String
  
  var fileName: String
}
object FileAsset {
  
  inline def apply(dirPath: String, fileName: String): FileAsset = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAsset]
  }
  
  extension [Self <: FileAsset](x: Self) {
    
    inline def setDirPath(value: String): Self = StObject.set(x, "dirPath", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
  }
}
