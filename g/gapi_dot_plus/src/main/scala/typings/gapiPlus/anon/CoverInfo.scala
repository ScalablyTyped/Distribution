package typings.gapiPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverInfo extends js.Object {
  
  var coverInfo: LeftImageOffset = js.native
  
  var coverPhoto: Height = js.native
  
  var layout: String = js.native
}
object CoverInfo {
  
  @scala.inline
  def apply(coverInfo: LeftImageOffset, coverPhoto: Height, layout: String): CoverInfo = {
    val __obj = js.Dynamic.literal(coverInfo = coverInfo.asInstanceOf[js.Any], coverPhoto = coverPhoto.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
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
    def setCoverPhoto(value: Height): Self = this.set("coverPhoto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
  }
}
