package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadOptionsBinary extends StObject {
  
  /**
    * Upload type determines how the file will be sent to the server.
    * Value will be `FileSystemUploadType.BINARY_CONTENT`.
    */
  var uploadType: js.UndefOr[FileSystemUploadType] = js.undefined
}
object UploadOptionsBinary {
  
  inline def apply(): UploadOptionsBinary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadOptionsBinary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadOptionsBinary] (val x: Self) extends AnyVal {
    
    inline def setUploadType(value: FileSystemUploadType): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
  }
}
