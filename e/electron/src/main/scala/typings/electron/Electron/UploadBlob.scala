package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadBlob extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/upload-blob
  /**
    * UUID of blob data to upload.
    */
  var blobUUID: String = js.native
  
  /**
    * `blob`.
    */
  var `type`: String = js.native
}
object UploadBlob {
  
  @scala.inline
  def apply(blobUUID: String, `type`: String): UploadBlob = {
    val __obj = js.Dynamic.literal(blobUUID = blobUUID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadBlob]
  }
  
  @scala.inline
  implicit class UploadBlobMutableBuilder[Self <: UploadBlob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlobUUID(value: String): Self = StObject.set(x, "blobUUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
