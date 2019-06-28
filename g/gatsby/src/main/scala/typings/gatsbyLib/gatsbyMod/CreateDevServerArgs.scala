package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDevServerArgs extends ParentSpanPluginArgs {
  var app: js.Any
}

object CreateDevServerArgs {
  @scala.inline
  def apply(
    actions: Actions,
    app: js.Any,
    boundActionCreators: Actions,
    cache: gatsbyLib.Anon_Del,
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
    tracing: Tracing
  ): CreateDevServerArgs = {
    val __obj = js.Dynamic.literal(actions = actions, app = app, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = createContentDigest, createNodeId = createNodeId, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, parentSpan = parentSpan, pathPrefix = pathPrefix, reporter = reporter, store = store, tracing = tracing)
  
    __obj.asInstanceOf[CreateDevServerArgs]
  }
}

