package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePagesArgs extends ParentSpanPluginArgs {
  var graphql: js.Function
  var traceId: java.lang.String
  var waitForCascadingActions: scala.Boolean
}

object CreatePagesArgs {
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
    traceId: java.lang.String,
    tracing: Tracing,
    waitForCascadingActions: scala.Boolean
  ): CreatePagesArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = createContentDigest, createNodeId = createNodeId, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, graphql = graphql, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, parentSpan = parentSpan, pathPrefix = pathPrefix, reporter = reporter, store = store, traceId = traceId, tracing = tracing, waitForCascadingActions = waitForCascadingActions)
  
    __obj.asInstanceOf[CreatePagesArgs]
  }
}

