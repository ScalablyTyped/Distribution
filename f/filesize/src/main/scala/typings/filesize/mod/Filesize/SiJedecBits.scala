package typings.filesize.mod.Filesize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiJedecBits extends js.Object {
  
  var Eb: js.UndefOr[String] = js.native
  
  var Gb: js.UndefOr[String] = js.native
  
  var Kb: js.UndefOr[String] = js.native
  
  var Mb: js.UndefOr[String] = js.native
  
  var Pb: js.UndefOr[String] = js.native
  
  var Tb: js.UndefOr[String] = js.native
  
  var Yb: js.UndefOr[String] = js.native
  
  var Zb: js.UndefOr[String] = js.native
  
  var b: js.UndefOr[String] = js.native
}
object SiJedecBits {
  
  @scala.inline
  def apply(): SiJedecBits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiJedecBits]
  }
  
  @scala.inline
  implicit class SiJedecBitsOps[Self <: SiJedecBits] (val x: Self) extends AnyVal {
    
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
    def setEb(value: String): Self = this.set("Eb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEb: Self = this.set("Eb", js.undefined)
    
    @scala.inline
    def setGb(value: String): Self = this.set("Gb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGb: Self = this.set("Gb", js.undefined)
    
    @scala.inline
    def setKb(value: String): Self = this.set("Kb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKb: Self = this.set("Kb", js.undefined)
    
    @scala.inline
    def setMb(value: String): Self = this.set("Mb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMb: Self = this.set("Mb", js.undefined)
    
    @scala.inline
    def setPb(value: String): Self = this.set("Pb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePb: Self = this.set("Pb", js.undefined)
    
    @scala.inline
    def setTb(value: String): Self = this.set("Tb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTb: Self = this.set("Tb", js.undefined)
    
    @scala.inline
    def setYb(value: String): Self = this.set("Yb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYb: Self = this.set("Yb", js.undefined)
    
    @scala.inline
    def setZb(value: String): Self = this.set("Zb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZb: Self = this.set("Zb", js.undefined)
    
    @scala.inline
    def setB(value: String): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteB: Self = this.set("b", js.undefined)
  }
}
