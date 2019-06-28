package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePluginArgs
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var actions: Actions
  var boundActionCreators: Actions
  var cache: gatsbyLib.Anon_Del
  var createContentDigest: js.Function
  var createNodeId: js.Function
  var emitter: nodeLib.eventsMod.EventEmitter
  var getNode: js.Function
  var getNodeAndSavePathDependency: js.Function
  var getNodes: js.Function
  var getNodesByType: js.Function
  var hasNodeChanged: js.Function
  var loadNodeContent: js.Function
  var pathPrefix: java.lang.String
  var reporter: Reporter
  var store: Store
  var tracing: Tracing
}

object NodePluginArgs {
  @scala.inline
  def apply(
    actions: Actions,
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
    pathPrefix: java.lang.String,
    reporter: Reporter,
    store: Store,
    tracing: Tracing,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): NodePluginArgs = {
    val __obj = js.Dynamic.literal(actions = actions, boundActionCreators = boundActionCreators, cache = cache, createContentDigest = createContentDigest, createNodeId = createNodeId, emitter = emitter, getNode = getNode, getNodeAndSavePathDependency = getNodeAndSavePathDependency, getNodes = getNodes, getNodesByType = getNodesByType, hasNodeChanged = hasNodeChanged, loadNodeContent = loadNodeContent, pathPrefix = pathPrefix, reporter = reporter, store = store, tracing = tracing)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NodePluginArgs]
  }
}

