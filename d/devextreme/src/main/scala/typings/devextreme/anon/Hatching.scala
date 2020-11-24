package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hatching extends js.Object {
  
  var border: js.UndefOr[ColorDashStyle] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var hatching: js.UndefOr[Step] = js.native
}
object Hatching {
  
  @scala.inline
  def apply(): Hatching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hatching]
  }
  
  @scala.inline
  implicit class HatchingOps[Self <: Hatching] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: ColorDashStyle): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setHatching(value: Step): Self = this.set("hatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHatching: Self = this.set("hatching", js.undefined)
  }
}
