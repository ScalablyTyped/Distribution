package typings.fluentuiTheme.themeMod

import typings.fluentuiTheme.anon.PartialIEffects
import typings.fluentuiTheme.anon.PartialIFontStyles
import typings.fluentuiTheme.anon.PartialIPalette
import typings.fluentuiTheme.anon.PartialISemanticColors
import typings.fluentuiTheme.anon.PartialISpacing
import typings.fluentuiTheme.anon.PinISchemeNamesIScheme
import typings.fluentuiTheme.anon.RecursivePartialTokens
import typings.uifabricMergeStyles.irawstyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialTheme extends js.Object {
  
  var components: js.UndefOr[ComponentsStyles] = js.native
  
  /**
    * Use this property to specify font property defaults.
    */
  var defaultFontStyle: js.UndefOr[IRawStyle] = js.native
  
  var disableGlobalClassNames: js.UndefOr[Boolean] = js.native
  
  var effects: js.UndefOr[PartialIEffects] = js.native
  
  var fonts: js.UndefOr[PartialIFontStyles] = js.native
  
  var isInverted: js.UndefOr[Boolean] = js.native
  
  var palette: js.UndefOr[PartialIPalette] = js.native
  
  var rtl: js.UndefOr[Boolean] = js.native
  
  /**
    * @internal
    * The schemes property is still in an experimental phase. The intent is to have it work
    * in conjunction with new 'schemes' prop that any component making use of Foundation can use.
    * Alternative themes that can be referred to by name.
    */
  var schemes: js.UndefOr[PinISchemeNamesIScheme] = js.native
  
  var semanticColors: js.UndefOr[PartialISemanticColors] = js.native
  
  var spacing: js.UndefOr[PartialISpacing] = js.native
  
  /**
    * @internal
    * CSS stylesheets to be registered.
    * This is still in an experimental phase and is only applied by `ThemeProvider`.
    */
  var stylesheets: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * @internal
    * Global tokens. This is experimental and not production-ready.
    * */
  var tokens: js.UndefOr[RecursivePartialTokens] = js.native
}
object PartialTheme {
  
  @scala.inline
  def apply(): PartialTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTheme]
  }
  
  @scala.inline
  implicit class PartialThemeOps[Self <: PartialTheme] (val x: Self) extends AnyVal {
    
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
    def setDefaultFontStyle(value: IRawStyle): Self = this.set("defaultFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultFontStyle: Self = this.set("defaultFontStyle", js.undefined)
    
    @scala.inline
    def setDisableGlobalClassNames(value: Boolean): Self = this.set("disableGlobalClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableGlobalClassNames: Self = this.set("disableGlobalClassNames", js.undefined)
    
    @scala.inline
    def setEffects(value: PartialIEffects): Self = this.set("effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffects: Self = this.set("effects", js.undefined)
    
    @scala.inline
    def setFonts(value: PartialIFontStyles): Self = this.set("fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
    
    @scala.inline
    def setIsInverted(value: Boolean): Self = this.set("isInverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInverted: Self = this.set("isInverted", js.undefined)
    
    @scala.inline
    def setPalette(value: PartialIPalette): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    
    @scala.inline
    def setSchemes(value: PinISchemeNamesIScheme): Self = this.set("schemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemes: Self = this.set("schemes", js.undefined)
    
    @scala.inline
    def setSemanticColors(value: PartialISemanticColors): Self = this.set("semanticColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSemanticColors: Self = this.set("semanticColors", js.undefined)
    
    @scala.inline
    def setSpacing(value: PartialISpacing): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    
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
