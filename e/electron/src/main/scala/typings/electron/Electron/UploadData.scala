package typings.electron.Electron

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadData extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/upload-data
  /**
    * UUID of blob data. Use ses.getBlobData method to retrieve the data.
    */
  var blobUUID: js.UndefOr[String] = js.undefined
  
  /**
    * Content being sent.
    */
  var bytes: Buffer
  
  /**
    * Path of file being uploaded.
    */
  var file: js.UndefOr[String] = js.undefined
}
object UploadData {
  
  inline def apply(bytes: Buffer): UploadData = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadData] (val x: Self) extends AnyVal {
    
    inline def setBlobUUID(value: String): Self = StObject.set(x, "blobUUID", value.asInstanceOf[js.Any])
    
    inline def setBlobUUIDUndefined: Self = StObject.set(x, "blobUUID", js.undefined)
    
    inline def setBytes(value: Buffer): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
