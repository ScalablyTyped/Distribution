package typings.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWebpackConfigArgs extends ParentSpanPluginArgs {
  var getConfig: js.Function = js.native
  var loaders: WebpackLoaders = js.native
  var plugins: WebpackPlugins = js.native
  var rules: WebpackRules = js.native
  var stage: GatsbyStages = js.native
}

