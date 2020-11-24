package typings.electron.Electron

import typings.electron.electronStrings.blob
import typings.electron.electronStrings.file
import typings.electron.electronStrings.rawData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostData extends js.Object {
  
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
  implicit class PostDataOps[Self <: PostData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: rawData | file | blob): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlobUUID(value: String): Self = this.set("blobUUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlobUUID: Self = this.set("blobUUID", js.undefined)
    
    @scala.inline
    def setBytes(value: String): Self = this.set("bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytes: Self = this.set("bytes", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setModificationTime(value: Double): Self = this.set("modificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModificationTime: Self = this.set("modificationTime", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
