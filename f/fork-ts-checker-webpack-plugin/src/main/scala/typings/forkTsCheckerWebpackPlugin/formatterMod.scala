package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.codeFrameDTsMod.BabelCodeFrameOptions
import typings.forkTsCheckerWebpackPlugin.formatterConfigMod.FormatterConfig
import typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
import typings.forkTsCheckerWebpackPlugin.formatterOptionsMod.FormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBasicFormatter(): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createBasicFormatter")().asInstanceOf[Formatter]
  
  inline def createCodeFrameFormatter(): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createCodeFrameFormatter")().asInstanceOf[Formatter]
  inline def createCodeFrameFormatter(options: BabelCodeFrameOptions): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createCodeFrameFormatter")(options.asInstanceOf[js.Any]).asInstanceOf[Formatter]
  
  inline def createFormatterConfig(): FormatterConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatterConfig")().asInstanceOf[FormatterConfig]
  inline def createFormatterConfig(options: FormatterOptions): FormatterConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatterConfig")(options.asInstanceOf[js.Any]).asInstanceOf[FormatterConfig]
  
  inline def createWebpackFormatter(formatter: Formatter): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebpackFormatter")(formatter.asInstanceOf[js.Any]).asInstanceOf[Formatter]
}
