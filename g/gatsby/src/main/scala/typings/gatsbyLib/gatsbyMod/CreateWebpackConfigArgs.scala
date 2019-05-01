package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWebpackConfigArgs extends ParentSpanPluginArgs {
  var getConfig: js.Function
  var loaders: WebpackLoaders
  var plugins: WebpackPlugins
  var rules: WebpackRules
  var stage: GatsbyStages
}

object CreateWebpackConfigArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: Cache,
    createContentDigest: js.Function,
    createNodeId: js.Function,
    emitter: nodeLib.eventsMod.EventEmitter,
    getConfig: js.Function,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    loaders: WebpackLoaders,
    parentSpan: js.Object,
    pathPrefix: java.lang.String,
    plugins: WebpackPlugins,
    reporter: Reporter,
    rules: WebpackRules,
    stage: GatsbyStages,
    store: Store,
    tracing: Tracing
  ): CreateWebpackConfigArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = createContentDigest, createNodeId = createNodeId, emitter = emitter, getConfig = getConfig, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, loaders = loaders, parentSpan = parentSpan, pathPrefix = pathPrefix, plugins = plugins, reporter = reporter, rules = rules, stage = stage, store = store, tracing = tracing)
  
    __obj.asInstanceOf[CreateWebpackConfigArgs]
  }
}

