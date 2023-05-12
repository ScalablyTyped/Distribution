package typings.fluentuiReactThemeProvider

import typings.fluentuiTheme.libTypesThemeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGetTokensMod {
  
  @JSImport("@fluentui/react-theme-provider/lib/getTokens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTokens(theme: Theme): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokens")(theme.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getTokens(
    theme: Theme,
    userTokens: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RecursivePartial<Tokens> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokens")(theme.asInstanceOf[js.Any], userTokens.asInstanceOf[js.Any])).asInstanceOf[Any]
}
