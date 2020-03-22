package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.codeframeFormatterMod.CodeFrameFormatterOptions
import typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/formatter/FormatterFactory", JSImport.Namespace)
@js.native
object formatterFactoryMod extends js.Object {
  trait _FormatterType extends js.Object
  
  def createFormatter(): Formatter = js.native
  def createFormatter(`type`: FormatterType): Formatter = js.native
  def createFormatter(`type`: FormatterType, options: FormatterOptions): Formatter = js.native
  type FormatterOptions = CodeFrameFormatterOptions
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.default
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.codeframe
    - typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
  */
  type FormatterType = js.UndefOr[_FormatterType | Formatter]
}

