package typings.forkTsCheckerWebpackPlugin.partialLoggerMod

import typings.forkTsCheckerWebpackPlugin.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/logger/PartialLogger", "createPartialLogger")
@js.native
object createPartialLogger extends js.Object {
  def apply(methods: js.Array[LoggerMethods], logger: Logger): Logger = js.native
}

