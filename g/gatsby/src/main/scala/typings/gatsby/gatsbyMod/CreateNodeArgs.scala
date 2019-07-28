package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_Del
import typings.gatsby.Anon_NodeId
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNodeArgs extends ParentSpanPluginArgs {
  var node: Node
  var traceId: String
  var traceTags: Anon_NodeId
}

object CreateNodeArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: Anon_Del,
    createContentDigest: /* input */ js.Any => String,
    createNodeId: js.Function,
    emitter: EventEmitter,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    node: Node,
    parentSpan: js.Object,
    pathPrefix: String,
    reporter: Reporter,
    store: Store,
    traceId: String,
    traceTags: Anon_NodeId,
    tracing: Tracing
  ): CreateNodeArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = js.Any.fromFunction1(createContentDigest), createNodeId = createNodeId, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, node = node, parentSpan = parentSpan, pathPrefix = pathPrefix, reporter = reporter, store = store, traceId = traceId, traceTags = traceTags, tracing = tracing)
  
    __obj.asInstanceOf[CreateNodeArgs]
  }
}

