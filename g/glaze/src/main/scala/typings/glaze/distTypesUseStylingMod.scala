package typings.glaze

import typings.glaze.distTypesThemeMod.Tokens
import typings.glaze.glazeStrings.aliases
import typings.glaze.glazeStrings.hack
import typings.glaze.glazeStrings.shorthands
import typings.react.mod.CSSProperties
import typings.std.Extract
import typings.typeFest.sourceLiteralUnionMod.LiteralUnion
import typings.typeFest.sourceValueOfMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUseStylingMod {
  
  @JSImport("glaze/dist-types/useStyling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyling(): js.Function1[/* themedStyle */ ThemedStyle, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyling")().asInstanceOf[js.Function1[/* themedStyle */ ThemedStyle, String]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    treat.treat/theme.ThemeOrAny['aliases'][T] extends glaze.glaze/dist-types/theme.Tokens<'shorthands'> ? glaze.glaze/dist-types/useStyling.ResolveShorthand<treat.treat/theme.ThemeOrAny['aliases'][T]> : treat.treat/theme.ThemeOrAny['aliases'][T]
    }}}
    */
  type ResolveAlias[T /* <: Tokens[aliases] */] = ResolveShorthand[
    /* import warning: importer.ImportType#apply Failed type conversion: treat.treat/theme.ThemeOrAny['aliases'][T] */ js.Any
  ]
  
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
  
  type ThemedStyle = CSSProperties & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in glaze.glaze/dist-types/theme.Tokens<'matchers'> ]:? glaze.glaze/dist-types/useStyling.ScaleKeys<key>} */ js.Any)
}
