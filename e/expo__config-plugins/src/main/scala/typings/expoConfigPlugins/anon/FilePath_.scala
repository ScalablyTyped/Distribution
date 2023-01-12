package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePath_ extends StObject {
  
  var contents: String
  
  var filePath: String
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
}
object FilePath_ {
  
  inline def apply(contents: String, filePath: String): FilePath_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePath_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilePath_] (val x: Self) extends AnyVal {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
