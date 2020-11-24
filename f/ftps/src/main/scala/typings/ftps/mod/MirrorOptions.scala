package typings.ftps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MirrorOptions extends js.Object {
  
  var filter: js.UndefOr[js.Any] = js.native
  
  var localDir: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[String] = js.native
  
  var parallel: js.UndefOr[Boolean | Double] = js.native
  
  var remoteDir: js.UndefOr[String] = js.native
  
  var upload: js.UndefOr[Boolean] = js.native
}
object MirrorOptions {
  
  @scala.inline
  def apply(): MirrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MirrorOptions]
  }
  
  @scala.inline
  implicit class MirrorOptionsOps[Self <: MirrorOptions] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setLocalDir(value: String): Self = this.set("localDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalDir: Self = this.set("localDir", js.undefined)
    
    @scala.inline
    def setOptions(value: String): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setParallel(value: Boolean | Double): Self = this.set("parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    
    @scala.inline
    def setRemoteDir(value: String): Self = this.set("remoteDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteDir: Self = this.set("remoteDir", js.undefined)
    
    @scala.inline
    def setUpload(value: Boolean): Self = this.set("upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
  }
}
