package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFileContentBuffer extends StObject {
  
  /**
    * The raw content in the secure keys file.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The file type of source file.
    */
  var fileType: js.UndefOr[String | Null] = js.undefined
}
object SchemaFileContentBuffer {
  
  inline def apply(): SchemaFileContentBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileContentBuffer]
  }
  
  extension [Self <: SchemaFileContentBuffer](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeNull: Self = StObject.set(x, "fileType", null)
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
  }
}
