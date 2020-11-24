package typings.fluentuiTheme.anon

import typings.fluentuiTheme.themeMod.ColorTokens
import typings.fluentuiTheme.themeMod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fluentui/theme.@fluentui/theme/lib/types/Theme.RecursivePartial<@fluentui/theme.@fluentui/theme/lib/types/Theme.ColorTokenSet & @fluentui/theme.@fluentui/theme/lib/types/Theme.TokenSetType> */
@js.native
trait RecursivePartialColorToke extends js.Object {
  
  var background: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  
  var borderColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  
  var contentColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  
  var dividerColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  
  var focusColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  
  var focusInnerColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  
  var highContrast: js.UndefOr[RecursivePartial[js.UndefOr[ColorTokens]] | js.Array[RecursivePartial[_]]] = js.native
  
  var iconColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  
  var linkColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  
  var menuIconColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  
  var opacity: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
  
  var secondaryContentColor: js.UndefOr[RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]] = js.native
}
object RecursivePartialColorToke {
  
  @scala.inline
  def apply(): RecursivePartialColorToke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialColorToke]
  }
  
  @scala.inline
  implicit class RecursivePartialColorTokeOps[Self <: RecursivePartialColorToke] (val x: Self) extends AnyVal {
    
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
    def setBackgroundVarargs(value: RecursivePartial[js.Any]*): Self = this.set("background", js.Array(value :_*))
    
    @scala.inline
    def setBackground(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBorderColorVarargs(value: RecursivePartial[js.Any]*): Self = this.set("borderColor", js.Array(value :_*))
    
    @scala.inline
    def setBorderColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setContentColorVarargs(value: RecursivePartial[js.Any]*): Self = this.set("contentColor", js.Array(value :_*))
    
    @scala.inline
    def setContentColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("contentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentColor: Self = this.set("contentColor", js.undefined)
    
    @scala.inline
    def setDividerColorVarargs(value: RecursivePartial[js.Any]*): Self = this.set("dividerColor", js.Array(value :_*))
    
    @scala.inline
    def setDividerColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("dividerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDividerColor: Self = this.set("dividerColor", js.undefined)
    
    @scala.inline
    def setFocusColorVarargs(value: RecursivePartial[js.Any]*): Self = this.set("focusColor", js.Array(value :_*))
    
    @scala.inline
    def setFocusColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("focusColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusColor: Self = this.set("focusColor", js.undefined)
    
    @scala.inline
    def setFocusInnerColorVarargs(value: RecursivePartial[js.Any]*): Self = this.set("focusInnerColor", js.Array(value :_*))
    
    @scala.inline
    def setFocusInnerColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("focusInnerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusInnerColor: Self = this.set("focusInnerColor", js.undefined)
    
    @scala.inline
    def setHighContrastVarargs(value: RecursivePartial[js.Any]*): Self = this.set("highContrast", js.Array(value :_*))
    
    @scala.inline
    def setHighContrast(value: RecursivePartial[js.UndefOr[ColorTokens]] | js.Array[RecursivePartial[_]]): Self = this.set("highContrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighContrast: Self = this.set("highContrast", js.undefined)
    
    @scala.inline
    def setIconColorVarargs(value: RecursivePartial[js.Any]*): Self = this.set("iconColor", js.Array(value :_*))
    
    @scala.inline
    def setIconColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setLinkColorVarargs(value: RecursivePartial[js.Any]*): Self = this.set("linkColor", js.Array(value :_*))
    
    @scala.inline
    def setLinkColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("linkColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkColor: Self = this.set("linkColor", js.undefined)
    
    @scala.inline
    def setMenuIconColorVarargs(value: RecursivePartial[js.Any]*): Self = this.set("menuIconColor", js.Array(value :_*))
    
    @scala.inline
    def setMenuIconColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("menuIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuIconColor: Self = this.set("menuIconColor", js.undefined)
    
    @scala.inline
    def setOpacityVarargs(value: RecursivePartial[js.Any]*): Self = this.set("opacity", js.Array(value :_*))
    
    @scala.inline
    def setOpacity(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setSecondaryContentColorVarargs(value: RecursivePartial[js.Any]*): Self = this.set("secondaryContentColor", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryContentColor(value: RecursivePartial[js.UndefOr[String]] | js.Array[RecursivePartial[_]]): Self = this.set("secondaryContentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryContentColor: Self = this.set("secondaryContentColor", js.undefined)
  }
}
