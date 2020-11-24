package typings.fsJetpack.typesMod

import typings.fsJetpack.fsJetpackStrings.follow
import typings.fsJetpack.fsJetpackStrings.report
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectOptions extends js.Object {
  
  var absolutePath: js.UndefOr[Boolean] = js.native
  
  var checksum: js.UndefOr[Checksum] = js.native
  
  var mode: js.UndefOr[Boolean] = js.native
  
  var symlinks: js.UndefOr[report | follow] = js.native
  
  var times: js.UndefOr[Boolean] = js.native
}
object InspectOptions {
  
  @scala.inline
  def apply(): InspectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectOptions]
  }
  
  @scala.inline
  implicit class InspectOptionsOps[Self <: InspectOptions] (val x: Self) extends AnyVal {
    
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
    def setAbsolutePath(value: Boolean): Self = this.set("absolutePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolutePath: Self = this.set("absolutePath", js.undefined)
    
    @scala.inline
    def setChecksum(value: Checksum): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    
    @scala.inline
    def setMode(value: Boolean): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setSymlinks(value: report | follow): Self = this.set("symlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymlinks: Self = this.set("symlinks", js.undefined)
    
    @scala.inline
    def setTimes(value: Boolean): Self = this.set("times", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimes: Self = this.set("times", js.undefined)
  }
}
