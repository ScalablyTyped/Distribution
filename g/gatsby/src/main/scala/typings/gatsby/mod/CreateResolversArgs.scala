package typings.gatsby.mod

import typings.gatsby.AnonDel
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
    cache: AnonDel,
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
    schema: NodePluginSchema,
    store: Store,
    traceId: `initial-createResolvers`,
    tracing: Tracing
  ): CreateResolversArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createContentDigest = js.Any.fromFunction1(createContentDigest), createNodeId = createNodeId.asInstanceOf[js.Any], createResolvers = createResolvers.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], intermediateSchema = intermediateSchema.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], parentSpan = parentSpan.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateResolversArgs]
  }
}

