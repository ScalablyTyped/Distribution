package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePathIsPluginFile extends StObject {
  
  var filePath: String
  
  var isPluginFile: Boolean
}
object FilePathIsPluginFile {
  
  inline def apply(filePath: String, isPluginFile: Boolean): FilePathIsPluginFile = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], isPluginFile = isPluginFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePathIsPluginFile]
  }
  
  extension [Self <: FilePathIsPluginFile](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setIsPluginFile(value: Boolean): Self = StObject.set(x, "isPluginFile", value.asInstanceOf[js.Any])
  }
}
