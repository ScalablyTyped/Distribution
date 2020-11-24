package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends js.Object {
  
  var Config: js.UndefOr[String] = js.native
  
  var File: js.UndefOr[String] = js.native
  
  var Registry: js.UndefOr[String] = js.native
}
object File {
  
  @scala.inline
  def apply(): File = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: String): Self = this.set("Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("Config", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("File", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("File", js.undefined)
    
    @scala.inline
    def setRegistry(value: String): Self = this.set("Registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistry: Self = this.set("Registry", js.undefined)
  }
}
