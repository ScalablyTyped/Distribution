package typings.gatsby.mod

import org.scalablytyped.runtime.StringDictionary
import typings.gatsby.AnonDel
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePluginArgs
  extends /* key */ StringDictionary[js.Any] {
  var actions: Actions
  var boundActionCreators: Actions
  var cache: AnonDel
  var createContentDigest: js.Function1[/* input */ js.Any, String]
  var createNodeId: js.Function
  var emitter: EventEmitter
  var getNode: js.Function
  var getNodeAndSavePathDependency: js.Function
  var getNodes: js.Function
  var getNodesByType: js.Function
  var hasNodeChanged: js.Function
  var loadNodeContent: js.Function
  var pathPrefix: String
  var reporter: Reporter
  var schema: NodePluginSchema
  var store: Store
  var tracing: Tracing
}

object NodePluginArgs {
  @scala.inline
  def apply(
    actions: Actions,
    boundActionCreators: Actions,
    cache: AnonDel,
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
    reporter: Reporter,
    schema: NodePluginSchema,
    store: Store,
    tracing: Tracing,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): NodePluginArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], boundActionCreators = boundActionCreators.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], createContentDigest = js.Any.fromFunction1(createContentDigest), createNodeId = createNodeId.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getNode = getNode.asInstanceOf[js.Any], getNodeAndSavePathDependency = getNodeAndSavePathDependency.asInstanceOf[js.Any], getNodes = getNodes.asInstanceOf[js.Any], getNodesByType = getNodesByType.asInstanceOf[js.Any], hasNodeChanged = hasNodeChanged.asInstanceOf[js.Any], loadNodeContent = loadNodeContent.asInstanceOf[js.Any], pathPrefix = pathPrefix.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], tracing = tracing.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NodePluginArgs]
  }
}

