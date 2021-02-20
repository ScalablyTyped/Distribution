package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileMapping extends StObject {
  
  /**
    * Offset in the mapped file on disk, in bytes.
    */
  var offset: Double = js.native
  
  /**
    * Full filesystem path.
    */
  var path: String = js.native
  
  /**
    * Size in the mapped file on disk, in bytes.
    */
  var size: Double = js.native
}
object FileMapping {
  
  @scala.inline
  def apply(offset: Double, path: String, size: Double): FileMapping = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileMapping]
  }
  
  @scala.inline
  implicit class FileMappingMutableBuilder[Self <: FileMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
