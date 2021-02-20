package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.codeFrameDTsMod.BabelCodeFrameOptions
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.ConfigurableFormatterType
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.FormatterType
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.NotConfigurableFormatterType
import typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
import typings.forkTsCheckerWebpackPlugin.formatterOptionsMod.FormatterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter", "createBasicFormatter")
  @js.native
  def createBasicFormatter(): Formatter = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter", "createCodeFrameFormatter")
  @js.native
  def createCodeFrameFormatter(): Formatter = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter", "createCodeFrameFormatter")
  @js.native
  def createCodeFrameFormatter(options: BabelCodeFrameOptions): Formatter = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter", "createFormatter")
  @js.native
  def createFormatter[T /* <: NotConfigurableFormatterType */](): Formatter = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter", "createFormatter")
  @js.native
  def createFormatter[T /* <: NotConfigurableFormatterType */](`type`: T): Formatter = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter", "createFormatter")
  @js.native
  def createFormatter[T /* <: ConfigurableFormatterType */](
    `type`: T,
    options: /* import warning: importer.ImportType#apply Failed type conversion: fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory.ConfigurableFormatterOptions[T] */ js.Any
  ): Formatter = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter", "createFormatter")
  @js.native
  def createFormatter[T /* <: FormatterType */](`type`: T, options: js.Object): Formatter = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter", "createFormatterConfiguration")
  @js.native
  def createFormatterConfiguration(): Formatter = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter", "createFormatterConfiguration")
  @js.native
  def createFormatterConfiguration(options: FormatterOptions): Formatter = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter", "createFormatter")
  @js.native
  def createFormatter_T_ConfigurableFormatterType[T /* <: ConfigurableFormatterType */](`type`: T): Formatter = js.native
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter", "createFormatter")
  @js.native
  def createFormatter_T_FormatterType[T /* <: FormatterType */](`type`: T): Formatter = js.native
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/formatter", "createWebpackFormatter")
  @js.native
  def createWebpackFormatter(formatter: Formatter): Formatter = js.native
}
