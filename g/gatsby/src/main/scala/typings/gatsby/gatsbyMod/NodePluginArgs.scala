package typings.gatsby.gatsbyMod

import org.scalablytyped.runtime.StringDictionary
import typings.gatsby.Anon_Del
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePluginArgs
  extends /* key */ StringDictionary[js.Any] {
  var actions: Actions
  var boundActionCreators: Actions
  var cache: Anon_Del
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
  var store: Store
  var tracing: Tracing
}

object NodePluginArgs {
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
    reporter: Reporter,
    store: Store,
    tracing: Tracing,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): NodePluginArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = js.Any.fromFunction1(createContentDigest), createNodeId = createNodeId, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, pathPrefix = pathPrefix, reporter = reporter, store = store, tracing = tracing)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NodePluginArgs]
  }
}

