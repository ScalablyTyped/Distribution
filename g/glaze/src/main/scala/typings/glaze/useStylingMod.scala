package typings.glaze

import org.scalablytyped.runtime.TopLevel
import typings.glaze.glazeStrings.aliases
import typings.glaze.glazeStrings.hack
import typings.glaze.glazeStrings.shorthands
import typings.glaze.themeMod.Tokens
import typings.react.mod.CSSProperties
import typings.std.Extract
import typings.typeFest.literalUnionMod.LiteralUnion
import typings.typeFest.valueOfMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStylingMod {
  
  @JSImport("glaze/dist-types/useStyling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyling(): js.Function1[/* themedStyle */ ThemedStyle, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyling")().asInstanceOf[js.Function1[/* themedStyle */ ThemedStyle, String]]
  
  type ResolveAlias[T /* <: Tokens[aliases] */] = (/* import warning: importer.ImportType#apply Failed type conversion: treat.treat/theme.ThemeOrAny['aliases'][T] */ js.Any) | (ResolveShorthand[
    /* import warning: importer.ImportType#apply Failed type conversion: treat.treat/theme.ThemeOrAny['aliases'][T] */ js.Any
  ])
  
  type ResolveShorthand[T /* <: Tokens[shorthands] */] = ValueOf[
    /* import warning: importer.ImportType#apply Failed type conversion: treat.treat/theme.ThemeOrAny['shorthands'][T] */ js.Any, 
    Double
  ]
  
  type ScaleKeys[Property] = LiteralUnion[
    Extract[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof treat.treat/theme.ThemeOrAny['scales'][treat.treat/theme.ThemeOrAny['matchers'][std.Extract<Property, glaze.glaze/dist-types/theme.Tokens<'matchers'>>]] */ js.Any, 
      ValueOf[CSSProperties, hack]
    ], 
    ValueOf[CSSProperties, hack]
  ]
  
  type ThemedStyle = CSSProperties & typings.glaze.glazeStrings.ThemedStyle & TopLevel[Any]
}
