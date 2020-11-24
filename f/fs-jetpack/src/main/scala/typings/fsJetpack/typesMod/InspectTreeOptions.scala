package typings.fsJetpack.typesMod

import typings.fsJetpack.fsJetpackStrings.follow
import typings.fsJetpack.fsJetpackStrings.report
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectTreeOptions extends js.Object {
  
  var checksum: js.UndefOr[Checksum] = js.native
  
  var relativePath: js.UndefOr[Boolean] = js.native
  
  var symlinks: js.UndefOr[report | follow] = js.native
  
  var times: js.UndefOr[Boolean] = js.native
}
object InspectTreeOptions {
  
  @scala.inline
  def apply(): InspectTreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectTreeOptions]
  }
  
  @scala.inline
  implicit class InspectTreeOptionsOps[Self <: InspectTreeOptions] (val x: Self) extends AnyVal {
    
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
    def setChecksum(value: Checksum): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    
    @scala.inline
    def setRelativePath(value: Boolean): Self = this.set("relativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativePath: Self = this.set("relativePath", js.undefined)
    
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
