package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceNodesArgs extends ParentSpanPluginArgs {
  var traceId: gatsbyLib.gatsbyLibStrings.`initial-sourceNodes`
  var waitForCascadingActions: scala.Boolean
}

object SourceNodesArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: Cache,
    createContentDigest: js.Function,
    createNodeId: js.Function,
    emitter: nodeLib.eventsMod.EventEmitter,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    parentSpan: js.Object,
    pathPrefix: java.lang.String,
    reporter: Reporter,
    store: Store,
    traceId: gatsbyLib.gatsbyLibStrings.`initial-sourceNodes`,
    tracing: Tracing,
    waitForCascadingActions: scala.Boolean
  ): SourceNodesArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = createContentDigest, createNodeId = createNodeId, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, parentSpan = parentSpan, pathPrefix = pathPrefix, reporter = reporter, store = store, traceId = traceId, tracing = tracing, waitForCascadingActions = waitForCascadingActions)
  
    __obj.asInstanceOf[SourceNodesArgs]
  }
}

