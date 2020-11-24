package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverInfo extends js.Object {
  
  var coverInfo: js.UndefOr[LeftImageOffset] = js.native
  
  var coverPhoto: js.UndefOr[Height] = js.native
  
  var layout: js.UndefOr[String] = js.native
}
object CoverInfo {
  
  @scala.inline
  def apply(): CoverInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverInfo]
  }
  
  @scala.inline
  implicit class CoverInfoOps[Self <: CoverInfo] (val x: Self) extends AnyVal {
    
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
    def setCoverInfo(value: LeftImageOffset): Self = this.set("coverInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverInfo: Self = this.set("coverInfo", js.undefined)
    
    @scala.inline
    def setCoverPhoto(value: Height): Self = this.set("coverPhoto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverPhoto: Self = this.set("coverPhoto", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
  }
}
