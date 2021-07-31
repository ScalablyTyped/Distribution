package typings.glaze

import org.scalablytyped.runtime.TopLevel
import typings.glaze.anon.AnimationDelay
import typings.glaze.anon.Bg
import typings.glaze.anon.Border
import typings.glaze.anon.Inset
import typings.glaze.anon.PickConsoleLogLevel
import typings.glaze.glazeNumbers.`1024`
import typings.glaze.glazeNumbers.`1280`
import typings.glaze.glazeNumbers.`640`
import typings.glaze.glazeNumbers.`768`
import typings.glaze.styleInjectorContextMod.StyleInjectorProviderProps
import typings.glaze.themeContextMod.ThemeProviderProps
import typings.glaze.themeMod.RuntimeTheme
import typings.glaze.themeMod.StaticTheme
import typings.glaze.useStylingMod.ThemedStyle
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("glaze", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def StyleInjectorProvider(hasChildrenInjector: StyleInjectorProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StyleInjectorProvider")(hasChildrenInjector.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def ThemeProvider(hasThemeChildren: ThemeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(hasThemeChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("glaze", "VirtualStyleInjector")
  @js.native
  class VirtualStyleInjector ()
    extends typings.glaze.styleInjectorMod.VirtualStyleInjector
  
  @scala.inline
  def createTheme(
    tokens: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any) & StaticTheme
  ): RuntimeTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(tokens.asInstanceOf[js.Any]).asInstanceOf[RuntimeTheme]
  @scala.inline
  def createTheme(
    tokens: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any) & StaticTheme,
    localDebugName: String
  ): RuntimeTheme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(tokens.asInstanceOf[js.Any], localDebugName.asInstanceOf[js.Any])).asInstanceOf[RuntimeTheme]
  
  object defaultTokens {
    
    @JSImport("glaze", "defaultTokens.aliases")
    @js.native
    val aliases: Bg = js.native
    
    @JSImport("glaze", "defaultTokens.breakpoints")
    @js.native
    val breakpoints: js.Tuple4[`640`, `768`, `1024`, `1280`] = js.native
    
    @JSImport("glaze", "defaultTokens.matchers")
    @js.native
    val matchers: AnimationDelay = js.native
    
    @JSImport("glaze", "defaultTokens.scales")
    @js.native
    val scales: Border = js.native
    
    @JSImport("glaze", "defaultTokens.shorthands")
    @js.native
    val shorthands: Inset = js.native
  }
  
  @scala.inline
  def modularScale(ratio: Double): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueOf<typeof defaultSteps, number> * / any ]: string}
    */ typings.glaze.glazeStrings.modularScale & TopLevel[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("modularScale")(ratio.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueOf<typeof defaultSteps, number> * / any ]: string}
    */ typings.glaze.glazeStrings.modularScale & TopLevel[js.Any]]
  @scala.inline
  def modularScale[T /* <: Double */](ratio: Double, steps: js.Array[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in T ]: string}
    */ typings.glaze.glazeStrings.modularScale & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("modularScale")(ratio.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in T ]: string}
    */ typings.glaze.glazeStrings.modularScale & TopLevel[js.Any]]
  
  @scala.inline
  def setLogger(logger: PickConsoleLogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def useStyling(): js.Function1[/* themedStyle */ ThemedStyle, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyling")().asInstanceOf[js.Function1[/* themedStyle */ ThemedStyle, String]]
  
  @scala.inline
  def useTheme(): RuntimeTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[RuntimeTheme]
}
