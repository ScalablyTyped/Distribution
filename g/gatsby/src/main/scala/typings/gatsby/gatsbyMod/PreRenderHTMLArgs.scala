package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_Del
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreRenderHTMLArgs extends NodePluginArgs {
  var getHeadComponents: js.Array[_]
  var getPostBodyComponents: js.Array[_]
  var getPreBodyComponents: js.Array[_]
  var replaceHeadComponents: js.Function
  var replacePostBodyComponents: js.Function
  var replacePreBodyComponents: js.Function
}

object PreRenderHTMLArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: Anon_Del,
    createContentDigest: /* input */ js.Any => String,
    createNodeId: js.Function,
    emitter: EventEmitter,
    getHeadComponents: js.Array[_],
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    getPostBodyComponents: js.Array[_],
    getPreBodyComponents: js.Array[_],
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    pathPrefix: String,
    replaceHeadComponents: js.Function,
    replacePostBodyComponents: js.Function,
    replacePreBodyComponents: js.Function,
    reporter: Reporter,
    store: Store,
    tracing: Tracing
  ): PreRenderHTMLArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createContentDigest = js.Any.fromFunction1(createContentDigest), createNodeId = createNodeId.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getHeadComponents = getHeadComponents.asInstanceOf[js.Any], getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], getPostBodyComponents = getPostBodyComponents.asInstanceOf[js.Any], getPreBodyComponents = getPreBodyComponents.asInstanceOf[js.Any], hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], replaceHeadComponents = replaceHeadComponents.asInstanceOf[js.Any], replacePostBodyComponents = replacePostBodyComponents.asInstanceOf[js.Any], replacePreBodyComponents = replacePreBodyComponents.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PreRenderHTMLArgs]
  }
}

