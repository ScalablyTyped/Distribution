package typings.fluentuiTheme.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorTokenSet extends js.Object {
  
  var background: js.UndefOr[String] = js.native
  
  var borderColor: js.UndefOr[String] = js.native
  
  var contentColor: js.UndefOr[String] = js.native
  
  var dividerColor: js.UndefOr[String] = js.native
  
  var focusColor: js.UndefOr[String] = js.native
  
  var focusInnerColor: js.UndefOr[String] = js.native
  
  var highContrast: js.UndefOr[ColorTokens] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var linkColor: js.UndefOr[String] = js.native
  
  var menuIconColor: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[String] = js.native
  
  var secondaryContentColor: js.UndefOr[String] = js.native
}
object ColorTokenSet {
  
  @scala.inline
  def apply(): ColorTokenSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorTokenSet]
  }
  
  @scala.inline
  implicit class ColorTokenSetOps[Self <: ColorTokenSet] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setContentColor(value: String): Self = this.set("contentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentColor: Self = this.set("contentColor", js.undefined)
    
    @scala.inline
    def setDividerColor(value: String): Self = this.set("dividerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDividerColor: Self = this.set("dividerColor", js.undefined)
    
    @scala.inline
    def setFocusColor(value: String): Self = this.set("focusColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusColor: Self = this.set("focusColor", js.undefined)
    
    @scala.inline
    def setFocusInnerColor(value: String): Self = this.set("focusInnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusInnerColor: Self = this.set("focusInnerColor", js.undefined)
    
    @scala.inline
    def setHighContrast(value: ColorTokens): Self = this.set("highContrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighContrast: Self = this.set("highContrast", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setLinkColor(value: String): Self = this.set("linkColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkColor: Self = this.set("linkColor", js.undefined)
    
    @scala.inline
    def setMenuIconColor(value: String): Self = this.set("menuIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuIconColor: Self = this.set("menuIconColor", js.undefined)
    
    @scala.inline
    def setOpacity(value: String): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSecondaryContentColor(value: String): Self = this.set("secondaryContentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryContentColor: Self = this.set("secondaryContentColor", js.undefined)
  }
}
