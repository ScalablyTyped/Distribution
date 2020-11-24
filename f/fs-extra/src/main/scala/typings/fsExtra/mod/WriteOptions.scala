package typings.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteOptions extends WriteFileOptions {
  
  var EOL: js.UndefOr[String] = js.native
  
  var fs: js.UndefOr[js.Object] = js.native
  
  var replacer: js.UndefOr[js.Any] = js.native
  
  var spaces: js.UndefOr[Double | String] = js.native
}
object WriteOptions {
  
  @scala.inline
  def apply(): WriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteOptions]
  }
  
  @scala.inline
  implicit class WriteOptionsOps[Self <: WriteOptions] (val x: Self) extends AnyVal {
    
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
    def setEOL(value: String): Self = this.set("EOL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEOL: Self = this.set("EOL", js.undefined)
    
    @scala.inline
    def setFs(value: js.Object): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    
    @scala.inline
    def setReplacer(value: js.Any): Self = this.set("replacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    
    @scala.inline
    def setSpaces(value: Double | String): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
  }
}
