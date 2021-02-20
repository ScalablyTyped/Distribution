package typings.electron.Electron

import typings.electron.electronStrings.blob
import typings.electron.electronStrings.file
import typings.electron.electronStrings.rawData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostData extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/post-data
  /**
    * The `UUID` of the `Blob` being uploaded. Required for the `blob` type.
    */
  var blobUUID: js.UndefOr[String] = js.native
  
  /**
    * The raw bytes of the post data in a `Buffer`. Required for the `rawData` type.
    */
  var bytes: js.UndefOr[String] = js.native
  
  /**
    * The path of the file being uploaded. Required for the `file` type.
    */
  var filePath: js.UndefOr[String] = js.native
  
  /**
    * The length of the file being uploaded, in bytes. If set to `-1`, the whole file
    * will be uploaded. Only valid for `file` types.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * The modification time of the file represented by a double, which is the number
    * of seconds since the `UNIX Epoch` (Jan 1, 1970). Only valid for `file` types.
    */
  var modificationTime: js.UndefOr[Double] = js.native
  
  /**
    * The offset from the beginning of the file being uploaded, in bytes. Only valid
    * for `file` types.
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * One of the following:
    */
  var `type`: rawData | file | blob = js.native
}
object PostData {
  
  @scala.inline
  def apply(`type`: rawData | file | blob): PostData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostData]
  }
  
  @scala.inline
  implicit class PostDataMutableBuilder[Self <: PostData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlobUUID(value: String): Self = StObject.set(x, "blobUUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobUUIDUndefined: Self = StObject.set(x, "blobUUID", js.undefined)
    
    @scala.inline
    def setBytes(value: String): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setModificationTime(value: Double): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModificationTimeUndefined: Self = StObject.set(x, "modificationTime", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setType(value: rawData | file | blob): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
