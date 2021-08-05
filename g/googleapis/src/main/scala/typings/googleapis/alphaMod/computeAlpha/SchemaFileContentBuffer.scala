package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFileContentBuffer extends StObject {
  
  /**
    * The raw content in the secure keys file.
    */
  var content: js.UndefOr[String] = js.undefined
  
  var fileType: js.UndefOr[String] = js.undefined
}
object SchemaFileContentBuffer {
  
  inline def apply(): SchemaFileContentBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileContentBuffer]
  }
  
  extension [Self <: SchemaFileContentBuffer](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
  }
}
