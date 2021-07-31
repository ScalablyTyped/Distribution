package typings.electron.Electron

import typings.node.Buffer
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
  
  @scala.inline
  def apply(bytes: Buffer): UploadData = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadData]
  }
  
  @scala.inline
  implicit class UploadDataMutableBuilder[Self <: UploadData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlobUUID(value: String): Self = StObject.set(x, "blobUUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobUUIDUndefined: Self = StObject.set(x, "blobUUID", js.undefined)
    
    @scala.inline
    def setBytes(value: Buffer): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
