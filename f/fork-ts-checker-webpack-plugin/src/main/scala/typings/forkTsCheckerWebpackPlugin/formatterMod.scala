package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.codeframeFormatterMod.CodeFrameFormatterOptions
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.FormatterOptions
import typings.forkTsCheckerWebpackPlugin.formatterFactoryMod.FormatterType
import typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/formatter", JSImport.Namespace)
@js.native
object formatterMod extends js.Object {
  def createCodeframeFormatter(): Formatter = js.native
  def createCodeframeFormatter(options: CodeFrameFormatterOptions): Formatter = js.native
  def createDefaultFormatter(): Formatter = js.native
  def createFormatter(): Formatter = js.native
  def createFormatter(`type`: FormatterType): Formatter = js.native
  def createFormatter(`type`: FormatterType, options: FormatterOptions): Formatter = js.native
  /**
    * TODO: maybe we should not treat internal errors as issues
    */
  def createInternalFormatter(): Formatter = js.native
  def createRawFormatter(): Formatter = js.native
}

