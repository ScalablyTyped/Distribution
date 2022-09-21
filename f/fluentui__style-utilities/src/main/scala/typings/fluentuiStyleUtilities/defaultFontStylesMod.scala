package typings.fluentuiStyleUtilities

import typings.fluentuiTheme.ifontstylesMod.IFontStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultFontStylesMod {
  
  @JSImport("@fluentui/style-utilities/lib/styles/DefaultFontStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/style-utilities/lib/styles/DefaultFontStyles", "DefaultFontStyles")
  @js.native
  val DefaultFontStyles: IFontStyles = js.native
  
  inline def registerDefaultFontFaces(baseUrl: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDefaultFontFaces")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
