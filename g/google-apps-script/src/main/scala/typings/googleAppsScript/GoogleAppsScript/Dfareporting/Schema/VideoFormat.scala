package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoFormat extends js.Object {
  
  var fileType: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[Double] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var resolution: js.UndefOr[Size] = js.native
  
  var targetBitRate: js.UndefOr[Double] = js.native
}
object VideoFormat {
  
  @scala.inline
  def apply(): VideoFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoFormat]
  }
  
  @scala.inline
  implicit class VideoFormatOps[Self <: VideoFormat] (val x: Self) extends AnyVal {
    
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
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setResolution(value: Size): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    
    @scala.inline
    def setTargetBitRate(value: Double): Self = this.set("targetBitRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetBitRate: Self = this.set("targetBitRate", js.undefined)
  }
}
