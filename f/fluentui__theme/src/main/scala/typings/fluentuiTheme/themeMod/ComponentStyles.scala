package typings.fluentuiTheme.themeMod

import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentStyles extends js.Object {
  
  /**
    * styles prop for a component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[_, _]] = js.native
  
  /**
    * The variants property is still in an experimental phase. This is only applied by `ThemeProvider`.
    */
  var variants: js.UndefOr[Variants] = js.native
}
object ComponentStyles {
  
  @scala.inline
  def apply(): ComponentStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentStyles]
  }
  
  @scala.inline
  implicit class ComponentStylesOps[Self <: ComponentStyles] (val x: Self) extends AnyVal {
    
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
    def setStylesFunction1(value: _ => DeepPartial[_]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[_, _]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setVariants(value: Variants): Self = this.set("variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariants: Self = this.set("variants", js.undefined)
  }
}
