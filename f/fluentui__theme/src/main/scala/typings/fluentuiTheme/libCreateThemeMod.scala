package typings.fluentuiTheme

import typings.fluentuiTheme.libTypesThemeMod.PartialTheme
import typings.fluentuiTheme.libTypesThemeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreateThemeMod {
  
  @JSImport("@fluentui/theme/lib/createTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")().asInstanceOf[Theme]
  inline def createTheme(theme: Unit, depComments: Boolean): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(theme.asInstanceOf[js.Any], depComments.asInstanceOf[js.Any])).asInstanceOf[Theme]
  inline def createTheme(theme: PartialTheme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Theme]
  inline def createTheme(theme: PartialTheme, depComments: Boolean): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(theme.asInstanceOf[js.Any], depComments.asInstanceOf[js.Any])).asInstanceOf[Theme]
}
