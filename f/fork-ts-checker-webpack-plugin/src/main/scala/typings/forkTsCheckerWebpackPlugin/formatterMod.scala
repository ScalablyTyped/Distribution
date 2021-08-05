package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.codeFrameDTsMod.BabelCodeFrameOptions
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.ConfigurableFormatterType
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.FormatterType
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.NotConfigurableFormatterType
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
  
  inline def createFormatter[T /* <: NotConfigurableFormatterType */](): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatter")().asInstanceOf[Formatter]
  inline def createFormatter[T /* <: NotConfigurableFormatterType */](`type`: T): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatter")(`type`.asInstanceOf[js.Any]).asInstanceOf[Formatter]
  inline def createFormatter[T /* <: ConfigurableFormatterType */](
    `type`: T,
    options: /* import warning: importer.ImportType#apply Failed type conversion: fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory.ConfigurableFormatterOptions[T] */ js.Any
  ): Formatter = (^.asInstanceOf[js.Dynamic].applyDynamic("createFormatter")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Formatter]
  inline def createFormatter[T /* <: FormatterType */](`type`: T, options: js.Object): Formatter = (^.asInstanceOf[js.Dynamic].applyDynamic("createFormatter")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Formatter]
  
  inline def createFormatterConfiguration(): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatterConfiguration")().asInstanceOf[Formatter]
  inline def createFormatterConfiguration(options: FormatterOptions): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatterConfiguration")(options.asInstanceOf[js.Any]).asInstanceOf[Formatter]
  
  inline def createFormatter_T_ConfigurableFormatterType[T /* <: ConfigurableFormatterType */](`type`: T): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatter")(`type`.asInstanceOf[js.Any]).asInstanceOf[Formatter]
  
  inline def createFormatter_T_FormatterType[T /* <: FormatterType */](`type`: T): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatter")(`type`.asInstanceOf[js.Any]).asInstanceOf[Formatter]
  
  inline def createWebpackFormatter(formatter: Formatter): Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebpackFormatter")(formatter.asInstanceOf[js.Any]).asInstanceOf[Formatter]
}
