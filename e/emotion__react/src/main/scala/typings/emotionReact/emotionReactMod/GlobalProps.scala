package typings.emotionReact.emotionReactMod

import typings.emotionSerialize.mod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalProps extends js.Object {
  
  var styles: Interpolation[Theme] = js.native
}
object GlobalProps {
  
  @scala.inline
  def apply(): GlobalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalProps]
  }
  
  @scala.inline
  implicit class GlobalPropsOps[Self <: GlobalProps] (val x: Self) extends AnyVal {
    
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
    def setStyles(value: Interpolation[Theme]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setStylesNull: Self = this.set("styles", null)
  }
}
