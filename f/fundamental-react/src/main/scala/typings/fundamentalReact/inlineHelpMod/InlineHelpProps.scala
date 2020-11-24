package typings.fundamentalReact.inlineHelpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineHelpProps
  extends /* x */ StringDictionary[js.Any] {
  
  var className: js.UndefOr[String] = js.native
  
  var contentClassName: js.UndefOr[String] = js.native
  
  var disableStyles: js.UndefOr[Boolean] = js.native
  
  var placement: InlineHelpPlacement = js.native
}
object InlineHelpProps {
  
  @scala.inline
  def apply(placement: InlineHelpPlacement): InlineHelpProps = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineHelpProps]
  }
  
  @scala.inline
  implicit class InlineHelpPropsOps[Self <: InlineHelpProps] (val x: Self) extends AnyVal {
    
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
    def setPlacement(value: InlineHelpPlacement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    
    @scala.inline
    def setDisableStyles(value: Boolean): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
  }
}
