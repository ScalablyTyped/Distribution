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
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createContentDigest = js.Any.fromFunction1(createContentDigest), createNodeId = createNodeId.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], setBodyAttributes = setBodyAttributes.asInstanceOf[js.Any], setBodyProps = setBodyProps.asInstanceOf[js.Any], setHeadComponents = setHeadComponents.asInstanceOf[js.Any], setHtmlAttributes = setHtmlAttributes.asInstanceOf[js.Any], setPostBodyComponents = setPostBodyComponents.asInstanceOf[js.Any], setPreBodyComponents = setPreBodyComponents.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderBodyArgs]
  }
}

