package typings.emotionCore.mod.global.JSX

import typings.emotionCore.mod.InterpolationWithTheme
import typings.emotionSerialize.mod.Interpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Do we need to modify `LibraryManagedAttributes` too,
  * to make `className` props optional when `css` props is specified?
  */
@js.native
trait IntrinsicAttributes extends js.Object {
  
  var css: js.UndefOr[InterpolationWithTheme[_]] = js.native
}
object IntrinsicAttributes {
  
  @scala.inline
  def apply(): IntrinsicAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntrinsicAttributes]
  }
  
  @scala.inline
  implicit class IntrinsicAttributesOps[Self <: IntrinsicAttributes] (val x: Self) extends AnyVal {
    
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
    def setCssFunction1(value: _ => Interpolation[js.UndefOr[scala.Nothing]]): Self = this.set("css", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCss(value: InterpolationWithTheme[_]): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setCssNull: Self = this.set("css", null)
  }
}
