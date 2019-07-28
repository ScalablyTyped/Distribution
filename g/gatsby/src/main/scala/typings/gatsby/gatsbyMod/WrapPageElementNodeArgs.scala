package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_Del
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapPageElementNodeArgs extends NodePluginArgs {
  var element: js.Object
  var pathname: String
  var props: js.Object
}

object WrapPageElementNodeArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: Anon_Del,
    createContentDigest: /* input */ js.Any => String,
    createNodeId: js.Function,
    element: js.Object,
    emitter: EventEmitter,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    pathPrefix: String,
    pathname: String,
    props: js.Object,
    reporter: Reporter,
    store: Store,
    tracing: Tracing
  ): WrapPageElementNodeArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = js.Any.fromFunction1(createContentDigest), createNodeId = createNodeId, element = element, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, pathPrefix = pathPrefix, pathname = pathname, props = props, reporter = reporter, store = store, tracing = tracing)
  
    __obj.asInstanceOf[WrapPageElementNodeArgs]
  }
}

