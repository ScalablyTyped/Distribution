package typings.gitlab.anon

import typings.gitlab.projectImportExportMod.UploadMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  metadata :gitlab.gitlab/dist/types/core/services/ProjectImportExport.UploadMetadata | undefined} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait metadataUploadMetadataund extends js.Object {
  
  var metadata: js.UndefOr[UploadMetadata] = js.native
  
  var sudo: js.UndefOr[String | Double] = js.native
}
object metadataUploadMetadataund {
  
  @scala.inline
  def apply(): metadataUploadMetadataund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[metadataUploadMetadataund]
  }
  
  @scala.inline
  implicit class metadataUploadMetadataundOps[Self <: metadataUploadMetadataund] (val x: Self) extends AnyVal {
    
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
    def setMetadata(value: UploadMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
  }
}
