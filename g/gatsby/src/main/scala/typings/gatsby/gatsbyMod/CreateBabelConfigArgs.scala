package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_Del
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBabelConfigArgs extends ParentSpanPluginArgs {
  var stage: GatsbyStages
}

object CreateBabelConfigArgs {
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
    stage: GatsbyStages,
    store: Store,
    tracing: Tracing
  ): CreateBabelConfigArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = js.Any.fromFunction1(createContentDigest), createNodeId = createNodeId, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, parentSpan = parentSpan, pathPrefix = pathPrefix, reporter = reporter, stage = stage, store = store, tracing = tracing)
  
    __obj.asInstanceOf[CreateBabelConfigArgs]
  }
}

