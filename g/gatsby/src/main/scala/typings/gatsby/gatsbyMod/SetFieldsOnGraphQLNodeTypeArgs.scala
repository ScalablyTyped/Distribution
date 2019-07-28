package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_Del
import typings.gatsby.Anon_Name
import typings.gatsby.gatsbyStrings.`initial-setFieldsOnGraphQLNodeType`
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetFieldsOnGraphQLNodeTypeArgs extends ParentSpanPluginArgs {
  var traceId: `initial-setFieldsOnGraphQLNodeType`
  var `type`: Anon_Name
}

object SetFieldsOnGraphQLNodeTypeArgs {
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
    parentSpan: js.Object,
    pathPrefix: String,
    reporter: Reporter,
    store: Store,
    traceId: `initial-setFieldsOnGraphQLNodeType`,
    tracing: Tracing,
    `type`: Anon_Name
  ): SetFieldsOnGraphQLNodeTypeArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = js.Any.fromFunction1(createContentDigest), createNodeId = createNodeId, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, parentSpan = parentSpan, pathPrefix = pathPrefix, reporter = reporter, store = store, traceId = traceId, tracing = tracing)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SetFieldsOnGraphQLNodeTypeArgs]
  }
}

