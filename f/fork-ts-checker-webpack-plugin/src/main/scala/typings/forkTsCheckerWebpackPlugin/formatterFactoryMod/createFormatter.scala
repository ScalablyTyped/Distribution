package typings.forkTsCheckerWebpackPlugin.formatterFactoryMod

import typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory", "createFormatter")
@js.native
object createFormatter extends js.Object {
  def apply[T /* <: NotConfigurableFormatterType */](): Formatter = js.native
  def apply[T /* <: FormatterType */](`type`: T): Formatter = js.native
  def apply[T /* <: ConfigurableFormatterType */](
    `type`: T,
    options: /* import warning: importer.ImportType#apply Failed type conversion: fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory.ConfigurableFormatterOptions[T] */ js.Any
  ): Formatter = js.native
  def apply[T /* <: FormatterType */](`type`: T, options: js.Object): Formatter = js.native
}

