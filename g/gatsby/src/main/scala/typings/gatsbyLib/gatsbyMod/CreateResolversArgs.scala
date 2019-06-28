package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResolversArgs extends ParentSpanPluginArgs {
  var createResolvers: js.Function
  var schema: js.Object
  var traceId: gatsbyLib.gatsbyLibStrings.`initial-createResolvers`
}

object CreateResolversArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: gatsbyLib.Anon_Del,
    createContentDigest: js.Function,
    createNodeId: js.Function,
    createResolvers: js.Function,
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
    schema: js.Object,
    store: Store,
    traceId: gatsbyLib.gatsbyLibStrings.`initial-createResolvers`,
    tracing: Tracing
  ): CreateResolversArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = createContentDigest, createNodeId = createNodeId, createResolvers = createResolvers, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, parentSpan = parentSpan, pathPrefix = pathPrefix, reporter = reporter, schema = schema, store = store, traceId = traceId, tracing = tracing)
  
    __obj.asInstanceOf[CreateResolversArgs]
  }
}

