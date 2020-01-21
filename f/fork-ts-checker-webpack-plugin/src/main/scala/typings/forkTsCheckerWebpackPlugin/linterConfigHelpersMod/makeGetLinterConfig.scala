package typings.forkTsCheckerWebpackPlugin.linterConfigHelpersMod

import typings.minimatch.mod.IMinimatch
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/linterConfigHelpers", "makeGetLinterConfig")
@js.native
object makeGetLinterConfig extends js.Object {
  def apply(
    linterConfigs: Record[String, js.UndefOr[ConfigurationFile]],
    linterExclusions: js.Array[IMinimatch],
    context: String
  ): js.Function1[/* file */ String, js.UndefOr[ConfigurationFile]] = js.native
}

