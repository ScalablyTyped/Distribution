package typings.electronPublish.mod

import typings.builderUtil.archMod.Arch
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadTask extends js.Object {
  
  var arch: Arch | Null = js.native
  
  var file: String = js.native
  
  var fileContent: js.UndefOr[Buffer | Null] = js.native
  
  var safeArtifactName: js.UndefOr[String | Null] = js.native
}
object UploadTask {
  
  @scala.inline
  def apply(file: String): UploadTask = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadTask]
  }
  
  @scala.inline
  implicit class UploadTaskOps[Self <: UploadTask] (val x: Self) extends AnyVal {
    
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArch(value: Arch): Self = this.set("arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchNull: Self = this.set("arch", null)
    
    @scala.inline
    def setFileContent(value: Buffer): Self = this.set("fileContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileContent: Self = this.set("fileContent", js.undefined)
    
    @scala.inline
    def setFileContentNull: Self = this.set("fileContent", null)
    
    @scala.inline
    def setSafeArtifactName(value: String): Self = this.set("safeArtifactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeArtifactName: Self = this.set("safeArtifactName", js.undefined)
    
    @scala.inline
    def setSafeArtifactNameNull: Self = this.set("safeArtifactName", null)
  }
}
