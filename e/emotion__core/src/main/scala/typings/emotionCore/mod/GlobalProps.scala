package typings.emotionCore.mod

import typings.emotionSerialize.mod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalProps[Theme] extends js.Object {
  
  var styles: InterpolationWithTheme[Theme] = js.native
}
object GlobalProps {
  
  @scala.inline
  def apply[Theme](): GlobalProps[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalProps[Theme]]
  }
  
  @scala.inline
  implicit class GlobalPropsOps[Self <: GlobalProps[_], Theme] (val x: Self with GlobalProps[Theme]) extends AnyVal {
    
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
    def setStylesFunction1(value: Theme => Interpolation[js.UndefOr[scala.Nothing]]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: InterpolationWithTheme[Theme]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setStylesNull: Self = this.set("styles", null)
  }
}
