package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxInternationalizatioObject extends js.Object {
  
  var CLOSE: js.UndefOr[String] = js.native
  
  var DOWNLOAD: js.UndefOr[String] = js.native
  
  var ERROR: js.UndefOr[String] = js.native
  
  var FULL_SCREEN: js.UndefOr[String] = js.native
  
  var NEXT: js.UndefOr[String] = js.native
  
  var PLAY_START: js.UndefOr[String] = js.native
  
  var PLAY_STOP: js.UndefOr[String] = js.native
  
  var PREV: js.UndefOr[String] = js.native
  
  var SHARE: js.UndefOr[String] = js.native
  
  var THUMBS: js.UndefOr[String] = js.native
  
  var ZOOM: js.UndefOr[String] = js.native
}
object FancyBoxInternationalizatioObject {
  
  @scala.inline
  def apply(): FancyBoxInternationalizatioObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxInternationalizatioObject]
  }
  
  @scala.inline
  implicit class FancyBoxInternationalizatioObjectOps[Self <: FancyBoxInternationalizatioObject] (val x: Self) extends AnyVal {
    
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
    def setCLOSE(value: String): Self = this.set("CLOSE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCLOSE: Self = this.set("CLOSE", js.undefined)
    
    @scala.inline
    def setDOWNLOAD(value: String): Self = this.set("DOWNLOAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDOWNLOAD: Self = this.set("DOWNLOAD", js.undefined)
    
    @scala.inline
    def setERROR(value: String): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteERROR: Self = this.set("ERROR", js.undefined)
    
    @scala.inline
    def setFULL_SCREEN(value: String): Self = this.set("FULL_SCREEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFULL_SCREEN: Self = this.set("FULL_SCREEN", js.undefined)
    
    @scala.inline
    def setNEXT(value: String): Self = this.set("NEXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNEXT: Self = this.set("NEXT", js.undefined)
    
    @scala.inline
    def setPLAY_START(value: String): Self = this.set("PLAY_START", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePLAY_START: Self = this.set("PLAY_START", js.undefined)
    
    @scala.inline
    def setPLAY_STOP(value: String): Self = this.set("PLAY_STOP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePLAY_STOP: Self = this.set("PLAY_STOP", js.undefined)
    
    @scala.inline
    def setPREV(value: String): Self = this.set("PREV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePREV: Self = this.set("PREV", js.undefined)
    
    @scala.inline
    def setSHARE(value: String): Self = this.set("SHARE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSHARE: Self = this.set("SHARE", js.undefined)
    
    @scala.inline
    def setTHUMBS(value: String): Self = this.set("THUMBS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTHUMBS: Self = this.set("THUMBS", js.undefined)
    
    @scala.inline
    def setZOOM(value: String): Self = this.set("ZOOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZOOM: Self = this.set("ZOOM", js.undefined)
  }
}
