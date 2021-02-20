package typings.gitlab.anon

import typings.gitlab.projectImportExportMod.UploadMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  metadata :gitlab.gitlab/dist/types/core/services/ProjectImportExport.UploadMetadata | undefined} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait metadataUploadMetadataund extends StObject {
  
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
  implicit class metadataUploadMetadataundMutableBuilder[Self <: metadataUploadMetadataund] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: UploadMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
