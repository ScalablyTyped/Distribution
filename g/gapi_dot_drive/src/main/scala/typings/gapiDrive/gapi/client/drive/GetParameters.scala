package typings.gapiDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetParameters extends js.Object {
  
  var acknowledgeAbuse: js.UndefOr[Boolean] = js.native
  
  var fileId: String = js.native
  
  var projection: js.UndefOr[String] = js.native
  
  var revisionId: js.UndefOr[String] = js.native
  
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  
  var updateViewedDate: js.UndefOr[Boolean] = js.native
}
object GetParameters {
  
  @scala.inline
  def apply(fileId: String): GetParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters]
  }
  
  @scala.inline
  implicit class GetParametersOps[Self <: GetParameters] (val x: Self) extends AnyVal {
    
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
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcknowledgeAbuse(value: Boolean): Self = this.set("acknowledgeAbuse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcknowledgeAbuse: Self = this.set("acknowledgeAbuse", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = this.set("supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsTeamDrives: Self = this.set("supportsTeamDrives", js.undefined)
    
    @scala.inline
    def setUpdateViewedDate(value: Boolean): Self = this.set("updateViewedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateViewedDate: Self = this.set("updateViewedDate", js.undefined)
  }
}
