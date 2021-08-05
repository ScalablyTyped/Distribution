package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadBlob extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/upload-blob
  /**
    * UUID of blob data to upload.
    */
  var blobUUID: String
  
  /**
    * `blob`.
    */
  var `type`: String
}
object UploadBlob {
  
  inline def apply(blobUUID: String, `type`: String): UploadBlob = {
    val __obj = js.Dynamic.literal(blobUUID = blobUUID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadBlob]
  }
  
  extension [Self <: UploadBlob](x: Self) {
    
    inline def setBlobUUID(value: String): Self = StObject.set(x, "blobUUID", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
