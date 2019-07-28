package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_Del
import typings.gatsby.gatsbyStrings.`initial-createResolvers`
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResolversArgs extends ParentSpanPluginArgs {
  var createResolvers: js.Function
  var intermediateSchema: js.Object
  var traceId: `initial-createResolvers`
}

object CreateResolversArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: Anon_Del,
    createContentDigest: /* input */ js.Any => String,
    createNodeId: js.Function,
    createResolvers: js.Function,
    emitter: EventEmitter,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    hasNodeChanged: js.Function,
    intermediateSchema: js.Object,
    loadNodeContent: js.Function,
    parentSpan: js.Object,
    pathPrefix: String,
    reporter: Reporter,
    store: Store,
    traceId: `initial-createResolvers`,
    tracing: Tracing
  ): CreateResolversArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = js.Any.fromFunction1(createContentDigest), createNodeId = createNodeId, createResolvers = createResolvers, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, hasNodeChanged = hasNodeChanged, intermediateSchema = intermediateSchema, loadNodeContent = loadNodeContent, parentSpan = parentSpan, pathPrefix = pathPrefix, reporter = reporter, store = store, traceId = traceId, tracing = tracing)
  
    __obj.asInstanceOf[CreateResolversArgs]
  }
}

