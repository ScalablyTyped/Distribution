package typings.fluentuiTheme.themeMod

import typings.fluentuiTheme.anon.PinISchemeNamesIScheme
import typings.fluentuiTheme.anon.RecursivePartialTokens
import typings.fluentuiTheme.ieffectsMod.IEffects
import typings.fluentuiTheme.ifontstylesMod.IFontStyles
import typings.fluentuiTheme.ipaletteMod.IPalette
import typings.fluentuiTheme.ischemeMod.IScheme
import typings.fluentuiTheme.isemanticcolorsMod.ISemanticColors
import typings.fluentuiTheme.ispacingMod.ISpacing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Theme extends IScheme {
  
  /**
    * Component-level styles and token set.
    * This is still in an experimental phase and is only applied by `ThemeProvider`.
    */
  var components: js.UndefOr[ComponentsStyles] = js.native
  
  /**
    * @internal
    * Id of the theme. This is for internal use only.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * @internal
    * The schemes property is still in an experimental phase. The intent is to have it work
    * in conjunction with new 'schemes' prop that any component making use of Foundation can use.
    * Alternative themes that can be referred to by name.
    */
  var schemes: js.UndefOr[PinISchemeNamesIScheme] = js.native
  
  /**
    * @internal
    * CSS stylesheets to be registered.
    * This is still in an experimental phase and is only applied by `ThemeProvider`.
    */
  var stylesheets: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * @internal
    * Global tokens. This is for internal use only and is not production-ready.
    * */
  var tokens: js.UndefOr[RecursivePartialTokens] = js.native
}
object Theme {
  
  @scala.inline
  def apply(
    disableGlobalClassNames: Boolean,
    effects: IEffects,
    fonts: IFontStyles,
    isInverted: Boolean,
    palette: IPalette,
    semanticColors: ISemanticColors,
    spacing: ISpacing
  ): Theme = {
    val __obj = js.Dynamic.literal(disableGlobalClassNames = disableGlobalClassNames.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], isInverted = isInverted.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], semanticColors = semanticColors.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
    
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
    def setComponents(value: ComponentsStyles): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setSchemes(value: PinISchemeNamesIScheme): Self = this.set("schemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemes: Self = this.set("schemes", js.undefined)
    
    @scala.inline
    def setStylesheetsVarargs(value: String*): Self = this.set("stylesheets", js.Array(value :_*))
    
    @scala.inline
    def setStylesheets(value: js.Array[String]): Self = this.set("stylesheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheets: Self = this.set("stylesheets", js.undefined)
    
    @scala.inline
    def setTokens(value: RecursivePartialTokens): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
  }
}
