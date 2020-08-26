package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.codeFrameDTsMod.BabelCodeFrameOptions
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.ConfigurableFormatterType
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.FormatterType
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.NotConfigurableFormatterType
import typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
import typings.forkTsCheckerWebpackPlugin.formatterOptionsMod.FormatterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/formatter", JSImport.Namespace)
@js.native
object formatterMod extends js.Object {
  def createBasicFormatter(): Formatter = js.native
  def createCodeFrameFormatter(): Formatter = js.native
  def createCodeFrameFormatter(options: BabelCodeFrameOptions): Formatter = js.native
  def createFormatter[T /* <: NotConfigurableFormatterType */](): Formatter = js.native
  def createFormatter[T /* <: FormatterType */](`type`: T): Formatter = js.native
  def createFormatter[T /* <: ConfigurableFormatterType */](
    `type`: T,
    options: /* import warning: importer.ImportType#apply Failed type conversion: fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory.ConfigurableFormatterOptions[T] */ js.Any
  ): Formatter = js.native
  def createFormatter[T /* <: FormatterType */](`type`: T, options: js.Object): Formatter = js.native
  def createFormatterConfiguration(): Formatter = js.native
  def createFormatterConfiguration(options: FormatterOptions): Formatter = js.native
  @JSName("createFormatter")
  def createFormatter_T_ConfigurableFormatterType[T /* <: ConfigurableFormatterType */](`type`: T): Formatter = js.native
  @JSName("createFormatter")
  def createFormatter_T_NotConfigurableFormatterType[T /* <: NotConfigurableFormatterType */](`type`: T): Formatter = js.native
  def createWebpackFormatter(formatter: Formatter, context: String): Formatter = js.native
}

