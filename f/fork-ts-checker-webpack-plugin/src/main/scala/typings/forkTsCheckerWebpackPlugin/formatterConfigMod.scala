package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
import typings.forkTsCheckerWebpackPlugin.formatterOptionsMod.FormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterConfigMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter/formatter-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFormatterConfig(): FormatterConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatterConfig")().asInstanceOf[FormatterConfig]
  inline def createFormatterConfig(options: FormatterOptions): FormatterConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatterConfig")(options.asInstanceOf[js.Any]).asInstanceOf[FormatterConfig]
  
  type FormatterConfig = Formatter
}
