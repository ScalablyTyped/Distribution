package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeridiemAM extends js.Object {
  
  var meridiemAM: js.UndefOr[String] = js.native
  
  var meridiemPM: js.UndefOr[String] = js.native
}
object MeridiemAM {
  
  @scala.inline
  def apply(): MeridiemAM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeridiemAM]
  }
  
  @scala.inline
  implicit class MeridiemAMOps[Self <: MeridiemAM] (val x: Self) extends AnyVal {
    
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
    def setMeridiemAM(value: String): Self = this.set("meridiemAM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeridiemAM: Self = this.set("meridiemAM", js.undefined)
    
    @scala.inline
    def setMeridiemPM(value: String): Self = this.set("meridiemPM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeridiemPM: Self = this.set("meridiemPM", js.undefined)
  }
}
