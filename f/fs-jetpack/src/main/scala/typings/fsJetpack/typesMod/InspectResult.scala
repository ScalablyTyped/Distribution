package typings.fsJetpack.typesMod

import typings.fsJetpack.fsJetpackStrings.dir
import typings.fsJetpack.fsJetpackStrings.file
import typings.fsJetpack.fsJetpackStrings.symlink
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectResult extends js.Object {
  
  var absolutePath: js.UndefOr[String] = js.native
  
  var accessTime: js.UndefOr[Date] = js.native
  
  var changeTime: js.UndefOr[Date] = js.native
  
  var md5: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[Double] = js.native
  
  var modifyTime: js.UndefOr[Date] = js.native
  
  var name: String = js.native
  
  var sha1: js.UndefOr[String] = js.native
  
  var sha256: js.UndefOr[String] = js.native
  
  var sha512: js.UndefOr[String] = js.native
  
  var size: Double = js.native
  
  var `type`: file | dir | symlink = js.native
}
object InspectResult {
  
  @scala.inline
  def apply(name: String, size: Double, `type`: file | dir | symlink): InspectResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectResult]
  }
  
  @scala.inline
  implicit class InspectResultOps[Self <: InspectResult] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: file | dir | symlink): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolutePath(value: String): Self = this.set("absolutePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolutePath: Self = this.set("absolutePath", js.undefined)
    
    @scala.inline
    def setAccessTime(value: Date): Self = this.set("accessTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessTime: Self = this.set("accessTime", js.undefined)
    
    @scala.inline
    def setChangeTime(value: Date): Self = this.set("changeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeTime: Self = this.set("changeTime", js.undefined)
    
    @scala.inline
    def setMd5(value: String): Self = this.set("md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5: Self = this.set("md5", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setModifyTime(value: Date): Self = this.set("modifyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifyTime: Self = this.set("modifyTime", js.undefined)
    
    @scala.inline
    def setSha1(value: String): Self = this.set("sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha1: Self = this.set("sha1", js.undefined)
    
    @scala.inline
    def setSha256(value: String): Self = this.set("sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
    
    @scala.inline
    def setSha512(value: String): Self = this.set("sha512", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha512: Self = this.set("sha512", js.undefined)
  }
}
