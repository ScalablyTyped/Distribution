package typings.fluentuiTheme

import typings.fluentuiTheme.libTypesIfontstylesMod.IFontStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFontsDefaultFontStylesMod {
  
  @JSImport("@fluentui/theme/lib/fonts/DefaultFontStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/theme/lib/fonts/DefaultFontStyles", "DefaultFontStyles")
  @js.native
  val DefaultFontStyles: IFontStyles = js.native
  
  inline def registerDefaultFontFaces(baseUrl: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDefaultFontFaces")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
