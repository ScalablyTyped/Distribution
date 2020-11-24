package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconSrc extends js.Object {
  
  var iconSrc: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[js.Any | String | js.Array[Double]] = js.native
  
  var onClick: js.UndefOr[js.Function] = js.native
  
  var tooltip: js.UndefOr[String | IsShown] = js.native
}
object IconSrc {
  
  @scala.inline
  def apply(): IconSrc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSrc]
  }
  
  @scala.inline
  implicit class IconSrcOps[Self <: IconSrc] (val x: Self) extends AnyVal {
    
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
    def setIconSrc(value: String): Self = this.set("iconSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSrc: Self = this.set("iconSrc", js.undefined)
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = this.set("location", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: js.Any | String | js.Array[Double]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setOnClick(value: js.Function): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setTooltip(value: String | IsShown): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
}
