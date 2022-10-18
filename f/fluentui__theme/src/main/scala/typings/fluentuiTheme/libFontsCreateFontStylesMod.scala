package typings.fluentuiTheme

import typings.fluentuiTheme.libTypesIfontstylesMod.IFontStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFontsCreateFontStylesMod {
  
  @JSImport("@fluentui/theme/lib/fonts/createFontStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFontStyles(): IFontStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("createFontStyles")().asInstanceOf[IFontStyles]
  inline def createFontStyles(localeCode: String): IFontStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("createFontStyles")(localeCode.asInstanceOf[js.Any]).asInstanceOf[IFontStyles]
}
