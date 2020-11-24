package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientFileReadOptions extends js.Object {
  
  var arrayBuffer: js.UndefOr[Boolean] = js.native
  
  var binary: js.UndefOr[Boolean] = js.native
  
  var blob: js.UndefOr[Boolean] = js.native
  
  var buffer: js.UndefOr[Boolean] = js.native
  
  var httpCache: js.UndefOr[Boolean] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var rev: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[Double] = js.native
  
  var versionTag: js.UndefOr[String] = js.native
}
object ClientFileReadOptions {
  
  @scala.inline
  def apply(): ClientFileReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientFileReadOptions]
  }
  
  @scala.inline
  implicit class ClientFileReadOptionsOps[Self <: ClientFileReadOptions] (val x: Self) extends AnyVal {
    
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
    def setArrayBuffer(value: Boolean): Self = this.set("arrayBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayBuffer: Self = this.set("arrayBuffer", js.undefined)
    
    @scala.inline
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    
    @scala.inline
    def setBlob(value: Boolean): Self = this.set("blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlob: Self = this.set("blob", js.undefined)
    
    @scala.inline
    def setBuffer(value: Boolean): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setHttpCache(value: Boolean): Self = this.set("httpCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpCache: Self = this.set("httpCache", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setRev(value: String): Self = this.set("rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRev: Self = this.set("rev", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setVersionTag(value: String): Self = this.set("versionTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionTag: Self = this.set("versionTag", js.undefined)
  }
}
