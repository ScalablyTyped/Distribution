package typings.forkTsCheckerWebpackPlugin.loggerFactoryMod

import typings.forkTsCheckerWebpackPlugin.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/logger/LoggerFactory", "createLogger")
@js.native
object createLogger extends js.Object {
  def apply(
    `type`: LoggerType,
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): Logger = js.native
  def apply(
    `type`: Logger,
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  ): Logger = js.native
}

