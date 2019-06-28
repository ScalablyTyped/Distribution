package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildArgs extends ParentSpanPluginArgs {
  var graphql: js.Function
}

object BuildArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: gatsbyLib.Anon_Del,
    createContentDigest: js.Function,
    createNodeId: js.Function,
    emitter: nodeLib.eventsMod.EventEmitter,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    graphql: js.Function,
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    parentSpan: js.Object,
    pathPrefix: java.lang.String,
    reporter: Reporter,
    store: Store,
    tracing: Tracing
  ): BuildArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = createContentDigest, createNodeId = createNodeId, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, graphql = graphql, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, parentSpan = parentSpan, pathPrefix = pathPrefix, reporter = reporter, store = store, tracing = tracing)
  
    __obj.asInstanceOf[BuildArgs]
  }
}

