package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A material attached to a course as part of a material set.
  */
@js.native
trait SchemaCourseMaterial extends js.Object {
  
  /**
    * Google Drive file attachment.
    */
  var driveFile: js.UndefOr[SchemaDriveFile] = js.native
  
  /**
    * Google Forms attachment.
    */
  var form: js.UndefOr[SchemaForm] = js.native
  
  /**
    * Link atatchment.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  
  /**
    * Youtube video attachment.
    */
  var youTubeVideo: js.UndefOr[SchemaYouTubeVideo] = js.native
}
object SchemaCourseMaterial {
  
  @scala.inline
  def apply(): SchemaCourseMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseMaterial]
  }
  
  @scala.inline
  implicit class SchemaCourseMaterialOps[Self <: SchemaCourseMaterial] (val x: Self) extends AnyVal {
    
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
    def setDriveFile(value: SchemaDriveFile): Self = this.set("driveFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveFile: Self = this.set("driveFile", js.undefined)
    
    @scala.inline
    def setForm(value: SchemaForm): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setLink(value: SchemaLink): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setYouTubeVideo(value: SchemaYouTubeVideo): Self = this.set("youTubeVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYouTubeVideo: Self = this.set("youTubeVideo", js.undefined)
  }
}
