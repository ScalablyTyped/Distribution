package typings.glaze

import org.scalablytyped.runtime.TopLevel
import typings.glaze.glazeStrings.aliases
import typings.glaze.glazeStrings.shorthands
import typings.glaze.themeMod.Tokens
import typings.react.mod.CSSProperties
import typings.std.Extract
import typings.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStylingMod {
  
  @JSImport("glaze/dist-types/useStyling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyling(): js.Function1[/* themedStyle */ ThemedStyle, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyling")().asInstanceOf[js.Function1[/* themedStyle */ ThemedStyle, String]]
  
  type ResolveAlias[T /* <: Tokens[aliases] */] = (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any['aliases'][T] */ js.Any) | (ResolveShorthand[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any['aliases'][T] */ js.Any
  ])
  
  type ResolveShorthand[T /* <: Tokens[shorthands] */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueOf<ThemeOrAny['shorthands'][T], number> */ js.Any
  
  type ScaleKeys[Property] = LiteralUnion[
    Extract[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any['scales'][/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any['matchers'][std.Extract<Property, glaze.glaze/dist-types/theme.Tokens<'matchers'>>]] */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueOf<CSSProperties> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueOf<CSSProperties> */ js.Any
  ]
  
  type ThemedStyle = CSSProperties & typings.glaze.glazeStrings.ThemedStyle & TopLevel[js.Any]
}
