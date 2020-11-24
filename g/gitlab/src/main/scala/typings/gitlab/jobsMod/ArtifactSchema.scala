package typings.gitlab.jobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactSchema extends js.Object {
  
  var file_format: js.UndefOr[String] = js.native
  
  var file_type: String = js.native
  
  var filename: String = js.native
  
  var size: Double = js.native
}
object ArtifactSchema {
  
  @scala.inline
  def apply(file_type: String, filename: String, size: Double): ArtifactSchema = {
    val __obj = js.Dynamic.literal(file_type = file_type.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactSchema]
  }
  
  @scala.inline
  implicit class ArtifactSchemaOps[Self <: ArtifactSchema] (val x: Self) extends AnyVal {
    
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
    def setFile_type(value: String): Self = this.set("file_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_format(value: String): Self = this.set("file_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile_format: Self = this.set("file_format", js.undefined)
  }
}
