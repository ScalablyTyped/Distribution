package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFileContentBuffer extends StObject {
  
  /**
    * The raw content in the secure keys file.
    */
  var content: js.UndefOr[String] = js.native
  
  var fileType: js.UndefOr[String] = js.native
}
object SchemaFileContentBuffer {
  
  @scala.inline
  def apply(): SchemaFileContentBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileContentBuffer]
  }
  
  @scala.inline
  implicit class SchemaFileContentBufferMutableBuilder[Self <: SchemaFileContentBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
  }
}
