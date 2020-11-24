package typings.googleImages.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchOptions extends js.Object {
  
  var colorType: js.UndefOr[SearchColorType] = js.native
  
  var dominantColor: js.UndefOr[SearchDominantColor] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var safe: js.UndefOr[SearchSafe] = js.native
  
  var size: js.UndefOr[SearchImageSize] = js.native
  
  var `type`: js.UndefOr[SearchImageType] = js.native
}
object SearchOptions {
  
  @scala.inline
  def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  
  @scala.inline
  implicit class SearchOptionsOps[Self <: SearchOptions] (val x: Self) extends AnyVal {
    
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
    def setColorType(value: SearchColorType): Self = this.set("colorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorType: Self = this.set("colorType", js.undefined)
    
    @scala.inline
    def setDominantColor(value: SearchDominantColor): Self = this.set("dominantColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominantColor: Self = this.set("dominantColor", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setSafe(value: SearchSafe): Self = this.set("safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    
    @scala.inline
    def setSize(value: SearchImageSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setType(value: SearchImageType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
