package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileMapping extends StObject {
  
  /**
    * Offset in the mapped file on disk, in bytes.
    */
  var offset: Double
  
  /**
    * Full filesystem path.
    */
  var path: String
  
  /**
    * Size in the mapped file on disk, in bytes.
    */
  var size: Double
}
object FileMapping {
  
  inline def apply(offset: Double, path: String, size: Double): FileMapping = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileMapping]
  }
  
  extension [Self <: FileMapping](x: Self) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
