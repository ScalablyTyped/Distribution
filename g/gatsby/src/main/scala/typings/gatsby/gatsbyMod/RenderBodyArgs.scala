package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_Del
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderBodyArgs extends NodePluginArgs {
  var pathname: String
  var setBodyAttributes: js.Function
  var setBodyProps: js.Function
  var setHeadComponents: js.Function
  var setHtmlAttributes: js.Function
  var setPostBodyComponents: js.Function
  var setPreBodyComponents: js.Function
}

object RenderBodyArgs {
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
    pathPrefix: String,
    pathname: String,
    reporter: Reporter,
    setBodyAttributes: js.Function,
    setBodyProps: js.Function,
    setHeadComponents: js.Function,
    setHtmlAttributes: js.Function,
    setPostBodyComponents: js.Function,
    setPreBodyComponents: js.Function,
    store: Store,
    tracing: Tracing
  ): RenderBodyArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = js.Any.fromFunction1(createContentDigest), createNodeId = createNodeId, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, pathPrefix = pathPrefix, pathname = pathname, reporter = reporter, setBodyAttributes = setBodyAttributes, setBodyProps = setBodyProps, setHeadComponents = setHeadComponents, setHtmlAttributes = setHtmlAttributes, setPostBodyComponents = setPostBodyComponents, setPreBodyComponents = setPreBodyComponents, store = store, tracing = tracing)
  
    __obj.asInstanceOf[RenderBodyArgs]
  }
}

