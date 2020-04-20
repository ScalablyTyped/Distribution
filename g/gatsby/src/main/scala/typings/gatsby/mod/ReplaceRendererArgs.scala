package typings.gatsby.mod

import typings.gatsby.AnonDel
import typings.node.eventsMod.EventEmitter
import typings.react.mod.ReactNode
import typings.std.HTMLBodyElement
import typings.std.HTMLHtmlElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceRendererArgs extends NodePluginArgs {
  var setBodyProps: js.Function
  def replaceBodyHTMLString(str: String): Unit
  def setBodyAttributes(attr: ReactProps[HTMLBodyElement]): Unit
  def setHeadComponents(comp: js.Array[ReactNode]): Unit
  def setHtmlAttributes(attr: ReactProps[HTMLHtmlElement]): Unit
  def setPostBodyComponents(comp: js.Array[ReactNode]): Unit
  def setPreBodyComponents(comp: js.Array[ReactNode]): Unit
}

object ReplaceRendererArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: AnonDel,
    createContentDigest: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof createContentDigest */ js.Any,
    createNodeId: js.Function,
    emitter: EventEmitter,
    getNode: js.Function,
    getNodeAndSavePathDependency: js.Function,
    getNodes: js.Function,
    getNodesByType: js.Function,
    hasNodeChanged: js.Function,
    loadNodeContent: js.Function,
    pathPrefix: String,
    replaceBodyHTMLString: String => Unit,
    reporter: Reporter,
    schema: NodePluginSchema,
    setBodyAttributes: ReactProps[HTMLBodyElement] => Unit,
    setBodyProps: js.Function,
    setHeadComponents: js.Array[ReactNode] => Unit,
    setHtmlAttributes: ReactProps[HTMLHtmlElement] => Unit,
    setPostBodyComponents: js.Array[ReactNode] => Unit,
    setPreBodyComponents: js.Array[ReactNode] => Unit,
    store: Store,
    tracing: Tracing
  ): ReplaceRendererArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createContentDigest = createContentDigest.asInstanceOf[js.Any], createNodeId = createNodeId.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], replaceBodyHTMLString = js.Any.fromFunction1(replaceBodyHTMLString), reporter = reporter.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], setBodyAttributes = js.Any.fromFunction1(setBodyAttributes), setBodyProps = setBodyProps.asInstanceOf[js.Any], setHeadComponents = js.Any.fromFunction1(setHeadComponents), setHtmlAttributes = js.Any.fromFunction1(setHtmlAttributes), setPostBodyComponents = js.Any.fromFunction1(setPostBodyComponents), setPreBodyComponents = js.Any.fromFunction1(setPreBodyComponents), store = store.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceRendererArgs]
  }
}

