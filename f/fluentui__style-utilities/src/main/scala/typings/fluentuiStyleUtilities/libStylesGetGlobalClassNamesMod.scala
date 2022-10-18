package typings.fluentuiStyleUtilities

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStylesGetGlobalClassNamesMod {
  
  @JSImport("@fluentui/style-utilities/lib/styles/getGlobalClassNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme): GlobalClassNames[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalClassNames")(classNames.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[GlobalClassNames[T]]
  inline def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme, disableGlobalClassNames: Boolean): GlobalClassNames[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalClassNames")(classNames.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], disableGlobalClassNames.asInstanceOf[js.Any])).asInstanceOf[GlobalClassNames[T]]
  
  type GlobalClassNames[IStyles] = Record[/* keyof IStyles */ String, String]
}
