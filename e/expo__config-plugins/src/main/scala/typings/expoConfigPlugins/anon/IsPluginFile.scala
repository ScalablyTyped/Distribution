package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPluginFile extends StObject {
  
  var filePath: String
  
  var isPluginFile: Boolean
}
object IsPluginFile {
  
  inline def apply(filePath: String, isPluginFile: Boolean): IsPluginFile = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], isPluginFile = isPluginFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPluginFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsPluginFile] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setIsPluginFile(value: Boolean): Self = StObject.set(x, "isPluginFile", value.asInstanceOf[js.Any])
  }
}
