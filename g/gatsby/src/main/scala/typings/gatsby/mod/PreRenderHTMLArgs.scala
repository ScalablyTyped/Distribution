package typings.gatsby.mod

import typings.gatsby.AnonDel
import typings.node.eventsMod.EventEmitter
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreRenderHTMLArgs extends NodePluginArgs {
  def getHeadComponents(): js.Array[ReactNode]
  def getPostBodyComponents(): js.Array[ReactNode]
  def getPreBodyComponents(): js.Array[ReactNode]
  def replaceHeadComponents(comp: js.Array[ReactNode]): Unit
  def replacePostBodyComponents(comp: js.Array[ReactNode]): Unit
  def replacePreBodyComponents(comp: js.Array[ReactNode]): Unit
}

object PreRenderHTMLArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: AnonDel,
    createContentDigest: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof createContentDigest */ js.Any,
    createNodeId: js.Function,
    emitter: EventEmitter,
    getHeadComponents: () => js.Array[ReactNode],
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    getPostBodyComponents: () => js.Array[ReactNode],
    getPreBodyComponents: () => js.Array[ReactNode],
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    pathPrefix: String,
    replaceHeadComponents: js.Array[ReactNode] => Unit,
    replacePostBodyComponents: js.Array[ReactNode] => Unit,
    replacePreBodyComponents: js.Array[ReactNode] => Unit,
    reporter: Reporter,
    schema: NodePluginSchema,
    store: Store,
    tracing: Tracing
  ): PreRenderHTMLArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createContentDigest = createContentDigest.asInstanceOf[js.Any], createNodeId = createNodeId.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getHeadComponents = js.Any.fromFunction0(getHeadComponents), getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], getPostBodyComponents = js.Any.fromFunction0(getPostBodyComponents), getPreBodyComponents = js.Any.fromFunction0(getPreBodyComponents), hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], replaceHeadComponents = js.Any.fromFunction1(replaceHeadComponents), replacePostBodyComponents = js.Any.fromFunction1(replacePostBodyComponents), replacePreBodyComponents = js.Any.fromFunction1(replacePreBodyComponents), reporter = reporter.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreRenderHTMLArgs]
  }
}

