package typings.devextreme.mod.DevExpress.fileManagement

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadInfo extends js.Object {
  
  /**
    * [descr:UploadInfo.bytesUploaded]
    */
  var bytesUploaded: Double = js.native
  
  /**
    * [descr:UploadInfo.chunkBlob]
    */
  var chunkBlob: Blob = js.native
  
  /**
    * [descr:UploadInfo.chunkCount]
    */
  var chunkCount: Double = js.native
  
  /**
    * [descr:UploadInfo.chunkIndex]
    */
  var chunkIndex: Double = js.native
  
  /**
    * [descr:UploadInfo.customData]
    */
  var customData: js.Any = js.native
}
object UploadInfo {
  
  @scala.inline
  def apply(bytesUploaded: Double, chunkBlob: Blob, chunkCount: Double, chunkIndex: Double, customData: js.Any): UploadInfo = {
    val __obj = js.Dynamic.literal(bytesUploaded = bytesUploaded.asInstanceOf[js.Any], chunkBlob = chunkBlob.asInstanceOf[js.Any], chunkCount = chunkCount.asInstanceOf[js.Any], chunkIndex = chunkIndex.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadInfo]
  }
  
  @scala.inline
  implicit class UploadInfoOps[Self <: UploadInfo] (val x: Self) extends AnyVal {
    
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
    def setBytesUploaded(value: Double): Self = this.set("bytesUploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkBlob(value: Blob): Self = this.set("chunkBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkCount(value: Double): Self = this.set("chunkCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkIndex(value: Double): Self = this.set("chunkIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomData(value: js.Any): Self = this.set("customData", value.asInstanceOf[js.Any])
  }
}
