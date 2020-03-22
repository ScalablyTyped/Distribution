package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.formatterFormatterMod.Formatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/formatter/InternalFormatter", JSImport.Namespace)
@js.native
object internalFormatterMod extends js.Object {
  /**
    * TODO: maybe we should not treat internal errors as issues
    */
  def createInternalFormatter(): Formatter = js.native
}

