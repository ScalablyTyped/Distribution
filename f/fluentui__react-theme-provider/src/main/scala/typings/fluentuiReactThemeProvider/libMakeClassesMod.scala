package typings.fluentuiReactThemeProvider

import typings.fluentuiReactThemeProvider.libMakeStylesMod.UseStylesOptions
import typings.fluentuiTheme.libTypesThemeMod.Theme
import typings.std.Record
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMakeClassesMod {
  
  @JSImport("@fluentui/react-theme-provider/lib/makeClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeClasses[TState /* <: js.Object */](styleOrFunction: js.Function1[/* theme */ Theme, Record[String, IStyle]]): js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClasses")(styleOrFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit]]
  inline def makeClasses[TState /* <: js.Object */](styleOrFunction: Record[String, IStyle]): js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClasses")(styleOrFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ TState, /* options */ js.UndefOr[UseStylesOptions], Unit]]
}
